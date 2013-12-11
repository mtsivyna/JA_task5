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

    // Defining arguments
    public Operation(Value... operations) {

        this.arguments = operations;
    }

    public final int evaluate (int... paramVal) {

        // Creating queue of parameters
        ArrayDeque<Integer> valuesQueue = new ArrayDeque<Integer>(paramVal.length);

        for (int i : paramVal) {

            valuesQueue.add(i);
        }

        initialize(valuesQueue);
        return getValue();
    }

    // Init operation with current x
    @Override
    public final void initialize(ArrayDeque<Integer> variableValues) {

        for (Value value : arguments) {

            value.initialize(variableValues);
        }
    }
}
