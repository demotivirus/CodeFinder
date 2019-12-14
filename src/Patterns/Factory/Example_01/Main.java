package Patterns.Factory.Example_01;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car toyota = factory.createCar("toyota");
        Car audi = factory.createCar("audi");

        toyota.drive();
        audi.drive();
    }
}
