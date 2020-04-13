package ast.sentences;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitors.Visitor;

import java.util.List;

public class If extends AbstractASTNode implements Sentence {

    private Expression condition;
    private List<Sentence> then;
    private List<Sentence> _else;

    public If(int line, int column, Expression condition, List<Sentence> then, List<Sentence> _else) {
        super(line, column);
        this.condition = condition;
        this.then = then;
        this._else = _else;
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Sentence> getThen() {
        return then;
    }

    public List<Sentence> get_else() {
        return _else;
    }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "If{" +
                "condition=" + condition +
                ", then=" + then.size() +
                ", _else=" + _else.size() +
                '}';
    }
}
