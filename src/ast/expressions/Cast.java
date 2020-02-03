package ast.expressions;

import ast.types.Type;

public class Cast implements Expression{

    private Expression expression;
    private Type type;
}
