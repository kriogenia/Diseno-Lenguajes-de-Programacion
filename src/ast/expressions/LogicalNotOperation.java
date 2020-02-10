package ast.expressions;

public class LogicalNotOperation implements Expression{

    private Expression expression;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
