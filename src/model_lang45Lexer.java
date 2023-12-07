// Generated from model_lang45.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class model_lang45Lexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BEGIN", "END", "DIM", "INT", "FLOAT", "BOOL", "IF", "ELSE", "FOR", "TO", 
			"STEP", "NEXT", "WHILE", "READLN", "WRITELN", "TRUE", "FALSE", "COMPARISON_OPS", 
			"MULTIPLICATION_OPS", "ADD", "SUB", "OR", "UNARY_OP", "ID", "LETTER", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "COLON", "SEMICOLON", "ASSIGNMENT", 
			"COMMA", "REAL_NUMBER", "EXP", "INT_NUMBER", "BIN_NUMBER", "OCT_NUMBER", 
			"DEC_NUMBER", "HEX_NUMBER", "DIGIT", "BIN_DIGIT", "OCT_DIGIT", "HEX_DIGIT", 
			"BIN_LETTER", "OCT_LETTER", "HEX_LETTER", "DEC_LETTER", "EXP_LETTER", 
			"WHITE_SPACE", "COMMENTARY"
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


	public model_lang45Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "model_lang45.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000(\u0169\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00c6\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00d2\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u00e5\b\u0017\n\u0017\f\u0017\u00e8\t\u0017\u0001"+
		"\u0018\u0003\u0018\u00eb\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0004\u001f\u00fb"+
		"\b\u001f\u000b\u001f\f\u001f\u00fc\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0004\u001f\u0102\b\u001f\u000b\u001f\f\u001f\u0103\u0003\u001f\u0106"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0004\u001f\u010a\b\u001f\u000b\u001f"+
		"\f\u001f\u010b\u0001\u001f\u0003\u001f\u010f\b\u001f\u0003\u001f\u0111"+
		"\b\u001f\u0001 \u0001 \u0001 \u0003 \u0116\b \u0001 \u0004 \u0119\b \u000b"+
		" \f \u011a\u0001!\u0001!\u0001!\u0003!\u0120\b!\u0001\"\u0004\"\u0123"+
		"\b\"\u000b\"\f\"\u0124\u0001\"\u0001\"\u0001#\u0004#\u012a\b#\u000b#\f"+
		"#\u012b\u0001#\u0001#\u0001$\u0004$\u0131\b$\u000b$\f$\u0132\u0001$\u0003"+
		"$\u0136\b$\u0001%\u0001%\u0005%\u013a\b%\n%\f%\u013d\t%\u0001%\u0001%"+
		"\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0003)\u0149"+
		"\b)\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001"+
		".\u0001/\u0004/\u0156\b/\u000b/\f/\u0157\u0001/\u0001/\u00010\u00010\u0001"+
		"0\u00010\u00050\u0160\b0\n0\f0\u0163\t0\u00010\u00010\u00010\u00010\u0001"+
		"0\u0001\u0161\u00001\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014"+
		")\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e"+
		"=\u001f? A!C\"E#G$I%K&M\u0000O\u0000Q\u0000S\u0000U\u0000W\u0000Y\u0000"+
		"[\u0000]\u0000_\'a(\u0001\u0000\b\u0002\u0000AZaz\u0002\u0000AFaf\u0002"+
		"\u0000BBbb\u0002\u0000OOoo\u0002\u0000HHhh\u0002\u0000DDdd\u0002\u0000"+
		"EEee\u0003\u0000\t\n\r\r  \u017b\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000"+
		"\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I"+
		"\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000_\u0001\u0000"+
		"\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0001c\u0001\u0000\u0000\u0000"+
		"\u0003i\u0001\u0000\u0000\u0000\u0005m\u0001\u0000\u0000\u0000\u0007q"+
		"\u0001\u0000\u0000\u0000\tu\u0001\u0000\u0000\u0000\u000b{\u0001\u0000"+
		"\u0000\u0000\r\u0080\u0001\u0000\u0000\u0000\u000f\u0083\u0001\u0000\u0000"+
		"\u0000\u0011\u0088\u0001\u0000\u0000\u0000\u0013\u008c\u0001\u0000\u0000"+
		"\u0000\u0015\u008f\u0001\u0000\u0000\u0000\u0017\u0094\u0001\u0000\u0000"+
		"\u0000\u0019\u0099\u0001\u0000\u0000\u0000\u001b\u009f\u0001\u0000\u0000"+
		"\u0000\u001d\u00a6\u0001\u0000\u0000\u0000\u001f\u00ae\u0001\u0000\u0000"+
		"\u0000!\u00b3\u0001\u0000\u0000\u0000#\u00c5\u0001\u0000\u0000\u0000%"+
		"\u00d1\u0001\u0000\u0000\u0000\'\u00d3\u0001\u0000\u0000\u0000)\u00d8"+
		"\u0001\u0000\u0000\u0000+\u00dc\u0001\u0000\u0000\u0000-\u00df\u0001\u0000"+
		"\u0000\u0000/\u00e1\u0001\u0000\u0000\u00001\u00ea\u0001\u0000\u0000\u0000"+
		"3\u00ec\u0001\u0000\u0000\u00005\u00ee\u0001\u0000\u0000\u00007\u00f0"+
		"\u0001\u0000\u0000\u00009\u00f2\u0001\u0000\u0000\u0000;\u00f4\u0001\u0000"+
		"\u0000\u0000=\u00f7\u0001\u0000\u0000\u0000?\u0110\u0001\u0000\u0000\u0000"+
		"A\u0112\u0001\u0000\u0000\u0000C\u011f\u0001\u0000\u0000\u0000E\u0122"+
		"\u0001\u0000\u0000\u0000G\u0129\u0001\u0000\u0000\u0000I\u0130\u0001\u0000"+
		"\u0000\u0000K\u0137\u0001\u0000\u0000\u0000M\u0140\u0001\u0000\u0000\u0000"+
		"O\u0142\u0001\u0000\u0000\u0000Q\u0144\u0001\u0000\u0000\u0000S\u0148"+
		"\u0001\u0000\u0000\u0000U\u014a\u0001\u0000\u0000\u0000W\u014c\u0001\u0000"+
		"\u0000\u0000Y\u014e\u0001\u0000\u0000\u0000[\u0150\u0001\u0000\u0000\u0000"+
		"]\u0152\u0001\u0000\u0000\u0000_\u0155\u0001\u0000\u0000\u0000a\u015b"+
		"\u0001\u0000\u0000\u0000cd\u0005b\u0000\u0000de\u0005e\u0000\u0000ef\u0005"+
		"g\u0000\u0000fg\u0005i\u0000\u0000gh\u0005n\u0000\u0000h\u0002\u0001\u0000"+
		"\u0000\u0000ij\u0005e\u0000\u0000jk\u0005n\u0000\u0000kl\u0005d\u0000"+
		"\u0000l\u0004\u0001\u0000\u0000\u0000mn\u0005d\u0000\u0000no\u0005i\u0000"+
		"\u0000op\u0005m\u0000\u0000p\u0006\u0001\u0000\u0000\u0000qr\u0005i\u0000"+
		"\u0000rs\u0005n\u0000\u0000st\u0005t\u0000\u0000t\b\u0001\u0000\u0000"+
		"\u0000uv\u0005f\u0000\u0000vw\u0005l\u0000\u0000wx\u0005o\u0000\u0000"+
		"xy\u0005a\u0000\u0000yz\u0005t\u0000\u0000z\n\u0001\u0000\u0000\u0000"+
		"{|\u0005b\u0000\u0000|}\u0005o\u0000\u0000}~\u0005o\u0000\u0000~\u007f"+
		"\u0005l\u0000\u0000\u007f\f\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"i\u0000\u0000\u0081\u0082\u0005f\u0000\u0000\u0082\u000e\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005e\u0000\u0000\u0084\u0085\u0005l\u0000\u0000\u0085"+
		"\u0086\u0005s\u0000\u0000\u0086\u0087\u0005e\u0000\u0000\u0087\u0010\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0005f\u0000\u0000\u0089\u008a\u0005o\u0000"+
		"\u0000\u008a\u008b\u0005r\u0000\u0000\u008b\u0012\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0005t\u0000\u0000\u008d\u008e\u0005o\u0000\u0000\u008e\u0014"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005s\u0000\u0000\u0090\u0091\u0005"+
		"t\u0000\u0000\u0091\u0092\u0005e\u0000\u0000\u0092\u0093\u0005p\u0000"+
		"\u0000\u0093\u0016\u0001\u0000\u0000\u0000\u0094\u0095\u0005n\u0000\u0000"+
		"\u0095\u0096\u0005e\u0000\u0000\u0096\u0097\u0005x\u0000\u0000\u0097\u0098"+
		"\u0005t\u0000\u0000\u0098\u0018\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"w\u0000\u0000\u009a\u009b\u0005h\u0000\u0000\u009b\u009c\u0005i\u0000"+
		"\u0000\u009c\u009d\u0005l\u0000\u0000\u009d\u009e\u0005e\u0000\u0000\u009e"+
		"\u001a\u0001\u0000\u0000\u0000\u009f\u00a0\u0005r\u0000\u0000\u00a0\u00a1"+
		"\u0005e\u0000\u0000\u00a1\u00a2\u0005a\u0000\u0000\u00a2\u00a3\u0005d"+
		"\u0000\u0000\u00a3\u00a4\u0005l\u0000\u0000\u00a4\u00a5\u0005n\u0000\u0000"+
		"\u00a5\u001c\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005w\u0000\u0000\u00a7"+
		"\u00a8\u0005r\u0000\u0000\u00a8\u00a9\u0005i\u0000\u0000\u00a9\u00aa\u0005"+
		"t\u0000\u0000\u00aa\u00ab\u0005e\u0000\u0000\u00ab\u00ac\u0005l\u0000"+
		"\u0000\u00ac\u00ad\u0005n\u0000\u0000\u00ad\u001e\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005t\u0000\u0000\u00af\u00b0\u0005r\u0000\u0000\u00b0\u00b1"+
		"\u0005u\u0000\u0000\u00b1\u00b2\u0005e\u0000\u0000\u00b2 \u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005f\u0000\u0000\u00b4\u00b5\u0005a\u0000\u0000"+
		"\u00b5\u00b6\u0005l\u0000\u0000\u00b6\u00b7\u0005s\u0000\u0000\u00b7\u00b8"+
		"\u0005e\u0000\u0000\u00b8\"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		"N\u0000\u0000\u00ba\u00c6\u0005E\u0000\u0000\u00bb\u00bc\u0005E\u0000"+
		"\u0000\u00bc\u00c6\u0005Q\u0000\u0000\u00bd\u00be\u0005L\u0000\u0000\u00be"+
		"\u00c6\u0005T\u0000\u0000\u00bf\u00c0\u0005L\u0000\u0000\u00c0\u00c6\u0005"+
		"E\u0000\u0000\u00c1\u00c2\u0005G\u0000\u0000\u00c2\u00c6\u0005T\u0000"+
		"\u0000\u00c3\u00c4\u0005G\u0000\u0000\u00c4\u00c6\u0005E\u0000\u0000\u00c5"+
		"\u00b9\u0001\u0000\u0000\u0000\u00c5\u00bb\u0001\u0000\u0000\u0000\u00c5"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c5\u00bf\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6"+
		"$\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005m\u0000\u0000\u00c8\u00c9\u0005"+
		"u\u0000\u0000\u00c9\u00ca\u0005l\u0000\u0000\u00ca\u00d2\u0005t\u0000"+
		"\u0000\u00cb\u00cc\u0005d\u0000\u0000\u00cc\u00cd\u0005i\u0000\u0000\u00cd"+
		"\u00d2\u0005v\u0000\u0000\u00ce\u00cf\u0005a\u0000\u0000\u00cf\u00d0\u0005"+
		"n\u0000\u0000\u00d0\u00d2\u0005d\u0000\u0000\u00d1\u00c7\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cb\u0001\u0000\u0000\u0000\u00d1\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d2&\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005p\u0000\u0000\u00d4"+
		"\u00d5\u0005l\u0000\u0000\u00d5\u00d6\u0005u\u0000\u0000\u00d6\u00d7\u0005"+
		"s\u0000\u0000\u00d7(\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005m\u0000"+
		"\u0000\u00d9\u00da\u0005i\u0000\u0000\u00da\u00db\u0005n\u0000\u0000\u00db"+
		"*\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005o\u0000\u0000\u00dd\u00de\u0005"+
		"r\u0000\u0000\u00de,\u0001\u0000\u0000\u0000\u00df\u00e0\u0005~\u0000"+
		"\u0000\u00e0.\u0001\u0000\u0000\u0000\u00e1\u00e6\u00031\u0018\u0000\u00e2"+
		"\u00e5\u00031\u0018\u0000\u00e3\u00e5\u0003C!\u0000\u00e4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e70\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e9\u00eb\u0007\u0000\u0000\u0000\u00ea\u00e9\u0001\u0000"+
		"\u0000\u0000\u00eb2\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005(\u0000\u0000"+
		"\u00ed4\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005)\u0000\u0000\u00ef6"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005:\u0000\u0000\u00f18\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0005;\u0000\u0000\u00f3:\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0005:\u0000\u0000\u00f5\u00f6\u0005=\u0000\u0000\u00f6<"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005,\u0000\u0000\u00f8>\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fb\u0003M&\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0003A \u0000\u00ff\u0111\u0001\u0000\u0000\u0000\u0100\u0102"+
		"\u0003M&\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000"+
		"\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000"+
		"\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0101\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000"+
		"\u0000\u0000\u0107\u0109\u0005.\u0000\u0000\u0108\u010a\u0003M&\u0000"+
		"\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000"+
		"\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u010f\u0003A \u0000\u010e\u010d"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0111"+
		"\u0001\u0000\u0000\u0000\u0110\u00fa\u0001\u0000\u0000\u0000\u0110\u0105"+
		"\u0001\u0000\u0000\u0000\u0111@\u0001\u0000\u0000\u0000\u0112\u0115\u0003"+
		"].\u0000\u0113\u0116\u0003\'\u0013\u0000\u0114\u0116\u0003)\u0014\u0000"+
		"\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000"+
		"\u0117\u0119\u0003M&\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0001\u0000\u0000\u0000\u011bB\u0001\u0000\u0000\u0000\u011c\u0120\u0003"+
		"K%\u0000\u011d\u0120\u0003G#\u0000\u011e\u0120\u0003I$\u0000\u011f\u011c"+
		"\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u011e"+
		"\u0001\u0000\u0000\u0000\u0120D\u0001\u0000\u0000\u0000\u0121\u0123\u0003"+
		"O\'\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000"+
		"\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0003U*\u0000"+
		"\u0127F\u0001\u0000\u0000\u0000\u0128\u012a\u0003Q(\u0000\u0129\u0128"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u0129"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0003W+\u0000\u012eH\u0001\u0000"+
		"\u0000\u0000\u012f\u0131\u0003M&\u0000\u0130\u012f\u0001\u0000\u0000\u0000"+
		"\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0001\u0000\u0000\u0000"+
		"\u0134\u0136\u0003[-\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0001\u0000\u0000\u0000\u0136J\u0001\u0000\u0000\u0000\u0137\u013b\u0003"+
		"M&\u0000\u0138\u013a\u0003S)\u0000\u0139\u0138\u0001\u0000\u0000\u0000"+
		"\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000"+
		"\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u013f\u0003Y,\u0000\u013fL"+
		"\u0001\u0000\u0000\u0000\u0140\u0141\u000209\u0000\u0141N\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u000201\u0000\u0143P\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u000207\u0000\u0145R\u0001\u0000\u0000\u0000\u0146\u0149"+
		"\u0007\u0001\u0000\u0000\u0147\u0149\u0003M&\u0000\u0148\u0146\u0001\u0000"+
		"\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149T\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0007\u0002\u0000\u0000\u014bV\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0007\u0003\u0000\u0000\u014dX\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0007\u0004\u0000\u0000\u014fZ\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0007\u0005\u0000\u0000\u0151\\\u0001\u0000\u0000\u0000\u0152\u0153\u0007"+
		"\u0006\u0000\u0000\u0153^\u0001\u0000\u0000\u0000\u0154\u0156\u0007\u0007"+
		"\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000"+
		"\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0006/\u0000"+
		"\u0000\u015a`\u0001\u0000\u0000\u0000\u015b\u015c\u0005(\u0000\u0000\u015c"+
		"\u015d\u0005*\u0000\u0000\u015d\u0161\u0001\u0000\u0000\u0000\u015e\u0160"+
		"\t\u0000\u0000\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u0160\u0163\u0001"+
		"\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0161\u015f\u0001"+
		"\u0000\u0000\u0000\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u0161\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0005*\u0000\u0000\u0165\u0166\u0005)\u0000"+
		"\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0168\u00060\u0000\u0000"+
		"\u0168b\u0001\u0000\u0000\u0000\u0017\u0000\u00c5\u00d1\u00e4\u00e6\u00ea"+
		"\u00fc\u0103\u0105\u010b\u010e\u0110\u0115\u011a\u011f\u0124\u012b\u0132"+
		"\u0135\u013b\u0148\u0157\u0161\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}