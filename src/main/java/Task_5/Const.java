package Task_5;

import java.util.ArrayDeque;

/**
 * Created with IntelliJ IDEA.
 * User: mtsivyna
 * Date: 11/14/13
 * Time: 11:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class Const implements IValue{

    private final int value;
    Const(int value) {

        this.value = value;
    }

    @Override
    public int getValue() {

        return value;
    }

    @Override
    public void initialize(ArrayDeque<Integer> variableValues) {

        //To change body of implemented methods use File | Settings | File Templates.
    }


}
