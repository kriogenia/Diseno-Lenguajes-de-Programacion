package ast;

import ast.definitions.Definition;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Program extends AbstractASTNode {

    private List<Definition> definitions;

    public Program() {
        super(0,0);
        definitions = new ArrayList<>();
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }

    public void add(Definition def) {
        definitions.add(def);
    }

    public void addAll(List<Definition> defs) { definitions.addAll(defs); }

    @Override
    public <P, R> R accept(Visitor<P, R> visitor, P param) {
        return visitor.visit(this, param);
    }

}