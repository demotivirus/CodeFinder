package Exceptions.theory;

public class Example_01 {
    public static void main(String[] args) {
        System.out.println(sqrt(-18));
    }

    public static double sqrt(double x){
        if(x < 0)
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        return Math.sqrt(x);
    }
}
