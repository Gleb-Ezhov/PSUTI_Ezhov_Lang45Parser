import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ErrorNodeImpl;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class model_lang45MyListener extends model_lang45BaseListener {
  HashMap varTypeMap = new HashMap<String, String>();
  Map varInitMap = new HashMap<String, Boolean>();
  List<String> exprStack = new ArrayList<>();

  // не забывать, что у каждого правила есть ruleIndex, с помощью которого можно фильтровать правила из контекста
  // todo: проверка совместимости типов, участвующих в выражении
  // todo: проверка типа значения, присваиваемого переменной. (переменным float могут присваиваться числа и переменные целого типа)

  @Override
  public void enterDeclaration(model_lang45Parser.DeclarationContext ctx) {
    // последний токен даёт тип каждого отдельного объявления: ctx.stop.getText()
    String typeOfThisDecl = ctx.stop.getText();
//    System.out.println(ctx.stop.getText());
    int numOfChild = ctx.children.size();
//    System.out.println(numOfChild);
//    System.out.println(ctx.getRuleIndex());

    // пары обявленный идентификатор-значение заносятся в мапу
    for (int i = 1; i < numOfChild; i += 2) {
      if (varTypeMap.containsKey(ctx.children.get(i).getText())) {
        String thisIdentifierName = ctx.children.get(i).getText();
        ctx.addErrorNode(new ErrorNodeImpl(new SemanticErrorToken3()));
        System.err.println("Ошибка СиА №3: Повторное объявление переменной " + thisIdentifierName);
      }
      varTypeMap.put(ctx.children.get(i).getText(), typeOfThisDecl);
//      System.out.println(ctx.children.get(i).getText());
    }
  }

  @Override
  public void enterIdentifier(model_lang45Parser.IdentifierContext ctx) {
    // Эта проверка работает на всех идентификаторах, так как мапа с ними заполняется сразу в момент
    // входа в блок с объявлением переменных.
    // В момент входа в любой идентификатор он уже в общей мапе и готов к проверке.
    if (!varTypeMap.containsKey(ctx.getText())) {
      String thisIdentifierName = ctx.getText();
      ctx.addErrorNode(new ErrorNodeImpl(new SemanticErrorToken1()));
      System.err.println("Ошибка СиА №1: Использование необъявленной переменной " + thisIdentifierName);

    }
    // Идентификаторы из объявлений не включены в проверку на инициализацию
    else if (ctx.parent.getRuleIndex() != 1 && !varInitMap.containsKey(ctx.getText())) {
      String thisIdentifierName = ctx.getText();
      ctx.addErrorNode(new ErrorNodeImpl(new SemanticErrorToken2()));
      System.err.println("Ошибка СиА №2: Использование неинициализированной переменной " + thisIdentifierName);
    }
//    // Если идентификатор фигурирует в объявлении повторно else if (ctx.parent.getRuleIndex() == 1) {
//      String thisIdentifierName = ctx.getText();
//      ctx.addErrorNode(new ErrorNodeImpl(new SemanticErrorToken3()));
//      System.err.println("Ошибка СиА №3: Повторное объявление переменной " + thisIdentifierName);
//    }

//    System.out.println(ctx.getRuleIndex());
  }

  @Override
  public void enterInput_st(model_lang45Parser.Input_stContext ctx) {
    int numOfChild = ctx.children.size();
    for (int i = 1; i < numOfChild; i += 2) {
      varInitMap.put(ctx.children.get(i).getText(), new Boolean(true));
    }
  }

  @Override
  public void enterAssignment_st(model_lang45Parser.Assignment_stContext ctx) {
    varInitMap.put(ctx.identifier().getText(), new Boolean(true));
  }

  @Override
  public void enterExpression(model_lang45Parser.ExpressionContext ctx) {
    System.out.println(ctx.getPayload().getText());
//    analyzeExpression(ctx.getPayload());
  }

  private String analyzeExpression(RuleContext ruleContext) {
    // expressionType: 1 - bool, 2 - int, 3 - float
    IntegerWrapper expressionType = new IntegerWrapper(0);
    Boolean typesConflict = new Boolean(false);

    List<ParseTree> children = new ArrayList<>(ruleContext.getChildCount());
    for (int i = 0; i < ruleContext.getChildCount(); ++i) {
      children.add(ruleContext.getChild(i));
    }

    analyzeExpressionsChildren(children, expressionType, typesConflict);
    System.out.println(expressionType.toString());

    return "stub";
  }

  private void analyzeExpressionsChildren(List<ParseTree> children, IntegerWrapper expressionType, Boolean typesConflict) {
    for (int i = 0; i < children.size(); i++) {
      // мы на висячем узле и можем проанализировать его содержимое
      if (children.get(i).getChildCount() == 0) {
        // identifier ruleIndex = 18; number ruleIndex = 15;
        String expressionElement = children.get(i).getText();
        if (varTypeMap.containsKey(expressionElement)) {
          switch ((String)varTypeMap.get(expressionElement)) {
            case "bool":
              if (expressionType.value < 1) expressionType.value = 1;
              break;
            case "int":
              if (expressionType.value < 2) expressionType.value = 2;
              break;
            case "float":
              if (expressionType.value < 3) expressionType.value = 3;
              break;
            default:
              System.out.println("no match");
          }
        }
        else if (expressionElement.compareTo("true") == 0 || expressionElement.compareTo("false") == 0) {
          if (expressionType.value < 1) expressionType.value = 1;
        }
        else {
          if (expressionElement.contains(".")) {
            if (expressionType.value < 3) expressionType.value = 3;
          }
          else {
            try {
              Integer.parseInt(expressionElement);
              if (expressionType.value < 2) expressionType.value = 2;
            } catch (NumberFormatException ex) {
              System.out.println("This was operation or parentheses token");
            }
          }
        }
        // вроде как всё со всем можно складывать и сравнивать, поэтому операции, наверное, не буду учитывать при анализе выражения, пока что
        // Хотя судя по бакалаврской программе, операции надо проверять и булевы литералы валидны только в логич. операциях
        // может сделать это в правилах для factor, term и т.д., а тут просто тип выражения вычислить
        // todo: дальше нужно обработать совместимость типов
        children.remove(i);
      }
    }

    // создаю список детей каждого из текущих неконечных детей, чтобы рекурсивно передать их дальше, и так до висячего узла
    for (int i = 0; i < children.size(); i++) {
      if (children.get(i) == null) {
        children.remove(i);
        continue;
      }

      List<ParseTree> childrenToPass = new ArrayList<>(children.get(i).getChildCount());
      for (int i1 = 0; i1 < children.get(i).getChildCount(); ++i1) {
        childrenToPass.add(children.get(i).getChild(i1));
      }

      if (childrenToPass.size() > 0) {
        analyzeExpressionsChildren(childrenToPass, expressionType, typesConflict);
      }
    }
  }

  @Override
  public void enterNumber(model_lang45Parser.NumberContext ctx) {
//    System.out.println(ctx.getRuleIndex());
  }

  @Override
  public void enterProgram(model_lang45Parser.ProgramContext ctx)
  {
//    System.out.println("Program visited: " + ctx.getText());
    List<ParseTree> list = ctx.children;
    for (int i = 0; i < list.size(); ++i) {
//      System.out.println(list.get(i).toString());
    }

  }

  @Override
  public void exitProgram(model_lang45Parser.ProgramContext ctx)
  {
//    System.out.println("Exit from program: " + ctx.getText());
//    varInitMap.forEach((key, value) -> { System.out.println(key + " is initialized: " + value.toString()); });

  }


}
