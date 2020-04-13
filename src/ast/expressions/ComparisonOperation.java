package ast.expressions;

import visitors.Visitor;

public class ComparisonOperation extends AbstractBinarialOperation {

    public ComparisonOperation(int line, int column, Expression left, String operation, Expression right) {
        super(line, column, left, operation, right);
    }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }
}
