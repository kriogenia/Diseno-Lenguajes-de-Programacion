package ast.types;

import ast.AbstractASTNode;
import visitor.Visitor;

public class ErrorType extends AbstractASTNode implements Type {

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
    }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "ERROR [line: " + getLine() + ", column: " + getColumn() + "] - "
                + this.message;
    }
}
