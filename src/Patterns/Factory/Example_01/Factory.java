package Patterns.Factory.Example_01;

public class Factory {
    public Car createCar(String typeCar){
        if (typeCar.equalsIgnoreCase("Toyota"))
            return new Toyota();
        else if (typeCar.equalsIgnoreCase("Audi"))
            return new Audi();
        else return null;
    }
}
