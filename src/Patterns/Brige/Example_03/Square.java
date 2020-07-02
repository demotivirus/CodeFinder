package Patterns.Brige.Example_03;

public class Square extends Shape{

    public Square(Color color){
        super(color);
    }

    @Override
    public String draw() {
        return "Square draw with " + color.fill().toLowerCase();
    }
}
