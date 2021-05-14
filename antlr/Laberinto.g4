grammar Laberinto;

import LaberintoLexico;

inicio : IDENT dimension directivas def_monedas?  bloque;
directivas :USE IDENT TIME NUMERO UTEMP;
dimension : ALTO NUMERO ANCHO NUMERO;

def_monedas : MONEDAS LLAVE_A monedas LLAVE_C;
monedas : (moneda PUNTO_COMA)+;
moneda : IDENT NUMERO;
def_enemigos : ENEMIGOS LLAVE_A enemigo LLAVE_C;
enemigos :(enemigo PUNTO_COMA)+ ;
enemigo : IDENT DAMAGE; 

bloque : LLAVE_A start end localizaciones?  LLAVE_C;
start : INICIO coord PUNTO_COMA ;
end : FINAL coord PUNTO_COMA ;
localizaciones : localizacion (localizacion)* ;
localizacion : IDENT coordenadas PUNTO_COMA ;
coordenadas : (coord PUNTO_COMA)+ ;
coord :PARENTA NUMERO COMA NUMERO PARENTC;
