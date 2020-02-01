package PrimitiveTypes;

public class Example_03 {
    public static void main(String[] args) {
        final double threshold = 0.0001;

        //прибавляем к нулю 0.1 одиннадцать раз подряд
        double f1 = .0;
        for (int i = 1; i <= 11; i++) {
            f1 += .1;
        }

        //Умножаем 0.1 на 11
        double f2 = .1 * 11;

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println(Math.abs(f1 + f2) > threshold);

        if (Math.abs(f1 - f2) < threshold)
            System.out.println("f1 и f2 равны");
        else
            System.out.println("f1 и f2 не равны");

        double x = Math.abs(f1 + f2);
        System.out.println(x);
        System.out.println(doubleExpression(f1, f2, x));
    }

    public static boolean doubleExpression(double a, double b, double c){
        double threshold = 0.0001;
        double res = Math.abs(a + b);
        boolean out = Math.abs(res - c) < threshold;
        return out;
    }
}
