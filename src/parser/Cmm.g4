grammar Cmm;

@header {
    import ast.*;
    import ast.definitions.*;
    import ast.types.*;
}

program returns [Program ast]: {$ast = new Program();}
    (vardef {$ast.addAll($vardef.ast);}
        |funcdef)+
	;

vardef returns [List<Definition> ast]: {$ast = new ArrayList<>();}
    type id1=ID {$ast.add(new VariableDefinition($id1.getLine(), $id1.getCharPositionInLine(), $id1.text, $type.ast));}
        (',' id2=ID {$ast.add(new VariableDefinition($id1.getLine(), $id1.getCharPositionInLine(), $id2.text, $type.ast));})* ';'

    ;

type returns [Type ast]:
    // Primitive types
    primitiveType {$ast = $primitiveType.ast;}
    // Struct
    | 'struct' '{' {List<RecordField> list = new ArrayList<>();}
        (type ID ';' {list.add(new RecordField(0,0, $ID.text, $type.ast));})+ '}' {$ast = new RecordType(0,0,list);}
    // Array
    | type ('[' INT_CONSTANT ']' )+
;
primitiveType returns [Type ast]:
    'int' { $ast = new IntegerType(0,0);}
     | 'char' { $ast = new CharacterType(0,0);}
     | 'double' { $ast = new RealType(0,0);}
    ;

funcdef: (primitiveType|'void') ID '(' params? ')''{' vardef* sentence* '}'
    ;

params: param (',' param)*
    ;

param: type ID
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