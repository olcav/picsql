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
		SELECT=1, FROM=2, WHERE=3, COMMA=4, OPERATOR_LOGIC=5, STAR=6, DIVIDE=7, 
		PATH_SLASH=8, MIN=9, MAX=10, X=11, Y=12, T=13, R=14, G=15, B=16, RAND=17, 
		RANK=18, PI=19, SIN=20, COS=21, TAN=22, LAG=23, LEAD=24, MODULO=25, PLUS=26, 
		MINUS=27, DIGITS=28, DECIMAL=29, STR=30, SPECIAL_CHAR=31, STR_PATH=32, 
		DOTS=33, LEFT_PARENTHESIS=34, RIGHT_PARENTHESIS=35, LEFT_BRACKET=36, RIGHT_BRACKET=37, 
		OPERATOR_CONDITION=38, DOT=39, IN=40, WS=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT", "FROM", "WHERE", "COMMA", "OPERATOR_LOGIC", "STAR", "DIVIDE", 
			"PATH_SLASH", "MIN", "MAX", "X", "Y", "T", "R", "G", "B", "RAND", "RANK", 
			"PI", "SIN", "COS", "TAN", "LAG", "LEAD", "MODULO", "PLUS", "MINUS", 
			"DIGITS", "DECIMAL", "STR", "SPECIAL_CHAR", "STR_PATH", "DOTS", "LEFT_PARENTHESIS", 
			"RIGHT_PARENTHESIS", "LEFT_BRACKET", "RIGHT_BRACKET", "OPERATOR_CONDITION", 
			"DOT", "IN", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'select'", "'from'", "'where'", "','", null, "'*'", "'/'", "'\\'", 
			"'min'", "'max'", "'x'", "'y'", "'t'", "'r'", "'g'", "'b'", "'rand()'", 
			"'rank()'", "'pi()'", "'sin'", "'cos'", "'tan'", "'lag'", "'lead'", "'%'", 
			"'+'", "'-'", null, null, null, null, null, "':'", "'('", "')'", "'['", 
			"']'", null, "'.'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "COMMA", "OPERATOR_LOGIC", "STAR", "DIVIDE", 
			"PATH_SLASH", "MIN", "MAX", "X", "Y", "T", "R", "G", "B", "RAND", "RANK", 
			"PI", "SIN", "COS", "TAN", "LAG", "LEAD", "MODULO", "PLUS", "MINUS", 
			"DIGITS", "DECIMAL", "STR", "SPECIAL_CHAR", "STR_PATH", "DOTS", "LEFT_PARENTHESIS", 
			"RIGHT_PARENTHESIS", "LEFT_BRACKET", "RIGHT_BRACKET", "OPERATOR_CONDITION", 
			"DOT", "IN", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u00f1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\5\6o\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\6\35\u00ba\n\35\r\35\16\35\u00bb\3\36"+
		"\6\36\u00bf\n\36\r\36\16\36\u00c0\3\36\3\36\6\36\u00c5\n\36\r\36\16\36"+
		"\u00c6\3\37\6\37\u00ca\n\37\r\37\16\37\u00cb\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u00e4\n\'\3(\3"+
		"(\3)\3)\3)\3*\6*\u00ec\n*\r*\16*\u00ed\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+\3\2\6\5\2\62;C\\c|\4\2//aa\4\2>>@@\5\2\13\f\17\17\"\"\2\u00fa\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U"+
		"\3\2\2\2\5\\\3\2\2\2\7a\3\2\2\2\tg\3\2\2\2\13n\3\2\2\2\rp\3\2\2\2\17r"+
		"\3\2\2\2\21t\3\2\2\2\23v\3\2\2\2\25z\3\2\2\2\27~\3\2\2\2\31\u0080\3\2"+
		"\2\2\33\u0082\3\2\2\2\35\u0084\3\2\2\2\37\u0086\3\2\2\2!\u0088\3\2\2\2"+
		"#\u008a\3\2\2\2%\u0091\3\2\2\2\'\u0098\3\2\2\2)\u009d\3\2\2\2+\u00a1\3"+
		"\2\2\2-\u00a5\3\2\2\2/\u00a9\3\2\2\2\61\u00ad\3\2\2\2\63\u00b2\3\2\2\2"+
		"\65\u00b4\3\2\2\2\67\u00b6\3\2\2\29\u00b9\3\2\2\2;\u00be\3\2\2\2=\u00c9"+
		"\3\2\2\2?\u00cd\3\2\2\2A\u00cf\3\2\2\2C\u00d1\3\2\2\2E\u00d3\3\2\2\2G"+
		"\u00d5\3\2\2\2I\u00d7\3\2\2\2K\u00d9\3\2\2\2M\u00e3\3\2\2\2O\u00e5\3\2"+
		"\2\2Q\u00e7\3\2\2\2S\u00eb\3\2\2\2UV\7u\2\2VW\7g\2\2WX\7n\2\2XY\7g\2\2"+
		"YZ\7e\2\2Z[\7v\2\2[\4\3\2\2\2\\]\7h\2\2]^\7t\2\2^_\7q\2\2_`\7o\2\2`\6"+
		"\3\2\2\2ab\7y\2\2bc\7j\2\2cd\7g\2\2de\7t\2\2ef\7g\2\2f\b\3\2\2\2gh\7."+
		"\2\2h\n\3\2\2\2ij\7c\2\2jk\7p\2\2ko\7f\2\2lm\7q\2\2mo\7t\2\2ni\3\2\2\2"+
		"nl\3\2\2\2o\f\3\2\2\2pq\7,\2\2q\16\3\2\2\2rs\7\61\2\2s\20\3\2\2\2tu\7"+
		"^\2\2u\22\3\2\2\2vw\7o\2\2wx\7k\2\2xy\7p\2\2y\24\3\2\2\2z{\7o\2\2{|\7"+
		"c\2\2|}\7z\2\2}\26\3\2\2\2~\177\7z\2\2\177\30\3\2\2\2\u0080\u0081\7{\2"+
		"\2\u0081\32\3\2\2\2\u0082\u0083\7v\2\2\u0083\34\3\2\2\2\u0084\u0085\7"+
		"t\2\2\u0085\36\3\2\2\2\u0086\u0087\7i\2\2\u0087 \3\2\2\2\u0088\u0089\7"+
		"d\2\2\u0089\"\3\2\2\2\u008a\u008b\7t\2\2\u008b\u008c\7c\2\2\u008c\u008d"+
		"\7p\2\2\u008d\u008e\7f\2\2\u008e\u008f\7*\2\2\u008f\u0090\7+\2\2\u0090"+
		"$\3\2\2\2\u0091\u0092\7t\2\2\u0092\u0093\7c\2\2\u0093\u0094\7p\2\2\u0094"+
		"\u0095\7m\2\2\u0095\u0096\7*\2\2\u0096\u0097\7+\2\2\u0097&\3\2\2\2\u0098"+
		"\u0099\7r\2\2\u0099\u009a\7k\2\2\u009a\u009b\7*\2\2\u009b\u009c\7+\2\2"+
		"\u009c(\3\2\2\2\u009d\u009e\7u\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2"+
		"\2\u00a0*\3\2\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7"+
		"u\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8"+
		"\7p\2\2\u00a8.\3\2\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac"+
		"\7i\2\2\u00ac\60\3\2\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7c\2\2\u00b0\u00b1\7f\2\2\u00b1\62\3\2\2\2\u00b2\u00b3\7\'\2\2\u00b3"+
		"\64\3\2\2\2\u00b4\u00b5\7-\2\2\u00b5\66\3\2\2\2\u00b6\u00b7\7/\2\2\u00b7"+
		"8\3\2\2\2\u00b8\u00ba\4\62;\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2"+
		"\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc:\3\2\2\2\u00bd\u00bf\4"+
		"\62;\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\5O(\2\u00c3\u00c5\4\62"+
		";\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7<\3\2\2\2\u00c8\u00ca\t\2\2\2\u00c9\u00c8\3\2\2\2"+
		"\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc>\3"+
		"\2\2\2\u00cd\u00ce\t\3\2\2\u00ce@\3\2\2\2\u00cf\u00d0\t\2\2\2\u00d0B\3"+
		"\2\2\2\u00d1\u00d2\7<\2\2\u00d2D\3\2\2\2\u00d3\u00d4\7*\2\2\u00d4F\3\2"+
		"\2\2\u00d5\u00d6\7+\2\2\u00d6H\3\2\2\2\u00d7\u00d8\7]\2\2\u00d8J\3\2\2"+
		"\2\u00d9\u00da\7_\2\2\u00daL\3\2\2\2\u00db\u00e4\7?\2\2\u00dc\u00dd\7"+
		"#\2\2\u00dd\u00e4\7?\2\2\u00de\u00e4\t\4\2\2\u00df\u00e0\7>\2\2\u00e0"+
		"\u00e4\7?\2\2\u00e1\u00e2\7@\2\2\u00e2\u00e4\7?\2\2\u00e3\u00db\3\2\2"+
		"\2\u00e3\u00dc\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e4N\3\2\2\2\u00e5\u00e6\7\60\2\2\u00e6P\3\2\2\2\u00e7\u00e8"+
		"\7k\2\2\u00e8\u00e9\7p\2\2\u00e9R\3\2\2\2\u00ea\u00ec\t\5\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\b*\2\2\u00f0T\3\2\2\2\n\2n\u00bb\u00c0\u00c6"+
		"\u00cb\u00e3\u00ed\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}