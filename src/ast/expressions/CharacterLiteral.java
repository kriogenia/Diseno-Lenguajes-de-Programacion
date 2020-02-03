package ast.expressions;

public class CharacterLiteral implements Expression {

    private char value;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
