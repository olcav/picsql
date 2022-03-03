// Generated from C:/Users/olivi/IdeaProjects/picsql/src/main/java/grammar\picsql.g4 by ANTLR 4.9.2
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class picsqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, SELECT=17, 
		FROM=18, WHERE=19, ORDER_BY=20, COMMA=21, OPERATOR_LOGIC=22, STAR=23, 
		DIVIDE=24, MODULO=25, PLUS=26, MINUS=27, DIGITS=28, DECIMAL=29, STR=30, 
		DOTS=31, LEFT_PARENTHESIS=32, RIGHT_PARENTHESIS=33, OPERATOR_CONDITION=34, 
		DOT=35, IN=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "SELECT", 
			"FROM", "WHERE", "ORDER_BY", "COMMA", "OPERATOR_LOGIC", "STAR", "DIVIDE", 
			"MODULO", "PLUS", "MINUS", "DIGITS", "DECIMAL", "STR", "DOTS", "LEFT_PARENTHESIS", 
			"RIGHT_PARENTHESIS", "OPERATOR_CONDITION", "DOT", "IN", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'x'", "'y'", "'r'", "'g'", "'b'", "'rand()'", "'rank()'", "'pi()'", 
			"'sin'", "'cos'", "'tan'", "'lag'", "'lead'", "'min'", "'max'", "'\\'", 
			"'select'", "'from'", "'where'", "'order by'", "','", null, "'*'", "'/'", 
			"'%'", "'+'", "'-'", null, null, null, "':'", "'('", "')'", null, "'.'", 
			"'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "SELECT", "FROM", "WHERE", "ORDER_BY", 
			"COMMA", "OPERATOR_LOGIC", "STAR", "DIVIDE", "MODULO", "PLUS", "MINUS", 
			"DIGITS", "DECIMAL", "STR", "DOTS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
			"OPERATOR_CONDITION", "DOT", "IN", "WS"
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


	public picsqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "picsql.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00e8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u00ac\n\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\6\35\u00b9\n\35\r\35\16"+
		"\35\u00ba\3\36\6\36\u00be\n\36\r\36\16\36\u00bf\3\36\3\36\6\36\u00c4\n"+
		"\36\r\36\16\36\u00c5\3\37\6\37\u00c9\n\37\r\37\16\37\u00ca\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00db\n#\3$\3$\3%\3%\3%\3&\6&\u00e3"+
		"\n&\r&\16&\u00e4\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\5\5\2\62;C\\c|\4\2"+
		">>@@\5\2\13\f\17\17\"\"\2\u00f1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O"+
		"\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17^\3\2\2\2\21e"+
		"\3\2\2\2\23j\3\2\2\2\25n\3\2\2\2\27r\3\2\2\2\31v\3\2\2\2\33z\3\2\2\2\35"+
		"\177\3\2\2\2\37\u0083\3\2\2\2!\u0087\3\2\2\2#\u0089\3\2\2\2%\u0090\3\2"+
		"\2\2\'\u0095\3\2\2\2)\u009b\3\2\2\2+\u00a4\3\2\2\2-\u00ab\3\2\2\2/\u00ad"+
		"\3\2\2\2\61\u00af\3\2\2\2\63\u00b1\3\2\2\2\65\u00b3\3\2\2\2\67\u00b5\3"+
		"\2\2\29\u00b8\3\2\2\2;\u00bd\3\2\2\2=\u00c8\3\2\2\2?\u00cc\3\2\2\2A\u00ce"+
		"\3\2\2\2C\u00d0\3\2\2\2E\u00da\3\2\2\2G\u00dc\3\2\2\2I\u00de\3\2\2\2K"+
		"\u00e2\3\2\2\2MN\7z\2\2N\4\3\2\2\2OP\7{\2\2P\6\3\2\2\2QR\7t\2\2R\b\3\2"+
		"\2\2ST\7i\2\2T\n\3\2\2\2UV\7d\2\2V\f\3\2\2\2WX\7t\2\2XY\7c\2\2YZ\7p\2"+
		"\2Z[\7f\2\2[\\\7*\2\2\\]\7+\2\2]\16\3\2\2\2^_\7t\2\2_`\7c\2\2`a\7p\2\2"+
		"ab\7m\2\2bc\7*\2\2cd\7+\2\2d\20\3\2\2\2ef\7r\2\2fg\7k\2\2gh\7*\2\2hi\7"+
		"+\2\2i\22\3\2\2\2jk\7u\2\2kl\7k\2\2lm\7p\2\2m\24\3\2\2\2no\7e\2\2op\7"+
		"q\2\2pq\7u\2\2q\26\3\2\2\2rs\7v\2\2st\7c\2\2tu\7p\2\2u\30\3\2\2\2vw\7"+
		"n\2\2wx\7c\2\2xy\7i\2\2y\32\3\2\2\2z{\7n\2\2{|\7g\2\2|}\7c\2\2}~\7f\2"+
		"\2~\34\3\2\2\2\177\u0080\7o\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2"+
		"\u0082\36\3\2\2\2\u0083\u0084\7o\2\2\u0084\u0085\7c\2\2\u0085\u0086\7"+
		"z\2\2\u0086 \3\2\2\2\u0087\u0088\7^\2\2\u0088\"\3\2\2\2\u0089\u008a\7"+
		"u\2\2\u008a\u008b\7g\2\2\u008b\u008c\7n\2\2\u008c\u008d\7g\2\2\u008d\u008e"+
		"\7e\2\2\u008e\u008f\7v\2\2\u008f$\3\2\2\2\u0090\u0091\7h\2\2\u0091\u0092"+
		"\7t\2\2\u0092\u0093\7q\2\2\u0093\u0094\7o\2\2\u0094&\3\2\2\2\u0095\u0096"+
		"\7y\2\2\u0096\u0097\7j\2\2\u0097\u0098\7g\2\2\u0098\u0099\7t\2\2\u0099"+
		"\u009a\7g\2\2\u009a(\3\2\2\2\u009b\u009c\7q\2\2\u009c\u009d\7t\2\2\u009d"+
		"\u009e\7f\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7\"\2"+
		"\2\u00a1\u00a2\7d\2\2\u00a2\u00a3\7{\2\2\u00a3*\3\2\2\2\u00a4\u00a5\7"+
		".\2\2\u00a5,\3\2\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7p\2\2\u00a8\u00ac"+
		"\7f\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ac\7t\2\2\u00ab\u00a6\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac.\3\2\2\2\u00ad\u00ae\7,\2\2\u00ae\60\3\2\2\2\u00af"+
		"\u00b0\7\61\2\2\u00b0\62\3\2\2\2\u00b1\u00b2\7\'\2\2\u00b2\64\3\2\2\2"+
		"\u00b3\u00b4\7-\2\2\u00b4\66\3\2\2\2\u00b5\u00b6\7/\2\2\u00b68\3\2\2\2"+
		"\u00b7\u00b9\4\62;\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb:\3\2\2\2\u00bc\u00be\4\62;\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\5G$\2\u00c2\u00c4\4\62;\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"<\3\2\2\2\u00c7\u00c9\t\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2"+
		"\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb>\3\2\2\2\u00cc\u00cd\7"+
		"<\2\2\u00cd@\3\2\2\2\u00ce\u00cf\7*\2\2\u00cfB\3\2\2\2\u00d0\u00d1\7+"+
		"\2\2\u00d1D\3\2\2\2\u00d2\u00db\7?\2\2\u00d3\u00d4\7#\2\2\u00d4\u00db"+
		"\7?\2\2\u00d5\u00db\t\3\2\2\u00d6\u00d7\7>\2\2\u00d7\u00db\7?\2\2\u00d8"+
		"\u00d9\7@\2\2\u00d9\u00db\7?\2\2\u00da\u00d2\3\2\2\2\u00da\u00d3\3\2\2"+
		"\2\u00da\u00d5\3\2\2\2\u00da\u00d6\3\2\2\2\u00da\u00d8\3\2\2\2\u00dbF"+
		"\3\2\2\2\u00dc\u00dd\7\60\2\2\u00ddH\3\2\2\2\u00de\u00df\7k\2\2\u00df"+
		"\u00e0\7p\2\2\u00e0J\3\2\2\2\u00e1\u00e3\t\4\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e7\b&\2\2\u00e7L\3\2\2\2\n\2\u00ab\u00ba\u00bf\u00c5\u00ca"+
		"\u00da\u00e4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}