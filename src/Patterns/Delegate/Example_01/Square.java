package Patterns.Delegate.Example_01;

public class Square implements Figure{
    @Override
    public void printFigure() {
        System.out.println("Print square");
    }
}
