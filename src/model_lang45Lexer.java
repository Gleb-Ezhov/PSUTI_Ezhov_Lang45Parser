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
		ADD_EXP=24, SUB_EXP=25, ID=26, LETTER=27, OPEN_BRACKET=28, CLOSE_BRACKET=29, 
		COLON=30, SEMICOLON=31, ASSIGNMENT=32, COMMA=33, REAL_NUMBER=34, EXP=35, 
		INT_NUMBER=36, BIN_NUMBER=37, OCT_NUMBER=38, DEC_NUMBER=39, HEX_NUMBER=40, 
		WHITE_SPACE=41, COMMENTARY=42;
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
			"MULTIPLICATION_OPS", "ADD", "SUB", "OR", "UNARY_OP", "ADD_EXP", "SUB_EXP", 
			"ID", "LETTER", "OPEN_BRACKET", "CLOSE_BRACKET", "COLON", "SEMICOLON", 
			"ASSIGNMENT", "COMMA", "REAL_NUMBER", "EXP", "INT_NUMBER", "BIN_NUMBER", 
			"OCT_NUMBER", "DEC_NUMBER", "HEX_NUMBER", "DIGIT", "BIN_DIGIT", "OCT_DIGIT", 
			"HEX_DIGIT", "BIN_LETTER", "OCT_LETTER", "HEX_LETTER", "DEC_LETTER", 
			"EXP_LETTER", "WHITE_SPACE", "COMMENTARY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'end'", "'dim'", "'int'", "'float'", "'bool'", "'if'", 
			"'else'", "'for'", "'to'", "'step'", "'next'", "'while'", "'readln'", 
			"'writeln'", "'true'", "'false'", null, null, "'plus'", "'min'", "'or'", 
			"'~'", "'+'", "'-'", null, null, "'('", "')'", "':'", "';'", "':='", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BEGIN", "END", "DIM", "INT", "FLOAT", "BOOL", "IF", "ELSE", "FOR", 
			"TO", "STEP", "NEXT", "WHILE", "READLN", "WRITELN", "TRUE", "FALSE", 
			"COMPARISON_OPS", "MULTIPLICATION_OPS", "ADD", "SUB", "OR", "UNARY_OP", 
			"ADD_EXP", "SUB_EXP", "ID", "LETTER", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"COLON", "SEMICOLON", "ASSIGNMENT", "COMMA", "REAL_NUMBER", "EXP", "INT_NUMBER", 
			"BIN_NUMBER", "OCT_NUMBER", "DEC_NUMBER", "HEX_NUMBER", "WHITE_SPACE", 
			"COMMENTARY"
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
		"\u0004\u0000*\u0171\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"0\u00021\u00071\u00022\u00072\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00ca\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d6\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u00ed\b\u0019\n\u0019\f\u0019\u00f0\t\u0019"+
		"\u0001\u001a\u0003\u001a\u00f3\b\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0004!\u0103\b!\u000b!\f"+
		"!\u0104\u0001!\u0001!\u0001!\u0004!\u010a\b!\u000b!\f!\u010b\u0003!\u010e"+
		"\b!\u0001!\u0001!\u0004!\u0112\b!\u000b!\f!\u0113\u0001!\u0003!\u0117"+
		"\b!\u0003!\u0119\b!\u0001\"\u0001\"\u0001\"\u0003\"\u011e\b\"\u0001\""+
		"\u0004\"\u0121\b\"\u000b\"\f\"\u0122\u0001#\u0001#\u0001#\u0003#\u0128"+
		"\b#\u0001$\u0004$\u012b\b$\u000b$\f$\u012c\u0001$\u0001$\u0001%\u0004"+
		"%\u0132\b%\u000b%\f%\u0133\u0001%\u0001%\u0001&\u0004&\u0139\b&\u000b"+
		"&\f&\u013a\u0001&\u0003&\u013e\b&\u0001\'\u0001\'\u0005\'\u0142\b\'\n"+
		"\'\f\'\u0145\t\'\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001"+
		"*\u0001+\u0001+\u0003+\u0151\b+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001"+
		".\u0001/\u0001/\u00010\u00010\u00011\u00041\u015e\b1\u000b1\f1\u015f\u0001"+
		"1\u00011\u00012\u00012\u00012\u00012\u00052\u0168\b2\n2\f2\u016b\t2\u0001"+
		"2\u00012\u00012\u00012\u00012\u0001\u0169\u00003\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q\u0000S\u0000U\u0000"+
		"W\u0000Y\u0000[\u0000]\u0000_\u0000a\u0000c)e*\u0001\u0000\b\u0002\u0000"+
		"AZaz\u0002\u0000AFaf\u0002\u0000BBbb\u0002\u0000OOoo\u0002\u0000HHhh\u0002"+
		"\u0000DDdd\u0002\u0000EEee\u0003\u0000\t\n\r\r  \u0183\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C"+
		"\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000"+
		"\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000"+
		"\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000c"+
		"\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0001g\u0001\u0000"+
		"\u0000\u0000\u0003m\u0001\u0000\u0000\u0000\u0005q\u0001\u0000\u0000\u0000"+
		"\u0007u\u0001\u0000\u0000\u0000\ty\u0001\u0000\u0000\u0000\u000b\u007f"+
		"\u0001\u0000\u0000\u0000\r\u0084\u0001\u0000\u0000\u0000\u000f\u0087\u0001"+
		"\u0000\u0000\u0000\u0011\u008c\u0001\u0000\u0000\u0000\u0013\u0090\u0001"+
		"\u0000\u0000\u0000\u0015\u0093\u0001\u0000\u0000\u0000\u0017\u0098\u0001"+
		"\u0000\u0000\u0000\u0019\u009d\u0001\u0000\u0000\u0000\u001b\u00a3\u0001"+
		"\u0000\u0000\u0000\u001d\u00aa\u0001\u0000\u0000\u0000\u001f\u00b2\u0001"+
		"\u0000\u0000\u0000!\u00b7\u0001\u0000\u0000\u0000#\u00c9\u0001\u0000\u0000"+
		"\u0000%\u00d5\u0001\u0000\u0000\u0000\'\u00d7\u0001\u0000\u0000\u0000"+
		")\u00dc\u0001\u0000\u0000\u0000+\u00e0\u0001\u0000\u0000\u0000-\u00e3"+
		"\u0001\u0000\u0000\u0000/\u00e5\u0001\u0000\u0000\u00001\u00e7\u0001\u0000"+
		"\u0000\u00003\u00e9\u0001\u0000\u0000\u00005\u00f2\u0001\u0000\u0000\u0000"+
		"7\u00f4\u0001\u0000\u0000\u00009\u00f6\u0001\u0000\u0000\u0000;\u00f8"+
		"\u0001\u0000\u0000\u0000=\u00fa\u0001\u0000\u0000\u0000?\u00fc\u0001\u0000"+
		"\u0000\u0000A\u00ff\u0001\u0000\u0000\u0000C\u0118\u0001\u0000\u0000\u0000"+
		"E\u011a\u0001\u0000\u0000\u0000G\u0127\u0001\u0000\u0000\u0000I\u012a"+
		"\u0001\u0000\u0000\u0000K\u0131\u0001\u0000\u0000\u0000M\u0138\u0001\u0000"+
		"\u0000\u0000O\u013f\u0001\u0000\u0000\u0000Q\u0148\u0001\u0000\u0000\u0000"+
		"S\u014a\u0001\u0000\u0000\u0000U\u014c\u0001\u0000\u0000\u0000W\u0150"+
		"\u0001\u0000\u0000\u0000Y\u0152\u0001\u0000\u0000\u0000[\u0154\u0001\u0000"+
		"\u0000\u0000]\u0156\u0001\u0000\u0000\u0000_\u0158\u0001\u0000\u0000\u0000"+
		"a\u015a\u0001\u0000\u0000\u0000c\u015d\u0001\u0000\u0000\u0000e\u0163"+
		"\u0001\u0000\u0000\u0000gh\u0005b\u0000\u0000hi\u0005e\u0000\u0000ij\u0005"+
		"g\u0000\u0000jk\u0005i\u0000\u0000kl\u0005n\u0000\u0000l\u0002\u0001\u0000"+
		"\u0000\u0000mn\u0005e\u0000\u0000no\u0005n\u0000\u0000op\u0005d\u0000"+
		"\u0000p\u0004\u0001\u0000\u0000\u0000qr\u0005d\u0000\u0000rs\u0005i\u0000"+
		"\u0000st\u0005m\u0000\u0000t\u0006\u0001\u0000\u0000\u0000uv\u0005i\u0000"+
		"\u0000vw\u0005n\u0000\u0000wx\u0005t\u0000\u0000x\b\u0001\u0000\u0000"+
		"\u0000yz\u0005f\u0000\u0000z{\u0005l\u0000\u0000{|\u0005o\u0000\u0000"+
		"|}\u0005a\u0000\u0000}~\u0005t\u0000\u0000~\n\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005b\u0000\u0000\u0080\u0081\u0005o\u0000\u0000\u0081\u0082"+
		"\u0005o\u0000\u0000\u0082\u0083\u0005l\u0000\u0000\u0083\f\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005i\u0000\u0000\u0085\u0086\u0005f\u0000\u0000"+
		"\u0086\u000e\u0001\u0000\u0000\u0000\u0087\u0088\u0005e\u0000\u0000\u0088"+
		"\u0089\u0005l\u0000\u0000\u0089\u008a\u0005s\u0000\u0000\u008a\u008b\u0005"+
		"e\u0000\u0000\u008b\u0010\u0001\u0000\u0000\u0000\u008c\u008d\u0005f\u0000"+
		"\u0000\u008d\u008e\u0005o\u0000\u0000\u008e\u008f\u0005r\u0000\u0000\u008f"+
		"\u0012\u0001\u0000\u0000\u0000\u0090\u0091\u0005t\u0000\u0000\u0091\u0092"+
		"\u0005o\u0000\u0000\u0092\u0014\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"s\u0000\u0000\u0094\u0095\u0005t\u0000\u0000\u0095\u0096\u0005e\u0000"+
		"\u0000\u0096\u0097\u0005p\u0000\u0000\u0097\u0016\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0005n\u0000\u0000\u0099\u009a\u0005e\u0000\u0000\u009a\u009b"+
		"\u0005x\u0000\u0000\u009b\u009c\u0005t\u0000\u0000\u009c\u0018\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005w\u0000\u0000\u009e\u009f\u0005h\u0000\u0000"+
		"\u009f\u00a0\u0005i\u0000\u0000\u00a0\u00a1\u0005l\u0000\u0000\u00a1\u00a2"+
		"\u0005e\u0000\u0000\u00a2\u001a\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"r\u0000\u0000\u00a4\u00a5\u0005e\u0000\u0000\u00a5\u00a6\u0005a\u0000"+
		"\u0000\u00a6\u00a7\u0005d\u0000\u0000\u00a7\u00a8\u0005l\u0000\u0000\u00a8"+
		"\u00a9\u0005n\u0000\u0000\u00a9\u001c\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0005w\u0000\u0000\u00ab\u00ac\u0005r\u0000\u0000\u00ac\u00ad\u0005i"+
		"\u0000\u0000\u00ad\u00ae\u0005t\u0000\u0000\u00ae\u00af\u0005e\u0000\u0000"+
		"\u00af\u00b0\u0005l\u0000\u0000\u00b0\u00b1\u0005n\u0000\u0000\u00b1\u001e"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005t\u0000\u0000\u00b3\u00b4\u0005"+
		"r\u0000\u0000\u00b4\u00b5\u0005u\u0000\u0000\u00b5\u00b6\u0005e\u0000"+
		"\u0000\u00b6 \u0001\u0000\u0000\u0000\u00b7\u00b8\u0005f\u0000\u0000\u00b8"+
		"\u00b9\u0005a\u0000\u0000\u00b9\u00ba\u0005l\u0000\u0000\u00ba\u00bb\u0005"+
		"s\u0000\u0000\u00bb\u00bc\u0005e\u0000\u0000\u00bc\"\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0005N\u0000\u0000\u00be\u00ca\u0005E\u0000\u0000\u00bf"+
		"\u00c0\u0005E\u0000\u0000\u00c0\u00ca\u0005Q\u0000\u0000\u00c1\u00c2\u0005"+
		"L\u0000\u0000\u00c2\u00ca\u0005T\u0000\u0000\u00c3\u00c4\u0005L\u0000"+
		"\u0000\u00c4\u00ca\u0005E\u0000\u0000\u00c5\u00c6\u0005G\u0000\u0000\u00c6"+
		"\u00ca\u0005T\u0000\u0000\u00c7\u00c8\u0005G\u0000\u0000\u00c8\u00ca\u0005"+
		"E\u0000\u0000\u00c9\u00bd\u0001\u0000\u0000\u0000\u00c9\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c1\u0001\u0000\u0000\u0000\u00c9\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c5\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00ca$\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005m\u0000\u0000"+
		"\u00cc\u00cd\u0005u\u0000\u0000\u00cd\u00ce\u0005l\u0000\u0000\u00ce\u00d6"+
		"\u0005t\u0000\u0000\u00cf\u00d0\u0005d\u0000\u0000\u00d0\u00d1\u0005i"+
		"\u0000\u0000\u00d1\u00d6\u0005v\u0000\u0000\u00d2\u00d3\u0005a\u0000\u0000"+
		"\u00d3\u00d4\u0005n\u0000\u0000\u00d4\u00d6\u0005d\u0000\u0000\u00d5\u00cb"+
		"\u0001\u0000\u0000\u0000\u00d5\u00cf\u0001\u0000\u0000\u0000\u00d5\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d6&\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		"p\u0000\u0000\u00d8\u00d9\u0005l\u0000\u0000\u00d9\u00da\u0005u\u0000"+
		"\u0000\u00da\u00db\u0005s\u0000\u0000\u00db(\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0005m\u0000\u0000\u00dd\u00de\u0005i\u0000\u0000\u00de\u00df\u0005"+
		"n\u0000\u0000\u00df*\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005o\u0000"+
		"\u0000\u00e1\u00e2\u0005r\u0000\u0000\u00e2,\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0005~\u0000\u0000\u00e4.\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005"+
		"+\u0000\u0000\u00e60\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005-\u0000"+
		"\u0000\u00e82\u0001\u0000\u0000\u0000\u00e9\u00ee\u00035\u001a\u0000\u00ea"+
		"\u00ed\u00035\u001a\u0000\u00eb\u00ed\u0003G#\u0000\u00ec\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ef4\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f3\u0007\u0000\u0000\u0000\u00f2\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f36\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005(\u0000\u0000"+
		"\u00f58\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005)\u0000\u0000\u00f7:"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005:\u0000\u0000\u00f9<\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0005;\u0000\u0000\u00fb>\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0005:\u0000\u0000\u00fd\u00fe\u0005=\u0000\u0000\u00fe@"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0005,\u0000\u0000\u0100B\u0001\u0000"+
		"\u0000\u0000\u0101\u0103\u0003Q(\u0000\u0102\u0101\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0003E\"\u0000\u0107\u0119\u0001\u0000\u0000\u0000\u0108"+
		"\u010a\u0003Q(\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001"+
		"\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u0109\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f\u0111\u0005.\u0000\u0000\u0110\u0112\u0003Q("+
		"\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000"+
		"\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000"+
		"\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0117\u0003E\"\u0000"+
		"\u0116\u0115\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000"+
		"\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u0102\u0001\u0000\u0000\u0000"+
		"\u0118\u010d\u0001\u0000\u0000\u0000\u0119D\u0001\u0000\u0000\u0000\u011a"+
		"\u011d\u0003a0\u0000\u011b\u011e\u0003/\u0017\u0000\u011c\u011e\u0003"+
		"1\u0018\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011c\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000"+
		"\u0000\u0000\u011f\u0121\u0003Q(\u0000\u0120\u011f\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0001\u0000\u0000\u0000\u0123F\u0001\u0000\u0000\u0000\u0124"+
		"\u0128\u0003O\'\u0000\u0125\u0128\u0003K%\u0000\u0126\u0128\u0003M&\u0000"+
		"\u0127\u0124\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000"+
		"\u0127\u0126\u0001\u0000\u0000\u0000\u0128H\u0001\u0000\u0000\u0000\u0129"+
		"\u012b\u0003S)\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001"+
		"\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0003"+
		"Y,\u0000\u012fJ\u0001\u0000\u0000\u0000\u0130\u0132\u0003U*\u0000\u0131"+
		"\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133"+
		"\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0001\u0000\u0000\u0000\u0135\u0136\u0003[-\u0000\u0136L\u0001"+
		"\u0000\u0000\u0000\u0137\u0139\u0003Q(\u0000\u0138\u0137\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013d\u0001\u0000\u0000"+
		"\u0000\u013c\u013e\u0003_/\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013eN\u0001\u0000\u0000\u0000\u013f\u0143"+
		"\u0003Q(\u0000\u0140\u0142\u0003W+\u0000\u0141\u0140\u0001\u0000\u0000"+
		"\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0146\u0001\u0000\u0000"+
		"\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0147\u0003].\u0000\u0147"+
		"P\u0001\u0000\u0000\u0000\u0148\u0149\u000209\u0000\u0149R\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u000201\u0000\u014bT\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u000207\u0000\u014dV\u0001\u0000\u0000\u0000\u014e\u0151"+
		"\u0007\u0001\u0000\u0000\u014f\u0151\u0003Q(\u0000\u0150\u014e\u0001\u0000"+
		"\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151X\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0007\u0002\u0000\u0000\u0153Z\u0001\u0000\u0000\u0000"+
		"\u0154\u0155\u0007\u0003\u0000\u0000\u0155\\\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0007\u0004\u0000\u0000\u0157^\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0007\u0005\u0000\u0000\u0159`\u0001\u0000\u0000\u0000\u015a\u015b\u0007"+
		"\u0006\u0000\u0000\u015bb\u0001\u0000\u0000\u0000\u015c\u015e\u0007\u0007"+
		"\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000"+
		"\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000"+
		"\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u00061\u0000"+
		"\u0000\u0162d\u0001\u0000\u0000\u0000\u0163\u0164\u0005(\u0000\u0000\u0164"+
		"\u0165\u0005*\u0000\u0000\u0165\u0169\u0001\u0000\u0000\u0000\u0166\u0168"+
		"\t\u0000\u0000\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168\u016b\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u0169\u0167\u0001"+
		"\u0000\u0000\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u0169\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0005*\u0000\u0000\u016d\u016e\u0005)\u0000"+
		"\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u00062\u0000\u0000"+
		"\u0170f\u0001\u0000\u0000\u0000\u0017\u0000\u00c9\u00d5\u00ec\u00ee\u00f2"+
		"\u0104\u010b\u010d\u0113\u0116\u0118\u011d\u0122\u0127\u012c\u0133\u013a"+
		"\u013d\u0143\u0150\u015f\u0169\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}