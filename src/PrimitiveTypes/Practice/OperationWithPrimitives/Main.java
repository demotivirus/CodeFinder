package PrimitiveTypes.Practice.OperationWithPrimitives;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        Operations op = new Operations();

        int[] randomNumbers = generator.getRandomNumbers(50, 1001);
        generator.printNumbers();

        op.printAllInfo(randomNumbers);
    }
}
