package Lambdas.Example_01;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        MyFunc func = () -> 2 * 2;
        System.out.println(func.getValue());

    }

    public UnaryOperator<Integer> square(){
        UnaryOperator<Integer> square = x -> x * x;
        return square;
    }
}
