package ast.sentences;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitors.Visitor;

public class Assign extends AbstractASTNode implements Sentence {

    private Expression id;
    private Expression refered;

    public Assign(int line, int column, Expression id, Expression refered) {
        super(line, column);
        this.id = id;
        this.refered = refered;
    }

    public Expression getId() {
        return id;
    }

    public Expression getRefered() {
        return refered;
    }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "Assign{" +
                "id=" + id +
                ", refered=" + refered +
                '}';
    }
}
