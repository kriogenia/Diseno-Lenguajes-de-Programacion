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
    public boolean isNotLogical() {
        return false;
    }

    @Override
    public boolean isBuiltInType() { return true; }

    @Override
    public Type arithmetic(Type t, ASTNode ast) {
        if (t instanceof ErrorType)
            return t;
        if (t == IntegerType.getInstance())
            return this;
        return super.arithmetic(t, ast);
    }

    @Override
    public Type comparison(Type t, ASTNode ast) {
        if (t instanceof ErrorType)
            return t;
        if (t == IntegerType.getInstance())
            return this;
        return super.comparison(t, ast);
    }

    @Override
    public Type logical(ASTNode ast) {
        return this;
    }

    @Override
    public Type logical(Type t, ASTNode ast) {
        if (t instanceof ErrorType)
            return t;
        if (t == IntegerType.getInstance())
            return this;
        return super.logical(t, ast);
    }

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
        return "IntegerType";
    }
}
