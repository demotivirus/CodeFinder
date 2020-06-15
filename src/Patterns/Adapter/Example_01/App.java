package Patterns.Adapter.Example_01;

public class App {
    public static void main(String[] args) {
        Runner runner = new Runner(new IceRoadAdapter());
        runner.runOnTheRoad();
    }
}
