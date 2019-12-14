package Patterns.Delegate.Example_01;

public class Triangle implements Figure{
    @Override
    public void printFigure() {
        System.out.println("Print triangle");
    }
}
