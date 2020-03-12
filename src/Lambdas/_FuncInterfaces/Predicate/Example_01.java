package Lambdas._FuncInterfaces.Predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class Example_01 {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;
        Predicate<String> password = x -> x.equals("U02x83vsdE");
        Predicate<Boolean> isOnlyTrue = a -> true;
        Predicate<String> isEmpty = x -> x.length() > 0;
        Predicate<Boolean> nonNull = Objects::nonNull;

        System.out.println(isOnlyTrue.test(false));
        System.out.println(isPositive.test(50));

        int x = 10;
        while (isPositive.test(x)) {
            System.out.println("Java");
            x--;
        }
    }
}
