package ast.sentences;

import ast.AbstractASTNode;
import ast.expressions.Expression;

import java.util.List;

public class While extends AbstractASTNode implements Sentence {

    private Expression condition;
    private List<Sentence> _do;

    public While(int line, int column, Expression condition, List<Sentence> _do) {
        super(line, column);
        this.condition = condition;
        this._do.addAll(_do);
    }
}
