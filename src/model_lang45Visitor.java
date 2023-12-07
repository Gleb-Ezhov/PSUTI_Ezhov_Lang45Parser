// Generated from model_lang45.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link model_lang45Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface model_lang45Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(model_lang45Parser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(model_lang45Parser.DeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(model_lang45Parser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(model_lang45Parser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#compound_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_st(model_lang45Parser.Compound_stContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#assignment_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_st(model_lang45Parser.Assignment_stContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#conditional_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_st(model_lang45Parser.Conditional_stContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#fixed_loop_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_loop_st(model_lang45Parser.Fixed_loop_stContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#conditional_loop_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_loop_st(model_lang45Parser.Conditional_loop_stContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#input_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_st(model_lang45Parser.Input_stContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#output_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_st(model_lang45Parser.Output_stContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(model_lang45Parser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#comp_ops_r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_ops_r(model_lang45Parser.Comp_ops_rContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(model_lang45Parser.OperandContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#addition_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition_ops(model_lang45Parser.Addition_opsContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(model_lang45Parser.TermContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#mult_ops_r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_ops_r(model_lang45Parser.Mult_ops_rContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(model_lang45Parser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#logic_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_value(model_lang45Parser.Logic_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(model_lang45Parser.FactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link model_lang45Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(model_lang45Parser.IdentifierContext ctx);
}