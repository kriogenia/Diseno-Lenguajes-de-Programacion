package ast.types;

import ast.expressions.IntegerLiteral;

public class Array implements Type {

    private IntegerLiteral size;
    private Type[] collection;

    @Override
    public Object getValue() {
        return collection;
    }
}
