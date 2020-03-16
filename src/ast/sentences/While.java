package ast.sentences;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class While extends AbstractASTNode implements Sentence {

    private Expression condition;
    private List<Sentence> _do;

    public While(int line, int column, Expression condition, List<Sentence> _do) {
        super(line, column);
        this.condition = condition;
        this._do = _do;
    }

    @Override
    public Object accept(Visitor visitor, Object params) {
        return visitor.visit(this, params);
    }

    @Override
    public String toString() {
        return "While{" +
                "condition=" + condition +
                ", _do=" + _do.size() +
                '}';
    }
}
