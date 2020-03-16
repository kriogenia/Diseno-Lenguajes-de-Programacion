package ast.sentences;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitor.Visitor;

public class Return extends AbstractASTNode implements Sentence {

    private Expression returnValue;

    public Return(int line, int column, Expression returnValue) {
        super(line, column);
        this.returnValue = returnValue;
    }

    @Override
    public Object accept(Visitor visitor, Object params) {
        return visitor.visit(this, params);
    }

    @Override
    public String toString() {
        return "Return{" +
                "returnValue=" + returnValue +
                '}';
    }
}
