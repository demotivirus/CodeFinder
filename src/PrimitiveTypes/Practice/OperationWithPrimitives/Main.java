package PrimitiveTypes.Practice.OperationWithPrimitives;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        Operations op = new Operations();

        int[] randomNumbers = generator.getRandomNumbers();
        generator.printNumbers();

        op.getEven(randomNumbers);
        op.getOdd(randomNumbers);
    }
}
