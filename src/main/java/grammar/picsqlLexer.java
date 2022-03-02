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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, SELECT=20, FROM=21, WHERE=22, ORDER_BY=23, EXISTS=24, 
		OPERATOR_LOGIC=25, STAR=26, DIVIDE=27, MODULO=28, PLUS=29, MINUS=30, DIGITS=31, 
		DECIMAL=32, STR=33, DOTS=34, LEFT_PARENTHESIS=35, RIGHT_PARENTHESIS=36, 
		OPERATOR_CONDITION=37, DOT=38, IN=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "SELECT", "FROM", "WHERE", "ORDER_BY", "EXISTS", "OPERATOR_LOGIC", 
			"STAR", "DIVIDE", "MODULO", "PLUS", "MINUS", "DIGITS", "DECIMAL", "STR", 
			"DOTS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "OPERATOR_CONDITION", 
			"DOT", "IN", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'x'", "'y'", "'r'", "'g'", "'b'", "'rand()'", "'rank()'", 
			"'pi()'", "'sin'", "'cos'", "'tan'", "'lag'", "'lead'", "'min'", "'max'", 
			"'tablesample'", "'percent'", "'pixels'", "'select'", "'from'", "'where'", 
			"'order by'", "'exists'", null, "'*'", "'/'", "'%'", "'+'", "'-'", null, 
			null, null, "':'", "'('", "')'", null, "'.'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "SELECT", "FROM", "WHERE", 
			"ORDER_BY", "EXISTS", "OPERATOR_LOGIC", "STAR", "DIVIDE", "MODULO", "PLUS", 
			"MINUS", "DIGITS", "DECIMAL", "STR", "DOTS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u010e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u00d2\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \6 \u00df\n \r \16 \u00e0\3!\6!\u00e4\n!\r!\16!\u00e5"+
		"\3!\3!\6!\u00ea\n!\r!\16!\u00eb\3\"\6\"\u00ef\n\"\r\"\16\"\u00f0\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0101\n&\3\'\3\'\3(\3(\3(\3)"+
		"\6)\u0109\n)\r)\16)\u010a\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\5\5\2"+
		"\62;C\\c|\4\2>>@@\5\2\13\f\17\17\"\"\2\u0117\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3"+
		"\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21f\3\2\2\2\23m\3\2\2\2\25r"+
		"\3\2\2\2\27v\3\2\2\2\31z\3\2\2\2\33~\3\2\2\2\35\u0082\3\2\2\2\37\u0087"+
		"\3\2\2\2!\u008b\3\2\2\2#\u008f\3\2\2\2%\u009b\3\2\2\2\'\u00a3\3\2\2\2"+
		")\u00aa\3\2\2\2+\u00b1\3\2\2\2-\u00b6\3\2\2\2/\u00bc\3\2\2\2\61\u00c5"+
		"\3\2\2\2\63\u00d1\3\2\2\2\65\u00d3\3\2\2\2\67\u00d5\3\2\2\29\u00d7\3\2"+
		"\2\2;\u00d9\3\2\2\2=\u00db\3\2\2\2?\u00de\3\2\2\2A\u00e3\3\2\2\2C\u00ee"+
		"\3\2\2\2E\u00f2\3\2\2\2G\u00f4\3\2\2\2I\u00f6\3\2\2\2K\u0100\3\2\2\2M"+
		"\u0102\3\2\2\2O\u0104\3\2\2\2Q\u0108\3\2\2\2ST\7.\2\2T\4\3\2\2\2UV\7z"+
		"\2\2V\6\3\2\2\2WX\7{\2\2X\b\3\2\2\2YZ\7t\2\2Z\n\3\2\2\2[\\\7i\2\2\\\f"+
		"\3\2\2\2]^\7d\2\2^\16\3\2\2\2_`\7t\2\2`a\7c\2\2ab\7p\2\2bc\7f\2\2cd\7"+
		"*\2\2de\7+\2\2e\20\3\2\2\2fg\7t\2\2gh\7c\2\2hi\7p\2\2ij\7m\2\2jk\7*\2"+
		"\2kl\7+\2\2l\22\3\2\2\2mn\7r\2\2no\7k\2\2op\7*\2\2pq\7+\2\2q\24\3\2\2"+
		"\2rs\7u\2\2st\7k\2\2tu\7p\2\2u\26\3\2\2\2vw\7e\2\2wx\7q\2\2xy\7u\2\2y"+
		"\30\3\2\2\2z{\7v\2\2{|\7c\2\2|}\7p\2\2}\32\3\2\2\2~\177\7n\2\2\177\u0080"+
		"\7c\2\2\u0080\u0081\7i\2\2\u0081\34\3\2\2\2\u0082\u0083\7n\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7c\2\2\u0085\u0086\7f\2\2\u0086\36\3\2\2\2\u0087\u0088"+
		"\7o\2\2\u0088\u0089\7k\2\2\u0089\u008a\7p\2\2\u008a \3\2\2\2\u008b\u008c"+
		"\7o\2\2\u008c\u008d\7c\2\2\u008d\u008e\7z\2\2\u008e\"\3\2\2\2\u008f\u0090"+
		"\7v\2\2\u0090\u0091\7c\2\2\u0091\u0092\7d\2\2\u0092\u0093\7n\2\2\u0093"+
		"\u0094\7g\2\2\u0094\u0095\7u\2\2\u0095\u0096\7c\2\2\u0096\u0097\7o\2\2"+
		"\u0097\u0098\7r\2\2\u0098\u0099\7n\2\2\u0099\u009a\7g\2\2\u009a$\3\2\2"+
		"\2\u009b\u009c\7r\2\2\u009c\u009d\7g\2\2\u009d\u009e\7t\2\2\u009e\u009f"+
		"\7e\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7v\2\2\u00a2"+
		"&\3\2\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7z\2\2\u00a6"+
		"\u00a7\7g\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7u\2\2\u00a9(\3\2\2\2\u00aa"+
		"\u00ab\7u\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7g\2\2"+
		"\u00ae\u00af\7e\2\2\u00af\u00b0\7v\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7h\2"+
		"\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7o\2\2\u00b5,\3\2"+
		"\2\2\u00b6\u00b7\7y\2\2\u00b7\u00b8\7j\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba"+
		"\7t\2\2\u00ba\u00bb\7g\2\2\u00bb.\3\2\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be"+
		"\7t\2\2\u00be\u00bf\7f\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7t\2\2\u00c1"+
		"\u00c2\7\"\2\2\u00c2\u00c3\7d\2\2\u00c3\u00c4\7{\2\2\u00c4\60\3\2\2\2"+
		"\u00c5\u00c6\7g\2\2\u00c6\u00c7\7z\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9"+
		"\7u\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7u\2\2\u00cb\62\3\2\2\2\u00cc\u00cd"+
		"\7c\2\2\u00cd\u00ce\7p\2\2\u00ce\u00d2\7f\2\2\u00cf\u00d0\7q\2\2\u00d0"+
		"\u00d2\7t\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\64\3\2\2\2"+
		"\u00d3\u00d4\7,\2\2\u00d4\66\3\2\2\2\u00d5\u00d6\7\61\2\2\u00d68\3\2\2"+
		"\2\u00d7\u00d8\7\'\2\2\u00d8:\3\2\2\2\u00d9\u00da\7-\2\2\u00da<\3\2\2"+
		"\2\u00db\u00dc\7/\2\2\u00dc>\3\2\2\2\u00dd\u00df\4\62;\2\u00de\u00dd\3"+
		"\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"@\3\2\2\2\u00e2\u00e4\4\62;\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2"+
		"\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9"+
		"\5M\'\2\u00e8\u00ea\4\62;\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ecB\3\2\2\2\u00ed\u00ef\t\2\2\2"+
		"\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1D\3\2\2\2\u00f2\u00f3\7<\2\2\u00f3F\3\2\2\2\u00f4\u00f5"+
		"\7*\2\2\u00f5H\3\2\2\2\u00f6\u00f7\7+\2\2\u00f7J\3\2\2\2\u00f8\u0101\7"+
		"?\2\2\u00f9\u00fa\7#\2\2\u00fa\u0101\7?\2\2\u00fb\u0101\t\3\2\2\u00fc"+
		"\u00fd\7>\2\2\u00fd\u0101\7?\2\2\u00fe\u00ff\7@\2\2\u00ff\u0101\7?\2\2"+
		"\u0100\u00f8\3\2\2\2\u0100\u00f9\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0101L\3\2\2\2\u0102\u0103\7\60\2\2\u0103"+
		"N\3\2\2\2\u0104\u0105\7k\2\2\u0105\u0106\7p\2\2\u0106P\3\2\2\2\u0107\u0109"+
		"\t\4\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\b)\2\2\u010dR\3\2\2\2\n"+
		"\2\u00d1\u00e0\u00e5\u00eb\u00f0\u0100\u010a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}