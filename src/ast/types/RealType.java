package ast.types;

import ast.AbstractASTNode;

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
}
