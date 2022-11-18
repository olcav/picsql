// Generated from C:/Users/olivi/IdeaProjects/picsql/src/main/java/grammar\picsql.g4 by ANTLR 4.10.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class picsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, COMMA=4, OPERATOR_LOGIC=5, STAR=6, DIVIDE=7, 
		PATH_SLASH=8, MIN=9, MAX=10, ABS=11, X=12, Y=13, XY=14, T=15, R=16, G=17, 
		B=18, RAND=19, RANK=20, PI=21, SIN=22, COS=23, TAN=24, LAG=25, LEAD=26, 
		FLIP=27, MODULO=28, PLUS=29, MINUS=30, DIGITS=31, DECIMAL=32, STR=33, 
		SPECIAL_CHAR=34, STR_PATH=35, DOTS=36, LEFT_PARENTHESIS=37, RIGHT_PARENTHESIS=38, 
		LEFT_BRACKET=39, RIGHT_BRACKET=40, OPERATOR_CONDITION=41, DOT=42, IN=43, 
		WS=44;
	public static final int
		RULE_query = 0, RULE_selectstmt = 1, RULE_from_pic_source = 2, RULE_from_source_list = 3, 
		RULE_selectionlist = 4, RULE_selection = 5, RULE_col_value = 6, RULE_mask_conv_vals = 7, 
		RULE_mask_conv = 8, RULE_negate_single_field = 9, RULE_single_field = 10, 
		RULE_alias_value = 11, RULE_zero_param_function = 12, RULE_one_params_function = 13, 
		RULE_three_params_function = 14, RULE_multiple_params_function = 15, RULE_flip_function = 16, 
		RULE_bool_expression = 17, RULE_begin_path = 18, RULE_alias = 19, RULE_alias_dot = 20, 
		RULE_path_part = 21, RULE_path = 22, RULE_pic_path = 23, RULE_subquery = 24, 
		RULE_where_clause = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "selectstmt", "from_pic_source", "from_source_list", "selectionlist", 
			"selection", "col_value", "mask_conv_vals", "mask_conv", "negate_single_field", 
			"single_field", "alias_value", "zero_param_function", "one_params_function", 
			"three_params_function", "multiple_params_function", "flip_function", 
			"bool_expression", "begin_path", "alias", "alias_dot", "path_part", "path", 
			"pic_path", "subquery", "where_clause"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'select'", "'from'", "'where'", "','", null, "'*'", "'/'", "'\\'", 
			"'min'", "'max'", "'abs'", "'x'", "'y'", "'xy'", "'t'", "'r'", "'g'", 
			"'b'", "'rand()'", "'rank()'", "'pi()'", "'sin'", "'cos'", "'tan'", "'lag'", 
			"'lead'", "'flip'", "'%'", "'+'", "'-'", null, null, null, null, null, 
			"':'", "'('", "')'", "'['", "']'", null, "'.'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "COMMA", "OPERATOR_LOGIC", "STAR", "DIVIDE", 
			"PATH_SLASH", "MIN", "MAX", "ABS", "X", "Y", "XY", "T", "R", "G", "B", 
			"RAND", "RANK", "PI", "SIN", "COS", "TAN", "LAG", "LEAD", "FLIP", "MODULO", 
			"PLUS", "MINUS", "DIGITS", "DECIMAL", "STR", "SPECIAL_CHAR", "STR_PATH", 
			"DOTS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_BRACKET", "RIGHT_BRACKET", 
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

	@Override
	public String getGrammarFileName() { return "picsql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public picsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryContext extends ParserRuleContext {
		public SelectstmtContext selectstmt() {
			return getRuleContext(SelectstmtContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			selectstmt();
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

	public static class SelectstmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(picsqlParser.SELECT, 0); }
		public SelectionlistContext selectionlist() {
			return getRuleContext(SelectionlistContext.class,0);
		}
		public TerminalNode FROM() { return getToken(picsqlParser.FROM, 0); }
		public List<From_source_listContext> from_source_list() {
			return getRuleContexts(From_source_listContext.class);
		}
		public From_source_listContext from_source_list(int i) {
			return getRuleContext(From_source_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(picsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(picsqlParser.COMMA, i);
		}
		public TerminalNode WHERE() { return getToken(picsqlParser.WHERE, 0); }
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public SelectstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterSelectstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitSelectstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitSelectstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectstmtContext selectstmt() throws RecognitionException {
		SelectstmtContext _localctx = new SelectstmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(SELECT);
			setState(55);
			selectionlist();
			setState(56);
			match(FROM);
			setState(57);
			from_source_list();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(58);
				match(COMMA);
				setState(59);
				from_source_list();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(65);
				match(WHERE);
				setState(66);
				where_clause(0);
				}
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

	public static class From_pic_sourceContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public List<TerminalNode> DIGITS() { return getTokens(picsqlParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(picsqlParser.DIGITS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(picsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(picsqlParser.COMMA, i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public From_pic_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_pic_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterFrom_pic_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitFrom_pic_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitFrom_pic_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_pic_sourceContext from_pic_source() throws RecognitionException {
		From_pic_sourceContext _localctx = new From_pic_sourceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_from_pic_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(LEFT_PARENTHESIS);
			setState(70);
			match(DIGITS);
			setState(71);
			match(COMMA);
			setState(72);
			match(DIGITS);
			setState(73);
			match(COMMA);
			setState(74);
			match(DIGITS);
			setState(75);
			match(COMMA);
			setState(76);
			match(DIGITS);
			setState(77);
			match(COMMA);
			setState(78);
			match(DIGITS);
			setState(79);
			match(RIGHT_PARENTHESIS);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(80);
				alias();
				}
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

	public static class From_source_listContext extends ParserRuleContext {
		public Pic_pathContext pic_path() {
			return getRuleContext(Pic_pathContext.class,0);
		}
		public From_pic_sourceContext from_pic_source() {
			return getRuleContext(From_pic_sourceContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public From_source_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_source_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterFrom_source_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitFrom_source_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitFrom_source_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_source_listContext from_source_list() throws RecognitionException {
		From_source_listContext _localctx = new From_source_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_from_source_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(83);
				pic_path();
				}
				break;
			case 2:
				{
				setState(84);
				from_pic_source();
				}
				break;
			case 3:
				{
				setState(85);
				subquery();
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

	public static class SelectionlistContext extends ParserRuleContext {
		public List<SelectionContext> selection() {
			return getRuleContexts(SelectionContext.class);
		}
		public SelectionContext selection(int i) {
			return getRuleContext(SelectionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(picsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(picsqlParser.COMMA, i);
		}
		public SelectionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterSelectionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitSelectionlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitSelectionlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionlistContext selectionlist() throws RecognitionException {
		SelectionlistContext _localctx = new SelectionlistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectionlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			selection(0);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(89);
				match(COMMA);
				setState(90);
				selection(0);
				}
				}
				setState(95);
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

	public static class SelectionContext extends ParserRuleContext {
		public Single_fieldContext single_field() {
			return getRuleContext(Single_fieldContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public List<SelectionContext> selection() {
			return getRuleContexts(SelectionContext.class);
		}
		public SelectionContext selection(int i) {
			return getRuleContext(SelectionContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode STAR() { return getToken(picsqlParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(picsqlParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(picsqlParser.MODULO, 0); }
		public TerminalNode PLUS() { return getToken(picsqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(picsqlParser.MINUS, 0); }
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		return selection(0);
	}

	private SelectionContext selection(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SelectionContext _localctx = new SelectionContext(_ctx, _parentState);
		SelectionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_selection, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case MIN:
			case MAX:
			case ABS:
			case X:
			case Y:
			case T:
			case R:
			case G:
			case B:
			case RAND:
			case RANK:
			case PI:
			case SIN:
			case COS:
			case TAN:
			case LAG:
			case LEAD:
			case FLIP:
			case MINUS:
			case DIGITS:
			case DECIMAL:
			case STR:
			case LEFT_BRACKET:
				{
				setState(97);
				single_field();
				}
				break;
			case LEFT_PARENTHESIS:
				{
				setState(98);
				match(LEFT_PARENTHESIS);
				setState(99);
				selection(0);
				setState(100);
				match(RIGHT_PARENTHESIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new SelectionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_selection);
						setState(104);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(105);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(106);
						selection(3);
						}
						break;
					case 2:
						{
						_localctx = new SelectionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_selection);
						setState(107);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(108);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(109);
						selection(2);
						}
						break;
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Col_valueContext extends ParserRuleContext {
		public Alias_valueContext alias_value() {
			return getRuleContext(Alias_valueContext.class,0);
		}
		public Alias_dotContext alias_dot() {
			return getRuleContext(Alias_dotContext.class,0);
		}
		public TerminalNode X() { return getToken(picsqlParser.X, 0); }
		public TerminalNode Y() { return getToken(picsqlParser.Y, 0); }
		public TerminalNode T() { return getToken(picsqlParser.T, 0); }
		public Col_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterCol_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitCol_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitCol_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Col_valueContext col_value() throws RecognitionException {
		Col_valueContext _localctx = new Col_valueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_col_value);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R:
			case G:
			case B:
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STR) {
					{
					setState(115);
					alias_dot();
					}
				}

				setState(118);
				alias_value();
				}
				break;
			case X:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(X);
				}
				break;
			case Y:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(Y);
				}
				break;
			case T:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(T);
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

	public static class Mask_conv_valsContext extends ParserRuleContext {
		public List<SelectionContext> selection() {
			return getRuleContexts(SelectionContext.class);
		}
		public SelectionContext selection(int i) {
			return getRuleContext(SelectionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(picsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(picsqlParser.COMMA, i);
		}
		public Mask_conv_valsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mask_conv_vals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterMask_conv_vals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitMask_conv_vals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitMask_conv_vals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mask_conv_valsContext mask_conv_vals() throws RecognitionException {
		Mask_conv_valsContext _localctx = new Mask_conv_valsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mask_conv_vals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			selection(0);
			setState(125);
			match(COMMA);
			setState(126);
			selection(0);
			setState(127);
			match(COMMA);
			setState(128);
			selection(0);
			setState(129);
			match(COMMA);
			setState(130);
			selection(0);
			setState(131);
			match(COMMA);
			setState(132);
			selection(0);
			setState(133);
			match(COMMA);
			setState(134);
			selection(0);
			setState(135);
			match(COMMA);
			setState(136);
			selection(0);
			setState(137);
			match(COMMA);
			setState(138);
			selection(0);
			setState(139);
			match(COMMA);
			setState(140);
			selection(0);
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

	public static class Mask_convContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(picsqlParser.LEFT_BRACKET, 0); }
		public Mask_conv_valsContext mask_conv_vals() {
			return getRuleContext(Mask_conv_valsContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(picsqlParser.RIGHT_BRACKET, 0); }
		public Mask_convContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mask_conv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterMask_conv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitMask_conv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitMask_conv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mask_convContext mask_conv() throws RecognitionException {
		Mask_convContext _localctx = new Mask_convContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mask_conv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(LEFT_BRACKET);
			setState(143);
			mask_conv_vals();
			setState(144);
			match(RIGHT_BRACKET);
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

	public static class Negate_single_fieldContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(picsqlParser.MINUS, 0); }
		public Single_fieldContext single_field() {
			return getRuleContext(Single_fieldContext.class,0);
		}
		public Negate_single_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negate_single_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterNegate_single_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitNegate_single_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitNegate_single_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negate_single_fieldContext negate_single_field() throws RecognitionException {
		Negate_single_fieldContext _localctx = new Negate_single_fieldContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_negate_single_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(MINUS);
			setState(147);
			single_field();
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

	public static class Single_fieldContext extends ParserRuleContext {
		public Negate_single_fieldContext negate_single_field() {
			return getRuleContext(Negate_single_fieldContext.class,0);
		}
		public TerminalNode DIGITS() { return getToken(picsqlParser.DIGITS, 0); }
		public TerminalNode DECIMAL() { return getToken(picsqlParser.DECIMAL, 0); }
		public TerminalNode STAR() { return getToken(picsqlParser.STAR, 0); }
		public Col_valueContext col_value() {
			return getRuleContext(Col_valueContext.class,0);
		}
		public Mask_convContext mask_conv() {
			return getRuleContext(Mask_convContext.class,0);
		}
		public Zero_param_functionContext zero_param_function() {
			return getRuleContext(Zero_param_functionContext.class,0);
		}
		public One_params_functionContext one_params_function() {
			return getRuleContext(One_params_functionContext.class,0);
		}
		public Three_params_functionContext three_params_function() {
			return getRuleContext(Three_params_functionContext.class,0);
		}
		public Multiple_params_functionContext multiple_params_function() {
			return getRuleContext(Multiple_params_functionContext.class,0);
		}
		public Flip_functionContext flip_function() {
			return getRuleContext(Flip_functionContext.class,0);
		}
		public Single_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterSingle_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitSingle_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitSingle_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_fieldContext single_field() throws RecognitionException {
		Single_fieldContext _localctx = new Single_fieldContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_single_field);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				negate_single_field();
				}
				break;
			case DIGITS:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(DIGITS);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(DECIMAL);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(STAR);
				}
				break;
			case X:
			case Y:
			case T:
			case R:
			case G:
			case B:
			case STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				col_value();
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				mask_conv();
				}
				break;
			case RAND:
			case RANK:
			case PI:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				zero_param_function();
				}
				break;
			case ABS:
			case SIN:
			case COS:
			case TAN:
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				one_params_function();
				}
				break;
			case LAG:
			case LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(157);
				three_params_function();
				}
				break;
			case MIN:
			case MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(158);
				multiple_params_function();
				}
				break;
			case FLIP:
				enterOuterAlt(_localctx, 11);
				{
				setState(159);
				flip_function();
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

	public static class Alias_valueContext extends ParserRuleContext {
		public TerminalNode R() { return getToken(picsqlParser.R, 0); }
		public TerminalNode G() { return getToken(picsqlParser.G, 0); }
		public TerminalNode B() { return getToken(picsqlParser.B, 0); }
		public Alias_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterAlias_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitAlias_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitAlias_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_valueContext alias_value() throws RecognitionException {
		Alias_valueContext _localctx = new Alias_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alias_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << R) | (1L << G) | (1L << B))) != 0)) ) {
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

	public static class Zero_param_functionContext extends ParserRuleContext {
		public TerminalNode RAND() { return getToken(picsqlParser.RAND, 0); }
		public TerminalNode RANK() { return getToken(picsqlParser.RANK, 0); }
		public TerminalNode PI() { return getToken(picsqlParser.PI, 0); }
		public Zero_param_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zero_param_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterZero_param_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitZero_param_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitZero_param_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zero_param_functionContext zero_param_function() throws RecognitionException {
		Zero_param_functionContext _localctx = new Zero_param_functionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_zero_param_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RAND) | (1L << RANK) | (1L << PI))) != 0)) ) {
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

	public static class One_params_functionContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode SIN() { return getToken(picsqlParser.SIN, 0); }
		public TerminalNode COS() { return getToken(picsqlParser.COS, 0); }
		public TerminalNode TAN() { return getToken(picsqlParser.TAN, 0); }
		public TerminalNode ABS() { return getToken(picsqlParser.ABS, 0); }
		public One_params_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one_params_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterOne_params_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitOne_params_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitOne_params_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final One_params_functionContext one_params_function() throws RecognitionException {
		One_params_functionContext _localctx = new One_params_functionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_one_params_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << SIN) | (1L << COS) | (1L << TAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(167);
			match(LEFT_PARENTHESIS);
			setState(168);
			selection(0);
			setState(169);
			match(RIGHT_PARENTHESIS);
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

	public static class Three_params_functionContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public Alias_valueContext alias_value() {
			return getRuleContext(Alias_valueContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(picsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(picsqlParser.COMMA, i);
		}
		public List<SelectionContext> selection() {
			return getRuleContexts(SelectionContext.class);
		}
		public SelectionContext selection(int i) {
			return getRuleContext(SelectionContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode LAG() { return getToken(picsqlParser.LAG, 0); }
		public TerminalNode LEAD() { return getToken(picsqlParser.LEAD, 0); }
		public Alias_dotContext alias_dot() {
			return getRuleContext(Alias_dotContext.class,0);
		}
		public Three_params_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_three_params_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterThree_params_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitThree_params_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitThree_params_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Three_params_functionContext three_params_function() throws RecognitionException {
		Three_params_functionContext _localctx = new Three_params_functionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_three_params_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==LAG || _la==LEAD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(172);
			match(LEFT_PARENTHESIS);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(173);
				alias_dot();
				}
			}

			setState(176);
			alias_value();
			setState(177);
			match(COMMA);
			setState(178);
			selection(0);
			setState(179);
			match(COMMA);
			setState(180);
			selection(0);
			setState(181);
			match(RIGHT_PARENTHESIS);
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

	public static class Multiple_params_functionContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public List<SelectionContext> selection() {
			return getRuleContexts(SelectionContext.class);
		}
		public SelectionContext selection(int i) {
			return getRuleContext(SelectionContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode MIN() { return getToken(picsqlParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(picsqlParser.MAX, 0); }
		public List<TerminalNode> COMMA() { return getTokens(picsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(picsqlParser.COMMA, i);
		}
		public Multiple_params_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_params_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterMultiple_params_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitMultiple_params_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitMultiple_params_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_params_functionContext multiple_params_function() throws RecognitionException {
		Multiple_params_functionContext _localctx = new Multiple_params_functionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiple_params_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !(_la==MIN || _la==MAX) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(184);
			match(LEFT_PARENTHESIS);
			setState(185);
			selection(0);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(186);
				match(COMMA);
				setState(187);
				selection(0);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(RIGHT_PARENTHESIS);
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

	public static class Flip_functionContext extends ParserRuleContext {
		public TerminalNode FLIP() { return getToken(picsqlParser.FLIP, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(picsqlParser.COMMA, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode X() { return getToken(picsqlParser.X, 0); }
		public TerminalNode Y() { return getToken(picsqlParser.Y, 0); }
		public TerminalNode XY() { return getToken(picsqlParser.XY, 0); }
		public Flip_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flip_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterFlip_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitFlip_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitFlip_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flip_functionContext flip_function() throws RecognitionException {
		Flip_functionContext _localctx = new Flip_functionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_flip_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(FLIP);
			setState(196);
			match(LEFT_PARENTHESIS);
			setState(197);
			selection(0);
			setState(198);
			match(COMMA);
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << X) | (1L << Y) | (1L << XY))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(200);
			match(RIGHT_PARENTHESIS);
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

	public static class Bool_expressionContext extends ParserRuleContext {
		public List<SelectionContext> selection() {
			return getRuleContexts(SelectionContext.class);
		}
		public SelectionContext selection(int i) {
			return getRuleContext(SelectionContext.class,i);
		}
		public TerminalNode OPERATOR_CONDITION() { return getToken(picsqlParser.OPERATOR_CONDITION, 0); }
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitBool_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitBool_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			selection(0);
			setState(203);
			match(OPERATOR_CONDITION);
			setState(204);
			selection(0);
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

	public static class Begin_pathContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(picsqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(picsqlParser.DOT, i);
		}
		public TerminalNode PATH_SLASH() { return getToken(picsqlParser.PATH_SLASH, 0); }
		public TerminalNode DIVIDE() { return getToken(picsqlParser.DIVIDE, 0); }
		public TerminalNode STR() { return getToken(picsqlParser.STR, 0); }
		public TerminalNode DOTS() { return getToken(picsqlParser.DOTS, 0); }
		public Begin_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterBegin_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitBegin_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitBegin_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_pathContext begin_path() throws RecognitionException {
		Begin_pathContext _localctx = new Begin_pathContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_begin_path);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(DOT);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(207);
					match(DOT);
					}
				}

				setState(210);
				_la = _input.LA(1);
				if ( !(_la==DIVIDE || _la==PATH_SLASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(STR);
				setState(212);
				match(DOTS);
				setState(213);
				_la = _input.LA(1);
				if ( !(_la==DIVIDE || _la==PATH_SLASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(picsqlParser.STR, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(STR);
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

	public static class Alias_dotContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(picsqlParser.STR, 0); }
		public TerminalNode DOT() { return getToken(picsqlParser.DOT, 0); }
		public Alias_dotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterAlias_dot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitAlias_dot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitAlias_dot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_dotContext alias_dot() throws RecognitionException {
		Alias_dotContext _localctx = new Alias_dotContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_alias_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(STR);
			setState(219);
			match(DOT);
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

	public static class Path_partContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(picsqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(picsqlParser.DOT, i);
		}
		public TerminalNode STR() { return getToken(picsqlParser.STR, 0); }
		public TerminalNode SPECIAL_CHAR() { return getToken(picsqlParser.SPECIAL_CHAR, 0); }
		public Path_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterPath_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitPath_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitPath_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Path_partContext path_part() throws RecognitionException {
		Path_partContext _localctx = new Path_partContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_path_part);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(DOT);
				setState(222);
				match(DOT);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(STR);
				}
				break;
			case SPECIAL_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(SPECIAL_CHAR);
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

	public static class PathContext extends ParserRuleContext {
		public List<Path_partContext> path_part() {
			return getRuleContexts(Path_partContext.class);
		}
		public Path_partContext path_part(int i) {
			return getRuleContext(Path_partContext.class,i);
		}
		public TerminalNode DOT() { return getToken(picsqlParser.DOT, 0); }
		public Begin_pathContext begin_path() {
			return getRuleContext(Begin_pathContext.class,0);
		}
		public List<TerminalNode> PATH_SLASH() { return getTokens(picsqlParser.PATH_SLASH); }
		public TerminalNode PATH_SLASH(int i) {
			return getToken(picsqlParser.PATH_SLASH, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(picsqlParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(picsqlParser.DIVIDE, i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(227);
				begin_path();
				}
				break;
			}
			setState(230);
			path_part();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIVIDE || _la==PATH_SLASH) {
				{
				{
				setState(231);
				_la = _input.LA(1);
				if ( !(_la==DIVIDE || _la==PATH_SLASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(232);
				path_part();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(DOT);
			setState(239);
			path_part();
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

	public static class Pic_pathContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(picsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(picsqlParser.COMMA, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(picsqlParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(picsqlParser.DIGITS, i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Pic_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pic_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterPic_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitPic_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitPic_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pic_pathContext pic_path() throws RecognitionException {
		Pic_pathContext _localctx = new Pic_pathContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pic_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(241);
				match(LEFT_PARENTHESIS);
				setState(242);
				path();
				setState(243);
				match(COMMA);
				setState(244);
				match(DIGITS);
				setState(245);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 2:
				{
				setState(247);
				match(LEFT_PARENTHESIS);
				setState(248);
				path();
				setState(249);
				match(COMMA);
				setState(250);
				match(DIGITS);
				setState(251);
				match(COMMA);
				setState(252);
				match(DIGITS);
				setState(253);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 3:
				{
				setState(255);
				match(LEFT_PARENTHESIS);
				setState(256);
				path();
				setState(257);
				match(COMMA);
				setState(258);
				match(DIGITS);
				setState(259);
				match(COMMA);
				setState(260);
				match(DIGITS);
				setState(261);
				match(COMMA);
				setState(262);
				match(DIGITS);
				setState(263);
				match(COMMA);
				setState(264);
				match(DIGITS);
				setState(265);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 4:
				{
				setState(267);
				path();
				}
				break;
			}
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(270);
				alias();
				}
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

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public SelectstmtContext selectstmt() {
			return getRuleContext(SelectstmtContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_subquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(LEFT_PARENTHESIS);
			setState(274);
			selectstmt();
			setState(275);
			match(RIGHT_PARENTHESIS);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(276);
				alias();
				}
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

	public static class Where_clauseContext extends ParserRuleContext {
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public List<Where_clauseContext> where_clause() {
			return getRuleContexts(Where_clauseContext.class);
		}
		public Where_clauseContext where_clause(int i) {
			return getRuleContext(Where_clauseContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode OPERATOR_LOGIC() { return getToken(picsqlParser.OPERATOR_LOGIC, 0); }
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		return where_clause(0);
	}

	private Where_clauseContext where_clause(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, _parentState);
		Where_clauseContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_where_clause, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(280);
				bool_expression();
				}
				break;
			case 2:
				{
				setState(281);
				match(LEFT_PARENTHESIS);
				setState(282);
				where_clause(0);
				setState(283);
				match(RIGHT_PARENTHESIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Where_clauseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_where_clause);
					setState(287);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(288);
					match(OPERATOR_LOGIC);
					setState(289);
					where_clause(3);
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return selection_sempred((SelectionContext)_localctx, predIndex);
		case 25:
			return where_clause_sempred((Where_clauseContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean selection_sempred(SelectionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean where_clause_sempred(Where_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u0128\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001=\b\u0001"+
		"\n\u0001\f\u0001@\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001D\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002R\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"W\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\\\b\u0004\n"+
		"\u0004\f\u0004_\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005g\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005o\b\u0005"+
		"\n\u0005\f\u0005r\t\u0005\u0001\u0006\u0003\u0006u\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006{\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a1"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00af\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u00bd\b\u000f\n\u000f\f\u000f\u00c0\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00d1\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00d7\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00e2\b\u0015\u0001\u0016\u0003\u0016\u00e5\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00ea\b\u0016\n\u0016"+
		"\f\u0016\u00ed\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u010d\b\u0017\u0001\u0017\u0003\u0017"+
		"\u0110\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0116\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u011e\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u0123\b\u0019\n\u0019\f\u0019\u0126\t\u0019\u0001\u0019\u0000"+
		"\u0002\n2\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\t\u0002\u0000\u0006\u0007"+
		"\u001c\u001c\u0001\u0000\u001d\u001e\u0001\u0000\u0010\u0012\u0001\u0000"+
		"\u0013\u0015\u0002\u0000\u000b\u000b\u0016\u0018\u0001\u0000\u0019\u001a"+
		"\u0001\u0000\t\n\u0001\u0000\f\u000e\u0001\u0000\u0007\b\u0133\u00004"+
		"\u0001\u0000\u0000\u0000\u00026\u0001\u0000\u0000\u0000\u0004E\u0001\u0000"+
		"\u0000\u0000\u0006V\u0001\u0000\u0000\u0000\bX\u0001\u0000\u0000\u0000"+
		"\nf\u0001\u0000\u0000\u0000\fz\u0001\u0000\u0000\u0000\u000e|\u0001\u0000"+
		"\u0000\u0000\u0010\u008e\u0001\u0000\u0000\u0000\u0012\u0092\u0001\u0000"+
		"\u0000\u0000\u0014\u00a0\u0001\u0000\u0000\u0000\u0016\u00a2\u0001\u0000"+
		"\u0000\u0000\u0018\u00a4\u0001\u0000\u0000\u0000\u001a\u00a6\u0001\u0000"+
		"\u0000\u0000\u001c\u00ab\u0001\u0000\u0000\u0000\u001e\u00b7\u0001\u0000"+
		"\u0000\u0000 \u00c3\u0001\u0000\u0000\u0000\"\u00ca\u0001\u0000\u0000"+
		"\u0000$\u00d6\u0001\u0000\u0000\u0000&\u00d8\u0001\u0000\u0000\u0000("+
		"\u00da\u0001\u0000\u0000\u0000*\u00e1\u0001\u0000\u0000\u0000,\u00e4\u0001"+
		"\u0000\u0000\u0000.\u010c\u0001\u0000\u0000\u00000\u0111\u0001\u0000\u0000"+
		"\u00002\u011d\u0001\u0000\u0000\u000045\u0003\u0002\u0001\u00005\u0001"+
		"\u0001\u0000\u0000\u000067\u0005\u0001\u0000\u000078\u0003\b\u0004\u0000"+
		"89\u0005\u0002\u0000\u00009>\u0003\u0006\u0003\u0000:;\u0005\u0004\u0000"+
		"\u0000;=\u0003\u0006\u0003\u0000<:\u0001\u0000\u0000\u0000=@\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?C\u0001"+
		"\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0005\u0003\u0000\u0000"+
		"BD\u00032\u0019\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"D\u0003\u0001\u0000\u0000\u0000EF\u0005%\u0000\u0000FG\u0005\u001f\u0000"+
		"\u0000GH\u0005\u0004\u0000\u0000HI\u0005\u001f\u0000\u0000IJ\u0005\u0004"+
		"\u0000\u0000JK\u0005\u001f\u0000\u0000KL\u0005\u0004\u0000\u0000LM\u0005"+
		"\u001f\u0000\u0000MN\u0005\u0004\u0000\u0000NO\u0005\u001f\u0000\u0000"+
		"OQ\u0005&\u0000\u0000PR\u0003&\u0013\u0000QP\u0001\u0000\u0000\u0000Q"+
		"R\u0001\u0000\u0000\u0000R\u0005\u0001\u0000\u0000\u0000SW\u0003.\u0017"+
		"\u0000TW\u0003\u0004\u0002\u0000UW\u00030\u0018\u0000VS\u0001\u0000\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000W\u0007\u0001"+
		"\u0000\u0000\u0000X]\u0003\n\u0005\u0000YZ\u0005\u0004\u0000\u0000Z\\"+
		"\u0003\n\u0005\u0000[Y\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\t\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000`a\u0006\u0005\uffff\uffff\u0000ag\u0003"+
		"\u0014\n\u0000bc\u0005%\u0000\u0000cd\u0003\n\u0005\u0000de\u0005&\u0000"+
		"\u0000eg\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000fb\u0001\u0000"+
		"\u0000\u0000gp\u0001\u0000\u0000\u0000hi\n\u0002\u0000\u0000ij\u0007\u0000"+
		"\u0000\u0000jo\u0003\n\u0005\u0003kl\n\u0001\u0000\u0000lm\u0007\u0001"+
		"\u0000\u0000mo\u0003\n\u0005\u0002nh\u0001\u0000\u0000\u0000nk\u0001\u0000"+
		"\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000q\u000b\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000su\u0003(\u0014\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000v{\u0003\u0016\u000b\u0000w{\u0005\f\u0000"+
		"\u0000x{\u0005\r\u0000\u0000y{\u0005\u000f\u0000\u0000zt\u0001\u0000\u0000"+
		"\u0000zw\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000"+
		"\u0000\u0000{\r\u0001\u0000\u0000\u0000|}\u0003\n\u0005\u0000}~\u0005"+
		"\u0004\u0000\u0000~\u007f\u0003\n\u0005\u0000\u007f\u0080\u0005\u0004"+
		"\u0000\u0000\u0080\u0081\u0003\n\u0005\u0000\u0081\u0082\u0005\u0004\u0000"+
		"\u0000\u0082\u0083\u0003\n\u0005\u0000\u0083\u0084\u0005\u0004\u0000\u0000"+
		"\u0084\u0085\u0003\n\u0005\u0000\u0085\u0086\u0005\u0004\u0000\u0000\u0086"+
		"\u0087\u0003\n\u0005\u0000\u0087\u0088\u0005\u0004\u0000\u0000\u0088\u0089"+
		"\u0003\n\u0005\u0000\u0089\u008a\u0005\u0004\u0000\u0000\u008a\u008b\u0003"+
		"\n\u0005\u0000\u008b\u008c\u0005\u0004\u0000\u0000\u008c\u008d\u0003\n"+
		"\u0005\u0000\u008d\u000f\u0001\u0000\u0000\u0000\u008e\u008f\u0005\'\u0000"+
		"\u0000\u008f\u0090\u0003\u000e\u0007\u0000\u0090\u0091\u0005(\u0000\u0000"+
		"\u0091\u0011\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u001e\u0000\u0000"+
		"\u0093\u0094\u0003\u0014\n\u0000\u0094\u0013\u0001\u0000\u0000\u0000\u0095"+
		"\u00a1\u0003\u0012\t\u0000\u0096\u00a1\u0005\u001f\u0000\u0000\u0097\u00a1"+
		"\u0005 \u0000\u0000\u0098\u00a1\u0005\u0006\u0000\u0000\u0099\u00a1\u0003"+
		"\f\u0006\u0000\u009a\u00a1\u0003\u0010\b\u0000\u009b\u00a1\u0003\u0018"+
		"\f\u0000\u009c\u00a1\u0003\u001a\r\u0000\u009d\u00a1\u0003\u001c\u000e"+
		"\u0000\u009e\u00a1\u0003\u001e\u000f\u0000\u009f\u00a1\u0003 \u0010\u0000"+
		"\u00a0\u0095\u0001\u0000\u0000\u0000\u00a0\u0096\u0001\u0000\u0000\u0000"+
		"\u00a0\u0097\u0001\u0000\u0000\u0000\u00a0\u0098\u0001\u0000\u0000\u0000"+
		"\u00a0\u0099\u0001\u0000\u0000\u0000\u00a0\u009a\u0001\u0000\u0000\u0000"+
		"\u00a0\u009b\u0001\u0000\u0000\u0000\u00a0\u009c\u0001\u0000\u0000\u0000"+
		"\u00a0\u009d\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u0015\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0007\u0002\u0000\u0000\u00a3\u0017\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0007\u0003\u0000\u0000\u00a5\u0019\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0007\u0004\u0000\u0000\u00a7\u00a8\u0005%\u0000\u0000\u00a8"+
		"\u00a9\u0003\n\u0005\u0000\u00a9\u00aa\u0005&\u0000\u0000\u00aa\u001b"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0007\u0005\u0000\u0000\u00ac\u00ae"+
		"\u0005%\u0000\u0000\u00ad\u00af\u0003(\u0014\u0000\u00ae\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0003\u0016\u000b\u0000\u00b1\u00b2\u0005\u0004"+
		"\u0000\u0000\u00b2\u00b3\u0003\n\u0005\u0000\u00b3\u00b4\u0005\u0004\u0000"+
		"\u0000\u00b4\u00b5\u0003\n\u0005\u0000\u00b5\u00b6\u0005&\u0000\u0000"+
		"\u00b6\u001d\u0001\u0000\u0000\u0000\u00b7\u00b8\u0007\u0006\u0000\u0000"+
		"\u00b8\u00b9\u0005%\u0000\u0000\u00b9\u00be\u0003\n\u0005\u0000\u00ba"+
		"\u00bb\u0005\u0004\u0000\u0000\u00bb\u00bd\u0003\n\u0005\u0000\u00bc\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0005&\u0000\u0000\u00c2\u001f\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005"+
		"\u001b\u0000\u0000\u00c4\u00c5\u0005%\u0000\u0000\u00c5\u00c6\u0003\n"+
		"\u0005\u0000\u00c6\u00c7\u0005\u0004\u0000\u0000\u00c7\u00c8\u0007\u0007"+
		"\u0000\u0000\u00c8\u00c9\u0005&\u0000\u0000\u00c9!\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0003\n\u0005\u0000\u00cb\u00cc\u0005)\u0000\u0000\u00cc"+
		"\u00cd\u0003\n\u0005\u0000\u00cd#\u0001\u0000\u0000\u0000\u00ce\u00d0"+
		"\u0005*\u0000\u0000\u00cf\u00d1\u0005*\u0000\u0000\u00d0\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d7\u0007\b\u0000\u0000\u00d3\u00d4\u0005!\u0000"+
		"\u0000\u00d4\u00d5\u0005$\u0000\u0000\u00d5\u00d7\u0007\b\u0000\u0000"+
		"\u00d6\u00ce\u0001\u0000\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d7%\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005!\u0000\u0000\u00d9\'"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0005!\u0000\u0000\u00db\u00dc\u0005"+
		"*\u0000\u0000\u00dc)\u0001\u0000\u0000\u0000\u00dd\u00de\u0005*\u0000"+
		"\u0000\u00de\u00e2\u0005*\u0000\u0000\u00df\u00e2\u0005!\u0000\u0000\u00e0"+
		"\u00e2\u0005\"\u0000\u0000\u00e1\u00dd\u0001\u0000\u0000\u0000\u00e1\u00df"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2+\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e5\u0003$\u0012\u0000\u00e4\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6\u00eb\u0003*\u0015\u0000\u00e7\u00e8\u0007\b\u0000"+
		"\u0000\u00e8\u00ea\u0003*\u0015\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005*\u0000\u0000\u00ef"+
		"\u00f0\u0003*\u0015\u0000\u00f0-\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005"+
		"%\u0000\u0000\u00f2\u00f3\u0003,\u0016\u0000\u00f3\u00f4\u0005\u0004\u0000"+
		"\u0000\u00f4\u00f5\u0005\u001f\u0000\u0000\u00f5\u00f6\u0005&\u0000\u0000"+
		"\u00f6\u010d\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005%\u0000\u0000\u00f8"+
		"\u00f9\u0003,\u0016\u0000\u00f9\u00fa\u0005\u0004\u0000\u0000\u00fa\u00fb"+
		"\u0005\u001f\u0000\u0000\u00fb\u00fc\u0005\u0004\u0000\u0000\u00fc\u00fd"+
		"\u0005\u001f\u0000\u0000\u00fd\u00fe\u0005&\u0000\u0000\u00fe\u010d\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0005%\u0000\u0000\u0100\u0101\u0003,\u0016"+
		"\u0000\u0101\u0102\u0005\u0004\u0000\u0000\u0102\u0103\u0005\u001f\u0000"+
		"\u0000\u0103\u0104\u0005\u0004\u0000\u0000\u0104\u0105\u0005\u001f\u0000"+
		"\u0000\u0105\u0106\u0005\u0004\u0000\u0000\u0106\u0107\u0005\u001f\u0000"+
		"\u0000\u0107\u0108\u0005\u0004\u0000\u0000\u0108\u0109\u0005\u001f\u0000"+
		"\u0000\u0109\u010a\u0005&\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000"+
		"\u010b\u010d\u0003,\u0016\u0000\u010c\u00f1\u0001\u0000\u0000\u0000\u010c"+
		"\u00f7\u0001\u0000\u0000\u0000\u010c\u00ff\u0001\u0000\u0000\u0000\u010c"+
		"\u010b\u0001\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e"+
		"\u0110\u0003&\u0013\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0001\u0000\u0000\u0000\u0110/\u0001\u0000\u0000\u0000\u0111\u0112\u0005"+
		"%\u0000\u0000\u0112\u0113\u0003\u0002\u0001\u0000\u0113\u0115\u0005&\u0000"+
		"\u0000\u0114\u0116\u0003&\u0013\u0000\u0115\u0114\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0001\u0000\u0000\u0000\u01161\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0006\u0019\uffff\uffff\u0000\u0118\u011e\u0003\"\u0011\u0000\u0119"+
		"\u011a\u0005%\u0000\u0000\u011a\u011b\u00032\u0019\u0000\u011b\u011c\u0005"+
		"&\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u0117\u0001\u0000"+
		"\u0000\u0000\u011d\u0119\u0001\u0000\u0000\u0000\u011e\u0124\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\n\u0002\u0000\u0000\u0120\u0121\u0005\u0005\u0000"+
		"\u0000\u0121\u0123\u00032\u0019\u0003\u0122\u011f\u0001\u0000\u0000\u0000"+
		"\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u01253\u0001\u0000\u0000\u0000\u0126"+
		"\u0124\u0001\u0000\u0000\u0000\u0017>CQV]fnptz\u00a0\u00ae\u00be\u00d0"+
		"\u00d6\u00e1\u00e4\u00eb\u010c\u010f\u0115\u011d\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}