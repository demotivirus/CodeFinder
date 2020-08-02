package PrimitiveTypes.Practice.OperationWithPrimitives;

import java.util.Arrays;

public class Operations {

    public void printAllInfo(int[] arr){
        System.out.println("==================================================================");
        printEven(arr);
        printOdd(arr);
        System.out.println("==================================================================");
        printMin(arr);
        printMax(arr);
        System.out.println("==================================================================");
        printNumDivisionTo3(arr);
        printNumDivisionTo9(arr);
        printNumDivision5And7(arr);
        System.out.println("==================================================================");
        printBubbleSortUp(arr);
        printBubbleSortDown(arr);
        System.out.println("==================================================================");
        printAll3LengthNumbers(arr);
        printAll3LengthSameNumbers(arr);
        System.out.println("==================================================================");
    }

    public void printEven(int[] arr) {
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

    public void printOdd(int[] arr) {
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

    public void printMin(int[] arr) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (res > arr[i]){
                //System.out.println(res);
                res = arr[i];
                //System.out.println("---> " + res);
            }
        }
        System.out.println("Min number is " + res);
    }

    public void printMax(int[] arr){
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (res < arr[i])
                res = arr[i];
        }
        System.out.println("Max number is " + res);
    }

    public void printNumDivisionTo3(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] != 0)
                count++;
        }

        int[] res = new int[count];

        int point = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] != 0) {
                res[point] = arr[i];
                point++;
            }
        }
        System.out.println("Numbers division to 3 " + Arrays.toString(res));
    }

    public void printNumDivisionTo9(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 9 == 0 && arr[i] != 0)
                count++;
        }

        int[] res = new int[count];

        int point = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 9 == 0 && arr[i] != 0) {
                res[point] = arr[i];
                point++;
            }
        }
        System.out.println("Numbers division to 9 " + Arrays.toString(res));
    }

    public void printNumDivision5And7(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0 && arr[i] % 7 == 0 && arr[i] != 0)
                count++;
        }

        int[] res = new int[count];

        int point = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0 && arr[i] % 7 == 0 && arr[i] != 0) {
                res[point] = arr[i];
                point++;
            }
        }
        System.out.println("Numbers division 5 and 7 " + Arrays.toString(res));
    }

    public void printBubbleSortUp(int[] arr){
        int res = arr.length;
        for (int i = 0; i < res-1; i++) {
            for (int j = 0; j < res-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("Sort to up " + Arrays.toString(arr));
    }

    public void printBubbleSortDown(int[] arr){
        int res = arr.length;
        for (int i = 0; i < res-1; i++) {
            for (int j = 0; j < res-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("Sort to down " + Arrays.toString(arr));
    }

    public void printAll3LengthNumbers(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 100 && arr[i] < 1000)
                count++;
        }

        int[] res = new int[count];

        int point = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 100 && arr[i] < 1000) {
                res[point] = arr[i];
                point++;
            }
        }
        System.out.println("All 3 length numbers " + Arrays.toString(res));
    }

    public void printAll3LengthSameNumbers(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 100 && arr[i] < 1000)
                if (arr[i] / 100 == arr[i] / 10 % 10)
                    if (arr[i] / 10 % 10 == arr[i] % 10)
                        count++;
        }

        int[] res = new int[count];

        int point = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 100 && arr[i] < 1000)
                if (arr[i] / 100 == arr[i] / 10 % 10)
                    if (arr[i] / 10 % 10 == arr[i] % 10){
                        res[point] = arr[i];
                        point++;
                    }

        }
        System.out.println("All 3 length SAME numbers " + Arrays.toString(res));
    }
}
