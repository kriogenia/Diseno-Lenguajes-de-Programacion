package ast.types;

import ast.expressions.IntegerLiteral;

public class Array implements Type {

    private IntegerLiteral size;
    private Type[] collection;

    @Override
    public Object getValue() {
        return collection;
    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
