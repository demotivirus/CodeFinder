package Generics.Theory.Example_05;

public class Main {
    public static void main(String[] args) {
        Box<Integer> boxIntegers = new Box<>(new Integer[]{5, 6, 7, 8});
        Box<Short> boxShorts = new Box<>(new Short[]{5, 6, 7, 8});
        Box<Double> boxDoubles = new Box<>(new Double[]{5.0, 6.0, 7.0, 8.0});
        Box<Number> boxNumbers = new Box<>(new Number[]{5, 6, 7, 8});

        System.out.println(boxIntegers.sameAverage(boxDoubles));
        System.out.println(boxDoubles.sameAverage(boxNumbers));

        boxNumbers.printNumbers();
        boxNumbers.addValue(9);
        boxNumbers.printNumbers();
    }
}
