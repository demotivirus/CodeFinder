package Generics.Theory.Example_05;

import java.util.Arrays;

public class Box<T extends Number> {
    private T[] arr;

    public Box(T[] arr) {
        this.arr = arr;
    }

    public double average(){
        double res = 0.0;
        for (Number number : arr)
            res += number.doubleValue();
        return res / arr.length;
    }

    public boolean sameAverage(Box<?> box){
        if (average() == box.average())
            return true;
        return false;
    }

    public void printNumbers(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void addValue(T val){
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = val;
    }
}
