package OOP.theory.instanceoff;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Pitbull pitbull = new Pitbull();
        Table table = new Table();

        System.out.println(dog instanceof Animal);
        System.out.println(pitbull instanceof Pitbull);

        //FALSE
        System.out.println(dog instanceof Pitbull);

        //Ex: incorrect type
        //System.out.println(table instanceof Animal);

        System.out.println(table instanceof Table);
    }
}
