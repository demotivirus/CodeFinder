package Patterns.AbstractFactory.Example_01;

import Patterns.AbstractFactory.Example_01.Ford.FordFactory;
import Patterns.AbstractFactory.Example_01.Toyota.ToyotaFactory;

public class Main {
    public static void main(String[] args) {
        ToyotaFactory toyotaFactory = new ToyotaFactory();
        toyotaFactory.createCoupe();
        toyotaFactory.createSedan();

        FordFactory fordFactory = new FordFactory();
        fordFactory.createCoupe();
        fordFactory.createSedan();

        CarsFactory factory = new ToyotaFactory();
        factory.createCoupe();
        factory = new FordFactory();
        factory.createSedan();
    }
}
