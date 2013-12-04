package Task_5;

/**
 * Created with IntelliJ IDEA.
 * User: mtsivyna
 * Date: 11/14/13
 * Time: 11:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class Minus {

    int difference;
    Times x;
    Const aConst;

    public Minus(Times x, Const aConst) {

        this.x = x;
        this.aConst = aConst;
    }

    public int evaluate(int xValue) {

        x.operation(xValue);
        difference = x.product - aConst.constant;
        return difference;
    }
}
