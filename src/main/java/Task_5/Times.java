package Task_5;

/**
 * Created with IntelliJ IDEA.
 * User: mtsivyna
 * Date: 11/14/13
 * Time: 11:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class Times extends Operation {

    public Times(Value... operations) {

        super(operations);
    }

    @Override
    public int getValue() {

        int result = arguments[0].getValue();

        for (int i = 1; i < arguments.length; i++) {

            result *= arguments[i].getValue();
        }

        return result;
    }
}
