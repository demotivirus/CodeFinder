package Lambdas._FuncInterfaces.Function;

import java.util.function.Function;

public class Example_01 {
    public static void main(String[] args) {
        Function<String, Integer> stringToInt = str -> {
            if (str.matches("[0-9]+"))
                return Integer.valueOf(str);
            else return 0;
        };

        System.out.println(stringToInt.apply("5"));
        System.out.println(stringToInt.apply("55"));
        System.out.println(stringToInt.apply("Hi"));

        Function<Integer, String> integerToString = String::valueOf;
        System.out.println("\"" + integerToString.apply(999) + "\"");
    }
}
