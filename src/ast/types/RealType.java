package ast.types;

import ast.ASTNode;
import visitors.Visitor;

public class RealType extends AbstractType {

   private static RealType instance;

   private RealType() {
       super(0, 0);
   }

   public static RealType getInstance() {
       if (instance == null)
           instance = new RealType();
       return instance;
   }

    @Override
    public String getName() {
        return "double";
    }

    @Override
    public int getSize() { return 4; }

    @Override
    public boolean isBuiltInType() { return true; }

    @Override
    public Type arithmetic(ASTNode ast) {
        return this;
    }

    @Override
    public Type arithmetic(Type t, ASTNode ast) {
        if (t instanceof ErrorType)
            return t;
        if (t == RealType.getInstance())
            return this;
        return super.arithmetic(t, ast);
    }

    @Override
    public Type comparison(Type t, ASTNode ast) {
        if (t instanceof ErrorType)
            return t;
        if (t == RealType.getInstance())
            return IntegerType.getInstance();
        return super.comparison(t, ast);
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
        return "RealType";
    }
}
