package ast.sentences;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;

public class Read extends AbstractASTNode implements Sentence {

    private List<Expression> expressions;

    public Read(int line, int column, List<Expression> expressions) {
        super(line, column);
        this.expressions = expressions;
    }

    @Override
    public Object accept(Visitor visitor, Object param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "Read{" +
                "expressions=" + expressions.size() +
                '}';
    }
}
