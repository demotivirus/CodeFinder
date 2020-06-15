package Patterns.Factory.Example_03;

public class Helicopter implements Transport{
    public Helicopter(){
        System.out.println("Helicopter create");
    }
    @Override
    public void move() {
        System.out.println("The helicopter fly");
    }
}
