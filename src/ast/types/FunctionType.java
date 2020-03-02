package ast.types;

import ast.AbstractASTNode;
import ast.definitions.VariableDefinition;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractASTNode implements Type {

    private List<VariableDefinition> params;
    private Type returnType;

    public FunctionType(List<VariableDefinition> params, Type returnType) {
        super(0, 0);
        this.params = new ArrayList<>();
        this.params.addAll(params);
        this.returnType = returnType;
    }
}
