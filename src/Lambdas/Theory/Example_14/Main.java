package Lambdas.Theory.Example_14;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        int xxx = 18;
        Integer xx = 19;
        BinaryOperator<Integer> bin = (x, y) -> {
            if (x <= 0) {
                //xxx += x; NOT EFFECTIVE FINAL
                //xx += x; TOO
                return 0;
            }
            else return x + y;
        };

        System.out.println(bin.apply(xxx, 16));

    }
}
