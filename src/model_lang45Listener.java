// Generated from model_lang45/model_lang45.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link model_lang45Parser}.
 */
public interface model_lang45Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(model_lang45Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(model_lang45Parser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(model_lang45Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(model_lang45Parser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(model_lang45Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(model_lang45Parser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(model_lang45Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(model_lang45Parser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#compound_st}.
	 * @param ctx the parse tree
	 */
	void enterCompound_st(model_lang45Parser.Compound_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#compound_st}.
	 * @param ctx the parse tree
	 */
	void exitCompound_st(model_lang45Parser.Compound_stContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#assignment_st}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_st(model_lang45Parser.Assignment_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#assignment_st}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_st(model_lang45Parser.Assignment_stContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#conditional_st}.
	 * @param ctx the parse tree
	 */
	void enterConditional_st(model_lang45Parser.Conditional_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#conditional_st}.
	 * @param ctx the parse tree
	 */
	void exitConditional_st(model_lang45Parser.Conditional_stContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#fixed_loop_st}.
	 * @param ctx the parse tree
	 */
	void enterFixed_loop_st(model_lang45Parser.Fixed_loop_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#fixed_loop_st}.
	 * @param ctx the parse tree
	 */
	void exitFixed_loop_st(model_lang45Parser.Fixed_loop_stContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#conditional_loop_st}.
	 * @param ctx the parse tree
	 */
	void enterConditional_loop_st(model_lang45Parser.Conditional_loop_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#conditional_loop_st}.
	 * @param ctx the parse tree
	 */
	void exitConditional_loop_st(model_lang45Parser.Conditional_loop_stContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#input_st}.
	 * @param ctx the parse tree
	 */
	void enterInput_st(model_lang45Parser.Input_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#input_st}.
	 * @param ctx the parse tree
	 */
	void exitInput_st(model_lang45Parser.Input_stContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#output_st}.
	 * @param ctx the parse tree
	 */
	void enterOutput_st(model_lang45Parser.Output_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#output_st}.
	 * @param ctx the parse tree
	 */
	void exitOutput_st(model_lang45Parser.Output_stContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(model_lang45Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(model_lang45Parser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(model_lang45Parser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(model_lang45Parser.OperandContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#addition_ops}.
	 * @param ctx the parse tree
	 */
	void enterAddition_ops(model_lang45Parser.Addition_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#addition_ops}.
	 * @param ctx the parse tree
	 */
	void exitAddition_ops(model_lang45Parser.Addition_opsContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(model_lang45Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(model_lang45Parser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(model_lang45Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(model_lang45Parser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#logic_value}.
	 * @param ctx the parse tree
	 */
	void enterLogic_value(model_lang45Parser.Logic_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#logic_value}.
	 * @param ctx the parse tree
	 */
	void exitLogic_value(model_lang45Parser.Logic_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(model_lang45Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(model_lang45Parser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link model_lang45Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(model_lang45Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link model_lang45Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(model_lang45Parser.IdentifierContext ctx);
}