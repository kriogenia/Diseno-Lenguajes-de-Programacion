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
    public Object accept(Visitor visitor, Object params) {
        return visitor.visit(this, params);
    }

    @Override
    public String toString() {
        return "ErrorType{" +
                "message='" + message + '\'' +
                '}';
    }
}
