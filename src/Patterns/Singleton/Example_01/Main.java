package Patterns.Singleton.Example_01;

public class Main {
    public static void main(String[] args) {
        UniqueClass uniqueClass = UniqueClass.getUniqueClass();
        UniqueClass.getUniqueClass();
        UniqueClass.getUniqueClass();

        for (int i = 0; i < 1000; i++) {
            UniqueClass.getUniqueClass();
        }
    }
}
