package OOP.theory.PassByReferenceOrByValue.Example_09;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 5, 5, 5, 5};
        switchParam(array);
        System.out.println(Arrays.toString(array));

        String[] strArr = {"One"};
        switchParam(strArr);
        System.out.println(Arrays.toString(strArr));

        String str = "One";
        switchParam(str);
        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder("One");
        switchParam(stringBuilder);
        System.out.println(stringBuilder);

        int x = 800;
        switchParam(x);
        System.out.println(x);

    }
    public static void switchParam(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] = 10);
        }
    }

    public static void switchParam(String[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = "Switch";
        }
    }

    private static void switchParam(String a) {
        a = "Two";
    }

    public static void switchParam(StringBuilder sb){
        sb.reverse();
    }

    public static void switchParam(int x){
        x = 999;
    }
}