package ast.types;

import ast.AbstractASTNode;

public class CharacterType extends AbstractASTNode implements Type {

    public CharacterType(int line, int column) {
        super(line, column);
    }
}