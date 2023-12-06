// Generated from model_lang45/model_lang45.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class model_lang45Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, DIM=3, INT=4, FLOAT=5, BOOL=6, IF=7, ELSE=8, FOR=9, TO=10, 
		STEP=11, NEXT=12, WHILE=13, READLN=14, WRITELN=15, TRUE=16, FALSE=17, 
		COMPARISON_OPS=18, MULTIPLICATION_OPS=19, ADD=20, SUB=21, OR=22, UNARY_OP=23, 
		ID=24, LETTER=25, OPEN_BRACKET=26, CLOSE_BRACKET=27, COLON=28, SEMICOLON=29, 
		ASSIGNMENT=30, COMMA=31, REAL_NUMBER=32, EXP=33, INT_NUMBER=34, BIN_NUMBER=35, 
		OCT_NUMBER=36, DEC_NUMBER=37, HEX_NUMBER=38, WHITE_SPACE=39, COMMENTARY=40;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_type = 2, RULE_statement = 3, 
		RULE_compound_st = 4, RULE_assignment_st = 5, RULE_conditional_st = 6, 
		RULE_fixed_loop_st = 7, RULE_conditional_loop_st = 8, RULE_input_st = 9, 
		RULE_output_st = 10, RULE_expression = 11, RULE_operand = 12, RULE_addition_ops = 13, 
		RULE_term = 14, RULE_number = 15, RULE_logic_value = 16, RULE_factor = 17, 
		RULE_identifier = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "type", "statement", "compound_st", "assignment_st", 
			"conditional_st", "fixed_loop_st", "conditional_loop_st", "input_st", 
			"output_st", "expression", "operand", "addition_ops", "term", "number", 
			"logic_value", "factor", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'end'", "'dim'", "'int'", "'float'", "'bool'", "'if'", 
			"'else'", "'for'", "'to'", "'step'", "'next'", "'while'", "'readln'", 
			"'writeln'", "'true'", "'false'", null, null, "'plus'", "'min'", "'or'", 
			"'~'", null, null, "'('", "')'", "':'", "';'", "':='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BEGIN", "END", "DIM", "INT", "FLOAT", "BOOL", "IF", "ELSE", "FOR", 
			"TO", "STEP", "NEXT", "WHILE", "READLN", "WRITELN", "TRUE", "FALSE", 
			"COMPARISON_OPS", "MULTIPLICATION_OPS", "ADD", "SUB", "OR", "UNARY_OP", 
			"ID", "LETTER", "OPEN_BRACKET", "CLOSE_BRACKET", "COLON", "SEMICOLON", 
			"ASSIGNMENT", "COMMA", "REAL_NUMBER", "EXP", "INT_NUMBER", "BIN_NUMBER", 
			"OCT_NUMBER", "DEC_NUMBER", "HEX_NUMBER", "WHITE_SPACE", "COMMENTARY"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "model_lang45.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public model_lang45Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(model_lang45Parser.END, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(model_lang45Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(model_lang45Parser.COLON, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIM:
					{
					setState(38);
					declaration();
					}
					break;
				case BEGIN:
				case IF:
				case FOR:
				case WHILE:
				case READLN:
				case WRITELN:
				case ID:
					{
					setState(39);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(42);
					match(COLON);
					}
				}

				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16835210L) != 0) );
			setState(49);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode DIM() { return getToken(model_lang45Parser.DIM, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(model_lang45Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(model_lang45Parser.COMMA, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(DIM);
			setState(52);
			identifier();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(53);
				match(COMMA);
				setState(54);
				identifier();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(model_lang45Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(model_lang45Parser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(model_lang45Parser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Compound_stContext compound_st() {
			return getRuleContext(Compound_stContext.class,0);
		}
		public Assignment_stContext assignment_st() {
			return getRuleContext(Assignment_stContext.class,0);
		}
		public Conditional_stContext conditional_st() {
			return getRuleContext(Conditional_stContext.class,0);
		}
		public Fixed_loop_stContext fixed_loop_st() {
			return getRuleContext(Fixed_loop_stContext.class,0);
		}
		public Conditional_loop_stContext conditional_loop_st() {
			return getRuleContext(Conditional_loop_stContext.class,0);
		}
		public Input_stContext input_st() {
			return getRuleContext(Input_stContext.class,0);
		}
		public Output_stContext output_st() {
			return getRuleContext(Output_stContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				compound_st();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				assignment_st();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				conditional_st();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				fixed_loop_st();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				conditional_loop_st();
				}
				break;
			case READLN:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				input_st();
				}
				break;
			case WRITELN:
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
				output_st();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_stContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(model_lang45Parser.BEGIN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode END() { return getToken(model_lang45Parser.END, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(model_lang45Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(model_lang45Parser.SEMICOLON, i);
		}
		public Compound_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterCompound_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitCompound_st(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitCompound_st(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stContext compound_st() throws RecognitionException {
		Compound_stContext _localctx = new Compound_stContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compound_st);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(BEGIN);
			setState(74);
			statement();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(75);
				match(SEMICOLON);
				setState(76);
				statement();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_stContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(model_lang45Parser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterAssignment_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitAssignment_st(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitAssignment_st(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stContext assignment_st() throws RecognitionException {
		Assignment_stContext _localctx = new Assignment_stContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			identifier();
			setState(85);
			match(ASSIGNMENT);
			setState(86);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_stContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(model_lang45Parser.IF, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(model_lang45Parser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(model_lang45Parser.CLOSE_BRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(model_lang45Parser.ELSE, 0); }
		public Conditional_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterConditional_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitConditional_st(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitConditional_st(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_stContext conditional_st() throws RecognitionException {
		Conditional_stContext _localctx = new Conditional_stContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditional_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IF);
			setState(89);
			match(OPEN_BRACKET);
			setState(90);
			expression();
			setState(91);
			match(CLOSE_BRACKET);
			setState(92);
			statement();
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(93);
				match(ELSE);
				setState(94);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fixed_loop_stContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(model_lang45Parser.FOR, 0); }
		public Assignment_stContext assignment_st() {
			return getRuleContext(Assignment_stContext.class,0);
		}
		public TerminalNode TO() { return getToken(model_lang45Parser.TO, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(model_lang45Parser.NEXT, 0); }
		public TerminalNode STEP() { return getToken(model_lang45Parser.STEP, 0); }
		public Fixed_loop_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_loop_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterFixed_loop_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitFixed_loop_st(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitFixed_loop_st(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_loop_stContext fixed_loop_st() throws RecognitionException {
		Fixed_loop_stContext _localctx = new Fixed_loop_stContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fixed_loop_st);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(FOR);
			setState(98);
			assignment_st();
			setState(99);
			match(TO);
			setState(100);
			expression();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(101);
				match(STEP);
				setState(102);
				expression();
				}
			}

			setState(105);
			statement();
			setState(106);
			match(NEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_loop_stContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(model_lang45Parser.WHILE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(model_lang45Parser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(model_lang45Parser.CLOSE_BRACKET, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Conditional_loop_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_loop_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterConditional_loop_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitConditional_loop_st(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitConditional_loop_st(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_loop_stContext conditional_loop_st() throws RecognitionException {
		Conditional_loop_stContext _localctx = new Conditional_loop_stContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditional_loop_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(WHILE);
			setState(109);
			match(OPEN_BRACKET);
			setState(110);
			expression();
			setState(111);
			match(CLOSE_BRACKET);
			setState(112);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Input_stContext extends ParserRuleContext {
		public TerminalNode READLN() { return getToken(model_lang45Parser.READLN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(model_lang45Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(model_lang45Parser.COMMA, i);
		}
		public Input_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterInput_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitInput_st(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitInput_st(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_stContext input_st() throws RecognitionException {
		Input_stContext _localctx = new Input_stContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_input_st);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(READLN);
			setState(115);
			identifier();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(116);
				match(COMMA);
				setState(117);
				identifier();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Output_stContext extends ParserRuleContext {
		public TerminalNode WRITELN() { return getToken(model_lang45Parser.WRITELN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(model_lang45Parser.COMMA, 0); }
		public Output_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterOutput_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitOutput_st(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitOutput_st(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_stContext output_st() throws RecognitionException {
		Output_stContext _localctx = new Output_stContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_output_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(WRITELN);
			setState(124);
			expression();
			{
			setState(125);
			match(COMMA);
			setState(126);
			expression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<TerminalNode> COMPARISON_OPS() { return getTokens(model_lang45Parser.COMPARISON_OPS); }
		public TerminalNode COMPARISON_OPS(int i) {
			return getToken(model_lang45Parser.COMPARISON_OPS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			operand();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMPARISON_OPS) {
				{
				{
				setState(129);
				match(COMPARISON_OPS);
				setState(130);
				operand();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperandContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Addition_opsContext> addition_ops() {
			return getRuleContexts(Addition_opsContext.class);
		}
		public Addition_opsContext addition_ops(int i) {
			return getRuleContext(Addition_opsContext.class,i);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			term();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) {
				{
				{
				setState(137);
				addition_ops();
				setState(138);
				term();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Addition_opsContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(model_lang45Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(model_lang45Parser.SUB, 0); }
		public TerminalNode OR() { return getToken(model_lang45Parser.OR, 0); }
		public Addition_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterAddition_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitAddition_ops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitAddition_ops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Addition_opsContext addition_ops() throws RecognitionException {
		Addition_opsContext _localctx = new Addition_opsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_addition_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULTIPLICATION_OPS() { return getTokens(model_lang45Parser.MULTIPLICATION_OPS); }
		public TerminalNode MULTIPLICATION_OPS(int i) {
			return getToken(model_lang45Parser.MULTIPLICATION_OPS, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			factor();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICATION_OPS) {
				{
				{
				setState(148);
				match(MULTIPLICATION_OPS);
				setState(149);
				factor();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT_NUMBER() { return getToken(model_lang45Parser.INT_NUMBER, 0); }
		public TerminalNode REAL_NUMBER() { return getToken(model_lang45Parser.REAL_NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !(_la==REAL_NUMBER || _la==INT_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logic_valueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(model_lang45Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(model_lang45Parser.FALSE, 0); }
		public Logic_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterLogic_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitLogic_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitLogic_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_valueContext logic_value() throws RecognitionException {
		Logic_valueContext _localctx = new Logic_valueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logic_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Logic_valueContext logic_value() {
			return getRuleContext(Logic_valueContext.class,0);
		}
		public TerminalNode UNARY_OP() { return getToken(model_lang45Parser.UNARY_OP, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(model_lang45Parser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(model_lang45Parser.CLOSE_BRACKET, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				identifier();
				}
				break;
			case REAL_NUMBER:
			case INT_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				number();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				logic_value();
				}
				break;
			case UNARY_OP:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(162);
				match(UNARY_OP);
				setState(163);
				factor();
				}
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(164);
				match(OPEN_BRACKET);
				setState(165);
				expression();
				setState(166);
				match(CLOSE_BRACKET);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(model_lang45Parser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof model_lang45Listener ) ((model_lang45Listener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof model_lang45Visitor ) return ((model_lang45Visitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u00ad\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0003\u0000)\b\u0000\u0001\u0000\u0003\u0000"+
		",\b\u0000\u0004\u0000.\b\u0000\u000b\u0000\f\u0000/\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00018\b"+
		"\u0001\n\u0001\f\u0001;\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003H\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004N\b\u0004\n\u0004\f\u0004Q\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006`\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007h\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\tw\b\t\n\t\f\tz\t\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0084"+
		"\b\u000b\n\u000b\f\u000b\u0087\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0005\f\u008d\b\f\n\f\f\f\u0090\t\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0097\b\u000e\n\u000e\f\u000e\u009a\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00a9\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0004\u0001\u0000\u0004\u0006"+
		"\u0001\u0000\u0014\u0016\u0002\u0000  \"\"\u0001\u0000\u0010\u0011\u00ae"+
		"\u0000-\u0001\u0000\u0000\u0000\u00023\u0001\u0000\u0000\u0000\u0004>"+
		"\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bI\u0001\u0000"+
		"\u0000\u0000\nT\u0001\u0000\u0000\u0000\fX\u0001\u0000\u0000\u0000\u000e"+
		"a\u0001\u0000\u0000\u0000\u0010l\u0001\u0000\u0000\u0000\u0012r\u0001"+
		"\u0000\u0000\u0000\u0014{\u0001\u0000\u0000\u0000\u0016\u0080\u0001\u0000"+
		"\u0000\u0000\u0018\u0088\u0001\u0000\u0000\u0000\u001a\u0091\u0001\u0000"+
		"\u0000\u0000\u001c\u0093\u0001\u0000\u0000\u0000\u001e\u009b\u0001\u0000"+
		"\u0000\u0000 \u009d\u0001\u0000\u0000\u0000\"\u00a8\u0001\u0000\u0000"+
		"\u0000$\u00aa\u0001\u0000\u0000\u0000&)\u0003\u0002\u0001\u0000\')\u0003"+
		"\u0006\u0003\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000"+
		")+\u0001\u0000\u0000\u0000*,\u0005\u001c\u0000\u0000+*\u0001\u0000\u0000"+
		"\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-(\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0005\u0002\u0000\u0000"+
		"2\u0001\u0001\u0000\u0000\u000034\u0005\u0003\u0000\u000049\u0003$\u0012"+
		"\u000056\u0005\u001f\u0000\u000068\u0003$\u0012\u000075\u0001\u0000\u0000"+
		"\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000"+
		"\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0003"+
		"\u0004\u0002\u0000=\u0003\u0001\u0000\u0000\u0000>?\u0007\u0000\u0000"+
		"\u0000?\u0005\u0001\u0000\u0000\u0000@H\u0003\b\u0004\u0000AH\u0003\n"+
		"\u0005\u0000BH\u0003\f\u0006\u0000CH\u0003\u000e\u0007\u0000DH\u0003\u0010"+
		"\b\u0000EH\u0003\u0012\t\u0000FH\u0003\u0014\n\u0000G@\u0001\u0000\u0000"+
		"\u0000GA\u0001\u0000\u0000\u0000GB\u0001\u0000\u0000\u0000GC\u0001\u0000"+
		"\u0000\u0000GD\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GF\u0001"+
		"\u0000\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0005\u0001\u0000"+
		"\u0000JO\u0003\u0006\u0003\u0000KL\u0005\u001d\u0000\u0000LN\u0003\u0006"+
		"\u0003\u0000MK\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000RS\u0005\u0002\u0000\u0000S\t\u0001\u0000\u0000"+
		"\u0000TU\u0003$\u0012\u0000UV\u0005\u001e\u0000\u0000VW\u0003\u0016\u000b"+
		"\u0000W\u000b\u0001\u0000\u0000\u0000XY\u0005\u0007\u0000\u0000YZ\u0005"+
		"\u001a\u0000\u0000Z[\u0003\u0016\u000b\u0000[\\\u0005\u001b\u0000\u0000"+
		"\\_\u0003\u0006\u0003\u0000]^\u0005\b\u0000\u0000^`\u0003\u0006\u0003"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\r\u0001\u0000"+
		"\u0000\u0000ab\u0005\t\u0000\u0000bc\u0003\n\u0005\u0000cd\u0005\n\u0000"+
		"\u0000dg\u0003\u0016\u000b\u0000ef\u0005\u000b\u0000\u0000fh\u0003\u0016"+
		"\u000b\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000ij\u0003\u0006\u0003\u0000jk\u0005\f\u0000\u0000k\u000f"+
		"\u0001\u0000\u0000\u0000lm\u0005\r\u0000\u0000mn\u0005\u001a\u0000\u0000"+
		"no\u0003\u0016\u000b\u0000op\u0005\u001b\u0000\u0000pq\u0003\u0006\u0003"+
		"\u0000q\u0011\u0001\u0000\u0000\u0000rs\u0005\u000e\u0000\u0000sx\u0003"+
		"$\u0012\u0000tu\u0005\u001f\u0000\u0000uw\u0003$\u0012\u0000vt\u0001\u0000"+
		"\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000y\u0013\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000{|\u0005\u000f\u0000\u0000|}\u0003\u0016\u000b\u0000}~\u0005\u001f"+
		"\u0000\u0000~\u007f\u0003\u0016\u000b\u0000\u007f\u0015\u0001\u0000\u0000"+
		"\u0000\u0080\u0085\u0003\u0018\f\u0000\u0081\u0082\u0005\u0012\u0000\u0000"+
		"\u0082\u0084\u0003\u0018\f\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084"+
		"\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0017\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0088\u008e\u0003\u001c\u000e\u0000\u0089"+
		"\u008a\u0003\u001a\r\u0000\u008a\u008b\u0003\u001c\u000e\u0000\u008b\u008d"+
		"\u0001\u0000\u0000\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008d\u0090"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0019\u0001\u0000\u0000\u0000\u0090\u008e"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0007\u0001\u0000\u0000\u0092\u001b"+
		"\u0001\u0000\u0000\u0000\u0093\u0098\u0003\"\u0011\u0000\u0094\u0095\u0005"+
		"\u0013\u0000\u0000\u0095\u0097\u0003\"\u0011\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u001d\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0007\u0002"+
		"\u0000\u0000\u009c\u001f\u0001\u0000\u0000\u0000\u009d\u009e\u0007\u0003"+
		"\u0000\u0000\u009e!\u0001\u0000\u0000\u0000\u009f\u00a9\u0003$\u0012\u0000"+
		"\u00a0\u00a9\u0003\u001e\u000f\u0000\u00a1\u00a9\u0003 \u0010\u0000\u00a2"+
		"\u00a3\u0005\u0017\u0000\u0000\u00a3\u00a9\u0003\"\u0011\u0000\u00a4\u00a5"+
		"\u0005\u001a\u0000\u0000\u00a5\u00a6\u0003\u0016\u000b\u0000\u00a6\u00a7"+
		"\u0005\u001b\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u009f"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a0\u0001\u0000\u0000\u0000\u00a8\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a2\u0001\u0000\u0000\u0000\u00a8\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a9#\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		"\u0018\u0000\u0000\u00ab%\u0001\u0000\u0000\u0000\r(+/9GO_gx\u0085\u008e"+
		"\u0098\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}