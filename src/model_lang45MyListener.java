public class model_lang45MyListener extends model_lang45BaseListener {
  @Override
  public void enterProgram(model_lang45Parser.ProgramContext ctx)
  {
    System.out.println("Program visited: " + ctx.getText());
  }

  @Override
  public void exitProgram(model_lang45Parser.ProgramContext ctx)
  {
    System.out.println("Exit from program: " + ctx.getText());
  }
}
