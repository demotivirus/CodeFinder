package OOP.theory.Overloading;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAll(8, 9d);
        System.out.println(animal.toString());
    }
}
