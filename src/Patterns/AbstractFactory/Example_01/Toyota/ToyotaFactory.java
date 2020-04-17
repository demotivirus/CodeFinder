package Patterns.AbstractFactory.Example_01.Toyota;

import Patterns.AbstractFactory.Example_01.CarsFactory;
import Patterns.AbstractFactory.Example_01.Coupe;
import Patterns.AbstractFactory.Example_01.Sedan;

public class ToyotaFactory implements CarsFactory {
    public Sedan createSedan(){
        return new ToyotaSedan();
    }

    public Coupe createCoupe(){
        return new ToyotaCoupe();
    }
}