package ast.expressions;

import ast.types.Type;

public class Cast implements Expression{

    private Expression expression;
    private Type type;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
