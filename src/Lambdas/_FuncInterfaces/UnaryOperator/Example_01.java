package Lambdas._FuncInterfaces.UnaryOperator;

import java.util.function.UnaryOperator;

public class Example_01 {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOneHundred = x -> x * 100;

        System.out.println(unaryOneHundred.apply(18));
    }
}
