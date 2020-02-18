package OOP.theory.PassByReferenceOrByValue.Example_01;

import java.util.Arrays;

//STATIC PASS
public class Example_01 {
    static int[] arr = {5, 5, 5, 5, 5};
    public static void main(String[] args) {
        replace(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] replace(int[] array){
        return arr = new int[]{10, 10, 10, 10, 10};
    }
}
