package PrimitiveTypes;

public class Example_02 {
    public static void main(String[] args) {
        double  a = 2.0 - 1.1;
        System.out.println(a);
        
        double x = 1.0;

        for (int i = 0; i < 10; i++) {
            x += 0.1;
        }
        System.out.println(x);

        System.out.println(0.0 > Double.MIN_VALUE);

        System.out.println(Math.abs(2.0 - 1.1));
    }
}