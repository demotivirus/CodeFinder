package Patterns.Composite.Example_02;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        Composite composite1 = new Composite();
        composite1.addComponent(circle);
        composite1.addComponent(triangle);
        composite1.draw();

        Composite composite2 = new Composite();
        composite2.addComponent(composite1);
        composite2.addComponent(square);
        composite2.draw();
    }
}
