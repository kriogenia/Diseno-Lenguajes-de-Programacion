package ast.types;

import ast.definitions.VariableDefinition;

import java.util.List;

public class Function implements Type {

    private List<VariableDefinition> params;
    private List<Type> returnType;


    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
