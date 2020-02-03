package ast.sentences;

import ast.expressions.Expression;

import java.util.List;

public class If implements Sentence {

    private Expression condition;
    private List<Sentence> then;
    private List<Sentence> _else;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
