//* --------------------------Seccion codigo-usuario ------------------------*/ 

import java_cup.runtime.*;

%% 

/* -----------------Seccionde opciones y declaraciones -----------------*/ 
/*--OPCIONES --*/ 
/* Nombre de la clase generada para el analizadorlexico*/ 

%class analex 

/* Indicar funcionamientoautonomo*/ 


/* Posibilitar acceso a la columna y fila actual de analisis*/ 

%line

%column
%unicode


/* Habilitar la compatibilidad con el interfaz CUP para el generador sint�ctico */

%cup

%state IDENTIFICADOR
%state COORDENADA

/*--DECLARACIONES --*/ 

%{ /* Principio Declaraciones */

/* Crear un nuevo objeto java_cup.runtime.Symbol con informacion sobre
   el token actual sin valor */
  
  private int c_line, c_column;

 private Symbol symbol(int type) {

   return new Symbol(type,yyline,yycolumn);
 
 }/* Fin symbol */


private Symbol symbol(int type,Object value){ 
	return new Symbol(type,yyline,yycolumn,value); 
} 

%} /* Fin Declaraciones */

nl  = \n | \r | \r\n
blanco = " "
tab =  \t
ident = [:jletter:]([:jletterdigit:] | \- | \_ )+
damage = (\-[:digit:]*)
utemp = "s" | "m" | "h"
end= "final"

%%
/* ------------------------Seccionde reglaslexicas----------------------*/
<YYINITIAL> {

"{" 		{System.out.println("Token llave_a encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.llave_a);}

"}" 		{System.out.println("Token llave_c encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.llave_c);}
	
","		{System.out.println("Token coma encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.coma);}

";"		{System.out.println("Token punto_coma encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.punto_coma);}

"use"		{System.out.println("Token use encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.use);}

"time"		{System.out.println("Token time encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.time);}

"alto"		{System.out.println("Token alto encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.alto);}

"ancho"		{System.out.println("Token ancho encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.ancho);}

"inicio"		{System.out.println("Token inicio encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.inicio);}

{end}		{System.out.println("Token final encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.end);}

"monedas"		{System.out.println("Token monedas encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.monedas);}
/*"moneda"		{System.out.println("Token moneda encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.moneda);}*/
"enemigos"		{System.out.println("Token enemigos encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.enemigos);}
/*"enemigo"		{System.out.println("Token enemigo encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.enemigo);}*/


[1-9][:digit:]* {System.out.println("Token numero <"+yytext()+"> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.numero, new Integer(yytext()));}

{damage} {System.out.println("Token daño <"+yytext()+"> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
return symbol(sym.damage, new Integer(yytext()));}

{ident} {System.out.println("Token ident <"+yytext()+"> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
return symbol(sym.ident, new String(yytext()));}

{utemp} {System.out.println("Token unidad de tiempo <"+yytext()+"> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
return symbol(sym.utemp, new String(yytext()));}
  
{nl}		{}
	
{blanco}	{}

{tab} 		{}

\(  {System.out.println("Parentesis abierto encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));
    /*yybegin(COORDENADA)*/ return symbol(sym.parenta);}

\) 		{System.out.println("Parentesis cerrado encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); 
  return symbol(sym.parentc);}
  
. {System.out.println("Token No Valido <" +yytext()+ ">linea: " + (yyline+1) + " columna: " + (yycolumn+1));}


//\) {System.out.println("Parentesis cerrado encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));
  //  /*yybegin(COORDENADA)*/ return symbol(sym.parentc);}

/*<COORDENADA> {
  \) {System.out.println("Token parentesis encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));
     yybegin(YYINITIAL);}
  [1-9][:digit:]* {System.out.println("Token numero <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1));
    return symbol(sym.COORDENADA, new Integer(yytext()));}
}*/


}/* fin YYinitial */
