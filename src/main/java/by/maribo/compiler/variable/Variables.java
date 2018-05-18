package by.maribo.compiler.variable;

import java.util.*;

public class Variables {
    private int depth = -1;
    private Map<Integer, List<Variable>> variables = new HashMap<>();

    public void increase() {
        variables.put(++depth, new ArrayList<>());
    }

    public void decrease() {
        variables.remove(depth--);
    }

    public void put(Type type, String name) {
        Variable variable = new Variable(type, name);
        variables.get(depth).add(variable);
    }

    public Variable get(String name) {
        for (int index = depth; index > -1; index--) {
            for (Variable variable : variables.get(index)) {
                if (variable.getName().equals(name)) {
                    return variable;
                }
            }
        }
        throw new VariableNotFoundException();
    }
}