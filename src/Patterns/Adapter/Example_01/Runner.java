package Patterns.Adapter.Example_01;

public class Runner {
    private Road road;

    public Runner(Road road){
        this.road = road;
    }

    public void runOnTheRoad(){
        System.out.println("Start run");
        road.run();
        System.out.println("Finish run");
    }
}
