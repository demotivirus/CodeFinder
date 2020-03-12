package Lambdas.Theory.Example_06;

public class Main {
    public static void main(String[] args) {
        NumericTest isEven = n -> (n % 2) == 0;
        NumericTest isNegative = n -> (n < 0);

        System.out.println(isEven.test(69));
        System.out.println(isNegative.test(-5));
    }
}
