package Task_5;

import java.util.ArrayDeque;

/**
 * Created with IntelliJ IDEA.
 * User: mtsivyna
 * Date: 11/22/13
 * Time: 12:15 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Operation implements Value {

    protected final Value[] arguments;

    // Current operations
    public Operation(Value... operations) {

        this.arguments = operations;
        System.out.println("val"+arguments[1]);
    }

    public final int evaluate (int... paramVal) {

        // Creating queue of parameters
        ArrayDeque<Integer> valuesQueue = new ArrayDeque<Integer>(paramVal.length);

        for (int i : paramVal) {

            valuesQueue.add(i);
        }
        System.out.println(valuesQueue);
        initialize(valuesQueue);
        return getValue();
    }

    @Override
    public final void initialize(ArrayDeque<Integer> variableValues) {

        for (Value value : arguments) {

            value.initialize(variableValues);
            System.out.println("val"+value);
        }
    }
}
