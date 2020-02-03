package ast.expressions;

public class ArithmeticOperation implements Expression{

    private String operation;
    private Expression left;
    private Expression right;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
