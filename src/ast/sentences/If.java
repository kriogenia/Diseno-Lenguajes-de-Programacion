package ast.sentences;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitor.Visitor;

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

    @Override
    public Object accept(Visitor visitor, Object param) {
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
