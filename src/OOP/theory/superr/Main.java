package OOP.theory.superr;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Mia", 8);
        System.out.println(cat.getName());

        Cat kitty = new Cat("Leo", 1);
        System.out.println(cat.getName());
        System.out.println(kitty.getMyName());
    }
}
