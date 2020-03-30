package ast.types;

import ast.ASTNode;
import visitor.Visitor;

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
    public boolean isBuiltInType() { return true; }

    @Override
    public Type arithmetic(Type t, ASTNode ast) {
        if (t instanceof ErrorType)
            return t;
        if (t == RealType.getInstance())
            return this;
        return super.arithmetic(t, ast);
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
