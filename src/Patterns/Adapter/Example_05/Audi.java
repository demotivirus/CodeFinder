package Patterns.Adapter.Example_05;

public class Audi implements Car{
    @Override
    public void wash() {
        System.out.println("Audi wash");
    }
}
