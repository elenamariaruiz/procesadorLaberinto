﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.6.6
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from C:\Users\Asus\Documents\GIT\howto_maze\pl_antlr\antlr_c\Laberinto.g4 by ANTLR 4.6.6

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

namespace antlr_c.Generated {
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.6.6")]
[System.CLSCompliant(false)]
public partial class LaberintoLexer : Lexer {
	public const int
		OTROS_CARACTERES=1, TILDES=2, VIDA=3, TIME=4, ALTO=5, ANCHO=6, MONEDAS=7, 
		LLAVE_A=8, LLAVE_C=9, PUNTO_COMA=10, ENEMIGOS=11, INICIO=12, FINAL=13, 
		PARENTA=14, PARENTC=15, COMA=16, DAMAGE=17, GUION=18, NUMERO=19, UTEMP=20, 
		IDENT=21, WS=22;
	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"OTROS_CARACTERES", "TILDES", "VIDA", "TIME", "ALTO", "ANCHO", "MONEDAS", 
		"LLAVE_A", "LLAVE_C", "PUNTO_COMA", "ENEMIGOS", "INICIO", "FINAL", "PARENTA", 
		"PARENTC", "COMA", "DAMAGE", "GUION", "NUMERO", "UTEMP", "IDENT", "WS"
	};


	public LaberintoLexer(ICharStream input)
		: base(input)
	{
		_interp = new LexerATNSimulator(this,_ATN);
	}

