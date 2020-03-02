package ast;

import ast.definitions.Definition;

import java.util.ArrayList;
import java.util.List;

public class Program {

    private List<Definition> definitions;

    public Program() {
        definitions = new ArrayList<>();
    }

    public void add(Definition def) {
        definitions.add(def);
    }

    public void addAll(List<Definition> defs) { definitions.addAll(defs); }
}
