package Patterns.AbstractFactory.Example_01;

public interface CarsFactory {
    Coupe createCoupe();
    Sedan createSedan();
}