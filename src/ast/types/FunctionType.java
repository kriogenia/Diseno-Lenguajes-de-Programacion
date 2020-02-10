package ast.types;

import ast.AbstractASTNode;
import ast.definitions.VariableDefinition;

import java.util.List;

public class FunctionType extends AbstractASTNode implements Type {

    private List<VariableDefinition> params;
    private Type returnType;

    public FunctionType(int line, int column, List<VariableDefinition> params, Type returnType) {
        super(line, column);
        this.params.addAll(params);
        this.returnType = returnType;
    }
}
