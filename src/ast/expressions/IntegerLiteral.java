package ast.expressions;

public class IntegerLiteral implements Expression {

    private int value;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
