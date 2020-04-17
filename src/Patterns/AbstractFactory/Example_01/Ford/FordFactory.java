package Patterns.AbstractFactory.Example_01.Ford;

import Patterns.AbstractFactory.Example_01.CarsFactory;
import Patterns.AbstractFactory.Example_01.Coupe;
import Patterns.AbstractFactory.Example_01.Sedan;

public class FordFactory implements CarsFactory {
    public Sedan createSedan(){
        return new FordSedan();
    }

    public Coupe createCoupe(){
        return new FordCoupe();
    }
}
