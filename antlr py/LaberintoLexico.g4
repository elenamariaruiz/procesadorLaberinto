lexer grammar LaberintoLexico;

/*
 * Lexer Rules
 */

OTROS_CARACTERES : GUION | '_';
TILDES : 'á' | 'é' | 'í' | 'ó' | 'ú' | 'Á' | 'É' | 'Í' | 'Ó' | 'Ú';

USE : 'use';
TIME:'time';
ALTO : 'alto';
ANCHO : 'ancho';
MONEDAS : 'monedas';
LLAVE_A : '{';
LLAVE_C : '}';
PUNTO_COMA : ';';
ENEMIGOS : 'enemigos';
INICIO:'inicio';
FINAL : 'final';
PARENTA : '(';
PARENTC : ')';
COMA:',';

DAMAGE : GUION NUMERO;
GUION :'-';
NUMERO : [1-9][0-9]*;

UTEMP : 's' | 'm' | 'h';

IDENT : [a-zA-Z]([a-z] | [A-Z] | [0-9] | OTROS_CARACTERES | TILDES | 'ñ' | 'Ñ')*; 
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines;







