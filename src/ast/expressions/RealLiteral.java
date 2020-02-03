package ast.expressions;

public class RealLiteral implements Expression {

    private double value;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
