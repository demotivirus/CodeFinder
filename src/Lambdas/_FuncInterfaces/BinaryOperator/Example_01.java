package Lambdas._FuncInterfaces.BinaryOperator;

import java.util.function.BinaryOperator;

public class Example_01 {
    public static void main(String[] args) {
        BinaryOperator<Integer> sqrt = (x, y) -> x * y;

        System.out.println(sqrt.apply(4, 18));
    }
}
