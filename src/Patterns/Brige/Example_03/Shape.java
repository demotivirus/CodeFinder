package Patterns.Brige.Example_03;

public abstract class Shape {
    protected Color color;

    public Shape(){}

    public Shape(Color color){
        this.color = color;
    }

    public abstract String draw();
}
