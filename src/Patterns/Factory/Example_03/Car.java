package Patterns.Factory.Example_03;

public class Car implements Transport{
    public Car(){
        System.out.println("The car create");
    }
    @Override
    public void move() {
        System.out.println("The car move");
    }
}
