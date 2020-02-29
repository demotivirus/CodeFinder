package Exceptions.theory;

public class Example_02 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if (i == 5)
                badMethod();
            goodMethod();
        }
    }

    private static void goodMethod(){
        System.out.println("OK.....");
    }

    private static void badMethod(){
        throw new NullPointerException();
    }
}