	private static readonly string[] _LiteralNames = {
		null, null, null, "'vida'", "'time'", "'alto'", "'ancho'", "'monedas'", 
		"'{'", "'}'", "';'", "'enemigos'", "'inicio'", "'final'", "'('", "')'", 
		"','", null, "'-'"
	};
	private static readonly string[] _SymbolicNames = {
		null, "OTROS_CARACTERES", "TILDES", "VIDA", "TIME", "ALTO", "ANCHO", "MONEDAS", 
		"LLAVE_A", "LLAVE_C", "PUNTO_COMA", "ENEMIGOS", "INICIO", "FINAL", "PARENTA", 
		"PARENTC", "COMA", "DAMAGE", "GUION", "NUMERO", "UTEMP", "IDENT", "WS"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[System.Obsolete("Use Vocabulary instead.")]
	public static readonly string[] tokenNames = GenerateTokenNames(DefaultVocabulary, _SymbolicNames.Length);

	private static string[] GenerateTokenNames(IVocabulary vocabulary, int length) {
		string[] tokenNames = new string[length];
		for (int i = 0; i < tokenNames.Length; i++) {
			tokenNames[i] = vocabulary.GetLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = vocabulary.GetSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}

		return tokenNames;
	}

	[System.Obsolete("Use IRecognizer.Vocabulary instead.")]
	public override string[] TokenNames
	{
		get
		{
			return tokenNames;
		}
	}

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "Laberinto.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return _serializedATN; } }

	public static readonly string _serializedATN =
		"\x3\xAF6F\x8320\x479D\xB75C\x4880\x1605\x191C\xAB37\x2\x18\x93\b\x1\x4"+
		"\x2\t\x2\x4\x3\t\x3\x4\x4\t\x4\x4\x5\t\x5\x4\x6\t\x6\x4\a\t\a\x4\b\t\b"+
		"\x4\t\t\t\x4\n\t\n\x4\v\t\v\x4\f\t\f\x4\r\t\r\x4\xE\t\xE\x4\xF\t\xF\x4"+
		"\x10\t\x10\x4\x11\t\x11\x4\x12\t\x12\x4\x13\t\x13\x4\x14\t\x14\x4\x15"+
		"\t\x15\x4\x16\t\x16\x4\x17\t\x17\x3\x2\x3\x2\x5\x2\x32\n\x2\x3\x3\x3\x3"+
		"\x3\x4\x3\x4\x3\x4\x3\x4\x3\x4\x3\x5\x3\x5\x3\x5\x3\x5\x3\x5\x3\x6\x3"+
		"\x6\x3\x6\x3\x6\x3\x6\x3\a\x3\a\x3\a\x3\a\x3\a\x3\a\x3\b\x3\b\x3\b\x3"+
		"\b\x3\b\x3\b\x3\b\x3\b\x3\t\x3\t\x3\n\x3\n\x3\v\x3\v\x3\f\x3\f\x3\f\x3"+
		"\f\x3\f\x3\f\x3\f\x3\f\x3\f\x3\r\x3\r\x3\r\x3\r\x3\r\x3\r\x3\r\x3\xE\x3"+
		"\xE\x3\xE\x3\xE\x3\xE\x3\xE\x3\xF\x3\xF\x3\x10\x3\x10\x3\x11\x3\x11\x3"+
		"\x12\x3\x12\x3\x12\x3\x13\x3\x13\x3\x14\x3\x14\a\x14|\n\x14\f\x14\xE\x14"+
		"\x7F\v\x14\x3\x15\x3\x15\x3\x16\x3\x16\x3\x16\x3\x16\x3\x16\a\x16\x88"+
		"\n\x16\f\x16\xE\x16\x8B\v\x16\x3\x17\x6\x17\x8E\n\x17\r\x17\xE\x17\x8F"+
		"\x3\x17\x3\x17\x2\x2\x2\x18\x3\x2\x3\x5\x2\x4\a\x2\x5\t\x2\x6\v\x2\a\r"+
		"\x2\b\xF\x2\t\x11\x2\n\x13\x2\v\x15\x2\f\x17\x2\r\x19\x2\xE\x1B\x2\xF"+
		"\x1D\x2\x10\x1F\x2\x11!\x2\x12#\x2\x13%\x2\x14\'\x2\x15)\x2\x16+\x2\x17"+
		"-\x2\x18\x3\x2\n\f\x2\xC3\xC3\xCB\xCB\xCF\xCF\xD5\xD5\xDC\xDC\xE3\xE3"+
		"\xEB\xEB\xEF\xEF\xF5\xF5\xFC\xFC\x3\x2\x33;\x3\x2\x32;\x5\x2jjoouu\x4"+
		"\x2\x43\\\x63|\x5\x2\x32;\x43\\\x63|\x4\x2\xD3\xD3\xF3\xF3\x5\x2\v\f\xF"+
		"\xF\"\"\x99\x2\x3\x3\x2\x2\x2\x2\x5\x3\x2\x2\x2\x2\a\x3\x2\x2\x2\x2\t"+
		"\x3\x2\x2\x2\x2\v\x3\x2\x2\x2\x2\r\x3\x2\x2\x2\x2\xF\x3\x2\x2\x2\x2\x11"+
		"\x3\x2\x2\x2\x2\x13\x3\x2\x2\x2\x2\x15\x3\x2\x2\x2\x2\x17\x3\x2\x2\x2"+
		"\x2\x19\x3\x2\x2\x2\x2\x1B\x3\x2\x2\x2\x2\x1D\x3\x2\x2\x2\x2\x1F\x3\x2"+
		"\x2\x2\x2!\x3\x2\x2\x2\x2#\x3\x2\x2\x2\x2%\x3\x2\x2\x2\x2\'\x3\x2\x2\x2"+
		"\x2)\x3\x2\x2\x2\x2+\x3\x2\x2\x2\x2-\x3\x2\x2\x2\x3\x31\x3\x2\x2\x2\x5"+
		"\x33\x3\x2\x2\x2\a\x35\x3\x2\x2\x2\t:\x3\x2\x2\x2\v?\x3\x2\x2\x2\r\x44"+
		"\x3\x2\x2\x2\xFJ\x3\x2\x2\x2\x11R\x3\x2\x2\x2\x13T\x3\x2\x2\x2\x15V\x3"+
		"\x2\x2\x2\x17X\x3\x2\x2\x2\x19\x61\x3\x2\x2\x2\x1Bh\x3\x2\x2\x2\x1Dn\x3"+
		"\x2\x2\x2\x1Fp\x3\x2\x2\x2!r\x3\x2\x2\x2#t\x3\x2\x2\x2%w\x3\x2\x2\x2\'"+
		"y\x3\x2\x2\x2)\x80\x3\x2\x2\x2+\x82\x3\x2\x2\x2-\x8D\x3\x2\x2\x2/\x32"+
		"\x5%\x13\x2\x30\x32\a\x61\x2\x2\x31/\x3\x2\x2\x2\x31\x30\x3\x2\x2\x2\x32"+
		"\x4\x3\x2\x2\x2\x33\x34\t\x2\x2\x2\x34\x6\x3\x2\x2\x2\x35\x36\ax\x2\x2"+
		"\x36\x37\ak\x2\x2\x37\x38\a\x66\x2\x2\x38\x39\a\x63\x2\x2\x39\b\x3\x2"+
		"\x2\x2:;\av\x2\x2;<\ak\x2\x2<=\ao\x2\x2=>\ag\x2\x2>\n\x3\x2\x2\x2?@\a"+
		"\x63\x2\x2@\x41\an\x2\x2\x41\x42\av\x2\x2\x42\x43\aq\x2\x2\x43\f\x3\x2"+
		"\x2\x2\x44\x45\a\x63\x2\x2\x45\x46\ap\x2\x2\x46G\a\x65\x2\x2GH\aj\x2\x2"+
		"HI\aq\x2\x2I\xE\x3\x2\x2\x2JK\ao\x2\x2KL\aq\x2\x2LM\ap\x2\x2MN\ag\x2\x2"+
		"NO\a\x66\x2\x2OP\a\x63\x2\x2PQ\au\x2\x2Q\x10\x3\x2\x2\x2RS\a}\x2\x2S\x12"+
		"\x3\x2\x2\x2TU\a\x7F\x2\x2U\x14\x3\x2\x2\x2VW\a=\x2\x2W\x16\x3\x2\x2\x2"+
		"XY\ag\x2\x2YZ\ap\x2\x2Z[\ag\x2\x2[\\\ao\x2\x2\\]\ak\x2\x2]^\ai\x2\x2^"+
		"_\aq\x2\x2_`\au\x2\x2`\x18\x3\x2\x2\x2\x61\x62\ak\x2\x2\x62\x63\ap\x2"+
		"\x2\x63\x64\ak\x2\x2\x64\x65\a\x65\x2\x2\x65\x66\ak\x2\x2\x66g\aq\x2\x2"+
		"g\x1A\x3\x2\x2\x2hi\ah\x2\x2ij\ak\x2\x2jk\ap\x2\x2kl\a\x63\x2\x2lm\an"+
		"\x2\x2m\x1C\x3\x2\x2\x2no\a*\x2\x2o\x1E\x3\x2\x2\x2pq\a+\x2\x2q \x3\x2"+
		"\x2\x2rs\a.\x2\x2s\"\x3\x2\x2\x2tu\x5%\x13\x2uv\x5\'\x14\x2v$\x3\x2\x2"+
		"\x2wx\a/\x2\x2x&\x3\x2\x2\x2y}\t\x3\x2\x2z|\t\x4\x2\x2{z\x3\x2\x2\x2|"+
		"\x7F\x3\x2\x2\x2}{\x3\x2\x2\x2}~\x3\x2\x2\x2~(\x3\x2\x2\x2\x7F}\x3\x2"+
		"\x2\x2\x80\x81\t\x5\x2\x2\x81*\x3\x2\x2\x2\x82\x89\t\x6\x2\x2\x83\x88"+
		"\t\a\x2\x2\x84\x88\x5\x3\x2\x2\x85\x88\x5\x5\x3\x2\x86\x88\t\b\x2\x2\x87"+
		"\x83\x3\x2\x2\x2\x87\x84\x3\x2\x2\x2\x87\x85\x3\x2\x2\x2\x87\x86\x3\x2"+
		"\x2\x2\x88\x8B\x3\x2\x2\x2\x89\x87\x3\x2\x2\x2\x89\x8A\x3\x2\x2\x2\x8A"+
		",\x3\x2\x2\x2\x8B\x89\x3\x2\x2\x2\x8C\x8E\t\t\x2\x2\x8D\x8C\x3\x2\x2\x2"+
		"\x8E\x8F\x3\x2\x2\x2\x8F\x8D\x3\x2\x2\x2\x8F\x90\x3\x2\x2\x2\x90\x91\x3"+
		"\x2\x2\x2\x91\x92\b\x17\x2\x2\x92.\x3\x2\x2\x2\b\x2\x31}\x87\x89\x8F\x3"+
		"\b\x2\x2";
	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN.ToCharArray());
}
} // namespace antlr_c.Generated
