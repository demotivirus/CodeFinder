package PrimitiveTypes.Practice.OperationWithPrimitives;

import javax.crypto.spec.PSource;
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
        eratosfen(arr);
        luckyNumbers(arr);
        fibonacciNumbers(arr);
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

        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] != 0) {
                res[position] = arr[i];
                position++;
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

        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 9 == 0 && arr[i] != 0) {
                res[position] = arr[i];
                position++;
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

        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0 && arr[i] % 7 == 0 && arr[i] != 0) {
                res[position] = arr[i];
                position++;
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

        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 100 && arr[i] < 1000) {
                res[position] = arr[i];
                position++;
            }
        }
        System.out.println("All 3 length numbers " + Arrays.toString(res));
    }

    public void printAll3LengthSameNumbers(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 100 && arr[i] < 1000)
                if (arr[i] / 100 == arr[i] / 10 % 10) //762 = 7 == 6 ?
                    if (arr[i] / 10 % 10 == arr[i] % 10) //773 7 == 3 ?
                        count++;
        }

        int[] res = new int[count];

        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 100 && arr[i] < 1000)
                if (arr[i] / 100 == arr[i] / 10 % 10)
                    if (arr[i] / 10 % 10 == arr[i] % 10){
                        res[position] = arr[i];
                        position++;
                    }
        }
        System.out.println("All 3 length SAME numbers " + Arrays.toString(res));
    }

    public void eratosfen(int[] arr){
        //printBubbleSortUp(arr);
        System.out.print("Simple numbers by Eratosfen: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] != 1 || arr[i] == 2)
                if (arr[i] % 3 != 0 || arr[i] == 3)
                    if (arr[i] % 5 != 0 || arr[i] == 5)
                        if (arr[i] % 7 != 0 || arr[i] == 7)
                            if (arr[i] % 11 != 0 || arr[i] == 11)
                                if (arr[i] % 13 != 0 || arr[i] == 13)
                                    if (arr[i] % 17 != 0 || arr[i] == 17)
                                        if (arr[i] % 19 != 0 || arr[i] == 19)
                                            if (arr[i] % 23 != 0 || arr[i] == 23)
                                                if (arr[i] % 29 != 0 || arr[i] == 29)
                                                    System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void luckyNumbers(int[] arr){
//        System.out.print("Lucky numbers: ");
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0 || arr[i] == 2)
//                if (arr[i] % 3 != 0 || arr[i] == 3)
//                        if (arr[i] % 7 != 0 || arr[i] == 7)
//                            if (arr[i] % 9 != 0 || arr[i] == 9)
//                                if (arr[i] % 13 != 0 || arr[i] == 13)
//                                    if (arr[i] % 15 != 0 || arr[i] == 15)
//                                        if (arr[i] % 21 != 0 || arr[i] == 21)
//                                            if (arr[i] % 25 != 0 || arr[i] == 25)
//                                                if (arr[i] % 31 != 0 || arr[i] == 31)
//                                                    System.out.print(arr[i] + " ");
//        }
//        System.out.println();
    }

    private int fib(int n) {
        if (n <= 1) return n;
        else return fib(n - 1) + fib(n - 2);
    }

    public void fibonacciNumbers(int[] arr){
        int[] fibonacciNumbers = new int[20];
        for (int i = 0; i < 20; i++) {
            fibonacciNumbers[i] = fib(i);
        }

        System.out.print("Fibonacci numbers: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < fibonacciNumbers.length; j++) {
                if (arr[i] == fibonacciNumbers[j])
                    System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
