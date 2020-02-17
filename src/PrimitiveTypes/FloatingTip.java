package PrimitiveTypes;

public class FloatingTip {
    public static void main(String[] args) {

        double x = 1_000_000.000_754_678d;
        double y = 1_000_000_000.754_678d;

        long ex = 999_999;
        float fl = (float) ex;

        System.out.println(x);
        System.out.println(y);

        System.out.println(fl);
    }
}
