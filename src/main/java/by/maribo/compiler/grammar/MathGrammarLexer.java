// Generated from D:/Projects/Java/MathCompiler/grammar\MathGrammar.g4 by ANTLR 4.7
package by.maribo.compiler.grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MathGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN_PROGRAM=1, BEGIN=2, END=3, OPEN_BRACKET=4, CLOSE_BRACKET=5, OPEN_SQUARE_BRACKET=6, 
		CLOSE_SQUARE_BRACKET=7, INT=8, FLOAT=9, DOUBLE=10, PRINT=11, IF=12, ELSE=13, 
		FOR=14, WHILE=15, RETURN=16, FUNCTION=17, SIZE=18, GET=19, SET=20, INDEX_OF=21, 
		PLUS=22, MINUS=23, MULTIPLY=24, DIVIDE=25, ASSIGNMENT=26, RESIDUAL=27, 
		EXPONENTIATION=28, NEGATION=29, EQUAL=30, NON_EQUAL=31, LESS=32, GREATER=33, 
		LESS_OR_EQUAL=34, GREATER_OR_EQUAL=35, COMMA=36, DOT_COMMA=37, SPACE=38, 
		NUMBER=39, NAME=40, LINE=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN_PROGRAM", "BEGIN", "END", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_SQUARE_BRACKET", 
		"CLOSE_SQUARE_BRACKET", "INT", "FLOAT", "DOUBLE", "PRINT", "IF", "ELSE", 
		"FOR", "WHILE", "RETURN", "FUNCTION", "SIZE", "GET", "SET", "INDEX_OF", 
		"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "ASSIGNMENT", "RESIDUAL", "EXPONENTIATION", 
		"NEGATION", "EQUAL", "NON_EQUAL", "LESS", "GREATER", "LESS_OR_EQUAL", 
		"GREATER_OR_EQUAL", "COMMA", "DOT_COMMA", "SPACE", "NUMBER", "NAME", "LINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'int'", "'float'", 
		"'double'", "'print'", "'if'", "'else'", "'for'", "'while'", "'return'", 
		"'function'", "'size'", "'get'", "'set'", "'indexOf'", "'+'", "'-'", "'*'", 
		"'/'", "'='", "'%'", "'^'", "'!'", "'=='", "'!='", "'<'", "'>'", "'<='", 
		"'>='", "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN_PROGRAM", "BEGIN", "END", "OPEN_BRACKET", "CLOSE_BRACKET", 
		"OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "INT", "FLOAT", "DOUBLE", 
		"PRINT", "IF", "ELSE", "FOR", "WHILE", "RETURN", "FUNCTION", "SIZE", "GET", 
		"SET", "INDEX_OF", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "ASSIGNMENT", 
		"RESIDUAL", "EXPONENTIATION", "NEGATION", "EQUAL", "NON_EQUAL", "LESS", 
		"GREATER", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", "COMMA", "DOT_COMMA", 
		"SPACE", "NUMBER", "NAME", "LINE"
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


	public MathGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MathGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3#\3$\3$\3$\3%\3%\3&\3&\3\'\6\'\u00db\n\'\r\'\16\'\u00dc\3\'\3\'\3(\5"+
		"(\u00e2\n(\3(\6(\u00e5\n(\r(\16(\u00e6\3(\3(\6(\u00eb\n(\r(\16(\u00ec"+
		"\7(\u00ef\n(\f(\16(\u00f2\13(\3(\5(\u00f5\n(\3(\3(\3(\3(\3(\5(\u00fc\n"+
		"(\3(\6(\u00ff\n(\r(\16(\u0100\3(\5(\u0104\n(\3)\3)\7)\u0108\n)\f)\16)"+
		"\u010b\13)\3*\3*\6*\u010f\n*\r*\16*\u0110\3*\3*\3\u0110\2+\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+\3\2\t\5\2\13\f\17\17\"\"\3\2//\3\2\62;\3\2gg\3\2hh\5\2"+
		"C\\aac|\6\2\62;C\\aac|\2\u011e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\t_\3\2\2"+
		"\2\13a\3\2\2\2\rc\3\2\2\2\17e\3\2\2\2\21g\3\2\2\2\23k\3\2\2\2\25q\3\2"+
		"\2\2\27x\3\2\2\2\31~\3\2\2\2\33\u0081\3\2\2\2\35\u0086\3\2\2\2\37\u008a"+
		"\3\2\2\2!\u0090\3\2\2\2#\u0097\3\2\2\2%\u00a0\3\2\2\2\'\u00a5\3\2\2\2"+
		")\u00a9\3\2\2\2+\u00ad\3\2\2\2-\u00b5\3\2\2\2/\u00b7\3\2\2\2\61\u00b9"+
		"\3\2\2\2\63\u00bb\3\2\2\2\65\u00bd\3\2\2\2\67\u00bf\3\2\2\29\u00c1\3\2"+
		"\2\2;\u00c3\3\2\2\2=\u00c5\3\2\2\2?\u00c8\3\2\2\2A\u00cb\3\2\2\2C\u00cd"+
		"\3\2\2\2E\u00cf\3\2\2\2G\u00d2\3\2\2\2I\u00d5\3\2\2\2K\u00d7\3\2\2\2M"+
		"\u00da\3\2\2\2O\u0103\3\2\2\2Q\u0105\3\2\2\2S\u010c\3\2\2\2UV\7d\2\2V"+
		"W\7g\2\2WX\7i\2\2XY\7k\2\2YZ\7p\2\2Z\4\3\2\2\2[\\\7}\2\2\\\6\3\2\2\2]"+
		"^\7\177\2\2^\b\3\2\2\2_`\7*\2\2`\n\3\2\2\2ab\7+\2\2b\f\3\2\2\2cd\7]\2"+
		"\2d\16\3\2\2\2ef\7_\2\2f\20\3\2\2\2gh\7k\2\2hi\7p\2\2ij\7v\2\2j\22\3\2"+
		"\2\2kl\7h\2\2lm\7n\2\2mn\7q\2\2no\7c\2\2op\7v\2\2p\24\3\2\2\2qr\7f\2\2"+
		"rs\7q\2\2st\7w\2\2tu\7d\2\2uv\7n\2\2vw\7g\2\2w\26\3\2\2\2xy\7r\2\2yz\7"+
		"t\2\2z{\7k\2\2{|\7p\2\2|}\7v\2\2}\30\3\2\2\2~\177\7k\2\2\177\u0080\7h"+
		"\2\2\u0080\32\3\2\2\2\u0081\u0082\7g\2\2\u0082\u0083\7n\2\2\u0083\u0084"+
		"\7u\2\2\u0084\u0085\7g\2\2\u0085\34\3\2\2\2\u0086\u0087\7h\2\2\u0087\u0088"+
		"\7q\2\2\u0088\u0089\7t\2\2\u0089\36\3\2\2\2\u008a\u008b\7y\2\2\u008b\u008c"+
		"\7j\2\2\u008c\u008d\7k\2\2\u008d\u008e\7n\2\2\u008e\u008f\7g\2\2\u008f"+
		" \3\2\2\2\u0090\u0091\7t\2\2\u0091\u0092\7g\2\2\u0092\u0093\7v\2\2\u0093"+
		"\u0094\7w\2\2\u0094\u0095\7t\2\2\u0095\u0096\7p\2\2\u0096\"\3\2\2\2\u0097"+
		"\u0098\7h\2\2\u0098\u0099\7w\2\2\u0099\u009a\7p\2\2\u009a\u009b\7e\2\2"+
		"\u009b\u009c\7v\2\2\u009c\u009d\7k\2\2\u009d\u009e\7q\2\2\u009e\u009f"+
		"\7p\2\2\u009f$\3\2\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3"+
		"\7|\2\2\u00a3\u00a4\7g\2\2\u00a4&\3\2\2\2\u00a5\u00a6\7i\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7\u00a8\7v\2\2\u00a8(\3\2\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab"+
		"\7g\2\2\u00ab\u00ac\7v\2\2\u00ac*\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af"+
		"\7p\2\2\u00af\u00b0\7f\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7z\2\2\u00b2"+
		"\u00b3\7Q\2\2\u00b3\u00b4\7h\2\2\u00b4,\3\2\2\2\u00b5\u00b6\7-\2\2\u00b6"+
		".\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8\60\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba"+
		"\62\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc\64\3\2\2\2\u00bd\u00be\7?\2\2\u00be"+
		"\66\3\2\2\2\u00bf\u00c0\7\'\2\2\u00c08\3\2\2\2\u00c1\u00c2\7`\2\2\u00c2"+
		":\3\2\2\2\u00c3\u00c4\7#\2\2\u00c4<\3\2\2\2\u00c5\u00c6\7?\2\2\u00c6\u00c7"+
		"\7?\2\2\u00c7>\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca\7?\2\2\u00ca@\3"+
		"\2\2\2\u00cb\u00cc\7>\2\2\u00ccB\3\2\2\2\u00cd\u00ce\7@\2\2\u00ceD\3\2"+
		"\2\2\u00cf\u00d0\7>\2\2\u00d0\u00d1\7?\2\2\u00d1F\3\2\2\2\u00d2\u00d3"+
		"\7@\2\2\u00d3\u00d4\7?\2\2\u00d4H\3\2\2\2\u00d5\u00d6\7.\2\2\u00d6J\3"+
		"\2\2\2\u00d7\u00d8\7=\2\2\u00d8L\3\2\2\2\u00d9\u00db\t\2\2\2\u00da\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\b\'\2\2\u00dfN\3\2\2\2\u00e0\u00e2\t\3\2\2"+
		"\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e5"+
		"\t\4\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00f0\3\2\2\2\u00e8\u00ea\13\2\2\2\u00e9\u00eb\t"+
		"\4\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u0104\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f5\t\3\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\t\4\2\2\u00f7\u00f8\13\2\2\2\u00f8"+
		"\u00fb\t\4\2\2\u00f9\u00fa\t\5\2\2\u00fa\u00fc\t\3\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00ff\t\4\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0104\t\6\2\2\u0103\u00e1\3\2\2\2\u0103"+
		"\u00f4\3\2\2\2\u0104P\3\2\2\2\u0105\u0109\t\7\2\2\u0106\u0108\t\b\2\2"+
		"\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010aR\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\7$\2\2\u010d\u010f"+
		"\13\2\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2"+
		"\u0110\u010e\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7$\2\2\u0113T\3\2"+
		"\2\2\16\2\u00dc\u00e1\u00e6\u00ec\u00f0\u00f4\u00fb\u0100\u0103\u0109"+
		"\u0110\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}