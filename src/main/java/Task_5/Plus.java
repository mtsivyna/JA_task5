package Task_5;

/**
 * Created with IntelliJ IDEA.
 * User: mtsivyna
 * Date: 11/14/13
 * Time: 11:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class Plus extends Operation {

        Plus(IValue... operations) {
            super(operations);
        }

        @Override
        public int getValue() {
            if (arguments.length != 2)
                throw new IllegalArgumentException();
            return arguments[0].getValue() + arguments[1].getValue();
        }

}
