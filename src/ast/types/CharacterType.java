package ast.types;

import ast.ASTNode;
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
        return "char";
    }

    @Override
    public int getNumberOfBytes() { return 1; }

    public String getSuffix() {
        return "b";
    }

    @Override
    public boolean isBuiltInType() { return true; }

    @Override
    public Type promotesTo(Type type, ASTNode ast) {
        if (type instanceof ErrorType)
            return type;
        if (type == instance)
            return this;
        return super.promotesTo(type, ast);
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