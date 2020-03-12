package Lambdas.Theory.Example_04;

public class Main {
    public static void main(String[] args) {
        Operationable sum = (x, y) -> x + y;
        Operationable multy = (x, y) -> x * y;

        System.out.println(sum.calculate(10, 20));
        System.out.println(multy.calculate(20, 22));
    }
}
