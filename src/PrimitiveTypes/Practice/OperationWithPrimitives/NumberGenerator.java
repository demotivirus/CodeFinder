package PrimitiveTypes.Practice.OperationWithPrimitives;

import java.util.Arrays;
import java.util.Random;

public class NumberGenerator {

    private Random random = new Random();
    private int[] saveNumbers;

    public int[] getRandomNumbers(int numbers, int seed){
        saveNumbers = randGen(numbers, seed);
        return saveNumbers;
    }

    public void printNumbers(){
        System.out.println("All numbers " + Arrays.toString(saveNumbers));
    }

    private int[] randGen(int numbers, int seed){
        int[] arr = new int[numbers];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(seed);
        }
        return arr;
    }
}
