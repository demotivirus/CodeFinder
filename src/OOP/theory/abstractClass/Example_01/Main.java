package OOP.theory.abstractClass.Example_01;

public class Main {
    public static void main(String[] args) {
        Animal crocodile = new Crocodile("Dory", 18, 290);
        System.out.println(crocodile.toString());
        System.out.println("Age = " + crocodile.getAge());
        System.out.println("Weight = " + ((Crocodile) crocodile).getWeight());

        Crocodile alligator = (Crocodile) crocodile;

        System.out.println("Weight = " + alligator.getWeight());

        Animal defaultCrocodile = new Crocodile();
        System.out.println(defaultCrocodile.toString());
    }
}
