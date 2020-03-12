package Lambdas._FuncInterfaces.Consumer;

import java.util.function.Consumer;

public class Example_01 {
    public static void main(String[] args) {
        Consumer<Integer> printer = x -> System.out.println(x + " dollars");
        Consumer<String> hello = str -> System.out.println("Hello " + str);

        printer.accept(600);
        hello.accept("Luke Skywalker");
    }
}
