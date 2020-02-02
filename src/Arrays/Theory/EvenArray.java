package Arrays.Theory;

import java.util.Arrays;

public class EvenArray {
    public static void main(String[] args) {
        String res = Arrays.toString(evenArray(10));
        System.out.println(res);
    }

      public static int[] evenArray(int number) {
        int[] arr = new int[number / 2];
        int fillArray = 0;
        for (int i = 0; i <= number; i++) {

            if (i == 0) continue;
            if (i % 2 == 0){
                arr[fillArray] = i;
                //System.out.println(arr[fillArray]);
                fillArray++;
            }
        }
        return arr;
    }
}
