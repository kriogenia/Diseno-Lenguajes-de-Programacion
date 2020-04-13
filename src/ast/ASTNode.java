package ast;

import visitors.Visitor;

public interface ASTNode {

    int getLine();
    int getColumn();

    <P,R>   R accept(Visitor<P,R> visitor, P param);
    
}
