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
		T__17=18, T__18=19, SELECT=20, FROM=21, WHERE=22, OPERATOR_LOGIC=23, STAR=24, 
		DIVIDE=25, MODULO=26, PLUS=27, MINUS=28, DIGITS=29, DECIMAL=30, STR=31, 
		DOTS=32, LEFT_PARENTHESIS=33, RIGHT_PARENTHESIS=34, OPERATOR_CONDITION=35, 
		DOT=36, WS=37;
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
			"T__17", "T__18", "SELECT", "FROM", "WHERE", "OPERATOR_LOGIC", "STAR", 
			"DIVIDE", "MODULO", "PLUS", "MINUS", "DIGITS", "DECIMAL", "STR", "DOTS", 
			"LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "OPERATOR_CONDITION", "DOT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'x'", "'y'", "'r'", "'g'", "'b'", "'rand()'", "'rank()'", 
			"'pi()'", "'sin'", "'cos'", "'tan'", "'lag'", "'lead'", "'min'", "'max'", 
			"'tablesample'", "'percent'", "'pixels'", "'select'", "'from'", "'where'", 
			null, "'*'", "'/'", "'%'", "'+'", "'-'", null, null, null, "':'", "'('", 
			"')'", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "SELECT", "FROM", "WHERE", 
			"OPERATOR_LOGIC", "STAR", "DIVIDE", "MODULO", "PLUS", "MINUS", "DIGITS", 
			"DECIMAL", "STR", "DOTS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "OPERATOR_CONDITION", 
			"DOT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00f5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u00bc"+
		"\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\6\36\u00c9"+
		"\n\36\r\36\16\36\u00ca\3\37\6\37\u00ce\n\37\r\37\16\37\u00cf\3\37\3\37"+
		"\6\37\u00d4\n\37\r\37\16\37\u00d5\3 \6 \u00d9\n \r \16 \u00da\3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u00eb\n$\3%\3%\3&\6&\u00f0\n&"+
		"\r&\16&\u00f1\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\5\5\2\62;C\\c|\4\2>>"+
		"@@\5\2\13\f\17\17\"\"\2\u00fe\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3"+
		"\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17Y\3\2\2\2\21`\3"+
		"\2\2\2\23g\3\2\2\2\25l\3\2\2\2\27p\3\2\2\2\31t\3\2\2\2\33x\3\2\2\2\35"+
		"|\3\2\2\2\37\u0081\3\2\2\2!\u0085\3\2\2\2#\u0089\3\2\2\2%\u0095\3\2\2"+
		"\2\'\u009d\3\2\2\2)\u00a4\3\2\2\2+\u00ab\3\2\2\2-\u00b0\3\2\2\2/\u00bb"+
		"\3\2\2\2\61\u00bd\3\2\2\2\63\u00bf\3\2\2\2\65\u00c1\3\2\2\2\67\u00c3\3"+
		"\2\2\29\u00c5\3\2\2\2;\u00c8\3\2\2\2=\u00cd\3\2\2\2?\u00d8\3\2\2\2A\u00dc"+
		"\3\2\2\2C\u00de\3\2\2\2E\u00e0\3\2\2\2G\u00ea\3\2\2\2I\u00ec\3\2\2\2K"+
		"\u00ef\3\2\2\2MN\7.\2\2N\4\3\2\2\2OP\7z\2\2P\6\3\2\2\2QR\7{\2\2R\b\3\2"+
		"\2\2ST\7t\2\2T\n\3\2\2\2UV\7i\2\2V\f\3\2\2\2WX\7d\2\2X\16\3\2\2\2YZ\7"+
		"t\2\2Z[\7c\2\2[\\\7p\2\2\\]\7f\2\2]^\7*\2\2^_\7+\2\2_\20\3\2\2\2`a\7t"+
		"\2\2ab\7c\2\2bc\7p\2\2cd\7m\2\2de\7*\2\2ef\7+\2\2f\22\3\2\2\2gh\7r\2\2"+
		"hi\7k\2\2ij\7*\2\2jk\7+\2\2k\24\3\2\2\2lm\7u\2\2mn\7k\2\2no\7p\2\2o\26"+
		"\3\2\2\2pq\7e\2\2qr\7q\2\2rs\7u\2\2s\30\3\2\2\2tu\7v\2\2uv\7c\2\2vw\7"+
		"p\2\2w\32\3\2\2\2xy\7n\2\2yz\7c\2\2z{\7i\2\2{\34\3\2\2\2|}\7n\2\2}~\7"+
		"g\2\2~\177\7c\2\2\177\u0080\7f\2\2\u0080\36\3\2\2\2\u0081\u0082\7o\2\2"+
		"\u0082\u0083\7k\2\2\u0083\u0084\7p\2\2\u0084 \3\2\2\2\u0085\u0086\7o\2"+
		"\2\u0086\u0087\7c\2\2\u0087\u0088\7z\2\2\u0088\"\3\2\2\2\u0089\u008a\7"+
		"v\2\2\u008a\u008b\7c\2\2\u008b\u008c\7d\2\2\u008c\u008d\7n\2\2\u008d\u008e"+
		"\7g\2\2\u008e\u008f\7u\2\2\u008f\u0090\7c\2\2\u0090\u0091\7o\2\2\u0091"+
		"\u0092\7r\2\2\u0092\u0093\7n\2\2\u0093\u0094\7g\2\2\u0094$\3\2\2\2\u0095"+
		"\u0096\7r\2\2\u0096\u0097\7g\2\2\u0097\u0098\7t\2\2\u0098\u0099\7e\2\2"+
		"\u0099\u009a\7g\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c&\3\2\2"+
		"\2\u009d\u009e\7r\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7z\2\2\u00a0\u00a1"+
		"\7g\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7u\2\2\u00a3(\3\2\2\2\u00a4\u00a5"+
		"\7u\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7g\2\2\u00a8"+
		"\u00a9\7e\2\2\u00a9\u00aa\7v\2\2\u00aa*\3\2\2\2\u00ab\u00ac\7h\2\2\u00ac"+
		"\u00ad\7t\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7o\2\2\u00af,\3\2\2\2\u00b0"+
		"\u00b1\7y\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7t\2\2"+
		"\u00b4\u00b5\7g\2\2\u00b5.\3\2\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7p\2"+
		"\2\u00b8\u00bc\7f\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bc\7t\2\2\u00bb\u00b6"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\60\3\2\2\2\u00bd\u00be\7,\2\2\u00be"+
		"\62\3\2\2\2\u00bf\u00c0\7\61\2\2\u00c0\64\3\2\2\2\u00c1\u00c2\7\'\2\2"+
		"\u00c2\66\3\2\2\2\u00c3\u00c4\7-\2\2\u00c48\3\2\2\2\u00c5\u00c6\7/\2\2"+
		"\u00c6:\3\2\2\2\u00c7\u00c9\4\62;\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3"+
		"\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb<\3\2\2\2\u00cc\u00ce"+
		"\4\62;\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\5I%\2\u00d2\u00d4\4\62"+
		";\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6>\3\2\2\2\u00d7\u00d9\t\2\2\2\u00d8\u00d7\3\2\2\2"+
		"\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db@\3"+
		"\2\2\2\u00dc\u00dd\7<\2\2\u00ddB\3\2\2\2\u00de\u00df\7*\2\2\u00dfD\3\2"+
		"\2\2\u00e0\u00e1\7+\2\2\u00e1F\3\2\2\2\u00e2\u00eb\7?\2\2\u00e3\u00e4"+
		"\7#\2\2\u00e4\u00eb\7?\2\2\u00e5\u00eb\t\3\2\2\u00e6\u00e7\7>\2\2\u00e7"+
		"\u00eb\7?\2\2\u00e8\u00e9\7@\2\2\u00e9\u00eb\7?\2\2\u00ea\u00e2\3\2\2"+
		"\2\u00ea\u00e3\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00ebH\3\2\2\2\u00ec\u00ed\7\60\2\2\u00edJ\3\2\2\2\u00ee\u00f0"+
		"\t\4\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b&\2\2\u00f4L\3\2\2\2\n"+
		"\2\u00bb\u00ca\u00cf\u00d5\u00da\u00ea\u00f1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}