// Generated from C:/Users/olivi/IdeaProjects/picsql/src/main/java/grammar\picsql.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SELECT=9, 
		FROM=10, WHERE=11, OPERATOR_LOGIC=12, STAR=13, DIVIDE=14, MODULO=15, PLUS=16, 
		MINUS=17, DIGITS=18, STR=19, DOTS=20, LEFT_PARENTHESIS=21, RIGHT_PARENTHESIS=22, 
		OPERATOR_CONDITION=23, DOT=24, WS=25;
	public static final int
		RULE_query = 0, RULE_selectstmt = 1, RULE_from_source_list = 2, RULE_selectionlist = 3, 
		RULE_selection = 4, RULE_single_field = 5, RULE_alias_value = 6, RULE_unary_function = 7, 
		RULE_expression = 8, RULE_begin_path = 9, RULE_alias = 10, RULE_path_part = 11, 
		RULE_path = 12, RULE_pic_path = 13, RULE_subquery = 14, RULE_where_clause = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "selectstmt", "from_source_list", "selectionlist", "selection", 
			"single_field", "alias_value", "unary_function", "expression", "begin_path", 
			"alias", "path_part", "path", "pic_path", "subquery", "where_clause"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'x'", "'y'", "'r'", "'g'", "'b'", "'rand()'", "'rank()'", 
			"'select'", "'from'", "'where'", null, "'*'", "'/'", "'%'", "'+'", "'-'", 
			null, null, "':'", "'('", "')'", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "SELECT", "FROM", 
			"WHERE", "OPERATOR_LOGIC", "STAR", "DIVIDE", "MODULO", "PLUS", "MINUS", 
			"DIGITS", "STR", "DOTS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "OPERATOR_CONDITION", 
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
			setState(32);
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
			setState(34);
			match(SELECT);
			setState(35);
			selectionlist();
			setState(36);
			match(FROM);
			setState(37);
			from_source_list();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(38);
				match(T__0);
				setState(39);
				from_source_list();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(45);
				match(WHERE);
				setState(46);
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

	public static class From_source_listContext extends ParserRuleContext {
		public Pic_pathContext pic_path() {
			return getRuleContext(Pic_pathContext.class,0);
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
		enterRule(_localctx, 4, RULE_from_source_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
			case DOT:
				{
				setState(49);
				pic_path();
				}
				break;
			case LEFT_PARENTHESIS:
				{
				setState(50);
				subquery();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 6, RULE_selectionlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			selection(0);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(54);
				match(T__0);
				setState(55);
				selection(0);
				}
				}
				setState(60);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_selection, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case STAR:
			case DIGITS:
			case STR:
				{
				setState(62);
				single_field();
				}
				break;
			case LEFT_PARENTHESIS:
				{
				setState(63);
				match(LEFT_PARENTHESIS);
				setState(64);
				selection(0);
				setState(65);
				match(RIGHT_PARENTHESIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new SelectionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_selection);
						setState(69);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(70);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(71);
						selection(3);
						}
						break;
					case 2:
						{
						_localctx = new SelectionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_selection);
						setState(72);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(73);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(74);
						selection(2);
						}
						break;
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Single_fieldContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(picsqlParser.DIGITS, 0); }
		public Alias_valueContext alias_value() {
			return getRuleContext(Alias_valueContext.class,0);
		}
		public TerminalNode STR() { return getToken(picsqlParser.STR, 0); }
		public TerminalNode DOT() { return getToken(picsqlParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(picsqlParser.STAR, 0); }
		public Unary_functionContext unary_function() {
			return getRuleContext(Unary_functionContext.class,0);
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
		enterRule(_localctx, 10, RULE_single_field);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITS:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(DIGITS);
				}
				break;
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				alias_value();
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(STR);
				setState(83);
				match(DOT);
				setState(84);
				alias_value();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(STAR);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				match(T__2);
				}
				break;
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				unary_function();
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
		enterRule(_localctx, 12, RULE_alias_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
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

	public static class Unary_functionContext extends ParserRuleContext {
		public Unary_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterUnary_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitUnary_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitUnary_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_functionContext unary_function() throws RecognitionException {
		Unary_functionContext _localctx = new Unary_functionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unary_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public TerminalNode OPERATOR_CONDITION() { return getToken(picsqlParser.OPERATOR_CONDITION, 0); }
		public TerminalNode DIGITS() { return getToken(picsqlParser.DIGITS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			selection(0);
			setState(96);
			match(OPERATOR_CONDITION);
			setState(97);
			match(DIGITS);
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
		public TerminalNode STR() { return getToken(picsqlParser.STR, 0); }
		public TerminalNode DOTS() { return getToken(picsqlParser.DOTS, 0); }
		public TerminalNode DIVIDE() { return getToken(picsqlParser.DIVIDE, 0); }
		public TerminalNode DOT() { return getToken(picsqlParser.DOT, 0); }
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
		enterRule(_localctx, 18, RULE_begin_path);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(STR);
				setState(100);
				match(DOTS);
				setState(101);
				match(DIVIDE);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(DOT);
				setState(103);
				match(DIVIDE);
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
		enterRule(_localctx, 20, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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

	public static class Path_partContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(picsqlParser.STR, 0); }
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
		enterRule(_localctx, 22, RULE_path_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
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

	public static class PathContext extends ParserRuleContext {
		public List<Path_partContext> path_part() {
			return getRuleContexts(Path_partContext.class);
		}
		public Path_partContext path_part(int i) {
			return getRuleContext(Path_partContext.class,i);
		}
		public Begin_pathContext begin_path() {
			return getRuleContext(Begin_pathContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(picsqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(picsqlParser.DOT, i);
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
		enterRule(_localctx, 24, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(110);
				begin_path();
				}
				break;
			}
			setState(113);
			path_part();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(114);
				match(DOT);
				setState(115);
				path_part();
				}
				}
				setState(120);
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

	public static class Pic_pathContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_pic_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			path();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(122);
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
		enterRule(_localctx, 28, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(LEFT_PARENTHESIS);
			setState(126);
			selectstmt();
			setState(127);
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

	public static class Where_clauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_where_clause, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(130);
				expression();
				}
				break;
			case 2:
				{
				setState(131);
				match(LEFT_PARENTHESIS);
				setState(132);
				where_clause(0);
				setState(133);
				match(RIGHT_PARENTHESIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Where_clauseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_where_clause);
					setState(137);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(138);
					match(OPERATOR_LOGIC);
					setState(139);
					where_clause(3);
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		case 4:
			return selection_sempred((SelectionContext)_localctx, predIndex);
		case 15:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0094\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\5\3\62\n\3\3"+
		"\4\3\4\5\4\66\n\4\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6F\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\\\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\5\13k\n\13\3\f\3\f\3\r\3\r\3\16\5\16r\n"+
		"\16\3\16\3\16\3\16\7\16w\n\16\f\16\16\16z\13\16\3\17\3\17\5\17~\n\17\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u008a\n\21\3\21"+
		"\3\21\3\21\7\21\u008f\n\21\f\21\16\21\u0092\13\21\3\21\2\4\n \22\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \2\6\3\2\17\21\3\2\22\23\3\2\6\b\3\2"+
		"\t\n\2\u0096\2\"\3\2\2\2\4$\3\2\2\2\6\65\3\2\2\2\b\67\3\2\2\2\nE\3\2\2"+
		"\2\f[\3\2\2\2\16]\3\2\2\2\20_\3\2\2\2\22a\3\2\2\2\24j\3\2\2\2\26l\3\2"+
		"\2\2\30n\3\2\2\2\32q\3\2\2\2\34{\3\2\2\2\36\177\3\2\2\2 \u0089\3\2\2\2"+
		"\"#\5\4\3\2#\3\3\2\2\2$%\7\13\2\2%&\5\b\5\2&\'\7\f\2\2\',\5\6\4\2()\7"+
		"\3\2\2)+\5\6\4\2*(\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\61\3\2\2\2."+
		",\3\2\2\2/\60\7\r\2\2\60\62\5 \21\2\61/\3\2\2\2\61\62\3\2\2\2\62\5\3\2"+
		"\2\2\63\66\5\34\17\2\64\66\5\36\20\2\65\63\3\2\2\2\65\64\3\2\2\2\66\7"+
		"\3\2\2\2\67<\5\n\6\289\7\3\2\29;\5\n\6\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2\2"+
		"<=\3\2\2\2=\t\3\2\2\2><\3\2\2\2?@\b\6\1\2@F\5\f\7\2AB\7\27\2\2BC\5\n\6"+
		"\2CD\7\30\2\2DF\3\2\2\2E?\3\2\2\2EA\3\2\2\2FO\3\2\2\2GH\f\4\2\2HI\t\2"+
		"\2\2IN\5\n\6\5JK\f\3\2\2KL\t\3\2\2LN\5\n\6\4MG\3\2\2\2MJ\3\2\2\2NQ\3\2"+
		"\2\2OM\3\2\2\2OP\3\2\2\2P\13\3\2\2\2QO\3\2\2\2R\\\7\24\2\2S\\\5\16\b\2"+
		"TU\7\25\2\2UV\7\32\2\2V\\\5\16\b\2W\\\7\17\2\2X\\\7\4\2\2Y\\\7\5\2\2Z"+
		"\\\5\20\t\2[R\3\2\2\2[S\3\2\2\2[T\3\2\2\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2"+
		"\2[Z\3\2\2\2\\\r\3\2\2\2]^\t\4\2\2^\17\3\2\2\2_`\t\5\2\2`\21\3\2\2\2a"+
		"b\5\n\6\2bc\7\31\2\2cd\7\24\2\2d\23\3\2\2\2ef\7\25\2\2fg\7\26\2\2gk\7"+
		"\20\2\2hi\7\32\2\2ik\7\20\2\2je\3\2\2\2jh\3\2\2\2k\25\3\2\2\2lm\7\25\2"+
		"\2m\27\3\2\2\2no\7\25\2\2o\31\3\2\2\2pr\5\24\13\2qp\3\2\2\2qr\3\2\2\2"+
		"rs\3\2\2\2sx\5\30\r\2tu\7\32\2\2uw\5\30\r\2vt\3\2\2\2wz\3\2\2\2xv\3\2"+
		"\2\2xy\3\2\2\2y\33\3\2\2\2zx\3\2\2\2{}\5\32\16\2|~\5\26\f\2}|\3\2\2\2"+
		"}~\3\2\2\2~\35\3\2\2\2\177\u0080\7\27\2\2\u0080\u0081\5\4\3\2\u0081\u0082"+
		"\7\30\2\2\u0082\37\3\2\2\2\u0083\u0084\b\21\1\2\u0084\u008a\5\22\n\2\u0085"+
		"\u0086\7\27\2\2\u0086\u0087\5 \21\2\u0087\u0088\7\30\2\2\u0088\u008a\3"+
		"\2\2\2\u0089\u0083\3\2\2\2\u0089\u0085\3\2\2\2\u008a\u0090\3\2\2\2\u008b"+
		"\u008c\f\4\2\2\u008c\u008d\7\16\2\2\u008d\u008f\5 \21\5\u008e\u008b\3"+
		"\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"!\3\2\2\2\u0092\u0090\3\2\2\2\20,\61\65<EMO[jqx}\u0089\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}