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
    }

    @Override
    public int getValue() {

        return value;
    }

    // Current method is used for defining number of variables
    @Override
    public void initialize(ArrayDeque<Integer> variableValues) {

        if (variableValues.size() <= 1) {

            this.value = variableValues.getFirst();
        }
        else {

            this.value = variableValues.pop();
        }
    }
}
