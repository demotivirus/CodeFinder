package PrimitiveTypes.Practice.OperationWithPrimitives;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        Operations op = new Operations();

        int[] randomNumbers = generator.getRandomNumbers(500, 2021);
        generator.printNumbers();

        op.printAllInfo(randomNumbers);
    }
}
