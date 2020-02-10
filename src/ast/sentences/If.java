package ast.sentences;

import ast.AbstractASTNode;
import ast.expressions.Expression;

import java.util.List;

public class If extends AbstractASTNode implements Sentence {

    private Expression condition;
    private List<Sentence> then;
    private List<Sentence> _else;

    public If(int line, int column, Expression condition, List<Sentence> then, List<Sentence> _else) {
        super(line, column);
        this.condition = condition;
        this.then.addAll(then);
        this._else.addAll(_else);
    }
}
