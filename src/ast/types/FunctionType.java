package ast.types;

import ast.ASTNode;
import ast.definitions.VariableDefinition;
import ast.expressions.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType {

    private List<VariableDefinition> args;
    private Type returnType;

    public FunctionType(int line, int column, List<VariableDefinition> params, Type returnType) {
        super(line, column);
        this.args = new ArrayList<>();
        this.args.addAll(params);
        this.returnType = returnType;
    }

    @Override
    public String getName() {
        return "function with return " + returnType.getName();
    }

    public List<VariableDefinition> getArgs() {
        return args;
    }

    public Type getReturnType() {
        return returnType;
    }

    @Override
    public Type parenthesis(List<Expression> types, ASTNode ast) {
        // Checks the number of parameters and arguments match
        if (args.size() != types.size())
            return new ErrorType(ast.getLine(), ast.getColumn(), "(Invalid Call): This function doesn't " +
                    "have an invocation with " + types.size() + " parameters");
        for (int i = 0; i< getArgs().size(); i++){
            // Checks the parameters are valid
            if (types.get(i).getType() instanceof ErrorType)
                return types.get(i).getType();
            // Checks the parameters are of the correct type
            if (getArgs().get(i).getType() != types.get(i).getType())
                return new ErrorType(ast.getLine(), ast.getColumn(), "(Invalid Call): Expected " +
                        getArgs().get(i).getType().getName() + " and received a " + types.get(i).getType().getName());
        }
        return this;
    }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "FunctionType{" +
                "params=" + args +
                ", returnType=" + returnType +
                '}';
    }
}
