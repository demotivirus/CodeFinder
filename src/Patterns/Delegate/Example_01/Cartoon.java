package Patterns.Delegate.Example_01;

public class Cartoon{
    public static void main(String[] args) {
        Painter painter = new Painter();

        painter.setFigure(new Circle());
        painter.printFigure();
    }
}
