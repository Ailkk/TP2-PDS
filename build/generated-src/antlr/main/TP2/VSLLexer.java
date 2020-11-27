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
		WS=1, COMMENT=2, LP=3, RP=4, LA=5, RA=6, PLUS=7, MOINS=8, MULTI=9, DIVI=10, 
		EGAL=11, INT=12, VIRG=13, IF=14, THEN=15, ELSE=16, FI=17, WHILE=18, DO=19, 
		DONE=20, IDENT=21, TEXT=22, INTEGER=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "COMMENT", "LETTER", "DIGIT", "ASCII", "LP", "RP", "LA", "RA", "PLUS", 
		"MOINS", "MULTI", "DIVI", "EGAL", "INT", "VIRG", "IF", "THEN", "ELSE", 
		"FI", "WHILE", "DO", "DONE", "IDENT", "TEXT", "INTEGER"
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
		case 24:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3@\n\3\f\3"+
		"\16\3C\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u0087\n\31\f\31\16\31"+
		"\u008a\13\31\3\32\3\32\7\32\u008e\n\32\f\32\16\32\u0091\13\32\3\32\3\32"+
		"\3\32\3\33\6\33\u0097\n\33\r\33\16\33\u0098\2\2\34\3\3\5\4\7\2\t\2\13"+
		"\2\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22"+
		")\23+\24-\25/\26\61\27\63\30\65\31\3\2\5\5\2\13\f\17\17\"\"\3\2\f\f\4"+
		"\2\f\f$$\2\u009b\2\3\3\2\2\2\2\5\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5;\3\2\2\2\7F\3\2\2\2\tH\3\2\2\2\13J"+
		"\3\2\2\2\rL\3\2\2\2\17N\3\2\2\2\21P\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27"+
		"V\3\2\2\2\31X\3\2\2\2\33Z\3\2\2\2\35\\\3\2\2\2\37_\3\2\2\2!c\3\2\2\2#"+
		"e\3\2\2\2%h\3\2\2\2\'m\3\2\2\2)r\3\2\2\2+u\3\2\2\2-{\3\2\2\2/~\3\2\2\2"+
		"\61\u0083\3\2\2\2\63\u008b\3\2\2\2\65\u0096\3\2\2\2\678\t\2\2\289\3\2"+
		"\2\29:\b\2\2\2:\4\3\2\2\2;<\7\61\2\2<=\7\61\2\2=A\3\2\2\2>@\n\3\2\2?>"+
		"\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\b\3\2\2E"+
		"\6\3\2\2\2FG\4c|\2G\b\3\2\2\2HI\4\62;\2I\n\3\2\2\2JK\n\4\2\2K\f\3\2\2"+
		"\2LM\7*\2\2M\16\3\2\2\2NO\7+\2\2O\20\3\2\2\2PQ\7}\2\2Q\22\3\2\2\2RS\7"+
		"\177\2\2S\24\3\2\2\2TU\7-\2\2U\26\3\2\2\2VW\7/\2\2W\30\3\2\2\2XY\7,\2"+
		"\2Y\32\3\2\2\2Z[\7\61\2\2[\34\3\2\2\2\\]\7<\2\2]^\7?\2\2^\36\3\2\2\2_"+
		"`\7K\2\2`a\7P\2\2ab\7V\2\2b \3\2\2\2cd\7.\2\2d\"\3\2\2\2ef\7K\2\2fg\7"+
		"H\2\2g$\3\2\2\2hi\7V\2\2ij\7J\2\2jk\7G\2\2kl\7P\2\2l&\3\2\2\2mn\7G\2\2"+
		"no\7N\2\2op\7U\2\2pq\7G\2\2q(\3\2\2\2rs\7H\2\2st\7K\2\2t*\3\2\2\2uv\7"+
		"Y\2\2vw\7J\2\2wx\7K\2\2xy\7N\2\2yz\7G\2\2z,\3\2\2\2{|\7F\2\2|}\7Q\2\2"+
		"}.\3\2\2\2~\177\7F\2\2\177\u0080\7Q\2\2\u0080\u0081\7P\2\2\u0081\u0082"+
		"\7G\2\2\u0082\60\3\2\2\2\u0083\u0088\5\7\4\2\u0084\u0087\5\7\4\2\u0085"+
		"\u0087\5\t\5\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\62\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u008f\7$\2\2\u008c\u008e\5\13\6\2\u008d\u008c\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7$\2\2\u0093\u0094\b\32\3\2\u0094"+
		"\64\3\2\2\2\u0095\u0097\5\t\5\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2"+
		"\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\66\3\2\2\2\b\2A\u0086"+
		"\u0088\u008f\u0098\4\b\2\2\3\32\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}