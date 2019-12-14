package Patterns.Delegate.Example_01;

public class Circle implements Figure{
    @Override
    public void printFigure() {
        System.out.println("Print circle");
    }
}
