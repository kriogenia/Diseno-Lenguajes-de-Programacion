package ast.expressions;

import ast.AbstractASTNode;

public class RealLiteral extends AbstractASTNode implements Expression {

    private double value;

    public RealLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }
}
