// Generated from /home/elena/Documentos/GIT/procesadorLaberinto/antlr/Laberinto.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaberintoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OTROS_CARACTERES=1, TILDES=2, USE=3, TIME=4, ALTO=5, ANCHO=6, MONEDAS=7, 
		LLAVE_A=8, LLAVE_C=9, PUNTO_COMA=10, ENEMIGOS=11, INICIO=12, FINAL=13, 
		PARENTA=14, PARENTC=15, COMA=16, DAMAGE=17, GUION=18, NUMERO=19, UTEMP=20, 
		IDENT=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OTROS_CARACTERES", "TILDES", "USE", "TIME", "ALTO", "ANCHO", "MONEDAS", 
			"LLAVE_A", "LLAVE_C", "PUNTO_COMA", "ENEMIGOS", "INICIO", "FINAL", "PARENTA", 
			"PARENTC", "COMA", "DAMAGE", "GUION", "NUMERO", "UTEMP", "IDENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'use'", "'time'", "'alto'", "'ancho'", "'monedas'", 
			"'{'", "'}'", "';'", "'enemigos'", "'inicio'", "'final'", "'('", "')'", 
			"','", null, "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OTROS_CARACTERES", "TILDES", "USE", "TIME", "ALTO", "ANCHO", "MONEDAS", 
			"LLAVE_A", "LLAVE_C", "PUNTO_COMA", "ENEMIGOS", "INICIO", "FINAL", "PARENTA", 
			"PARENTC", "COMA", "DAMAGE", "GUION", "NUMERO", "UTEMP", "IDENT", "WS"
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


	public LaberintoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Laberinto.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0092\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\5\2\62"+
		"\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\7\24{\n\24\f\24\16\24~\13\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u0087\n\26\f\26\16\26\u008a\13\26\3\27"+
		"\6\27\u008d\n\27\r\27\16\27\u008e\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30\3\2\n\f\2\u00c3\u00c3\u00cb\u00cb\u00cf\u00cf\u00d5\u00d5"+
		"\u00dc\u00dc\u00e3\u00e3\u00eb\u00eb\u00ef\u00ef\u00f5\u00f5\u00fc\u00fc"+
		"\3\2\63;\3\2\62;\5\2jjoouu\4\2C\\c|\5\2\62;C\\c|\4\2\u00d3\u00d3\u00f3"+
		"\u00f3\5\2\13\f\17\17\"\"\2\u0098\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t9\3\2"+
		"\2\2\13>\3\2\2\2\rC\3\2\2\2\17I\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2\25U\3"+
		"\2\2\2\27W\3\2\2\2\31`\3\2\2\2\33g\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!q\3"+
		"\2\2\2#s\3\2\2\2%v\3\2\2\2\'x\3\2\2\2)\177\3\2\2\2+\u0081\3\2\2\2-\u008c"+
		"\3\2\2\2/\62\5%\23\2\60\62\7a\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\4\3\2\2"+
		"\2\63\64\t\2\2\2\64\6\3\2\2\2\65\66\7w\2\2\66\67\7u\2\2\678\7g\2\28\b"+
		"\3\2\2\29:\7v\2\2:;\7k\2\2;<\7o\2\2<=\7g\2\2=\n\3\2\2\2>?\7c\2\2?@\7n"+
		"\2\2@A\7v\2\2AB\7q\2\2B\f\3\2\2\2CD\7c\2\2DE\7p\2\2EF\7e\2\2FG\7j\2\2"+
		"GH\7q\2\2H\16\3\2\2\2IJ\7o\2\2JK\7q\2\2KL\7p\2\2LM\7g\2\2MN\7f\2\2NO\7"+
		"c\2\2OP\7u\2\2P\20\3\2\2\2QR\7}\2\2R\22\3\2\2\2ST\7\177\2\2T\24\3\2\2"+
		"\2UV\7=\2\2V\26\3\2\2\2WX\7g\2\2XY\7p\2\2YZ\7g\2\2Z[\7o\2\2[\\\7k\2\2"+
		"\\]\7i\2\2]^\7q\2\2^_\7u\2\2_\30\3\2\2\2`a\7k\2\2ab\7p\2\2bc\7k\2\2cd"+
		"\7e\2\2de\7k\2\2ef\7q\2\2f\32\3\2\2\2gh\7h\2\2hi\7k\2\2ij\7p\2\2jk\7c"+
		"\2\2kl\7n\2\2l\34\3\2\2\2mn\7*\2\2n\36\3\2\2\2op\7+\2\2p \3\2\2\2qr\7"+
		".\2\2r\"\3\2\2\2st\5%\23\2tu\5\'\24\2u$\3\2\2\2vw\7/\2\2w&\3\2\2\2x|\t"+
		"\3\2\2y{\t\4\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}(\3\2\2\2~|\3"+
		"\2\2\2\177\u0080\t\5\2\2\u0080*\3\2\2\2\u0081\u0088\t\6\2\2\u0082\u0087"+
		"\t\7\2\2\u0083\u0087\5\3\2\2\u0084\u0087\5\5\3\2\u0085\u0087\t\b\2\2\u0086"+
		"\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2"+
		"\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		",\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d\t\t\2\2\u008c\u008b\3\2\2\2"+
		"\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\b\27\2\2\u0091.\3\2\2\2\b\2\61|\u0086\u0088\u008e"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}