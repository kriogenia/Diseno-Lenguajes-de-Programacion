package ast.types;

import ast.AbstractASTNode;
import ast.definitions.VariableDefinition;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractASTNode implements Type {

    private List<VariableDefinition> params;
    private Type returnType;

    public FunctionType(int line, int column, List<VariableDefinition> params, Type returnType) {
        super(line, column);
        this.params = new ArrayList<>();
        this.params.addAll(params);
        this.returnType = returnType;
    }

    @Override
    public Object accept(Visitor visitor, Object param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "FunctionType{" +
                "params=" + params +
                ", returnType=" + returnType +
                '}';
    }
}
