package PrimitiveTypes;

public class BitOperations {
    public static void main(String[] args) {

        System.out.println("=============NOT==============");
        int x = 666;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println(~x);
        System.out.println(Integer.toBinaryString(~x));

        //1 & 1 = 1
        System.out.println("==============AND==============");
        int y = 777;
        System.out.println(y);
        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println("y = " + Integer.toBinaryString(y));
        System.out.println(x & y);
        System.out.println("    " + Integer.toBinaryString(x & y));

        //0 & 0 = 0
        System.out.println("==============OR==============");
        System.out.println(y);
        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println("y = " + Integer.toBinaryString(y));
        System.out.println(x | y);
        System.out.println("    " + Integer.toBinaryString(x | y));
        System.out.println(y | x);
        //System.out.println(Integer.toBinaryString(y | x));

        //if different values = 1
        //if equals values = 0
        System.out.println("==============XOR==============");
        System.out.println(y);
        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println("y = " + Integer.toBinaryString(y));
        System.out.println(x ^ y);
        System.out.println("     " + Integer.toBinaryString(x ^ y));

        System.out.println("==============SHIFT >>==============");
        y = 200;
        x = 2;
        System.out.println(y);
        System.out.println("y = " + Integer.toBinaryString(y));
        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println(y >> x);
        System.out.println("      " + Integer.toBinaryString(y >> x));

        System.out.println("==============<< SHIFT==============");
        System.out.println(y);
        System.out.println("y = " + Integer.toBinaryString(y));
        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println(y << x);
        System.out.println("    " + Integer.toBinaryString(y << x));

        System.out.println("==============SHIFT >>>==============");
        System.out.println(y);
        System.out.println("y = " + Integer.toBinaryString(y));
        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println(y >>> x);
        System.out.println("      " + Integer.toBinaryString(y >>> x));
    }
}
