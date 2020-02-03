package ast.sentences;

import ast.expressions.Expression;

import java.util.List;

public class While implements Sentence {

    private Expression condition;
    private List<Sentence> _do;
}
