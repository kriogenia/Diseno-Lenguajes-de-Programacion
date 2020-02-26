grammar Cmm;	

program: (vardef|funcdef)+
	;

vardef: param (',' ID)* ';'                             // Simple type
    | 'struct' '{' (param ';')+ '}' ID ';'              // Struct
    | primitiveType ('[' INT_CONSTANT ']')+ ID ';'      // Arrays
    ;

primitiveType: 'int' | 'char' | 'double'
    ;

funcdef: (primitiveType|'void') ID '(' params? ')''{' vardef* sentence* '}'
    ;

params: param (',' param)*
    ;

param: primitiveType ID
    ;

sentence : funccall ';'
    // return
    | 'return' expr ';'
    // while
    | 'while' '(' expr ')' '{' sentence* '}'
    // if
    | 'if' '(' expr ')' (sentence|'{'sentence*'}') ('else' (sentence|'{'sentence*'}'))?
    // write
    | 'write' expr (',' expr)* ';'
    // read
    | 'read' expr (',' expr)* ';'
    // assignment
    | expr '=' expr ';'
    ;

expr:
    // constants
      INT_CONSTANT
    | REAL_CONSTANT
    | CHAR_CONSTANT
    // ident
    | ID
    // parenthesis
    | '(' expr ')'
    // array access
    | expr '[' expr ']'
    // field access
    | expr '.' ID
    // cast
    | '(' primitiveType ')' expr
    // unary minus
    | '-' expr
    // arithmetic operations
    | expr ('*'|'/'|'%') expr
    | expr ('+'|'-') expr
    // comparisons
    | expr ('>'|'>='|'<'|'<='|'!='|'==') expr
    // negation
    | '!' expr
    // logic operations
    | expr ('&&'|'||') expr
    // llamadas a funciones
    | funccall
    ;

funccall: ID '(' (expr (',' expr)*)? ')'
    ;

///////////////////////////////////////////////////

fragment
LETTER: [a-zA-Z]
    ;

fragment
BSLASH: '\\'
    ;

fragment
SQ: '\''
    ;

fragment
NL: BSLASH 'n'
    ;

fragment
TAB: BSLASH 't'
    ;

fragment
ASCII: BSLASH[0-9][0-9]?[0-9]?
    ;

WS: ([ ]|'\n'|'\r'|'\t') -> skip
	;

SCOMMENT: '//' ~( '\r' | '\n' )* -> skip
    ;

MCOMMENT: '/*' .*? '*/' -> skip
    ;

INT_CONSTANT: [1-9][0-9]* | [0]
	;

REAL_CONSTANT: (INT_CONSTANT?'.'INT_CONSTANT | INT_CONSTANT'.'INT_CONSTANT?|INT_CONSTANT)([eE]'-'?INT_CONSTANT)?
	;

ID: ('_'|LETTER)+('_'|LETTER|[0-9])*
    ;

CHAR_CONSTANT: (SQ)(.|ASCII|NL|TAB)(SQ)
    ;