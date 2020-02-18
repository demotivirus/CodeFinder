package OOP.theory.PassByReferenceOrByValue.Example_06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 5, 5};
        Example_06 ex = new Example_06(arr);
        System.out.println(Arrays.toString(ex.getArr()));
        ex.switchArray();
        System.out.println(Arrays.toString(ex.getArr()));
    }
}
