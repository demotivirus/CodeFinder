package Patterns.Brige.Example_03;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Square(new RedColor());
        System.out.println(shape.draw());

        shape = new Circle(new BlueColor());
        System.out.println(shape.draw());
    }
}
