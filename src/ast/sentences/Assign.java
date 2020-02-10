package ast.sentences;

import ast.AbstractASTNode;
import ast.expressions.Expression;

public class Assign extends AbstractASTNode implements Sentence {

    private Expression id;
    private Expression refered;

    public Assign(int line, int column, Expression id, Expression refered) {
        super(line, column);
        this.id = id;
        this.refered = refered;
    }
}
