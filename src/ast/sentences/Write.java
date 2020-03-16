package ast.sentences;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;

public class Write extends AbstractASTNode implements Sentence {

    private List<Expression> expressions;

    public Write(int line, int column, List<Expression> expressions) {
        super(line, column);
        this.expressions = expressions;
    }

    @Override
    public Object accept(Visitor visitor, Object params) {
        return visitor.visit(this, params);
    }

    @Override
    public String toString() {
        return "Write{" +
                "expressions=" + expressions.size() +
                '}';
    }
}
