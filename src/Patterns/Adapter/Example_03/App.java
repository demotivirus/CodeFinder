package Patterns.Adapter.Example_03;

public class App {
    public static void main(String[] args) {
        MovableMPH bugatti = new Bugatti();
        MovableKmhAdapter adapter = new MovableKmhAdapter(bugatti);
        System.out.println(adapter.getSpeed() + " km/h");
    }
}
