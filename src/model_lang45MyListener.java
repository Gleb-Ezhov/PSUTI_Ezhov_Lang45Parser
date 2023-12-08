import org.antlr.v4.runtime.tree.ErrorNodeImpl;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class model_lang45MyListener extends model_lang45BaseListener {
  HashMap varTypeMap = new HashMap<String, String>();
  Map varInitMap = new HashMap<String, Boolean>();
  List<String> exprStack = new ArrayList<>();
  List<String> tempExprStack = new ArrayList<>();
  boolean isThereExprTypesConflict = false;
  boolean isInnerExprAreAnalyzing = false;
  String assignmentRightPartType = "";
  String ifExpressionType = "";

  // не забывать, что у каждого правила есть ruleIndex, с помощью которого можно фильтровать правила из контекста
  // ruleIndex'ы изменяются, при изменении списка правил в грамматике!!!
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
        System.err.println("Ошибка СеА №3: Повторное объявление переменной " + thisIdentifierName);
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
      System.err.println("Ошибка СеА №1: Использование необъявленной переменной " + thisIdentifierName);

    }
    // Идентификаторы из объявлений не включены в проверку на инициализацию
    else if (ctx.parent.getRuleIndex() != 1 && !varInitMap.containsKey(ctx.getText())) {
      String thisIdentifierName = ctx.getText();
      ctx.addErrorNode(new ErrorNodeImpl(new SemanticErrorToken2()));
      System.err.println("Ошибка СеА №2: Использование неинициализированной переменной " + thisIdentifierName);
    }
//    // Если идентификатор фигурирует в объявлении повторно else if (ctx.parent.getRuleIndex() == 1) {
//      String thisIdentifierName = ctx.getText();
//      ctx.addErrorNode(new ErrorNodeImpl(new SemanticErrorToken3()));
//      System.err.println("Ошибка СеА №3: Повторное объявление переменной " + thisIdentifierName);
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
    // ruleIndex is 5
