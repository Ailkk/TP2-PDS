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
		INT=10, VIRG=11, IF=12, THEN=13, ELSE=14, FI=15, IDENT=16, TEXT=17, INTEGER=18;
	public static final int
		RULE_program = 0, RULE_bloc = 1, RULE_instruction = 2, RULE_assignment = 3, 
		RULE_id = 4, RULE_expression = 5, RULE_factor = 6, RULE_variable = 7, 
		RULE_sialors = 8, RULE_primary = 9;
	public static final String[] ruleNames = {
		"program", "bloc", "instruction", "assignment", "id", "expression", "factor", 
		"variable", "sialors", "primary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "':='", "'INT'", 
		"','", "'IF'", "'THEN'", "'ELSE'", "'FI'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "LP", "RP", "PLUS", "MOINS", "MULTI", "DIVI", "EGAL", 
		"INT", "VIRG", "IF", "THEN", "ELSE", "FI", "IDENT", "TEXT", "INTEGER"
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
			setState(20);
			((ProgramContext)_localctx).e = bloc();
			setState(21);
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(25);
				match(INT);
				setState(26);
				((BlocContext)_localctx).v = variable();
				r.add(((BlocContext)_localctx).v.out);
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRG) {
					{
					{
					setState(28);
					match(VIRG);
					setState(29);
					((BlocContext)_localctx).v = variable();
					r.add(((BlocContext)_localctx).v.out);
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				((BlocContext)_localctx).ins = instruction();
				l.add(((BlocContext)_localctx).ins.out);
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IF || _la==IDENT );
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SialorsContext sialors() {
			return getRuleContext(SialorsContext.class,0);
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
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				((InstructionContext)_localctx).a = assignment();
				 ((InstructionContext)_localctx).out =  ((InstructionContext)_localctx).a.out; 
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				((InstructionContext)_localctx).i = sialors();
				 ((InstructionContext)_localctx).out =  ((InstructionContext)_localctx).i.out; 
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
			setState(56);
			((AssignmentContext)_localctx).l = id();
			setState(57);
			match(EGAL);
			setState(58);
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
			setState(61);
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
			setState(65);
			((ExpressionContext)_localctx).f = factor(0);
			 ((ExpressionContext)_localctx).out =  ((ExpressionContext)_localctx).f.out; 
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(78);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.r = _prevctx;
						_localctx.r = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(69);
						match(PLUS);
						setState(70);
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
						setState(73);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(74);
						match(MOINS);
						setState(75);
						((ExpressionContext)_localctx).l = factor(0);
						 ((ExpressionContext)_localctx).out =  new TP2.ASD.SubExpression(((ExpressionContext)_localctx).l.out, ((ExpressionContext)_localctx).r.out); 
						}
						break;
					}
					} 
				}
				setState(82);
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
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(84);
				((FactorContext)_localctx).p = primary();
				 ((FactorContext)_localctx).out =  ((FactorContext)_localctx).p.out; 
				}
				break;
			case 2:
				{
				setState(87);
				match(LP);
				setState(88);
				((FactorContext)_localctx).l = factor(0);
				setState(89);
				match(MULTI);
				setState(90);
				((FactorContext)_localctx).r = expression(0);
				setState(91);
				match(RP);
				 ((FactorContext)_localctx).out =  new TP2.ASD.MulExpression(((FactorContext)_localctx).l.out, ((FactorContext)_localctx).r.out); 
				}
				break;
			case 3:
				{
				setState(94);
				match(LP);
				setState(95);
				((FactorContext)_localctx).l = factor(0);
				setState(96);
				match(DIVI);
				setState(97);
				((FactorContext)_localctx).r = expression(0);
				setState(98);
				match(RP);
				 ((FactorContext)_localctx).out =  new TP2.ASD.DivExpression(((FactorContext)_localctx).l.out, ((FactorContext)_localctx).r.out); 
				}
				break;
			case 4:
				{
				setState(101);
				match(LP);
				setState(102);
				((FactorContext)_localctx).l = factor(0);
				setState(103);
				match(PLUS);
				setState(104);
				((FactorContext)_localctx).r = expression(0);
				setState(105);
				match(RP);
				 ((FactorContext)_localctx).out =  new TP2.ASD.AddExpression(((FactorContext)_localctx).l.out, ((FactorContext)_localctx).r.out); 
				}
				break;
			case 5:
				{
				setState(108);
				match(LP);
				setState(109);
				((FactorContext)_localctx).l = factor(0);
				setState(110);
				match(MOINS);
				setState(111);
				((FactorContext)_localctx).r = expression(0);
				setState(112);
				match(RP);
				 ((FactorContext)_localctx).out =  new TP2.ASD.SubExpression(((FactorContext)_localctx).l.out, ((FactorContext)_localctx).r.out); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new FactorContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(117);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(118);
						match(MULTI);
						setState(119);
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
						setState(122);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(123);
						match(DIVI);
						setState(124);
						((FactorContext)_localctx).r = expression(0);
						 ((FactorContext)_localctx).out =  new TP2.ASD.DivExpression(((FactorContext)_localctx).l.out, ((FactorContext)_localctx).r.out); 
						}
						break;
					}
					} 
				}
				setState(131);
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
			setState(132);
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(IF);
				setState(136);
				((SialorsContext)_localctx).e = expression(0);
				setState(137);
				match(THEN);
				setState(138);
				((SialorsContext)_localctx).b1 = bloc();
				setState(139);
				match(ELSE);
				setState(140);
				((SialorsContext)_localctx).b2 = bloc();
				setState(141);
				match(FI);
				 ((SialorsContext)_localctx).out =  new TP2.ASD.IfElseInstruction(((SialorsContext)_localctx).e.out, ((SialorsContext)_localctx).b1.out, ((SialorsContext)_localctx).b2.out); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(IF);
				setState(145);
				((SialorsContext)_localctx).e = expression(0);
				setState(146);
				match(THEN);
				setState(147);
				((SialorsContext)_localctx).b1 = bloc();
				setState(148);
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
		enterRule(_localctx, 18, RULE_primary);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				((PrimaryContext)_localctx).INTEGER = match(INTEGER);
				 ((PrimaryContext)_localctx).out =  new TP2.ASD.IntegerExpression((((PrimaryContext)_localctx).INTEGER!=null?Integer.valueOf(((PrimaryContext)_localctx).INTEGER.getText()):0)); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u00a2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\5\3(\n\3\3\3\3\3\3\3\6\3-\n\3\r\3\16\3.\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7Q\n\7\f\7\16\7T\13\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bv\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0082\n\b\f\b\16\b\u0085\13\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u009a\n\n\3\13\3\13\3\13\3\13\5\13\u00a0\n\13\3\13\2\4\f\16\f\2\4"+
		"\6\b\n\f\16\20\22\24\2\2\2\u00a5\2\26\3\2\2\2\4\32\3\2\2\2\68\3\2\2\2"+
		"\b:\3\2\2\2\n?\3\2\2\2\fB\3\2\2\2\16u\3\2\2\2\20\u0086\3\2\2\2\22\u0099"+
		"\3\2\2\2\24\u009f\3\2\2\2\26\27\5\4\3\2\27\30\7\2\2\3\30\31\b\2\1\2\31"+
		"\3\3\2\2\2\32\'\b\3\1\2\33\34\7\f\2\2\34\35\5\20\t\2\35$\b\3\1\2\36\37"+
		"\7\r\2\2\37 \5\20\t\2 !\b\3\1\2!#\3\2\2\2\"\36\3\2\2\2#&\3\2\2\2$\"\3"+
		"\2\2\2$%\3\2\2\2%(\3\2\2\2&$\3\2\2\2\'\33\3\2\2\2\'(\3\2\2\2(,\3\2\2\2"+
		")*\5\6\4\2*+\b\3\1\2+-\3\2\2\2,)\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2"+
		"/\60\3\2\2\2\60\61\b\3\1\2\61\5\3\2\2\2\62\63\5\b\5\2\63\64\b\4\1\2\64"+
		"9\3\2\2\2\65\66\5\22\n\2\66\67\b\4\1\2\679\3\2\2\28\62\3\2\2\28\65\3\2"+
		"\2\29\7\3\2\2\2:;\5\n\6\2;<\7\13\2\2<=\5\f\7\2=>\b\5\1\2>\t\3\2\2\2?@"+
		"\7\22\2\2@A\b\6\1\2A\13\3\2\2\2BC\b\7\1\2CD\5\16\b\2DE\b\7\1\2ER\3\2\2"+
		"\2FG\f\5\2\2GH\7\7\2\2HI\5\16\b\2IJ\b\7\1\2JQ\3\2\2\2KL\f\4\2\2LM\7\b"+
		"\2\2MN\5\16\b\2NO\b\7\1\2OQ\3\2\2\2PF\3\2\2\2PK\3\2\2\2QT\3\2\2\2RP\3"+
		"\2\2\2RS\3\2\2\2S\r\3\2\2\2TR\3\2\2\2UV\b\b\1\2VW\5\24\13\2WX\b\b\1\2"+
		"Xv\3\2\2\2YZ\7\5\2\2Z[\5\16\b\2[\\\7\t\2\2\\]\5\f\7\2]^\7\6\2\2^_\b\b"+
		"\1\2_v\3\2\2\2`a\7\5\2\2ab\5\16\b\2bc\7\n\2\2cd\5\f\7\2de\7\6\2\2ef\b"+
		"\b\1\2fv\3\2\2\2gh\7\5\2\2hi\5\16\b\2ij\7\7\2\2jk\5\f\7\2kl\7\6\2\2lm"+
		"\b\b\1\2mv\3\2\2\2no\7\5\2\2op\5\16\b\2pq\7\b\2\2qr\5\f\7\2rs\7\6\2\2"+
		"st\b\b\1\2tv\3\2\2\2uU\3\2\2\2uY\3\2\2\2u`\3\2\2\2ug\3\2\2\2un\3\2\2\2"+
		"v\u0083\3\2\2\2wx\f\6\2\2xy\7\t\2\2yz\5\f\7\2z{\b\b\1\2{\u0082\3\2\2\2"+
		"|}\f\5\2\2}~\7\n\2\2~\177\5\f\7\2\177\u0080\b\b\1\2\u0080\u0082\3\2\2"+
		"\2\u0081w\3\2\2\2\u0081|\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2"+
		"\2\u0083\u0084\3\2\2\2\u0084\17\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087"+
		"\7\22\2\2\u0087\u0088\b\t\1\2\u0088\21\3\2\2\2\u0089\u008a\7\16\2\2\u008a"+
		"\u008b\5\f\7\2\u008b\u008c\7\17\2\2\u008c\u008d\5\4\3\2\u008d\u008e\7"+
		"\20\2\2\u008e\u008f\5\4\3\2\u008f\u0090\7\21\2\2\u0090\u0091\b\n\1\2\u0091"+
		"\u009a\3\2\2\2\u0092\u0093\7\16\2\2\u0093\u0094\5\f\7\2\u0094\u0095\7"+
		"\17\2\2\u0095\u0096\5\4\3\2\u0096\u0097\7\21\2\2\u0097\u0098\b\n\1\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0089\3\2\2\2\u0099\u0092\3\2\2\2\u009a\23\3\2\2"+
		"\2\u009b\u009c\7\24\2\2\u009c\u00a0\b\13\1\2\u009d\u009e\7\22\2\2\u009e"+
		"\u00a0\b\13\1\2\u009f\u009b\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\25\3\2\2"+
		"\2\r$\'.8PRu\u0081\u0083\u0099\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}