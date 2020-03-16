package ast.expressions;

import ast.AbstractASTNode;
import visitor.Visitor;

public class CharacterLiteral extends AbstractASTNode implements Expression {

    private char value;

    public CharacterLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public Object accept(Visitor visitor, Object param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "CharacterLiteral{" +
                "value=" + value +
                '}';
    }
}
