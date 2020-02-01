package PrimitiveTypes;

public class Example_05 {
    public static void main (String[] args) {
        System.out.println(isPowerOfTwo(32));
        System.out.println(Math.pow(2, 40));

        System.out.println(isPowerOfTwo2(4));
    }

    public static boolean isPowerOfTwo(int value) {

        return Integer.bitCount(Math.abs(value)) == 1;
    }

    public static boolean isPowerOfTwo2(int value) {
        boolean isTrue = false;
        for (int i = 0; i < 100; i++) {
            if(Math.abs(value) == Math.pow(2, i))
                isTrue = true;
        }
        return isTrue;
    }
}
