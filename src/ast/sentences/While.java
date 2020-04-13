package ast.sentences;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitors.Visitor;

import java.util.List;

public class While extends AbstractASTNode implements Sentence {

    private Expression condition;
    private List<Sentence> _do;

    public While(int line, int column, Expression condition, List<Sentence> _do) {
        super(line, column);
        this.condition = condition;
        this._do = _do;
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Sentence> get_do() {
        return _do;
    }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "While{" +
                "condition=" + condition +
                ", _do=" + _do.size() +
                '}';
    }
}
