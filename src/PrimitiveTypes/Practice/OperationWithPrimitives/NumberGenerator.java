package PrimitiveTypes.Practice.OperationWithPrimitives;

import java.util.Arrays;
import java.util.Random;

public class NumberGenerator {

    private Random random = new Random();
    private int[] saveNumbers;

    public int[] getRandomNumbers(){
        saveNumbers = randGen();
        return saveNumbers;
    }

    public void printNumbers(){
        System.out.println(Arrays.toString(saveNumbers));
    }

    private int[] randGen(){
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
        return arr;
    }
}
