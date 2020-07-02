package Patterns.Brige.Example_03;

public class Circle extends Shape{

    public Circle(Color color){
        super(color);
    }

    @Override
    public String draw() {
        return "Circle draw with " + color.fill().toLowerCase();
    }
}
