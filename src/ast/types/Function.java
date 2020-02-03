package ast.types;

import ast.sentences.Sentence;

import java.util.List;

public class Function implements Type {

    private List<Sentence> sentences;
    private List<Type> functionTypes;


    @Override
    public Object getValue() {
        return null;
    }
}
