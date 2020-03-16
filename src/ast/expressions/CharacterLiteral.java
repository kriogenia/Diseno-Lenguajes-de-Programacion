package ast.expressions;

import visitor.Visitor;

public class CharacterLiteral extends AbstractExpression {

    private char value;

    public CharacterLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public Object accept(Visitor visitor, Object params) {
        return visitor.visit(this, params);
    }

    @Override
    public String toString() {
        return "CharacterLiteral{" +
                "value=" + value +
                '}';
    }
}
