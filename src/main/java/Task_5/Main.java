package Task_5;

/**
 * Created with IntelliJ IDEA.
 * User: mtsivyna
 * Date: 11/14/13
 * Time: 11:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main (String[] args) {

        System.out.println(
                new Division(
                    new Const(24),
                    new Variable("x")
                    ).evaluate(5, 2));
    }
}
