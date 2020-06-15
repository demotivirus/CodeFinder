package Patterns.Singleton.Example_02;

public class App {
    public static void main(String[] args) {

        for (int i = 0; i < 10_000; i++) {
            Singleton singleton = Singleton.getInstance();
        }
    }
}
