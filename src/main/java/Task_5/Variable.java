package Task_5;

import java.util.ArrayDeque;

/**
 * Created with IntelliJ IDEA.
 * User: mtsivyna
 * Date: 11/14/13
 * Time: 11:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class Variable implements Value {

    String name;
    private int value;

    Variable(String name) {

        this.name = name;
        System.out.println("Variable 1 " + name);
    }

    @Override
    public int getValue() {
        System.out.println("Variable 2 " + value);
        return value;
    }

    @Override
    public void initialize(ArrayDeque<Integer> variableValues) {

        this.value = variableValues.pop();
        System.out.println("Variable 3 " + value);

    }
}
