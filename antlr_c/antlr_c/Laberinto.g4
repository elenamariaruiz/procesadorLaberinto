grammar Laberinto;

import LaberintoLexico;

inicio : IDENT dimension directivas def_monedas? def_enemigos? bloque;
directivas :USE IDENT TIME NUMERO UTEMP;
dimension : ALTO? num1=NUMERO ANCHO? num2=NUMERO;

def_monedas : MONEDAS LLAVE_A monedas LLAVE_C;
monedas : (moneda PUNTO_COMA)+;
moneda : IDENT NUMERO;
def_enemigos : ENEMIGOS LLAVE_A enemigos LLAVE_C;
enemigos :(enemigo PUNTO_COMA)+ ;
enemigo : IDENT DAMAGE; 

bloque : LLAVE_A start end localizaciones?  LLAVE_C;
start : INICIO coord PUNTO_COMA ;
end : FINAL coord PUNTO_COMA ;
localizaciones : localizacion (localizacion)* ;
localizacion : IDENT coordenadas PUNTO_COMA ;
coordenadas : (coord)+ ;
coord :PARENTA num1=NUMERO COMA? num2=NUMERO PARENTC;
