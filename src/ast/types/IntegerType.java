package ast.types;

import ast.ASTNode;
import visitor.Visitor;

public class IntegerType extends AbstractType {

    private static IntegerType instance;

    private IntegerType() {
        super(0, 0);
    }

    public static IntegerType getInstance() {
        if (instance == null)
            instance = new IntegerType();
        return instance;
    }

    @Override
    public String getName() {
        return "integer";
    }

    @Override
    public boolean isLogical() {
        return true;
    }

    @Override
    public Type arithmetic(Type t, ASTNode ast) {
        if (t instanceof ErrorType)
            return t;
        if (t == IntegerType.getInstance())
            return this;
        return super.arithmetic(t, ast);
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
        return "IntegerType";
    }
}
