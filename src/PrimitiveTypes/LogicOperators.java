package PrimitiveTypes;

public class LogicOperators {
    public static void main(String[] args) {

        /*
         * AND
         * &&
         * if 1 false - all false
         */

        boolean x = false;
        boolean y = true;
        boolean res = x && y;

        System.out.println(res);

        /*
         * OR
         * ||
         * if 2 false - false
         */

        res = x || x;

        System.out.println(res);

        /*
         * XOR (NOT OR)
         * ^
         * if only 1 variable is true - true
         */

        res = y ^ y ^ x ^ x;

        System.out.println(res);

        res = x ^ y ^ y ^ y;

        System.out.println(res);

        /*
         * NOT
         * reverse: false is true, true is false
         */

        res = !x;

        System.out.println(res);
    }
}
