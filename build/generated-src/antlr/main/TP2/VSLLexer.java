// Generated from VSLLexer.g by ANTLR 4.7.1

  package TP2;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, LP=3, RP=4, PLUS=5, MOINS=6, MULTI=7, DIVI=8, EGAL=9, 
		INT=10, VIRG=11, IF=12, THEN=13, ELSE=14, FI=15, IDENT=16, TEXT=17, INTEGER=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "COMMENT", "LETTER", "DIGIT", "ASCII", "LP", "RP", "PLUS", "MOINS", 
		"MULTI", "DIVI", "EGAL", "INT", "VIRG", "IF", "THEN", "ELSE", "FI", "IDENT", 
		"TEXT", "INTEGER"
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


	public VSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VSLLexer.g"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 19:
			TEXT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 setText(getText().substring(1, getText().length() - 1)); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\7\24k\n\24\f\24\16\24n\13\24\3"+
		"\25\3\25\7\25r\n\25\f\25\16\25u\13\25\3\25\3\25\3\25\3\26\6\26{\n\26\r"+
		"\26\16\26|\2\2\27\3\3\5\4\7\2\t\2\13\2\r\5\17\6\21\7\23\b\25\t\27\n\31"+
		"\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24\3\2\5\5\2\13\f\17\17\"\""+
		"\3\2\f\f\4\2\f\f$$\2\177\2\3\3\2\2\2\2\5\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\61\3\2\2\2\7<\3\2\2"+
		"\2\t>\3\2\2\2\13@\3\2\2\2\rB\3\2\2\2\17D\3\2\2\2\21F\3\2\2\2\23H\3\2\2"+
		"\2\25J\3\2\2\2\27L\3\2\2\2\31N\3\2\2\2\33Q\3\2\2\2\35U\3\2\2\2\37W\3\2"+
		"\2\2!Z\3\2\2\2#_\3\2\2\2%d\3\2\2\2\'g\3\2\2\2)o\3\2\2\2+z\3\2\2\2-.\t"+
		"\2\2\2./\3\2\2\2/\60\b\2\2\2\60\4\3\2\2\2\61\62\7\61\2\2\62\63\7\61\2"+
		"\2\63\67\3\2\2\2\64\66\n\3\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2"+
		"\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\b\3\2\2;\6\3\2\2\2<=\4c|\2=\b\3\2"+
		"\2\2>?\4\62;\2?\n\3\2\2\2@A\n\4\2\2A\f\3\2\2\2BC\7*\2\2C\16\3\2\2\2DE"+
		"\7+\2\2E\20\3\2\2\2FG\7-\2\2G\22\3\2\2\2HI\7/\2\2I\24\3\2\2\2JK\7,\2\2"+
		"K\26\3\2\2\2LM\7\61\2\2M\30\3\2\2\2NO\7<\2\2OP\7?\2\2P\32\3\2\2\2QR\7"+
		"K\2\2RS\7P\2\2ST\7V\2\2T\34\3\2\2\2UV\7.\2\2V\36\3\2\2\2WX\7K\2\2XY\7"+
		"H\2\2Y \3\2\2\2Z[\7V\2\2[\\\7J\2\2\\]\7G\2\2]^\7P\2\2^\"\3\2\2\2_`\7G"+
		"\2\2`a\7N\2\2ab\7U\2\2bc\7G\2\2c$\3\2\2\2de\7H\2\2ef\7K\2\2f&\3\2\2\2"+
		"gl\5\7\4\2hk\5\7\4\2ik\5\t\5\2jh\3\2\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2"+
		"lm\3\2\2\2m(\3\2\2\2nl\3\2\2\2os\7$\2\2pr\5\13\6\2qp\3\2\2\2ru\3\2\2\2"+
		"sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7$\2\2wx\b\25\3\2x*\3\2\2\2"+
		"y{\5\t\5\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2},\3\2\2\2\b\2\67jl"+
		"s|\4\b\2\2\3\25\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}