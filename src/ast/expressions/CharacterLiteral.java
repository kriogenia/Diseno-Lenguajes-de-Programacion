package ast.expressions;

import visitor.Visitor;

public class CharacterLiteral extends AbstractExpression {

    private char value;

    public CharacterLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "CharacterLiteral{" +
                "value=" + value +
                '}';
    }
}
