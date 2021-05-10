// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: AnalizadorLexico.flex

//* --------------------------Seccion codigo-usuario ------------------------*/ 

import java_cup.runtime.*;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class analex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int IDENTIFICADOR = 2;
  public static final int COORDENADA = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\12\u1f00\1\u2000\1\u2100\1\u2200\1\u1f00\1\u2300"+
    "\1\u2400\2\u1f00\31\u0100\1\u2500\121\u0100\1\u2600\4\u0100\1\u2700"+
    "\1\u0100\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00\53\u0100"+
    "\1\u2e00\10\u2f00\31\u1f00\1\u0100\1\u3000\1\u3100\1\u0100\1\u3200"+
    "\1\u3300\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900\1\u3a00"+
    "\1\u0100\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000\1\u4100"+
    "\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700\1\u4800\1\u4900"+
    "\1\u4a00\1\u4b00\1\u4c00\1\u4d00\1\u4e00\1\u1f00\1\u4f00\1\u5000"+
    "\1\u5100\1\u5200\3\u0100\1\u5300\1\u5400\1\u5500\12\u1f00\4\u0100"+
    "\1\u5600\17\u1f00\2\u0100\1\u5700\41\u1f00\2\u0100\1\u5800\1\u5900"+
    "\2\u1f00\1\u5a00\1\u5b00\27\u0100\1\u5c00\4\u0100\1\u5d00\1\u5e00"+
    "\42\u1f00\1\u0100\1\u5f00\1\u6000\11\u1f00\1\u6100\24\u1f00\1\u6200"+
    "\1\u6300\1\u1f00\1\u6400\1\u6500\1\u6600\1\u6700\2\u1f00\1\u6800"+
    "\5\u1f00\1\u6900\1\u6a00\1\u6b00\5\u1f00\1\u6c00\1\u6d00\2\u1f00"+
    "\1\u6e00\1\u1f00\1\u6f00\14\u1f00\1\u7000\4\u1f00\246\u0100\1\u7100"+
    "\20\u0100\1\u7200\1\u7300\25\u0100\1\u7400\34\u0100\1\u7500\14\u1f00"+
    "\2\u0100\1\u7600\5\u1f00\23\u0100\1\u7700\u0aec\u1f00\1\u7800\1\u7900"+
    "\u02fe\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\16\0\4\5\1\1"+
    "\3\5\1\0\3\5\1\6\1\7\2\5\1\10\1\11"+
    "\2\5\1\12\11\13\1\5\1\14\5\5\32\0\4\5"+
    "\1\0\1\5\1\15\1\0\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\2\0\1\25\1\26\1\27\1\30"+
    "\3\0\1\31\1\32\1\33\5\0\1\34\1\5\1\35"+
    "\1\5\41\0\2\5\4\0\4\5\1\0\2\5\1\0"+
    "\7\5\1\0\4\5\1\0\5\5\27\0\1\5\37\0"+
    "\1\5\u01ca\0\4\5\14\0\16\5\5\0\7\5\1\0"+
    "\1\5\1\0\21\5\165\0\1\5\2\0\2\5\4\0"+
    "\1\5\1\0\6\5\1\0\1\5\3\0\1\5\1\0"+
    "\1\5\24\0\1\5\123\0\1\5\213\0\1\5\5\0"+
    "\2\5\246\0\1\5\46\0\2\5\1\0\6\5\51\0"+
    "\6\5\1\0\1\5\55\0\1\5\1\0\1\5\2\0"+
    "\1\5\2\0\1\5\1\0\10\5\33\0\4\5\4\0"+
    "\15\5\6\0\5\5\1\0\4\5\13\0\1\5\1\0"+
    "\3\5\100\0\12\12\4\5\146\0\1\5\11\0\1\5"+
    "\12\0\1\5\6\0\12\12\3\0\2\5\1\0\17\5"+
    "\74\0\2\5\145\0\16\5\12\12\54\0\4\5\1\0"+
    "\2\5\61\0\22\5\34\0\4\5\13\0\65\5\25\0"+
    "\1\5\22\0\13\5\221\0\2\5\12\12\1\5\23\0"+
    "\1\5\10\0\2\5\2\0\2\5\26\0\1\5\7\0"+
    "\1\5\1\0\3\5\4\0\2\5\11\0\2\5\2\0"+
    "\2\5\4\0\10\5\1\0\4\5\2\0\1\5\5\0"+
    "\2\5\12\12\4\0\7\5\2\0\1\5\1\0\2\5"+
    "\3\0\1\5\6\0\4\5\2\0\2\5\26\0\1\5"+
    "\7\0\1\5\2\0\1\5\2\0\1\5\2\0\2\5"+
    "\1\0\1\5\5\0\4\5\2\0\2\5\3\0\3\5"+
    "\1\0\7\5\4\0\1\5\1\0\7\5\12\12\6\0"+
    "\13\5\3\0\1\5\11\0\1\5\3\0\1\5\26\0"+
    "\1\5\7\0\1\5\2\0\1\5\5\0\2\5\12\0"+
    "\1\5\3\0\1\5\3\0\2\5\1\0\17\5\4\0"+
    "\2\5\12\12\1\5\1\0\7\5\7\0\1\5\3\0"+
    "\1\5\10\0\2\5\2\0\2\5\26\0\1\5\7\0"+
    "\1\5\2\0\1\5\5\0\2\5\11\0\2\5\2\0"+
    "\2\5\3\0\7\5\3\0\4\5\2\0\1\5\5\0"+
    "\2\5\12\12\1\5\1\0\20\5\2\0\1\5\6\0"+
    "\3\5\3\0\1\5\4\0\3\5\2\0\1\5\1\0"+
    "\1\5\2\0\3\5\2\0\3\5\3\0\3\5\14\0"+
    "\4\5\5\0\3\5\3\0\1\5\4\0\2\5\1\0"+
    "\6\5\1\0\16\5\12\12\11\5\1\0\6\5\15\0"+
    "\1\5\3\0\1\5\27\0\1\5\20\0\3\5\10\0"+
    "\1\5\3\0\1\5\4\0\7\5\2\0\1\5\3\0"+
    "\5\5\4\0\2\5\12\12\20\5\4\0\1\5\10\0"+
    "\1\5\3\0\1\5\27\0\1\5\12\0\1\5\5\0"+
    "\2\5\11\0\1\5\3\0\1\5\4\0\7\5\2\0"+
    "\7\5\1\0\1\5\4\0\2\5\12\12\1\5\2\0"+
    "\15\5\15\0\1\5\3\0\1\5\63\0\1\5\3\0"+
    "\1\5\5\0\5\5\4\0\7\5\5\0\2\5\12\12"+
    "\12\5\6\0\1\5\3\0\1\5\22\0\3\5\30\0"+
    "\1\5\11\0\1\5\1\0\2\5\7\0\3\5\1\0"+
    "\4\5\6\0\1\5\1\0\1\5\10\0\6\5\12\12"+
    "\2\5\2\0\15\5\72\0\4\5\20\0\1\5\12\12"+
    "\47\5\2\0\1\5\1\0\1\5\5\0\1\5\30\0"+
    "\1\5\1\0\1\5\27\0\2\5\5\0\1\5\1\0"+
    "\1\5\6\0\2\5\12\12\2\5\4\0\40\5\1\0"+
    "\27\5\2\0\6\5\12\12\13\5\1\0\1\5\1\0"+
    "\1\5\1\0\4\5\12\0\1\5\44\0\4\5\24\0"+
    "\1\5\22\0\1\5\44\0\11\5\1\0\71\5\100\0"+
    "\12\12\6\5\100\0\12\12\4\0\2\5\46\0\1\5"+
    "\1\0\5\5\1\0\2\5\53\0\1\5\115\0\1\5"+
    "\4\0\2\5\7\0\1\5\1\0\1\5\4\0\2\5"+
    "\51\0\1\5\4\0\2\5\41\0\1\5\4\0\2\5"+
    "\7\0\1\5\1\0\1\5\4\0\2\5\17\0\1\5"+
    "\71\0\1\5\4\0\2\5\103\0\2\5\3\0\40\5"+
    "\20\0\20\5\126\0\2\5\6\0\3\5\u016c\0\2\5"+
    "\21\0\1\5\32\0\5\5\113\0\3\5\13\0\7\5"+
    "\15\0\1\5\7\0\13\5\25\0\13\5\24\0\14\5"+
    "\15\0\1\5\3\0\1\5\2\0\14\5\124\0\3\5"+
    "\1\0\3\5\3\0\2\5\12\12\41\5\4\0\1\5"+
    "\12\12\6\5\131\0\7\5\53\0\5\5\106\0\12\5"+
    "\37\0\1\5\14\0\4\5\14\0\12\5\12\12\36\0"+
    "\2\5\5\0\13\5\54\0\4\5\32\0\6\5\12\12"+
    "\46\5\34\0\4\5\77\0\1\5\35\0\2\5\1\0"+
    "\12\12\6\5\12\12\15\5\1\0\10\5\16\0\1\5"+
    "\2\0\77\5\114\0\4\5\12\12\21\5\11\0\14\5"+
    "\60\0\12\12\72\0\14\5\70\0\10\5\12\12\3\5"+
    "\3\0\12\12\44\0\2\5\11\0\7\5\53\0\2\5"+
    "\3\0\20\5\3\0\1\5\47\0\5\5\372\0\1\5"+
    "\33\0\2\5\6\0\2\5\46\0\2\5\6\0\2\5"+
    "\10\0\1\5\1\0\1\5\1\0\1\5\1\0\1\5"+
    "\37\0\2\5\65\0\1\5\7\0\1\5\1\0\3\5"+
    "\3\0\1\5\7\0\3\5\4\0\2\5\6\0\4\5"+
    "\15\0\5\5\3\0\1\5\7\0\16\5\5\0\30\5"+
    "\2\3\5\0\20\5\2\0\23\5\1\0\13\5\5\0"+
    "\1\5\12\0\1\5\1\0\15\5\1\0\20\5\15\0"+
    "\3\5\40\0\20\5\15\0\4\5\1\0\3\5\14\0"+
    "\21\5\1\0\4\5\1\0\2\5\12\0\1\5\1\0"+
    "\3\5\5\0\6\5\1\0\1\5\1\0\1\5\1\0"+
    "\1\5\4\0\1\5\13\0\2\5\4\0\5\5\5\0"+
    "\4\5\1\0\21\5\51\0\u0177\5\57\0\1\5\57\0"+
    "\1\5\205\0\6\5\11\0\14\5\46\0\1\5\1\0"+
    "\5\5\1\0\2\5\70\0\7\5\1\0\17\5\30\0"+
    "\11\5\7\0\1\5\7\0\1\5\7\0\1\5\7\0"+
    "\1\5\7\0\1\5\7\0\1\5\7\0\1\5\7\0"+
    "\1\5\40\0\57\5\1\0\325\5\3\0\31\5\17\0"+
    "\1\5\5\0\2\5\5\0\4\5\126\0\2\5\2\0"+
    "\2\5\3\0\1\5\132\0\1\5\4\0\5\5\53\0"+
    "\1\5\136\0\21\5\40\0\60\5\320\0\100\5\375\0"+
    "\3\5\215\0\103\5\56\0\2\5\15\0\3\5\20\0"+
    "\12\12\2\0\24\5\60\0\4\5\12\0\1\5\163\0"+
    "\45\5\11\0\2\5\147\0\2\5\65\0\2\5\11\0"+
    "\52\5\63\0\4\5\1\0\13\5\1\0\7\5\64\0"+
    "\14\5\106\0\12\5\12\12\6\5\30\0\3\5\1\0"+
    "\1\5\3\0\12\12\44\0\2\5\44\0\14\5\35\0"+
    "\3\5\101\0\16\5\1\0\12\12\6\5\20\0\12\12"+
    "\5\0\1\5\67\0\11\5\16\0\2\5\12\12\6\5"+
    "\27\0\3\5\111\0\30\5\3\0\2\5\20\0\2\5"+
    "\5\0\12\5\6\0\2\5\6\0\2\5\6\0\11\5"+
    "\7\0\1\5\7\0\1\5\53\0\1\5\16\0\6\5"+
    "\173\0\1\5\2\0\2\5\12\12\6\5\244\0\14\5"+
    "\27\0\4\5\61\0\4\5\u0100\3\156\0\2\5\152\0"+
    "\46\5\7\0\14\5\5\0\5\5\14\0\1\5\15\0"+
    "\1\5\5\0\1\5\1\0\1\5\2\0\1\5\2\0"+
    "\1\5\154\0\41\5\153\0\22\5\100\0\2\5\66\0"+
    "\50\5\15\0\3\5\20\0\20\5\20\0\3\5\2\0"+
    "\30\5\3\0\31\5\1\0\6\5\5\0\1\5\207\0"+
    "\2\5\1\0\4\5\1\0\13\5\12\12\7\5\32\0"+
    "\4\5\1\0\1\5\32\0\13\5\131\0\3\5\6\0"+
    "\2\5\6\0\2\5\6\0\2\5\3\0\3\5\2\0"+
    "\3\5\2\0\22\5\3\0\4\5\14\0\1\5\32\0"+
    "\1\5\23\0\1\5\2\0\1\5\17\0\2\5\16\0"+
    "\42\5\173\0\105\5\65\0\210\5\1\0\202\5\35\0"+
    "\3\5\61\0\17\5\1\0\37\5\40\0\15\5\36\0"+
    "\5\5\53\0\5\5\36\0\2\5\44\0\4\5\10\0"+
    "\1\5\5\0\52\5\236\0\2\5\12\12\6\5\44\0"+
    "\4\5\44\0\4\5\50\0\10\5\64\0\234\5\67\0"+
    "\11\5\26\0\12\5\10\0\230\5\6\0\2\5\1\0"+
    "\1\5\54\0\1\5\2\0\3\5\1\0\2\5\27\0"+
    "\12\5\27\0\11\5\37\0\101\5\23\0\1\5\2\0"+
    "\12\5\26\0\12\5\32\0\106\5\70\0\6\5\2\0"+
    "\100\5\4\0\1\5\2\0\5\5\10\0\1\5\3\0"+
    "\1\5\35\0\2\5\3\0\4\5\1\0\40\5\35\0"+
    "\3\5\35\0\43\5\10\0\1\5\36\0\31\5\66\0"+
    "\12\5\26\0\12\5\23\0\15\5\22\0\156\5\111\0"+
    "\67\5\63\0\15\5\63\0\15\5\50\0\10\5\12\12"+
    "\u0146\5\52\0\1\5\2\0\3\5\2\0\116\5\35\0"+
    "\12\5\1\0\10\5\41\0\137\5\25\0\33\5\27\0"+
    "\11\5\107\0\37\5\12\12\17\5\74\0\2\5\1\0"+
    "\17\5\1\0\2\5\31\0\7\5\12\12\6\5\65\0"+
    "\1\5\12\12\4\5\4\0\10\5\44\0\2\5\1\0"+
    "\11\5\105\0\4\5\4\0\1\5\2\0\12\12\1\0"+
    "\1\5\1\0\43\5\22\0\1\5\45\0\6\5\1\0"+
    "\101\5\7\0\1\5\1\0\1\5\4\0\1\5\17\0"+
    "\1\5\12\0\7\5\73\0\5\5\12\12\6\5\4\0"+
    "\1\5\10\0\2\5\2\0\2\5\26\0\1\5\7\0"+
    "\1\5\2\0\1\5\5\0\1\5\12\0\2\5\2\0"+
    "\2\5\3\0\2\5\1\0\6\5\1\0\5\5\7\0"+
    "\2\5\7\0\3\5\5\0\213\5\113\0\5\5\12\12"+
    "\4\5\4\0\36\5\106\0\1\5\1\0\10\5\12\12"+
    "\246\5\66\0\2\5\11\0\27\5\6\0\42\5\101\0"+
    "\3\5\1\0\13\5\12\12\46\5\71\0\7\5\12\12"+
    "\66\5\33\0\2\5\17\0\4\5\12\12\306\5\73\0"+
    "\145\5\100\0\12\12\25\5\10\0\2\5\1\0\2\5"+
    "\10\0\1\5\2\0\1\5\36\0\1\5\2\0\2\5"+
    "\11\0\14\5\12\0\106\5\10\0\2\5\56\0\2\5"+
    "\10\0\1\5\2\0\33\5\77\0\10\5\1\0\10\5"+
    "\112\0\3\5\1\0\42\5\71\0\7\5\11\0\1\5"+
    "\55\0\1\5\11\0\17\5\12\12\30\5\36\0\2\5"+
    "\26\0\1\5\16\0\111\5\7\0\1\5\2\0\1\5"+
    "\54\0\3\5\1\0\1\5\2\0\1\5\11\0\10\5"+
    "\12\12\6\5\6\0\1\5\2\0\1\5\45\0\1\5"+
    "\2\0\1\5\6\0\7\5\12\12\u0136\5\27\0\271\5"+
    "\1\0\54\5\4\0\37\5\232\0\146\5\157\0\21\5"+
    "\304\0\274\5\57\0\1\5\11\0\307\5\107\0\271\5"+
    "\71\0\7\5\37\0\1\5\12\12\146\5\36\0\2\5"+
    "\5\0\13\5\67\0\11\5\4\0\14\5\12\12\11\5"+
    "\25\0\5\5\23\0\260\5\100\0\200\5\113\0\4\5"+
    "\71\0\7\5\21\0\100\5\2\0\1\5\2\0\13\5"+
    "\2\0\16\5\370\0\10\5\326\0\52\5\11\0\367\5"+
    "\37\0\61\5\3\0\21\5\4\0\10\5\u018c\0\4\5"+
    "\153\0\5\5\15\0\3\5\11\0\7\5\12\0\3\5"+
    "\2\0\1\5\4\0\301\5\5\0\3\5\26\0\2\5"+
    "\7\0\36\5\4\0\224\5\3\0\273\5\125\0\1\5"+
    "\107\0\1\5\2\0\2\5\1\0\2\5\2\0\2\5"+
    "\4\0\1\5\14\0\1\5\1\0\1\5\7\0\1\5"+
    "\101\0\1\5\4\0\2\5\10\0\1\5\7\0\1\5"+
    "\34\0\1\5\4\0\1\5\5\0\1\5\1\0\3\5"+
    "\7\0\1\5\u0154\0\2\5\31\0\1\5\31\0\1\5"+
    "\37\0\1\5\31\0\1\5\37\0\1\5\31\0\1\5"+
    "\37\0\1\5\31\0\1\5\37\0\1\5\31\0\1\5"+
    "\10\0\2\5\62\12\67\0\4\5\62\0\10\5\1\0"+
    "\16\5\1\0\26\5\5\0\1\5\17\0\120\5\7\0"+
    "\1\5\21\0\2\5\7\0\1\5\2\0\1\5\5\0"+
    "\325\5\55\0\3\5\16\0\2\5\12\12\4\5\1\0"+
    "\u0171\5\60\0\12\12\5\5\306\0\13\5\7\0\51\5"+
    "\114\0\4\5\12\12\u0156\5\1\0\117\5\4\0\1\5"+
    "\33\0\1\5\2\0\1\5\1\0\2\5\1\0\1\5"+
    "\12\0\1\5\4\0\1\5\1\0\1\5\1\0\6\5"+
    "\1\0\4\5\1\0\1\5\1\0\1\5\1\0\1\5"+
    "\3\0\1\5\2\0\1\5\1\0\2\5\1\0\1\5"+
    "\1\0\1\5\1\0\1\5\1\0\1\5\1\0\1\5"+
    "\2\0\1\5\1\0\2\5\4\0\1\5\7\0\1\5"+
    "\4\0\1\5\4\0\1\5\1\0\1\5\12\0\1\5"+
    "\21\0\5\5\3\0\1\5\5\0\1\5\21\0\u0134\5"+
    "\12\0\6\5\336\0\42\5\65\0\13\5\336\0\2\5"+
    "\u0182\0\16\5\u0131\0\37\5\36\0\342\5\113\0\266\5"+
    "\1\0\36\5\140\0\200\5\360\0\20\5";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[31232];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\7\1\1\12\1\13\17\1\1\14\1\15"+
    "\5\1\1\16\1\17\1\1\1\20\3\1\1\21\2\1"+
    "\1\22\1\23";

  private static int [] zzUnpackAction() {
    int [] result = new int[55];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\36\0\74\0\36\0\132\0\36\0\36\0\36"+
    "\0\36\0\170\0\226\0\36\0\264\0\322\0\360\0\u010e"+
    "\0\u012c\0\u014a\0\u0168\0\36\0\36\0\u0186\0\u01a4\0\u01c2"+
    "\0\u01e0\0\u01fe\0\u021c\0\u023a\0\u0258\0\u0276\0\u0294\0\u02b2"+
    "\0\u02d0\0\u02ee\0\u030c\0\u032a\0\74\0\74\0\u0348\0\u0366"+
    "\0\u0384\0\u03a2\0\u03c0\0\74\0\74\0\u03de\0\74\0\u03fc"+
    "\0\u041a\0\u0438\0\74\0\u0456\0\u0474\0\74\0\74";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[55];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\0\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\3\1\13\1\14\1\15\2\3\1\16\1\17"+
    "\2\3\1\20\1\3\1\21\3\3\1\22\1\23\1\24"+
    "\1\25\36\0\1\3\10\0\3\3\1\0\17\3\4\0"+
    "\1\4\33\0\1\3\10\0\1\3\2\12\1\0\17\3"+
    "\2\0\1\3\10\0\1\3\2\13\1\0\17\3\2\0"+
    "\1\3\10\0\3\3\1\0\10\3\1\26\1\3\1\27"+
    "\4\3\2\0\1\3\10\0\3\3\1\0\12\3\1\30"+
    "\4\3\2\0\1\3\10\0\3\3\1\0\7\3\1\31"+
    "\7\3\2\0\1\3\10\0\3\3\1\0\12\3\1\32"+
    "\4\3\2\0\1\3\10\0\3\3\1\0\13\3\1\33"+
    "\3\3\2\0\1\3\10\0\3\3\1\0\7\3\1\34"+
    "\7\3\2\0\1\3\10\0\3\3\1\0\14\3\1\35"+
    "\2\3\2\0\1\3\10\0\3\3\1\0\15\3\1\36"+
    "\1\3\2\0\1\3\10\0\3\3\1\0\1\3\1\37"+
    "\15\3\2\0\1\3\10\0\3\3\1\0\3\3\1\40"+
    "\13\3\2\0\1\3\10\0\3\3\1\0\12\3\1\41"+
    "\4\3\2\0\1\3\10\0\3\3\1\0\7\3\1\42"+
    "\7\3\2\0\1\3\10\0\3\3\1\0\12\3\1\43"+
    "\4\3\2\0\1\3\10\0\3\3\1\0\11\3\1\44"+
    "\5\3\2\0\1\3\10\0\3\3\1\0\3\3\1\45"+
    "\13\3\2\0\1\3\10\0\3\3\1\0\13\3\1\46"+
    "\3\3\2\0\1\3\10\0\3\3\1\0\6\3\1\47"+
    "\10\3\2\0\1\3\10\0\3\3\1\0\11\3\1\50"+
    "\5\3\2\0\1\3\10\0\3\3\1\0\1\51\16\3"+
    "\2\0\1\3\10\0\3\3\1\0\1\3\1\52\15\3"+
    "\2\0\1\3\10\0\3\3\1\0\3\3\1\53\13\3"+
    "\2\0\1\3\10\0\3\3\1\0\3\3\1\54\13\3"+
    "\2\0\1\3\10\0\3\3\1\0\13\3\1\55\3\3"+
    "\2\0\1\3\10\0\3\3\1\0\7\3\1\56\7\3"+
    "\2\0\1\3\10\0\3\3\1\0\10\3\1\57\6\3"+
    "\2\0\1\3\10\0\3\3\1\0\7\3\1\60\7\3"+
    "\2\0\1\3\10\0\3\3\1\0\2\3\1\61\14\3"+
    "\2\0\1\3\10\0\3\3\1\0\5\3\1\62\11\3"+
    "\2\0\1\3\10\0\3\3\1\0\13\3\1\63\3\3"+
    "\2\0\1\3\10\0\3\3\1\0\1\64\16\3\2\0"+
    "\1\3\10\0\3\3\1\0\13\3\1\65\3\3\2\0"+
    "\1\3\10\0\3\3\1\0\14\3\1\66\2\3\2\0"+
    "\1\3\10\0\3\3\1\0\14\3\1\67\2\3\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1170];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\10\1\1\1\11\1\1\4\11\2\1\1\11"+
    "\7\1\2\11\42\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[55];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */

/* Crear un nuevo objeto java_cup.runtime.Symbol con informacion sobre
   el token actual sin valor */
  
  private int c_line, c_column;

 private Symbol symbol(int type) {

   return new Symbol(type,yyline,yycolumn);
 
 }/* Fin symbol */


private Symbol symbol(int type,Object value){ 
	return new Symbol(type,yyline,yycolumn,value); 
} 



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  analex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println("Token ident <"+yytext()+"> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
return symbol(sym.ident, new String(yytext()));
            }
            // fall through
          case 20: break;
          case 2:
            { 
            }
            // fall through
          case 21: break;
          case 3:
            { System.out.println("Token No Valido <" +yytext()+ ">linea: " + (yyline+1) + " columna: " + (yycolumn+1));
            }
            // fall through
          case 22: break;
          case 4:
            { System.out.println("Parentesis abierto encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));
    /*yybegin(COORDENADA)*/ return symbol(sym.parenta);
            }
            // fall through
          case 23: break;
          case 5:
            { System.out.println("Parentesis cerrado encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.parentc);
            }
            // fall through
          case 24: break;
          case 6:
            { System.out.println("Token coma encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.coma);
            }
            // fall through
          case 25: break;
          case 7:
            { System.out.println("Token daño <"+yytext()+"> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
return symbol(sym.damage, new Integer(yytext()));
            }
            // fall through
          case 26: break;
          case 8:
            { System.out.println("Token numero <"+yytext()+"> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.numero, new Integer(yytext()));
            }
            // fall through
          case 27: break;
          case 9:
            { System.out.println("Token punto_coma encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.punto_coma);
            }
            // fall through
          case 28: break;
          case 10:
            { System.out.println("Token llave_a encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.llave_a);
            }
            // fall through
          case 29: break;
          case 11:
            { System.out.println("Token llave_c encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.llave_c);
            }
            // fall through
          case 30: break;
          case 12:
            { System.out.println("Token use encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.use);
            }
            // fall through
          case 31: break;
          case 13:
            { System.out.println("Token alto encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.alto);
            }
            // fall through
          case 32: break;
          case 14:
            { System.out.println("Token time encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.time);
            }
            // fall through
          case 33: break;
          case 15:
            { System.out.println("Token ancho encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.ancho);
            }
            // fall through
          case 34: break;
          case 16:
            { System.out.println("Token final encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.end);
            }
            // fall through
          case 35: break;
          case 17:
            { System.out.println("Token inicio encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.inicio);
            }
            // fall through
          case 36: break;
          case 18:
            { System.out.println("Token monedas encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.monedas);
            }
            // fall through
          case 37: break;
          case 19:
            { System.out.println("Token enemigos encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.enemigos);
            }
            // fall through
          case 38: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
