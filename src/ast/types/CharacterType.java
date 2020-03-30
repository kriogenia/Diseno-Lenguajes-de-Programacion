package ast.types;

import visitor.Visitor;

public class CharacterType extends AbstractType {

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
    public String getName() {
        return "character";
    }

    @Override
    public Type promotesTo(Type type) {
        if (type instanceof ErrorType)
            return type;
        if (type == instance)
            return this;
        return null;
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