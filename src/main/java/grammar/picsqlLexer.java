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
		SELECT=1, FROM=2, WHERE=3, COMMA=4, OPERATOR_LOGIC=5, STAR=6, PATH_SLASH=7, 
		DIVIDE=8, MIN=9, MAX=10, X=11, Y=12, R=13, G=14, B=15, RAND=16, RANK=17, 
		PI=18, SIN=19, COS=20, TAN=21, LAG=22, LEAD=23, MODULO=24, PLUS=25, MINUS=26, 
		DIGITS=27, DECIMAL=28, STR=29, DOTS=30, LEFT_PARENTHESIS=31, RIGHT_PARENTHESIS=32, 
		OPERATOR_CONDITION=33, DOT=34, IN=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT", "FROM", "WHERE", "COMMA", "OPERATOR_LOGIC", "STAR", "PATH_SLASH", 
			"DIVIDE", "MIN", "MAX", "X", "Y", "R", "G", "B", "RAND", "RANK", "PI", 
			"SIN", "COS", "TAN", "LAG", "LEAD", "MODULO", "PLUS", "MINUS", "DIGITS", 
			"DECIMAL", "STR", "DOTS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "OPERATOR_CONDITION", 
			"DOT", "IN", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'select'", "'from'", "'where'", "','", null, "'*'", null, "'/'", 
			"'min'", "'max'", "'x'", "'y'", "'r'", "'g'", "'b'", "'rand()'", "'rank()'", 
			"'pi()'", "'sin'", "'cos'", "'tan'", "'lag'", "'lead'", "'%'", "'+'", 
			"'-'", null, null, null, "':'", "'('", "')'", null, "'.'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "COMMA", "OPERATOR_LOGIC", "STAR", "PATH_SLASH", 
			"DIVIDE", "MIN", "MAX", "X", "Y", "R", "G", "B", "RAND", "RANK", "PI", 
			"SIN", "COS", "TAN", "LAG", "LEAD", "MODULO", "PLUS", "MINUS", "DIGITS", 
			"DECIMAL", "STR", "DOTS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "OPERATOR_CONDITION", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00dd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6e\n\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u00ae"+
		"\n\34\r\34\16\34\u00af\3\35\6\35\u00b3\n\35\r\35\16\35\u00b4\3\35\3\35"+
		"\6\35\u00b9\n\35\r\35\16\35\u00ba\3\36\6\36\u00be\n\36\r\36\16\36\u00bf"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00d0\n\"\3"+
		"#\3#\3$\3$\3$\3%\6%\u00d8\n%\r%\16%\u00d9\3%\3%\2\2&\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2"+
		"\6\4\2\61\61^^\5\2\62;C\\c|\4\2>>@@\5\2\13\f\17\17\"\"\2\u00e6\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\3K\3\2\2\2\5R\3\2\2\2\7W\3\2\2\2\t]\3\2\2\2\13d\3\2\2\2\rf\3\2"+
		"\2\2\17h\3\2\2\2\21j\3\2\2\2\23l\3\2\2\2\25p\3\2\2\2\27t\3\2\2\2\31v\3"+
		"\2\2\2\33x\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!~\3\2\2\2#\u0085\3\2\2\2%\u008c"+
		"\3\2\2\2\'\u0091\3\2\2\2)\u0095\3\2\2\2+\u0099\3\2\2\2-\u009d\3\2\2\2"+
		"/\u00a1\3\2\2\2\61\u00a6\3\2\2\2\63\u00a8\3\2\2\2\65\u00aa\3\2\2\2\67"+
		"\u00ad\3\2\2\29\u00b2\3\2\2\2;\u00bd\3\2\2\2=\u00c1\3\2\2\2?\u00c3\3\2"+
		"\2\2A\u00c5\3\2\2\2C\u00cf\3\2\2\2E\u00d1\3\2\2\2G\u00d3\3\2\2\2I\u00d7"+
		"\3\2\2\2KL\7u\2\2LM\7g\2\2MN\7n\2\2NO\7g\2\2OP\7e\2\2PQ\7v\2\2Q\4\3\2"+
		"\2\2RS\7h\2\2ST\7t\2\2TU\7q\2\2UV\7o\2\2V\6\3\2\2\2WX\7y\2\2XY\7j\2\2"+
		"YZ\7g\2\2Z[\7t\2\2[\\\7g\2\2\\\b\3\2\2\2]^\7.\2\2^\n\3\2\2\2_`\7c\2\2"+
		"`a\7p\2\2ae\7f\2\2bc\7q\2\2ce\7t\2\2d_\3\2\2\2db\3\2\2\2e\f\3\2\2\2fg"+
		"\7,\2\2g\16\3\2\2\2hi\t\2\2\2i\20\3\2\2\2jk\7\61\2\2k\22\3\2\2\2lm\7o"+
		"\2\2mn\7k\2\2no\7p\2\2o\24\3\2\2\2pq\7o\2\2qr\7c\2\2rs\7z\2\2s\26\3\2"+
		"\2\2tu\7z\2\2u\30\3\2\2\2vw\7{\2\2w\32\3\2\2\2xy\7t\2\2y\34\3\2\2\2z{"+
		"\7i\2\2{\36\3\2\2\2|}\7d\2\2} \3\2\2\2~\177\7t\2\2\177\u0080\7c\2\2\u0080"+
		"\u0081\7p\2\2\u0081\u0082\7f\2\2\u0082\u0083\7*\2\2\u0083\u0084\7+\2\2"+
		"\u0084\"\3\2\2\2\u0085\u0086\7t\2\2\u0086\u0087\7c\2\2\u0087\u0088\7p"+
		"\2\2\u0088\u0089\7m\2\2\u0089\u008a\7*\2\2\u008a\u008b\7+\2\2\u008b$\3"+
		"\2\2\2\u008c\u008d\7r\2\2\u008d\u008e\7k\2\2\u008e\u008f\7*\2\2\u008f"+
		"\u0090\7+\2\2\u0090&\3\2\2\2\u0091\u0092\7u\2\2\u0092\u0093\7k\2\2\u0093"+
		"\u0094\7p\2\2\u0094(\3\2\2\2\u0095\u0096\7e\2\2\u0096\u0097\7q\2\2\u0097"+
		"\u0098\7u\2\2\u0098*\3\2\2\2\u0099\u009a\7v\2\2\u009a\u009b\7c\2\2\u009b"+
		"\u009c\7p\2\2\u009c,\3\2\2\2\u009d\u009e\7n\2\2\u009e\u009f\7c\2\2\u009f"+
		"\u00a0\7i\2\2\u00a0.\3\2\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\u00a4\7c\2\2\u00a4\u00a5\7f\2\2\u00a5\60\3\2\2\2\u00a6\u00a7\7\'\2\2"+
		"\u00a7\62\3\2\2\2\u00a8\u00a9\7-\2\2\u00a9\64\3\2\2\2\u00aa\u00ab\7/\2"+
		"\2\u00ab\66\3\2\2\2\u00ac\u00ae\4\62;\2\u00ad\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b08\3\2\2\2\u00b1"+
		"\u00b3\4\62;\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\5E#\2\u00b7\u00b9"+
		"\4\62;\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb:\3\2\2\2\u00bc\u00be\t\3\2\2\u00bd\u00bc\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0<\3"+
		"\2\2\2\u00c1\u00c2\7<\2\2\u00c2>\3\2\2\2\u00c3\u00c4\7*\2\2\u00c4@\3\2"+
		"\2\2\u00c5\u00c6\7+\2\2\u00c6B\3\2\2\2\u00c7\u00d0\7?\2\2\u00c8\u00c9"+
		"\7#\2\2\u00c9\u00d0\7?\2\2\u00ca\u00d0\t\4\2\2\u00cb\u00cc\7>\2\2\u00cc"+
		"\u00d0\7?\2\2\u00cd\u00ce\7@\2\2\u00ce\u00d0\7?\2\2\u00cf\u00c7\3\2\2"+
		"\2\u00cf\u00c8\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0D\3\2\2\2\u00d1\u00d2\7\60\2\2\u00d2F\3\2\2\2\u00d3\u00d4"+
		"\7k\2\2\u00d4\u00d5\7p\2\2\u00d5H\3\2\2\2\u00d6\u00d8\t\5\2\2\u00d7\u00d6"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\b%\2\2\u00dcJ\3\2\2\2\n\2d\u00af\u00b4\u00ba"+
		"\u00bf\u00cf\u00d9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}