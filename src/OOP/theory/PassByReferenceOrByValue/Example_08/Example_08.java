package OOP.theory.PassByReferenceOrByValue.Example_08;

import java.util.Arrays;

public class Example_08 {
    public static void main(String[] args) {
        int[] primitiveArr = {5, 5, 5, 5, 5};
        switchArr(primitiveArr);
        System.out.println(Arrays.toString(primitiveArr));

        StringBuilder[] mutableArr = {new StringBuilder("5"), new StringBuilder("5"),
                new StringBuilder("5"), new StringBuilder("5"), new StringBuilder("5")};
        switchArr(mutableArr);
        System.out.println(Arrays.toString(mutableArr));

        Cat[] cats = new Cat[]{new Cat("One"), new Cat("One"), new Cat("One")};
        switchArr(cats);
        System.out.println(Arrays.toString(cats));
    }

    public static void switchArr(int[] arr){
        arr = new int[]{10, 10, 10, 10, 10};
    }

    public static void switchArr(StringBuilder[] arr){
        arr = new StringBuilder[]{new StringBuilder("10"), new StringBuilder("10"),
                new StringBuilder("10"), new StringBuilder("10"), new StringBuilder("10")};
    }

    public static void switchArr(Cat[] cat){
        cat = new Cat[]{new Cat("Two")};
    }
}
