package Patterns.Delegate.Example_01;

public class Painter {
    private Figure figure;

    public void setFigure(Figure figure){
        this.figure = figure;
    }

    public void printFigure(){
        figure.printFigure();
    }
}
