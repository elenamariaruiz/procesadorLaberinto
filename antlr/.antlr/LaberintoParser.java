// Generated from /home/elena/Documentos/GIT/procesadorLaberinto/antlr/Laberinto.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaberintoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OTROS_CARACTERES=1, TILDES=2, USE=3, TIME=4, ALTO=5, ANCHO=6, MONEDAS=7, 
		LLAVE_A=8, LLAVE_C=9, PUNTO_COMA=10, ENEMIGOS=11, INICIO=12, FINAL=13, 
		PARENTA=14, PARENTC=15, COMA=16, DAMAGE=17, GUION=18, NUMERO=19, UTEMP=20, 
		IDENT=21, WS=22;
	public static final int
		RULE_inicio = 0, RULE_directivas = 1, RULE_dimension = 2, RULE_def_monedas = 3, 
		RULE_monedas = 4, RULE_moneda = 5, RULE_def_enemigos = 6, RULE_enemigos = 7, 
		RULE_enemigo = 8, RULE_bloque = 9, RULE_start = 10, RULE_end = 11, RULE_localizaciones = 12, 
		RULE_localizacion = 13, RULE_coordenadas = 14, RULE_coord = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "directivas", "dimension", "def_monedas", "monedas", "moneda", 
			"def_enemigos", "enemigos", "enemigo", "bloque", "start", "end", "localizaciones", 
			"localizacion", "coordenadas", "coord"
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

	@Override
	public String getGrammarFileName() { return "Laberinto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LaberintoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LaberintoParser.IDENT, 0); }
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public DirectivasContext directivas() {
			return getRuleContext(DirectivasContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Def_monedasContext def_monedas() {
			return getRuleContext(Def_monedasContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(IDENT);
			setState(33);
			dimension();
			setState(34);
			directivas();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MONEDAS) {
				{
				setState(35);
				def_monedas();
				}
			}

			setState(38);
			bloque();
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

	public static class DirectivasContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(LaberintoParser.USE, 0); }
		public TerminalNode IDENT() { return getToken(LaberintoParser.IDENT, 0); }
		public TerminalNode TIME() { return getToken(LaberintoParser.TIME, 0); }
		public TerminalNode NUMERO() { return getToken(LaberintoParser.NUMERO, 0); }
		public TerminalNode UTEMP() { return getToken(LaberintoParser.UTEMP, 0); }
		public DirectivasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directivas; }
	}

	public final DirectivasContext directivas() throws RecognitionException {
		DirectivasContext _localctx = new DirectivasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_directivas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(USE);
			setState(41);
			match(IDENT);
			setState(42);
			match(TIME);
			setState(43);
			match(NUMERO);
			setState(44);
			match(UTEMP);
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

	public static class DimensionContext extends ParserRuleContext {
		public TerminalNode ALTO() { return getToken(LaberintoParser.ALTO, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(LaberintoParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(LaberintoParser.NUMERO, i);
		}
		public TerminalNode ANCHO() { return getToken(LaberintoParser.ANCHO, 0); }
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(ALTO);
			setState(47);
			match(NUMERO);
			setState(48);
			match(ANCHO);
			setState(49);
			match(NUMERO);
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

	public static class Def_monedasContext extends ParserRuleContext {
		public TerminalNode MONEDAS() { return getToken(LaberintoParser.MONEDAS, 0); }
		public TerminalNode LLAVE_A() { return getToken(LaberintoParser.LLAVE_A, 0); }
		public MonedasContext monedas() {
			return getRuleContext(MonedasContext.class,0);
		}
		public TerminalNode LLAVE_C() { return getToken(LaberintoParser.LLAVE_C, 0); }
		public Def_monedasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_monedas; }
	}

	public final Def_monedasContext def_monedas() throws RecognitionException {
		Def_monedasContext _localctx = new Def_monedasContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_def_monedas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(MONEDAS);
			setState(52);
			match(LLAVE_A);
			setState(53);
			monedas();
			setState(54);
			match(LLAVE_C);
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

	public static class MonedasContext extends ParserRuleContext {
		public List<MonedaContext> moneda() {
			return getRuleContexts(MonedaContext.class);
		}
		public MonedaContext moneda(int i) {
			return getRuleContext(MonedaContext.class,i);
		}
		public List<TerminalNode> PUNTO_COMA() { return getTokens(LaberintoParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(LaberintoParser.PUNTO_COMA, i);
		}
		public MonedasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monedas; }
	}

	public final MonedasContext monedas() throws RecognitionException {
		MonedasContext _localctx = new MonedasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_monedas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				moneda();
				setState(57);
				match(PUNTO_COMA);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	public static class MonedaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LaberintoParser.IDENT, 0); }
		public TerminalNode NUMERO() { return getToken(LaberintoParser.NUMERO, 0); }
		public MonedaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moneda; }
	}

	public final MonedaContext moneda() throws RecognitionException {
		MonedaContext _localctx = new MonedaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_moneda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(IDENT);
			setState(64);
			match(NUMERO);
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

	public static class Def_enemigosContext extends ParserRuleContext {
		public TerminalNode ENEMIGOS() { return getToken(LaberintoParser.ENEMIGOS, 0); }
		public TerminalNode LLAVE_A() { return getToken(LaberintoParser.LLAVE_A, 0); }
		public EnemigoContext enemigo() {
			return getRuleContext(EnemigoContext.class,0);
		}
		public TerminalNode LLAVE_C() { return getToken(LaberintoParser.LLAVE_C, 0); }
		public Def_enemigosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_enemigos; }
	}

	public final Def_enemigosContext def_enemigos() throws RecognitionException {
		Def_enemigosContext _localctx = new Def_enemigosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_def_enemigos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ENEMIGOS);
			setState(67);
			match(LLAVE_A);
			setState(68);
			enemigo();
			setState(69);
			match(LLAVE_C);
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

	public static class EnemigosContext extends ParserRuleContext {
		public List<EnemigoContext> enemigo() {
			return getRuleContexts(EnemigoContext.class);
		}
		public EnemigoContext enemigo(int i) {
			return getRuleContext(EnemigoContext.class,i);
		}
		public List<TerminalNode> PUNTO_COMA() { return getTokens(LaberintoParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(LaberintoParser.PUNTO_COMA, i);
		}
		public EnemigosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enemigos; }
	}

	public final EnemigosContext enemigos() throws RecognitionException {
		EnemigosContext _localctx = new EnemigosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_enemigos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				enemigo();
				setState(72);
				match(PUNTO_COMA);
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	public static class EnemigoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LaberintoParser.IDENT, 0); }
		public TerminalNode DAMAGE() { return getToken(LaberintoParser.DAMAGE, 0); }
		public EnemigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enemigo; }
	}

	public final EnemigoContext enemigo() throws RecognitionException {
		EnemigoContext _localctx = new EnemigoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_enemigo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(IDENT);
			setState(79);
			match(DAMAGE);
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLAVE_A() { return getToken(LaberintoParser.LLAVE_A, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode LLAVE_C() { return getToken(LaberintoParser.LLAVE_C, 0); }
		public LocalizacionesContext localizaciones() {
			return getRuleContext(LocalizacionesContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(LLAVE_A);
			setState(82);
			start();
			setState(83);
			end();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(84);
				localizaciones();
				}
			}

			setState(87);
			match(LLAVE_C);
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

	public static class StartContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(LaberintoParser.INICIO, 0); }
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(LaberintoParser.PUNTO_COMA, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(INICIO);
			setState(90);
			coord();
			setState(91);
			match(PUNTO_COMA);
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(LaberintoParser.FINAL, 0); }
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(LaberintoParser.PUNTO_COMA, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(FINAL);
			setState(94);
			coord();
			setState(95);
			match(PUNTO_COMA);
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

	public static class LocalizacionesContext extends ParserRuleContext {
		public List<LocalizacionContext> localizacion() {
			return getRuleContexts(LocalizacionContext.class);
		}
		public LocalizacionContext localizacion(int i) {
			return getRuleContext(LocalizacionContext.class,i);
		}
		public LocalizacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localizaciones; }
	}

	public final LocalizacionesContext localizaciones() throws RecognitionException {
		LocalizacionesContext _localctx = new LocalizacionesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_localizaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			localizacion();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(98);
				localizacion();
				}
				}
				setState(103);
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

	public static class LocalizacionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LaberintoParser.IDENT, 0); }
		public CoordenadasContext coordenadas() {
			return getRuleContext(CoordenadasContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(LaberintoParser.PUNTO_COMA, 0); }
		public LocalizacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localizacion; }
	}

	public final LocalizacionContext localizacion() throws RecognitionException {
		LocalizacionContext _localctx = new LocalizacionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_localizacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IDENT);
			setState(105);
			coordenadas();
			setState(106);
			match(PUNTO_COMA);
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

	public static class CoordenadasContext extends ParserRuleContext {
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public List<TerminalNode> PUNTO_COMA() { return getTokens(LaberintoParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(LaberintoParser.PUNTO_COMA, i);
		}
		public CoordenadasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordenadas; }
	}

	public final CoordenadasContext coordenadas() throws RecognitionException {
		CoordenadasContext _localctx = new CoordenadasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_coordenadas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				coord();
				setState(109);
				match(PUNTO_COMA);
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PARENTA );
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

	public static class CoordContext extends ParserRuleContext {
		public TerminalNode PARENTA() { return getToken(LaberintoParser.PARENTA, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(LaberintoParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(LaberintoParser.NUMERO, i);
		}
		public TerminalNode COMA() { return getToken(LaberintoParser.COMA, 0); }
		public TerminalNode PARENTC() { return getToken(LaberintoParser.PARENTC, 0); }
		public CoordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coord; }
	}

	public final CoordContext coord() throws RecognitionException {
		CoordContext _localctx = new CoordContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_coord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(PARENTA);
			setState(116);
			match(NUMERO);
			setState(117);
			match(COMA);
			setState(118);
			match(NUMERO);
			setState(119);
			match(PARENTC);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30|\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\2\3\2"+
		"\5\2\'\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\6\6>\n\6\r\6\16\6?\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\6\tM\n\t\r\t\16\tN\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\5\13X\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\7\16f"+
		"\n\16\f\16\16\16i\13\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\6\20r\n\20"+
		"\r\20\16\20s\3\21\3\21\3\21\3\21\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \2\2\2q\2\"\3\2\2\2\4*\3\2\2\2\6\60\3\2\2\2\b"+
		"\65\3\2\2\2\n=\3\2\2\2\fA\3\2\2\2\16D\3\2\2\2\20L\3\2\2\2\22P\3\2\2\2"+
		"\24S\3\2\2\2\26[\3\2\2\2\30_\3\2\2\2\32c\3\2\2\2\34j\3\2\2\2\36q\3\2\2"+
		"\2 u\3\2\2\2\"#\7\27\2\2#$\5\6\4\2$&\5\4\3\2%\'\5\b\5\2&%\3\2\2\2&\'\3"+
		"\2\2\2\'(\3\2\2\2()\5\24\13\2)\3\3\2\2\2*+\7\5\2\2+,\7\27\2\2,-\7\6\2"+
		"\2-.\7\25\2\2./\7\26\2\2/\5\3\2\2\2\60\61\7\7\2\2\61\62\7\25\2\2\62\63"+
		"\7\b\2\2\63\64\7\25\2\2\64\7\3\2\2\2\65\66\7\t\2\2\66\67\7\n\2\2\678\5"+
		"\n\6\289\7\13\2\29\t\3\2\2\2:;\5\f\7\2;<\7\f\2\2<>\3\2\2\2=:\3\2\2\2>"+
		"?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\13\3\2\2\2AB\7\27\2\2BC\7\25\2\2C\r\3\2"+
		"\2\2DE\7\r\2\2EF\7\n\2\2FG\5\22\n\2GH\7\13\2\2H\17\3\2\2\2IJ\5\22\n\2"+
		"JK\7\f\2\2KM\3\2\2\2LI\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\21\3\2\2"+
		"\2PQ\7\27\2\2QR\7\23\2\2R\23\3\2\2\2ST\7\n\2\2TU\5\26\f\2UW\5\30\r\2V"+
		"X\5\32\16\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\13\2\2Z\25\3\2\2\2[\\\7"+
		"\16\2\2\\]\5 \21\2]^\7\f\2\2^\27\3\2\2\2_`\7\17\2\2`a\5 \21\2ab\7\f\2"+
		"\2b\31\3\2\2\2cg\5\34\17\2df\5\34\17\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2g"+
		"h\3\2\2\2h\33\3\2\2\2ig\3\2\2\2jk\7\27\2\2kl\5\36\20\2lm\7\f\2\2m\35\3"+
		"\2\2\2no\5 \21\2op\7\f\2\2pr\3\2\2\2qn\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3"+
		"\2\2\2t\37\3\2\2\2uv\7\20\2\2vw\7\25\2\2wx\7\22\2\2xy\7\25\2\2yz\7\21"+
		"\2\2z!\3\2\2\2\b&?NWgs";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}