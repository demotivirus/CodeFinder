package OOP.theory.PassByReferenceOrByValue.Example_02;

import java.util.Arrays;

//Pass by value
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 5, 5};
        Example_02 ex = new Example_02();
        ex.replace(arr);
        System.out.println(Arrays.toString(arr));
        arr = ex.replace(arr); //Pass by value
        System.out.println(Arrays.toString(arr));
    }
}
