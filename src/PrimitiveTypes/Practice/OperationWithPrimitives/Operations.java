package PrimitiveTypes.Practice.OperationWithPrimitives;

import java.util.Arrays;

public class Operations {
    public void getEven(int[] arr) {
        //Get array length
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                count++;
        }

        int[] res = new int[count];

        //Arraylist! Magic in point :)
        int point = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                res[point] = arr[i];
                point++;
            }
        }
        System.out.println("Even numbers " + Arrays.toString(res));
    }

    public void getOdd(int[] arr) {
        //Get array length
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1)
                count++;
        }

        int[] res = new int[count];

        //Arraylist! Magic in point :)
        int point = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                res[point] = arr[i];
                point++;
            }
        }
        System.out.println("Odd numbers " + Arrays.toString(res));
    }
}
