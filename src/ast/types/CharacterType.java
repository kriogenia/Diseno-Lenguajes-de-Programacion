package ast.types;

import ast.AbstractASTNode;
import visitor.Visitor;

public class CharacterType extends AbstractASTNode implements Type {

    private static CharacterType instance;

    private CharacterType() {
        super(0, 0);
    }

    public static CharacterType getInstance() {
        if (instance == null)
            instance = new CharacterType();
        return instance;
    }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "CharacterType";
    }
}