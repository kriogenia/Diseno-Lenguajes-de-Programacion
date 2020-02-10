package ast.expressions;

import ast.AbstractASTNode;

public class IntegerLiteral extends AbstractASTNode implements Expression {

    private int value;

    public IntegerLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }
}
