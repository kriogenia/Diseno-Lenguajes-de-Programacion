package ast.expressions;

import ast.AbstractASTNode;
import visitor.Visitor;

public class UnaryMinusOperation extends AbstractASTNode implements Expression{

    private Expression expression;

    public UnaryMinusOperation(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public Object accept(Visitor visitor, Object param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "UnaryMinusOperation{" +
                "-" + expression +
                '}';
    }
}
