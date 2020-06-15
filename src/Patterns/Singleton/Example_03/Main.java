package Patterns.Singleton.Example_03;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10_000; i++) {
            System.out.println(Singleton.INSTANCE.hashCode());
        }
    }
}
