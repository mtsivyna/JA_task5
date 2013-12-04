package Task_5;

import java.util.ArrayDeque;

/**
 * Created with IntelliJ IDEA.
 * User: mtsivyna
 * Date: 11/22/13
 * Time: 12:15 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Operations implements IValue {

    IValue [] arguments;
    public Operations (IValue... operations) {
        this.arguments = operations;
    }

    public static abstract class Operation implements IValue {
        protected final IValue[] arguments;
        public Operation(IValue... operations) {
            this.arguments = operations;
        }

        public int evaluate (int... params) {
            ArrayDeque<Integer> values = new ArrayDeque<Integer>(params.length);

            for (int i : params) {
                values.add(i);
            }
            initialize(values);
            return getValue;
        }
    }

}
