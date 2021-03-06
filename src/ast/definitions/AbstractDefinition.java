package ast.definitions;

import ast.types.Type;
import ast.AbstractASTNode;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {

    String name;
    Type type;

    int scope;

    public AbstractDefinition(int line, int column, String name, Type type) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    public String getName() { return name;  }

    public Type getType() { return type; }

    public int getScope() { return this.scope; }

    public void setScope(int scope) { this.scope = scope; }

}