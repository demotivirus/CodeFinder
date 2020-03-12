package Lambdas.Theory.Example_05;

public class Main {
    public static void main(String[] args) {
        Operationable<String> concat = (x, y) -> x + y;
        Operationable<Integer> sum = ((x, y) -> x + y);

        System.out.println(concat.calculate("Ja", "va"));
        System.out.println(sum.calculate(2, 8));
    }
}
