// Generated from VSLParser.g by ANTLR 4.7.1

  package TP2;

  import java.util.stream.Collectors;
  import java.util.Arrays;
  import java.util.List;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, LP=3, RP=4, PLUS=5, MOINS=6, MULTI=7, DIVI=8, EGAL=9, 
		INT=10, VIRG=11, IDENT=12, TEXT=13, INTEGER=14;
	public static final int
		RULE_program = 0, RULE_bloc = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_id = 4, RULE_expression = 5, RULE_factor = 6, RULE_variable = 7, 
		RULE_primary = 8;
	public static final String[] ruleNames = {
		"program", "bloc", "statement", "assignment", "id", "expression", "factor", 
		"variable", "primary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "':='", "'INT'", 
		"','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "LP", "RP", "PLUS", "MOINS", "MULTI", "DIVI", "EGAL", 
		"INT", "VIRG", "IDENT", "TEXT", "INTEGER"
	};
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
	public String getGrammarFileName() { return "VSLParser.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TP2.ASD.Program out;
		public BlocContext e;
		public TerminalNode EOF() { return getToken(VSLParser.EOF, 0); }
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((ProgramContext)_localctx).e = bloc();
			setState(19);
			match(EOF);
			 ((ProgramContext)_localctx).out =  new TP2.ASD.Program(((ProgramContext)_localctx).e.out); 
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

	public static class BlocContext extends ParserRuleContext {
		public TP2.ASD.Bloc out;
		public VariableContext v;
		public StatementContext s;
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<TP2.ASD.Statement> l = new ArrayList(); List<TP2.ASD.Variable> r = new ArrayList(); 
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(23);
				((BlocContext)_localctx).v = variable();
				r.add(((BlocContext)_localctx).v.out);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				((BlocContext)_localctx).s = statement();
				l.add(((BlocContext)_localctx).s.out);
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP) | (1L << IDENT) | (1L << INTEGER))) != 0) );
			 ((BlocContext)_localctx).out =  new TP2.ASD.Bloc(r,l);
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

	public static class StatementContext extends ParserRuleContext {
		public TP2.ASD.Statement out;
		public ExpressionContext e;
		public AssignmentContext a;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				((StatementContext)_localctx).e = expression();
				 ((StatementContext)_localctx).out =  ((StatementContext)_localctx).e.out; 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				((StatementContext)_localctx).a = assignment();
				 ((StatementContext)_localctx).out =  ((StatementContext)_localctx).a.out; 
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

	public static class AssignmentContext extends ParserRuleContext {
		public TP2.ASD.AffectInstruction out;
		public IdContext l;
		public ExpressionContext r;
		public TerminalNode EGAL() { return getToken(VSLParser.EGAL, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((AssignmentContext)_localctx).l = id();
			setState(49);
			match(EGAL);
			setState(50);
			((AssignmentContext)_localctx).r = expression();
			 ((AssignmentContext)_localctx).out =  new TP2.ASD.AffectInstruction(((AssignmentContext)_localctx).l.out, ((AssignmentContext)_localctx).r.out); 
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

	public static class IdContext extends ParserRuleContext {
		public TP2.ASD.Ident out;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(VSLParser.IDENT, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			((IdContext)_localctx).IDENT = match(IDENT);
			 ((IdContext)_localctx).out =  new TP2.ASD.Ident((((IdContext)_localctx).IDENT!=null?((IdContext)_localctx).IDENT.getText():null)); 
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
		public TP2.ASD.Expression out;
		public FactorContext l;
		public ExpressionContext r;
		public FactorContext f;
		public TerminalNode PLUS() { return getToken(VSLParser.PLUS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MOINS() { return getToken(VSLParser.MOINS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				((ExpressionContext)_localctx).l = factor(0);
				setState(57);
				match(PLUS);
				setState(58);
				((ExpressionContext)_localctx).r = expression();
				 ((ExpressionContext)_localctx).out =  new TP2.ASD.AddExpression(((ExpressionContext)_localctx).l.out, ((ExpressionContext)_localctx).r.out); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				((ExpressionContext)_localctx).l = factor(0);
				setState(62);
				match(MOINS);
				setState(63);
				((ExpressionContext)_localctx).r = expression();
				 ((ExpressionContext)_localctx).out =  new TP2.ASD.SubExpression(((ExpressionContext)_localctx).l.out, ((ExpressionContext)_localctx).r.out); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				((ExpressionContext)_localctx).f = factor(0);
				 ((ExpressionContext)_localctx).out =  ((ExpressionContext)_localctx).f.out; 
				}
				break;
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

	public static class FactorContext extends ParserRuleContext {
		public TP2.ASD.Expression out;
		public FactorContext l;
		public PrimaryContext p;
		public ExpressionContext r;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode LP() { return getToken(VSLParser.LP, 0); }
		public TerminalNode MULTI() { return getToken(VSLParser.MULTI, 0); }
		public TerminalNode RP() { return getToken(VSLParser.RP, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DIVI() { return getToken(VSLParser.DIVI, 0); }
		public TerminalNode PLUS() { return getToken(VSLParser.PLUS, 0); }
		public TerminalNode MOINS() { return getToken(VSLParser.MOINS, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		return factor(0);
	}

	private FactorContext factor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FactorContext _localctx = new FactorContext(_ctx, _parentState);
		FactorContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(72);
				((FactorContext)_localctx).p = primary();
				 ((FactorContext)_localctx).out =  ((FactorContext)_localctx).p.out; 
				}
				break;
			case 2:
				{
				setState(75);
				match(LP);
				setState(76);
				((FactorContext)_localctx).l = factor(0);
				setState(77);
				match(MULTI);
				setState(78);
				((FactorContext)_localctx).r = expression();
				setState(79);
				match(RP);
				 ((FactorContext)_localctx).out =  new TP2.ASD.MulExpression(((FactorContext)_localctx).l.out, ((FactorContext)_localctx).r.out); 
				}
				break;
			case 3:
				{
				setState(82);
				match(LP);
				setState(83);
				((FactorContext)_localctx).l = factor(0);
				setState(84);
				match(DIVI);
				setState(85);
				((FactorContext)_localctx).r = expression();
				setState(86);
				match(RP);
				 ((FactorContext)_localctx).out =  new TP2.ASD.DivExpression(((FactorContext)_localctx).l.out, ((FactorContext)_localctx).r.out); 
				}
				break;
			case 4:
				{
				setState(89);
				match(LP);
				setState(90);
				((FactorContext)_localctx).l = factor(0);
				setState(91);
				match(PLUS);
				setState(92);
				((FactorContext)_localctx).r = expression();
				setState(93);
				match(RP);
				 ((FactorContext)_localctx).out =  new TP2.ASD.AddExpression(((FactorContext)_localctx).l.out, ((FactorContext)_localctx).r.out); 
				}
				break;
			case 5:
				{
				setState(96);
				match(LP);
				setState(97);
				((FactorContext)_localctx).l = factor(0);
				setState(98);
				match(MOINS);
				setState(99);
				((FactorContext)_localctx).r = expression();
				setState(100);
				match(RP);
				 ((FactorContext)_localctx).out =  new TP2.ASD.SubExpression(((FactorContext)_localctx).l.out, ((FactorContext)_localctx).r.out); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new FactorContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(105);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(106);
						match(MULTI);
						setState(107);
						((FactorContext)_localctx).r = expression();
						 ((FactorContext)_localctx).out =  new TP2.ASD.MulExpression(((FactorContext)_localctx).l.out, ((FactorContext)_localctx).r.out); 
						}
						break;
					case 2:
						{
						_localctx = new FactorContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(110);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(111);
						match(DIVI);
						setState(112);
						((FactorContext)_localctx).r = expression();
						 ((FactorContext)_localctx).out =  new TP2.ASD.DivExpression(((FactorContext)_localctx).l.out, ((FactorContext)_localctx).r.out); 
						}
						break;
					}
					} 
				}
				setState(119);
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

	public static class VariableContext extends ParserRuleContext {
		public TP2.ASD.Variable out;
		public IdContext i;
		public TerminalNode INT() { return getToken(VSLParser.INT, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> VIRG() { return getTokens(VSLParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(VSLParser.VIRG, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<TP2.ASD.Ident> l = new ArrayList();
			setState(121);
			match(INT);
			{
			setState(122);
			((VariableContext)_localctx).i = id();
			l.add(((VariableContext)_localctx).i.out);
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(125);
				match(VIRG);
				setState(126);
				((VariableContext)_localctx).i = id();
				l.add(((VariableContext)_localctx).i.out);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((VariableContext)_localctx).out =  new TP2.ASD.Variable(l); 
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

	public static class PrimaryContext extends ParserRuleContext {
		public TP2.ASD.Expression out;
		public Token INTEGER;
		public TerminalNode INTEGER() { return getToken(VSLParser.INTEGER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((PrimaryContext)_localctx).INTEGER = match(INTEGER);
			 ((PrimaryContext)_localctx).out =  new TP2.ASD.IntegerExpression((((PrimaryContext)_localctx).INTEGER!=null?Integer.valueOf(((PrimaryContext)_localctx).INTEGER.getText()):0)); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return factor_sempred((FactorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean factor_sempred(FactorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u008e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3\3\6\3%"+
		"\n\3\r\3\16\3&\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7H\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\bj\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bv\n\b\f\b\16\by\13"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0084\n\t\f\t\16\t\u0087\13"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\2\3\16\13\2\4\6\b\n\f\16\20\22\2\2\2\u0090"+
		"\2\24\3\2\2\2\4\30\3\2\2\2\6\60\3\2\2\2\b\62\3\2\2\2\n\67\3\2\2\2\fG\3"+
		"\2\2\2\16i\3\2\2\2\20z\3\2\2\2\22\u008a\3\2\2\2\24\25\5\4\3\2\25\26\7"+
		"\2\2\3\26\27\b\2\1\2\27\3\3\2\2\2\30\36\b\3\1\2\31\32\5\20\t\2\32\33\b"+
		"\3\1\2\33\35\3\2\2\2\34\31\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2"+
		"\2\2\37$\3\2\2\2 \36\3\2\2\2!\"\5\6\4\2\"#\b\3\1\2#%\3\2\2\2$!\3\2\2\2"+
		"%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\b\3\1\2)\5\3\2\2\2*+\5\f"+
		"\7\2+,\b\4\1\2,\61\3\2\2\2-.\5\b\5\2./\b\4\1\2/\61\3\2\2\2\60*\3\2\2\2"+
		"\60-\3\2\2\2\61\7\3\2\2\2\62\63\5\n\6\2\63\64\7\13\2\2\64\65\5\f\7\2\65"+
		"\66\b\5\1\2\66\t\3\2\2\2\678\7\16\2\289\b\6\1\29\13\3\2\2\2:;\5\16\b\2"+
		";<\7\7\2\2<=\5\f\7\2=>\b\7\1\2>H\3\2\2\2?@\5\16\b\2@A\7\b\2\2AB\5\f\7"+
		"\2BC\b\7\1\2CH\3\2\2\2DE\5\16\b\2EF\b\7\1\2FH\3\2\2\2G:\3\2\2\2G?\3\2"+
		"\2\2GD\3\2\2\2H\r\3\2\2\2IJ\b\b\1\2JK\5\22\n\2KL\b\b\1\2Lj\3\2\2\2MN\7"+
		"\5\2\2NO\5\16\b\2OP\7\t\2\2PQ\5\f\7\2QR\7\6\2\2RS\b\b\1\2Sj\3\2\2\2TU"+
		"\7\5\2\2UV\5\16\b\2VW\7\n\2\2WX\5\f\7\2XY\7\6\2\2YZ\b\b\1\2Zj\3\2\2\2"+
		"[\\\7\5\2\2\\]\5\16\b\2]^\7\7\2\2^_\5\f\7\2_`\7\6\2\2`a\b\b\1\2aj\3\2"+
		"\2\2bc\7\5\2\2cd\5\16\b\2de\7\b\2\2ef\5\f\7\2fg\7\6\2\2gh\b\b\1\2hj\3"+
		"\2\2\2iI\3\2\2\2iM\3\2\2\2iT\3\2\2\2i[\3\2\2\2ib\3\2\2\2jw\3\2\2\2kl\f"+
		"\6\2\2lm\7\t\2\2mn\5\f\7\2no\b\b\1\2ov\3\2\2\2pq\f\5\2\2qr\7\n\2\2rs\5"+
		"\f\7\2st\b\b\1\2tv\3\2\2\2uk\3\2\2\2up\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3"+
		"\2\2\2x\17\3\2\2\2yw\3\2\2\2z{\b\t\1\2{|\7\f\2\2|}\5\n\6\2}~\b\t\1\2~"+
		"\u0085\3\2\2\2\177\u0080\7\r\2\2\u0080\u0081\5\n\6\2\u0081\u0082\b\t\1"+
		"\2\u0082\u0084\3\2\2\2\u0083\177\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\b\t\1\2\u0089\21\3\2\2\2\u008a\u008b\7\20\2\2\u008b\u008c\b\n\1"+
		"\2\u008c\23\3\2\2\2\n\36&\60Giuw\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}