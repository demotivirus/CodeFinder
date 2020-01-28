package Arrays;

import java.util.Arrays;

public class AllCharsArray {
    public static void main(String[] args) {
        char[] arr = new char[Character.MAX_VALUE];

        for (int i = 0; i < arr.length; i++) {
            char x = (char) i;
            arr[i] = x;
        }

        //System.out.println(Arrays.toString(arr));
        System.out.println(arr);
    }
}
