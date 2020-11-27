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
		WS=1, COMMENT=2, LP=3, RP=4, LA=5, RA=6, PLUS=7, MOINS=8, MULTI=9, DIVI=10, 
		EGAL=11, INT=12, VIRG=13, IF=14, THEN=15, ELSE=16, FI=17, WHILE=18, DO=19, 
		DONE=20, IDENT=21, TEXT=22, INTEGER=23;
	public static final int
		RULE_program = 0, RULE_bloc = 1, RULE_instruction = 2, RULE_assignment = 3, 
		RULE_id = 4, RULE_expression = 5, RULE_factor = 6, RULE_variable = 7, 
		RULE_sialors = 8, RULE_tantque = 9, RULE_primary = 10;
	public static final String[] ruleNames = {
		"program", "bloc", "instruction", "assignment", "id", "expression", "factor", 
		"variable", "sialors", "tantque", "primary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", 
		"':='", "'INT'", "','", "'IF'", "'THEN'", "'ELSE'", "'FI'", "'WHILE'", 
		"'DO'", "'DONE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "LP", "RP", "LA", "RA", "PLUS", "MOINS", "MULTI", 
		"DIVI", "EGAL", "INT", "VIRG", "IF", "THEN", "ELSE", "FI", "WHILE", "DO", 
		"DONE", "IDENT", "TEXT", "INTEGER"
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
			setState(22);
			((ProgramContext)_localctx).e = bloc();
			setState(23);
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
		public InstructionContext ins;
		public TerminalNode INT() { return getToken(VSLParser.INT, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> VIRG() { return getTokens(VSLParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(VSLParser.VIRG, i);
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
			List<TP2.ASD.Instruction> l = new ArrayList(); List<TP2.ASD.Variable> r = new ArrayList(); 
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(27);
				match(INT);
				setState(28);
				((BlocContext)_localctx).v = variable();
				r.add(((BlocContext)_localctx).v.out);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRG) {
					{
					{
					setState(30);
					match(VIRG);
					setState(31);
					((BlocContext)_localctx).v = variable();
					r.add(((BlocContext)_localctx).v.out);
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				((BlocContext)_localctx).ins = instruction();
				l.add(((BlocContext)_localctx).ins.out);
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << IDENT))) != 0) );
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

	public static class InstructionContext extends ParserRuleContext {
		public TP2.ASD.Instruction out;
		public AssignmentContext a;
		public SialorsContext i;
		public TantqueContext w;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SialorsContext sialors() {
			return getRuleContext(SialorsContext.class,0);
		}
		public TantqueContext tantque() {
			return getRuleContext(TantqueContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				((InstructionContext)_localctx).a = assignment();
				 ((InstructionContext)_localctx).out =  ((InstructionContext)_localctx).a.out; 
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				((InstructionContext)_localctx).i = sialors();
				 ((InstructionContext)_localctx).out =  ((InstructionContext)_localctx).i.out; 
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				((InstructionContext)_localctx).w = tantque();
				 ((InstructionContext)_localctx).out =  ((InstructionContext)_localctx).w.out; 
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
			setState(61);
			((AssignmentContext)_localctx).l = id();
			setState(62);
			match(EGAL);
			setState(63);
			((AssignmentContext)_localctx).r = expression(0);
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
			setState(66);
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
		public ExpressionContext r;
		public FactorContext f;
		public FactorContext l;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(VSLParser.PLUS, 0); }
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(70);
			((ExpressionContext)_localctx).f = factor(0);
			 ((ExpressionContext)_localctx).out =  ((ExpressionContext)_localctx).f.out; 
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(83);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.r = _prevctx;
						_localctx.r = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(73);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(74);
						match(PLUS);
						setState(75);
						((ExpressionContext)_localctx).l = factor(0);
						 ((ExpressionContext)_localctx).out =  new TP2.ASD.AddExpression(((ExpressionContext)_localctx).l.out, ((ExpressionContext)_localctx).r.out); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.r = _prevctx;
						_localctx.r = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(78);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(79);
						match(MOINS);
						setState(80);
						((ExpressionContext)_localctx).l = factor(0);
						 ((ExpressionContext)_localctx).out =  new TP2.ASD.SubExpression(((ExpressionContext)_localctx).l.out, ((ExpressionContext)_localctx).r.out); 
						}
						break;
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(89);
				((FactorContext)_localctx).p = primary();
				 ((FactorContext)_localctx).out =  ((FactorContext)_localctx).p.out; 
				}
				break;
			case 2:
				{
				setState(92);
				match(LP);
				setState(93);
				((FactorContext)_localctx).l = factor(0);
				setState(94);
				match(MULTI);
				setState(95);
				((FactorContext)_localctx).r = expression(0);
				setState(96);
				match(RP);
				 ((FactorContext)_localctx).out =  new TP2.ASD.MulExpression(((FactorContext)_localctx).l.out, ((FactorContext)_localctx).r.out); 
				}
				break;
			case 3:
				{
				setState(99);
				match(LP);
				setState(100);
				((FactorContext)_localctx).l = factor(0);
				setState(101);
				match(DIVI);
				setState(102);
				((FactorContext)_localctx).r = expression(0);
				setState(103);
				match(RP);
				 ((FactorContext)_localctx).out =  new TP2.ASD.DivExpression(((FactorContext)_localctx).l.out, ((FactorContext)_localctx).r.out); 
				}
				break;
			case 4:
				{
				setState(106);
				match(LP);
				setState(107);
				((FactorContext)_localctx).l = factor(0);
				setState(108);
				match(PLUS);
				setState(109);
				((FactorContext)_localctx).r = expression(0);
				setState(110);
				match(RP);
				 ((FactorContext)_localctx).out =  new TP2.ASD.AddExpression(((FactorContext)_localctx).l.out, ((FactorContext)_localctx).r.out); 
				}
				break;
			case 5:
				{
				setState(113);
				match(LP);
				setState(114);
				((FactorContext)_localctx).l = factor(0);
				setState(115);
				match(MOINS);
				setState(116);
				((FactorContext)_localctx).r = expression(0);
				setState(117);
				match(RP);
				 ((FactorContext)_localctx).out =  new TP2.ASD.SubExpression(((FactorContext)_localctx).l.out, ((FactorContext)_localctx).r.out); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(132);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new FactorContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(122);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(123);
						match(MULTI);
						setState(124);
						((FactorContext)_localctx).r = expression(0);
						 ((FactorContext)_localctx).out =  new TP2.ASD.MulExpression(((FactorContext)_localctx).l.out, ((FactorContext)_localctx).r.out); 
						}
						break;
					case 2:
						{
						_localctx = new FactorContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(127);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(128);
						match(DIVI);
						setState(129);
						((FactorContext)_localctx).r = expression(0);
						 ((FactorContext)_localctx).out =  new TP2.ASD.DivExpression(((FactorContext)_localctx).l.out, ((FactorContext)_localctx).r.out); 
						}
						break;
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(VSLParser.IDENT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((VariableContext)_localctx).IDENT = match(IDENT);
			 ((VariableContext)_localctx).out =  new TP2.ASD.IntegerVariable((((VariableContext)_localctx).IDENT!=null?((VariableContext)_localctx).IDENT.getText():null));
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

	public static class SialorsContext extends ParserRuleContext {
		public TP2.ASD.IfElseInstruction out;
		public ExpressionContext e;
		public BlocContext b1;
		public BlocContext b2;
		public TerminalNode IF() { return getToken(VSLParser.IF, 0); }
		public TerminalNode THEN() { return getToken(VSLParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(VSLParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(VSLParser.FI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlocContext> bloc() {
			return getRuleContexts(BlocContext.class);
		}
		public BlocContext bloc(int i) {
			return getRuleContext(BlocContext.class,i);
		}
		public SialorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sialors; }
	}

	public final SialorsContext sialors() throws RecognitionException {
		SialorsContext _localctx = new SialorsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sialors);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(IF);
				setState(141);
				((SialorsContext)_localctx).e = expression(0);
				setState(142);
				match(THEN);
				setState(143);
				((SialorsContext)_localctx).b1 = bloc();
				setState(144);
				match(ELSE);
				setState(145);
				((SialorsContext)_localctx).b2 = bloc();
				setState(146);
				match(FI);
				 ((SialorsContext)_localctx).out =  new TP2.ASD.IfElseInstruction(((SialorsContext)_localctx).e.out, ((SialorsContext)_localctx).b1.out, ((SialorsContext)_localctx).b2.out); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(IF);
				setState(150);
				((SialorsContext)_localctx).e = expression(0);
				setState(151);
				match(THEN);
				setState(152);
				((SialorsContext)_localctx).b1 = bloc();
				setState(153);
				match(FI);
				 ((SialorsContext)_localctx).out =  new TP2.ASD.IfElseInstruction(((SialorsContext)_localctx).e.out, ((SialorsContext)_localctx).b1.out,null); 
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

	public static class TantqueContext extends ParserRuleContext {
		public TP2.ASD.WhileInstruction out;
		public ExpressionContext e;
		public BlocContext b;
		public TerminalNode WHILE() { return getToken(VSLParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(VSLParser.DO, 0); }
		public TerminalNode LA() { return getToken(VSLParser.LA, 0); }
		public TerminalNode RA() { return getToken(VSLParser.RA, 0); }
		public TerminalNode DONE() { return getToken(VSLParser.DONE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public TantqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tantque; }
	}

	public final TantqueContext tantque() throws RecognitionException {
		TantqueContext _localctx = new TantqueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tantque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(WHILE);
			setState(159);
			((TantqueContext)_localctx).e = expression(0);
			setState(160);
			match(DO);
			setState(161);
			match(LA);
			setState(162);
			((TantqueContext)_localctx).b = bloc();
			setState(163);
			match(RA);
			setState(164);
			match(DONE);
			 ((TantqueContext)_localctx).out =  new TP2.ASD.WhileInstruction(((TantqueContext)_localctx).e.out, ((TantqueContext)_localctx).b.out); 
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
		public Token IDENT;
		public TerminalNode INTEGER() { return getToken(VSLParser.INTEGER, 0); }
		public TerminalNode IDENT() { return getToken(VSLParser.IDENT, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primary);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				((PrimaryContext)_localctx).INTEGER = match(INTEGER);
				 ((PrimaryContext)_localctx).out =  new TP2.ASD.IntegerExpression((((PrimaryContext)_localctx).INTEGER!=null?Integer.valueOf(((PrimaryContext)_localctx).INTEGER.getText()):0)); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				((PrimaryContext)_localctx).IDENT = match(IDENT);
				 ((PrimaryContext)_localctx).out =  new TP2.ASD.VariableExpression((((PrimaryContext)_localctx).IDENT!=null?((PrimaryContext)_localctx).IDENT.getText():null)); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 6:
			return factor_sempred((FactorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean factor_sempred(FactorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00b0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3%\n\3"+
		"\f\3\16\3(\13\3\5\3*\n\3\3\3\3\3\3\3\6\3/\n\3\r\3\16\3\60\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7V\n\7"+
		"\f\7\16\7Y\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b{\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0087\n\b\f"+
		"\b\16\b\u008a\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009f\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00ae\n\f\3\f\2\4\f\16\r\2\4\6\b\n\f"+
		"\16\20\22\24\26\2\2\2\u00b3\2\30\3\2\2\2\4\34\3\2\2\2\6=\3\2\2\2\b?\3"+
		"\2\2\2\nD\3\2\2\2\fG\3\2\2\2\16z\3\2\2\2\20\u008b\3\2\2\2\22\u009e\3\2"+
		"\2\2\24\u00a0\3\2\2\2\26\u00ad\3\2\2\2\30\31\5\4\3\2\31\32\7\2\2\3\32"+
		"\33\b\2\1\2\33\3\3\2\2\2\34)\b\3\1\2\35\36\7\16\2\2\36\37\5\20\t\2\37"+
		"&\b\3\1\2 !\7\17\2\2!\"\5\20\t\2\"#\b\3\1\2#%\3\2\2\2$ \3\2\2\2%(\3\2"+
		"\2\2&$\3\2\2\2&\'\3\2\2\2\'*\3\2\2\2(&\3\2\2\2)\35\3\2\2\2)*\3\2\2\2*"+
		".\3\2\2\2+,\5\6\4\2,-\b\3\1\2-/\3\2\2\2.+\3\2\2\2/\60\3\2\2\2\60.\3\2"+
		"\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\b\3\1\2\63\5\3\2\2\2\64\65\5\b"+
		"\5\2\65\66\b\4\1\2\66>\3\2\2\2\678\5\22\n\289\b\4\1\29>\3\2\2\2:;\5\24"+
		"\13\2;<\b\4\1\2<>\3\2\2\2=\64\3\2\2\2=\67\3\2\2\2=:\3\2\2\2>\7\3\2\2\2"+
		"?@\5\n\6\2@A\7\r\2\2AB\5\f\7\2BC\b\5\1\2C\t\3\2\2\2DE\7\27\2\2EF\b\6\1"+
		"\2F\13\3\2\2\2GH\b\7\1\2HI\5\16\b\2IJ\b\7\1\2JW\3\2\2\2KL\f\5\2\2LM\7"+
		"\t\2\2MN\5\16\b\2NO\b\7\1\2OV\3\2\2\2PQ\f\4\2\2QR\7\n\2\2RS\5\16\b\2S"+
		"T\b\7\1\2TV\3\2\2\2UK\3\2\2\2UP\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2"+
		"X\r\3\2\2\2YW\3\2\2\2Z[\b\b\1\2[\\\5\26\f\2\\]\b\b\1\2]{\3\2\2\2^_\7\5"+
		"\2\2_`\5\16\b\2`a\7\13\2\2ab\5\f\7\2bc\7\6\2\2cd\b\b\1\2d{\3\2\2\2ef\7"+
		"\5\2\2fg\5\16\b\2gh\7\f\2\2hi\5\f\7\2ij\7\6\2\2jk\b\b\1\2k{\3\2\2\2lm"+
		"\7\5\2\2mn\5\16\b\2no\7\t\2\2op\5\f\7\2pq\7\6\2\2qr\b\b\1\2r{\3\2\2\2"+
		"st\7\5\2\2tu\5\16\b\2uv\7\n\2\2vw\5\f\7\2wx\7\6\2\2xy\b\b\1\2y{\3\2\2"+
		"\2zZ\3\2\2\2z^\3\2\2\2ze\3\2\2\2zl\3\2\2\2zs\3\2\2\2{\u0088\3\2\2\2|}"+
		"\f\6\2\2}~\7\13\2\2~\177\5\f\7\2\177\u0080\b\b\1\2\u0080\u0087\3\2\2\2"+
		"\u0081\u0082\f\5\2\2\u0082\u0083\7\f\2\2\u0083\u0084\5\f\7\2\u0084\u0085"+
		"\b\b\1\2\u0085\u0087\3\2\2\2\u0086|\3\2\2\2\u0086\u0081\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\17\3\2\2"+
		"\2\u008a\u0088\3\2\2\2\u008b\u008c\7\27\2\2\u008c\u008d\b\t\1\2\u008d"+
		"\21\3\2\2\2\u008e\u008f\7\20\2\2\u008f\u0090\5\f\7\2\u0090\u0091\7\21"+
		"\2\2\u0091\u0092\5\4\3\2\u0092\u0093\7\22\2\2\u0093\u0094\5\4\3\2\u0094"+
		"\u0095\7\23\2\2\u0095\u0096\b\n\1\2\u0096\u009f\3\2\2\2\u0097\u0098\7"+
		"\20\2\2\u0098\u0099\5\f\7\2\u0099\u009a\7\21\2\2\u009a\u009b\5\4\3\2\u009b"+
		"\u009c\7\23\2\2\u009c\u009d\b\n\1\2\u009d\u009f\3\2\2\2\u009e\u008e\3"+
		"\2\2\2\u009e\u0097\3\2\2\2\u009f\23\3\2\2\2\u00a0\u00a1\7\24\2\2\u00a1"+
		"\u00a2\5\f\7\2\u00a2\u00a3\7\25\2\2\u00a3\u00a4\7\7\2\2\u00a4\u00a5\5"+
		"\4\3\2\u00a5\u00a6\7\b\2\2\u00a6\u00a7\7\26\2\2\u00a7\u00a8\b\13\1\2\u00a8"+
		"\25\3\2\2\2\u00a9\u00aa\7\31\2\2\u00aa\u00ae\b\f\1\2\u00ab\u00ac\7\27"+
		"\2\2\u00ac\u00ae\b\f\1\2\u00ad\u00a9\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\27\3\2\2\2\r&)\60=UWz\u0086\u0088\u009e\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}