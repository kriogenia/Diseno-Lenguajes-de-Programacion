package ast.sentences;

import ast.AbstractASTNode;
import ast.expressions.Expression;

import java.util.List;

public class Read extends AbstractASTNode implements Sentence {

    private List<Expression> expressionions;

    public Read(int line, int column, List<Expression> expressionions) {
        super(line, column);
        this.expressionions.addAll(expressionions);
    }
}
