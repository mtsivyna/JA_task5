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
            new Minus(
                new Times(
                    new Const(2),
                    new Variable("x")
                    ),
                new Const(4)
         ).evaluate(12));

        System.out.println(
            new Plus(
                new Minus(
                    new Times(
                        new Variable("x"),
                        new Variable("x")
                    ),
                    new Times(
                        new Const(-2),
                        new Variable("x")
                    )
                ),

                new Const(1)
            ).evaluate ());
    }


}
