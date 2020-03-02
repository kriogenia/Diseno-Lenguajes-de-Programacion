package ast.sentences;

import ast.AbstractASTNode;
import ast.expressions.Expression;

import java.util.List;

public class Write extends AbstractASTNode implements Sentence {

    private List<Expression> expressions;

    public Write(int line, int column, List<Expression> expressions) {
        super(line, column);
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return "Write{" +
                "expressions=" + expressions.size() +
                '}';
    }
}
