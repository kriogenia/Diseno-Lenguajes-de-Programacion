package ast.expressions;

import visitor.Visitor;

public class ComparisonOperation extends AbstractBinarialOperation {

    public ComparisonOperation(int line, int column, Expression left, String operation, Expression right) {
        super(line, column, left, operation, right);
    }

    @Override
    public Object accept(Visitor visitor, Object params) {
        return visitor.visit(this, params);
    }
}
