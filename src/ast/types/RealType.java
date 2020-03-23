package ast.types;

import ast.AbstractASTNode;
import visitor.Visitor;

public class RealType extends AbstractASTNode implements Type {

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
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "RealType";
    }
}
