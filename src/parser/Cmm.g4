grammar Cmm;

/***************************************************
 *                    HEADER                       *
 **************************************************/

@header {
    import java.util.Stack;
    import ast.*;
    import ast.definitions.*;
    import ast.sentences.*;
    import ast.types.*;
}

/***************************************************
 *                 DEFINITIONS                     *
 **************************************************/

program returns [Program ast]:
    {   $ast = new Program();   }
    (vardef
    {   $ast.addAll($vardef.ast);   }
    |funcdef
    {   $ast.add($funcdef.ast); }
    )+
	;

vardef returns [List<Definition> ast]:
    {   $ast = new ArrayList<>();   }
    type id1=ID
    {   $ast.add(new VariableDefinition($id1.getLine(), $id1.getCharPositionInLine(), $id1.text, $type.ast));   }
    (',' id2=ID
    {   $ast.add(new VariableDefinition($id2.getLine(), $id2.getCharPositionInLine(), $id2.text, $type.ast));   }
    )* ';'
    ;

funcdef returns [Definition ast]:
    {   List<VariableDefinition> params = new ArrayList<>();
        List<Sentence> sentences = new ArrayList<>();       }
    {   Type rt = null; } (
    primitiveType
    {   rt = $primitiveType.ast;    }
    | voidType
    {   rt = $voidType.ast; }
    ) fid=ID '(' (
    t1=primitiveType id1=ID
    {   params.add(new VariableDefinition($id1.getLine(), $id1.getCharPositionInLine(), $id1.text, $t1.ast));   }
    (',' tn=primitiveType idn=ID
    {   params.add(new VariableDefinition($idn.getLine(), $idn.getCharPositionInLine(), $idn.text, $tn.ast));   }
    )*)? ')''{' (
    vardef
    {   $vardef.ast.forEach(vd -> sentences.add((VariableDefinition)vd));    }
    )* ( sentence )* '}'
    {   Type ft = new FunctionType(params, rt);
        $ast = new FunctionDefinition($start.getLine(), $start.getCharPositionInLine(), $fid.text, ft, sentences);}
    ;

/***************************************************
 *                    TYPES                        *
 **************************************************/

type returns [Type ast]:
    // Primitive types
    primitiveType {$ast = $primitiveType.ast;}
    // Struct
    | ('struct' '{' {List<RecordField> list = new ArrayList<>();}
        (type ID ';' {list.add(new RecordField($ID.text, $type.ast));})+ '}'
        {$ast = new RecordType(list);})
    // Array
    | it=type {Stack<Integer> sizes = new Stack<>();}
        ('[' INT_CONSTANT ']' {sizes.add(LexerHelper.lexemeToInt($INT_CONSTANT.text) );})+
        {   $ast = new ArrayType(sizes.pop(), $it.ast);
            while (!sizes.isEmpty())
                $ast = new ArrayType(sizes.pop(), $ast);
        }
    ;

primitiveType returns [Type ast]:
    'int' { $ast = IntegerType.getInstance();}
     | 'char' { $ast = CharacterType.getInstance();}
     | 'double' { $ast = RealType.getInstance();}
    ;

voidType returns [Type ast]:
    'void' {$ast = VoidType.getInstance();}
    ;

/***************************************************
 *                  SENTENCES                      *
 **************************************************/

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

/***************************************************
 *                  EXPRESSIONS                    *
 **************************************************/

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

/***************************************************
 *                    LEXER                       *
 **************************************************/

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