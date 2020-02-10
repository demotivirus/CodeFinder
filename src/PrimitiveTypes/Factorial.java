package PrimitiveTypes;

import java.math.BigInteger;

//1 * 2 * 3 * 4 * 5 * 6 * ... =
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(6));
        System.out.println(recursFactorial(6));
        System.out.println(bigFactorial(100));
        System.out.println(bigRecFactorial(100));
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; ++i)
            fact *= i;
        return fact;
    }

    public static int recursFactorial(int n){
        if (n == 0) return 1;
        return recursFactorial(n - 1) * n;
    }

    public static BigInteger bigFactorial(int n){
        BigInteger big = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            big = big.multiply(BigInteger.valueOf(i));
        return big;
    }

    public static BigInteger bigRecFactorial(int n){
        if (n == 0) return BigInteger.ONE;
        return bigRecFactorial(n - 1).multiply(BigInteger.valueOf(n));
    }
}
