package OOP.theory.PassByReferenceOrByValue.Example_07;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Mia");
        Cat cat2 = cat;
        System.out.println(cat2.getName());
        cat.setName("Leo");
        System.out.println(cat2.getName());

        int x = 6;
        int y = x;
        x = 10;
        System.out.println(y);
        switchPrimitive(x);
        System.out.println(x);

        switchCat(cat);
        System.out.println(cat.getName());

        int[] arr = {5, 5, 5, 5, 5,};
        switchArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int switchPrimitive(int x){
        return x *= 2;
    }

    public static void switchCat(Cat cat222){
        cat222.setName("Switch!");
    }

    public static int[] switchArr(int[] array){
        return array = new int[] {1, 1, 1, 1, 1};
    }
}