//    System.out.println(ctx.getRuleIndex());

    assignmentRightPartType = "";
    varInitMap.put(ctx.identifier().getText(), new Boolean(true));
  }

  @Override
  public void exitAssignment_st(model_lang45Parser.Assignment_stContext ctx) {
    if (varTypeMap.containsKey(ctx.getChild(0).getText())) {
      String varType = (String) varTypeMap.get(ctx.getChild(0).getText());
      if (varType.equals("float")) {
        if (assignmentRightPartType.equals("bool") || assignmentRightPartType.equals("null")) {
          String identifierName = ctx.getChild(0).getText();
          ctx.addErrorNode(new ErrorNodeImpl(new SemanticErrorToken5()));
          System.err.println("Ошибка СеА №5: Несовместимость типов в присваивании. Переменная: " + identifierName);
        }
      }
      else if (!varType.equals(assignmentRightPartType)) {
        String identifierName = ctx.getChild(0).getText();
        ctx.addErrorNode(new ErrorNodeImpl(new SemanticErrorToken5()));
        System.err.println("Ошибка СеА №5: Несовместимость типов в присваивании. Переменная: " + identifierName);
      }
    }
  }

  @Override
  public void exitConditional_st(model_lang45Parser.Conditional_stContext ctx) {
    // ruleIndex is 6
//    System.out.println(ctx.getRuleIndex());
    if (!ifExpressionType.equals("bool")) {
      String identifierName = ctx.getChild(0).getText();
      ctx.addErrorNode(new ErrorNodeImpl(new SemanticErrorToken6()));
      System.err.println("Ошибка СеА №6: Тип выражения внутри условного оператора if отличен от логического.");
    }

    ifExpressionType = "";
  }

  // ---------- На этих событиях формирую стек выражения ---------------
  @Override
  public void enterFactor(model_lang45Parser.FactorContext ctx) {
    // ruleIndex is 19
//    System.out.println(ctx.getRuleIndex());
    if (ctx.getChildCount() == 1) { // solo identifier or number or logic value
      exprStack.add(ctx.getChild(0).getText());
    }
    else if (ctx.getChildCount() == 2) { // unary operator. second child is another factor, so it will be covered in future call
      exprStack.add(ctx.getChild(0).getText());
    }
    else if (ctx.getChildCount() == 3) { // expression in parentheses
      // do nothing. добавил, чтобы все случаи показать
    }
  }

  @Override
  public void enterMult_ops_r(model_lang45Parser.Mult_ops_rContext ctx) {
    exprStack.add(ctx.getText());
  }

  @Override
  public void enterAddition_ops(model_lang45Parser.Addition_opsContext ctx) {
    exprStack.add(ctx.getText());
  }

  @Override
  public void enterComp_ops_r(model_lang45Parser.Comp_ops_rContext ctx) {
    exprStack.add(ctx.getText());
  }
  // ------------------------------------------------------------------------

  @Override
  public void exitExpression(model_lang45Parser.ExpressionContext ctx) {
//    System.out.println(ctx.getParent().getRuleIndex());
    // Если это выражение из скобок, то проводим для него анализ сразу.
    // Его тип останется в стеке после анализа для дальнейшего анализа корневого выражения.
    if (ctx.getParent().getRuleIndex() == 19) {
      isInnerExprAreAnalyzing = true;  // todo: это я хотел флагом избежать добавления error узла во внутреннем выражении, который к нему не относится (не сделано)
      analyzeExpression(ctx);
      return;
    }
    isInnerExprAreAnalyzing = false;
    exprStack.forEach(System.out::println);
//    System.out.println(ctx.getPayload().getText());
    String expressionType = analyzeExpression(ctx);
    System.out.println(expressionType);
    if (ctx.getParent().getRuleIndex() == 5) {
      assignmentRightPartType = expressionType;
    } else if (ctx.getParent().getRuleIndex() == 6) {
      ifExpressionType = expressionType;
    }
    exprStack.clear(); // чистим стек выражения, заполненный в соответствующих правилах, на выходе из корневого выражения
  }

  private String analyzeExpression(model_lang45Parser.ExpressionContext ctx) {
    isThereExprTypesConflict = false;
    // expressionType: 0 - expr type error, 1 - bool, 2 - int, 3 - float
    IntegerWrapper expressionType = new IntegerWrapper(0);
    Boolean typesConflict = new Boolean(false);

//    List<ParseTree> children = new ArrayList<>(ctx.getChildCount());
//    for (int i = 0; i < ctx.getChildCount(); ++i) {
//      children.add(ctx.getChild(i));
//    }

    //parseExpression(children, expressionType);
    if (analyzeExpressionOnTypesConflict(expressionType)) {
      expressionType.value = 0;
      ctx.addErrorNode(new ErrorNodeImpl(new SemanticErrorToken4()));
      System.err.println("Ошибка СеА №4: Несовместимые типы в выражении.");
    }

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
        String expressionElement = children.get(i).getText();
        if (varTypeMap.containsKey(expressionElement)) {
          switch ((String)varTypeMap.get(expressionElement)) {
            case "bool":
//              exprStack.add("bool");
              if (expressionType.value < 1) expressionType.value = 1;
              break;
            case "int":
//              exprStack.add("int");
              if (expressionType.value < 2) expressionType.value = 2;
              break;
            case "float":
//              exprStack.add("float");
              if (expressionType.value < 3) expressionType.value = 3;
              break;
            default:
              System.out.println("no match");
          }
        }
        else if (expressionElement.compareTo("true") == 0 || expressionElement.compareTo("false") == 0) {
//          exprStack.add("bool");
          if (expressionType.value < 1) expressionType.value = 1;
        }
        else {
          if (expressionElement.contains(".")) {
//            exprStack.add("float");
            if (expressionType.value < 3) expressionType.value = 3;
          }
          else {
            try {
              // todo: учесть буквы-суфиксы для разных представлений целого числа
//              if (expressionElement.contains("d") || expressionElement.contains("D")) {
//                expressionElement = expressionElement.substring(0, expressionElement.length());
//              }
              Integer.parseInt(expressionElement);
//              exprStack.add("int");
              if (expressionType.value < 2) expressionType.value = 2;
            } catch (NumberFormatException ex) {
//              exprStack.add(expressionElement);
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

  // Анализ текущего стека на наличие конфликта типов
  private boolean analyzeExpressionOnTypesConflict(IntegerWrapper expressionType) {
    //todo: совместимость типов как в моём прошлом компиляторе
    convertExprStackValuesToTypes(expressionType);
    // EXPRE
//    for (int i = 0; i < exprStack.size(); ++i) {
//      tempExprStack.add(exprStack.get(i));
//      exprStack.remove(i);
//    }
//    sortOperationsByPrecedence();
    // todo: похоже, что здесь нужно "расфасовать" операции и их операнды в стеке по приоритету перед провдением анализа
    /* Есть ещё идея сделать для factor, term и operand правил отдельные стеки и обрабатывать их выражения на выходе из
       этих правил. Результат анализа будет помещаться в стек более младшей операции. В конце тип попадёт в основной стек выражения.
       В таком случае нужно будет написать дополнительно более мелкую обработку под каждый тип операций.
     */

    IntegerWrapper i = new IntegerWrapper(0);
    while (exprStack.size() != 1 && !isThereExprTypesConflict) {
      for (i.value = 0; i.value < exprStack.size(); i.value += 1) {
        if (exprStack.get(i.value).equals("mult") || exprStack.get(i.value).equals("div") ||
                exprStack.get(i.value).equals("and") || exprStack.get(i.value).equals("~")) {
          operationTypeValidation1(i);
          break;
        }
      }

      for (i.value = 0; i.value < exprStack.size(); i.value += 1) {
        if (exprStack.get(i.value).equals("plus") || exprStack.get(i.value).equals("min") || exprStack.get(i.value).equals("or"))
        {
          operationTypeValidation3(i);
          break;
        }
      }

      for (i.value = 0; i.value < exprStack.size(); i.value += 1) {
        if (exprStack.get(i.value).equals("LT") || exprStack.get(i.value).equals("LE") || exprStack.get(i.value).equals("NE") ||
                exprStack.get(i.value).equals("GT") || exprStack.get(i.value).equals("GE") || exprStack.get(i.value).equals("EQ"))
        {
          operationTypeValidation2(i);
          break;
        }
      }
    } // while

    // тут достаточно устанавливать expressionType (?)
    if (!isThereExprTypesConflict) {
      switch (exprStack.get(0)) {
        case "bool" -> expressionType.value = 1;
        case "int" -> expressionType.value = 2;
        case "float" -> expressionType.value = 3;
        default -> expressionType.value = 0;
      };
    }

    // EXPRE
//    for (String el : tempExprStack) {
//      exprStack.add(0, el);
//    }

    return isThereExprTypesConflict;
  }

//  private void sortOperationsByPrecedence() {
//    for (int i = 0; i < exprStack.size(); ++i) {
//      if (exprStack.get(i).equals("mult") && exprStack.get(i).equals("div") && exprStack.get(i).equals("and")) {
//        String operand1 = exprStack.get(i - 1);
//        String operation = exprStack.get(i);
//        String operand2 = exprStack.get(i + 1);
//        exprStack.remove(i - 1);
//        exprStack.remove(i - 1);
//        exprStack.remove(i - 1);
//        exprStack.add();
//      }
//    }
//  }

  // todo: вполне вероятно, что изменение expressionType здесь не нужно, и оно считается тут некорректно.
  private void convertExprStackValuesToTypes(IntegerWrapper expressionType) {
    for (int i = 0; i < exprStack.size(); ++i) {
      String curElement = exprStack.get(i);

      if (varTypeMap.containsKey(curElement)) {
        switch ((String)varTypeMap.get(curElement)) {
          case "bool":
            exprStack.remove(i);
            exprStack.add(i, "bool");
            if (expressionType.value < 1) expressionType.value = 1;
            break;
          case "int":
            exprStack.remove(i);
            exprStack.add(i, "int");
            if (expressionType.value < 2) expressionType.value = 2;
            break;
          case "float":
            exprStack.remove(i);
            exprStack.add(i, "float");
            if (expressionType.value < 3) expressionType.value = 3;
            break;
          default:
            System.out.println("no match");
        }
      }
      else if (curElement.compareTo("true") == 0 || curElement.compareTo("false") == 0) {
        exprStack.remove(i);
        exprStack.add(i, "bool");
        if (expressionType.value < 1) expressionType.value = 1;
      }
      else {
        if (curElement.contains(".")) {
          exprStack.remove(i);
          exprStack.add(i, "float");
          if (expressionType.value < 3) expressionType.value = 3;
        }
        else {
          try {
            Integer.parseInt(curElement);
            exprStack.remove(i);
            exprStack.add(i, "int");
            if (expressionType.value < 2) expressionType.value = 2;
          } catch (NumberFormatException ex) {
            exprStack.remove(i);
            exprStack.add(i, curElement);
//              System.out.println("This was operation token or type from nested expression.");
          }
        }
      }
    } // for
  }

  // mult, div, and, ~
  private void operationTypeValidation1(IntegerWrapper index)
  {
    String operation = exprStack.get(index.value);
    if (operation.equals("~")) {
      exprStack.remove(index.value);
//      String typeOfOperand = exprStack.get(index.value);
      exprStack.remove(index.value);
      exprStack.add(index.value, "bool");
    }
    else if (exprStack.get(index.value - 1).equals("int") && exprStack.get(index.value + 1).equals("int"))
    {
      // удаление обработанной операции из стека выражения
      exprStack.remove(index.value - 1);
      exprStack.remove(index.value - 1);
      exprStack.remove(index.value - 1);

      // добавление результата операции в стек
      if (operation.equals("div")) exprStack.add(index.value - 1, "float");
      else exprStack.add(index.value - 1, "int");
    }
    else if (exprStack.get(index.value - 1).equals("float") && exprStack.get(index.value + 1).equals("int") ||
            exprStack.get(index.value - 1).equals("int") && exprStack.get(index.value + 1).equals("float") ||
            exprStack.get(index.value - 1).equals("float") && exprStack.get(index.value + 1).equals("float"))
    {
      // удаление обработанной операции из стека выражения
      exprStack.remove(index.value - 1);
      exprStack.remove(index.value - 1);
      exprStack.remove(index.value - 1);

      // добавление результата операции в стек
      exprStack.add(index.value - 1, "float");
    }
    else if (exprStack.get(index.value - 1).equals("bool") || exprStack.get(index.value + 1).equals("bool"))
    {
      isThereExprTypesConflict = true;
    }
  }

  // comparison operations
  private void operationTypeValidation2(IntegerWrapper index)
  {
    if (exprStack.get(index.value - 1).equals("int") && exprStack.get(index.value + 1).equals("int"))
    {
      exprStack.remove(index.value - 1);
      exprStack.remove(index.value - 1);
      exprStack.remove(index.value - 1);

      exprStack.add(index.value - 1, "bool");
    }
    else if (exprStack.get(index.value - 1).equals("float") && exprStack.get(index.value + 1).equals("int") ||
            exprStack.get(index.value - 1).equals("int") && exprStack.get(index.value + 1).equals("float") ||
            exprStack.get(index.value - 1).equals("float") && exprStack.get(index.value + 1).equals("float"))
    {
      exprStack.remove(index.value - 1);
      exprStack.remove(index.value - 1);
      exprStack.remove(index.value - 1);

      exprStack.add(index.value - 1, "bool");
    }
    else if (exprStack.get(index.value - 1).equals("bool") && exprStack.get(index.value + 1).equals("bool"))
    {
      if (exprStack.get(index.value).equals("NE") || exprStack.get(index.value).equals("EQ"))
      {
        exprStack.remove(index.value - 1);
        exprStack.remove(index.value - 1);
        exprStack.remove(index.value - 1);

        exprStack.add(index.value - 1, "bool");
      }
      else
      {
        isThereExprTypesConflict = true;
      }
    }
    else
    {
      isThereExprTypesConflict = true;
    }
  }

  // add, sub, or
  private void operationTypeValidation3(IntegerWrapper index) {
    String operation = exprStack.get(index.value);
    if (operation.equals("or")) {
      if (exprStack.get(index.value - 1).equals("bool") && exprStack.get(index.value + 1).equals("bool"))
      {
        exprStack.remove(index.value - 1);
        exprStack.remove(index.value - 1);
        exprStack.remove(index.value - 1);

        exprStack.add(index.value - 1, "bool");
      }
      else
      {
        isThereExprTypesConflict = true;
      }
    }
    else if (exprStack.get(index.value - 1).equals("int") && exprStack.get(index.value + 1).equals("int"))
    {
      exprStack.remove(index.value - 1);
      exprStack.remove(index.value - 1);
      exprStack.remove(index.value - 1);

      exprStack.add(index.value - 1, "int");
    }
    else if (exprStack.get(index.value - 1).equals("float") && exprStack.get(index.value + 1).equals("int") ||
            exprStack.get(index.value - 1).equals("int") && exprStack.get(index.value + 1).equals("float") ||
            exprStack.get(index.value - 1).equals("float") && exprStack.get(index.value + 1).equals("float"))
    {
      exprStack.remove(index.value - 1);
      exprStack.remove(index.value - 1);
      exprStack.remove(index.value - 1);

      exprStack.add(index.value - 1, "float");
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
