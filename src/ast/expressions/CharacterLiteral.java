package ast.expressions;

import ast.AbstractASTNode;

public class CharacterLiteral extends AbstractASTNode implements Expression {

    private char value;

    public CharacterLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }
}
