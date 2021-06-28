# Lenguaje Generación de Laberintos
Trabajo Procesadores del Lenguaje 2020/2021

##Ejecución CUP
###Requisitos
Para poder ejecutar el procesador de lenguajes, es necesario tener instalado tanto Java 1.8 como los archivos .jar de JFlex y CUP en el sistema.

## Ejecución

Comando para generar el analizador léxico:

    jflex AnalizadorLexico.flex --encoding utf-8

Comando para generar el analizador sintáctico :

    java  java_cup.Main AnalizadorSintactico.cup

Compilar: 

    javac -encoding utf8 *.java  

Ejecutar: 

    java -cp <ruta_del_archivo_java-cup-11b-runtime.jar> Main <archivo_laberinto.txt>

O:

    java Main <archivo_laberinto.txt>
    
El archivo XML de salida quedará guardado en pl_cup


##Ejecución ANTLR
El procesador implementado con ANTLR está dentro de la aplicación, por lo que no es necesario realizar ningún paso extra.

##Ejecución de la aplicación:

El archivo .exe que ejecuta la aplicación se encuentra en pl_antlr\antlr_c\bin\Debug\net472\




## Test
* **laberinto.txt**: Ejemplo de una definición correcta de un laberinto.
* *coordenadaDuplicada.txt*: Se utiliza dos veces la misma coordenada.
* *coordenadaNoValidaTest.txt*: Una de las coordenadas excede los límites del laberinto.
* *elementoduplicadoTest.txt*: Más de un elemento ha sido declarado usando el mismo nombre.
* *faltaComaText.txt*: En este ejemplo una de las coordenadas no contiene la coma ',' como separación entre la coordenada del eje x y la coordenada del eje y.
* *laberintoSinEnemigos.txt*: El laberinto descrito en este ejemplo no tiene enemigos.
* *laberintoSinLocalizacion.txt*: El laberinto descrito no tiene localizaciones.
* *laberintoSinLocalizacionSinDefinicioin.txt*: El laberinto descrito no tiene ni enemigos ni monedas.
* *laberintoSinMonedas.txt*: El laberinto descrito no tiene monedas.
* *opcionalTest.txt*: Este ejemplo está descrito sin utilizar aquellos elementos del lenguaje que son opcionales.
* *palabraMonedaTest.txt*: Ejemplo de un laberinto descrito que no contiene la palabra "moneda".
    
## Participantes
* Elena María Ruiz Izquierdo

