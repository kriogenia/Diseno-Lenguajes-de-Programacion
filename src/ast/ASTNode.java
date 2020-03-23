package ast;

import visitor.Visitor;

public interface ASTNode {

    int getLine();
    int getColumn();

    <P,R>   R accept(Visitor<P,R> visitor, P param);
    
}
