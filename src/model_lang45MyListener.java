import org.antlr.v4.runtime.tree.ErrorNodeImpl;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class model_lang45MyListener extends model_lang45BaseListener {
  HashMap varTypeMap = new HashMap<String, String>();
  Map varInitMap = new HashMap<String, Boolean>();
  List<String> exprStack = new ArrayList<>();
  boolean isThereExprTypesConflict = false;

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
//    System.out.println(ctx.getPayload().getText());
    System.out.println(analyzeExpression(ctx));
  }

  private String analyzeExpression(model_lang45Parser.ExpressionContext ctx) {
    isThereExprTypesConflict = false;
    exprStack.clear();
    // expressionType: 0 - expr type error, 1 - bool, 2 - int, 3 - float
    IntegerWrapper expressionType = new IntegerWrapper(0);
    Boolean typesConflict = new Boolean(false);

    List<ParseTree> children = new ArrayList<>(ctx.getChildCount());
    for (int i = 0; i < ctx.getChildCount(); ++i) {
      children.add(ctx.getChild(i));
    }

    parseExpression(children, expressionType);
//    if (analyzeExpressionOnTypesConflict()) {
//      expressionType.value = 0;
//      ctx.addErrorNode(new ErrorNodeImpl(new SemanticErrorToken4()));
//      System.err.println("Ошибка СиА №4: Несовместимые типы в выражении.");
//    }

//    System.out.println(expressionType);
    return switch (expressionType.value) {
      case 1 -> "bool";
      case 2 -> "int";
      case 3 -> "float";
      default -> "null";
    };
  }

  // парсит выражение на ExpressionStack для дальнейшего анализа на конфликт типов, а также вычисляет общий тип выражения
  private void parseExpression(List<ParseTree> children, IntegerWrapper expressionType) {
    for (int i = 0; i < children.size(); i++) {
      // мы на висячем узле и можем проанализировать его содержимое
      /* todo: проблема. типы и операции добавляются в стек выражения подряд. похоже, это нужно будет делать
       отдельно с доп. логикой на приоритет операций. то есть собрать все висячие узлы в один список и потом его
        дополнительно перенести в стэк уже с учётом приоритета операций. */
      if (children.get(i).getChildCount() == 0) {
        // identifier ruleIndex = 18; number ruleIndex = 15;
        String expressionElement = children.get(i).getText();
        if (varTypeMap.containsKey(expressionElement)) {
          switch ((String)varTypeMap.get(expressionElement)) {
            case "bool":
              exprStack.add("bool");
              if (expressionType.value < 1) expressionType.value = 1;
              break;
            case "int":
              exprStack.add("int");
              if (expressionType.value < 2) expressionType.value = 2;
              break;
            case "float":
              exprStack.add("float");
              if (expressionType.value < 3) expressionType.value = 3;
              break;
            default:
              System.out.println("no match");
          }
        }
        else if (expressionElement.compareTo("true") == 0 || expressionElement.compareTo("false") == 0) {
          exprStack.add("bool");
          if (expressionType.value < 1) expressionType.value = 1;
        }
        else {
          if (expressionElement.contains(".")) {
            exprStack.add("float");
            if (expressionType.value < 3) expressionType.value = 3;
          }
          else {
            try {
              Integer.parseInt(expressionElement);
              exprStack.add("int");
              if (expressionType.value < 2) expressionType.value = 2;
            } catch (NumberFormatException ex) {
              exprStack.add(expressionElement);
//              System.out.println("This was operation or parentheses token");
            }
          }
        }
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
        parseExpression(childrenToPass, expressionType);
      }
    }
  }

  // Анализ текущего стэка на наличие конфилкта типов
  private boolean analyzeExpressionOnTypesConflict() {
    //todo: совместимость типов как в моём прошлом компиляторе
    IntegerWrapper i = new IntegerWrapper(0);
    while (exprStack.size() != 1 && !isThereExprTypesConflict)
    {
      for (i.value = 0; i.value < exprStack.size(); i.value += 1)
      {
        if (exprStack.get(i.value).equals("mult") || exprStack.get(i.value).equals("plus") ||
                exprStack.get(i.value).equals("min") || exprStack.get(i.value).equals("div"))
        {
          operationTypeValidation1(i);
          break;
        }
//        else if (exprStack.get(i.value).equals("LT") || exprStack.get(i.value).equals("LE") || exprStack.get(i.value).equals("NE") ||
//                exprStack.get(i.value).equals("GT") || exprStack.get(i.value).equals("GE") || exprStack.get(i.value).equals("EQ"))
//        {
//          opergetionTypeValidgetion2(i, exprStack);
//          break;
//        }
//        else if (exprStack.get(i.value).equals("and") || exprStack.get(i.value).equals("~") || exprStack.get(i.value).equals("or"))
//        {
//          opergetionTypeValidgetion3(i, exprStack);
//          break;
//        }
      }
    }
    return false;
  }

  void operationTypeValidation1(IntegerWrapper index)
  {
    String operation = exprStack.get(index.value);
    if (exprStack.get(index.value - 1).equals("int") && exprStack.get(index.value + 1).equals("int"))
    {
      // удаление обработанной операции из стэка выражения
      exprStack.remove(0);
      exprStack.remove(0);
      exprStack.remove(0);

      // добавление результата операции в стэк
      if (operation.equals("/")) exprStack.add(0, "float");
      else exprStack.add(0, "int");
    }
    else if (exprStack.get(index.value - 1).equals("float") && exprStack.get(index.value + 1).equals("int") ||
            exprStack.get(index.value - 1).equals("int") && exprStack.get(index.value + 1).equals("float") ||
            exprStack.get(index.value - 1).equals("float") && exprStack.get(index.value + 1).equals("float"))
    {
      // удаление обработанной операции из стэка выражения
      exprStack.remove(0);
      exprStack.remove(0);
      exprStack.remove(0);

      // добавление результата операции в стэк
      exprStack.add(0, "float");
    }
    else if (exprStack.get(index.value - 1).equals("bool") || exprStack.get(index.value + 1).equals("bool"))
    {
      isThereExprTypesConflict = true;
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
