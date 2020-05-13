# Diseno-Lenguajes-de-Programacion
Repositorio de control de versiones de la práctica de Diseño de Lenguajes de Programación 2019/20 de la Universidad de Oviedo, evaluado con una nota de 9,3. El lenguaje a desarrollar es uno con una sintaxis semejante a C y las siguientes capacidades:

* Un programa es una secuencia de definiciones de variables y funciones.
* La sintaxis de la definición de una variable consiste en un tipo seguido de una lista no vacía de identificadores separados por comas. Dichas definiciones de variables se finalizan con el carácter ';'.
* Las funciones se definen especificando su tipo de retorno, su identificador (nombre) y una lista de parámetros entre paréntesis y separados por comas. Tanto el tipo de retorno como los tipos de los parámetros deben ser simples (es decir, no se permiten ni arrays ni registros). El cuerpo de la función debe escribirse entre llaves ('{' y '}').
* Los cuerpos de las funciones consisten en una secuencia de definiciones de variables seguida de una secuencia de sentencias. Tanto las definiciones de variables como las sentencias deben terminar con el carácter ';'.
* La definición de la función 'main' es obligatoria y debe ser la última, retornando 'void' y sin parámetros.
* Los tipos simples son 'int', 'double' y 'char'. Los tipos array se crean con '[]', siguiendo la sintaxis de Java, pero especificando el tamaño del array con un literal entero (como en C). La palabra reservada 'struct' permite crear tipos registro. Los registros no tienen identificador, y los campos son declarados como definiciones de variables dentro de '{' '}'. No se permite la definición de tipos (como typedef en C).
* Una escritura es una sentencia que consiste en la palabra reservada 'write' seguida de una lista no vacía de expresiones separadas por comas. La sentencia de lectura es análoga, pero usando la palabra reservada 'read'.
* Las asignaciones se construyen con dos expresiones separadas por el operador '='.
* Las sentencias if/else y los bucles while siguen la sintaxis de C. También se debe soportar la sentencia 'return' <expression> (la expresión es obligatoria).
* La invocación de una función puede ser una expresión o una sentencia. La invocación de un procedimiento siempre será una sentencia.
* La conversión explícita de tipos simples (expresiones cast) sigue la sintaxis de C.
* Las expresiones se construyen con:
  * Literales enteros, reales y carácteres sin signo.
  * Identificadores.
  * Los siguientes operadores aplicados a una o dos expresiones (por orden de precedencia descendente):
    * ( )		No asociativo
    * []		No asociativo
    * .		No asociativo
    * CAST 	No asociativo
    * ( - (unario) )	No asociativo
    * ( * / % )	Asociativo a izquierdas
    * ( + -	)	Asociativo a izquierdas
    * ( > >= < <= != ==	)	Asociativo a izquierdas
    * ( && || !	)	Asociativo a izquierdas

![AST Nodes design](https://i.imgur.com/J75Mzk7.png)
