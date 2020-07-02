package Patterns.Composite.Example_02;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape{
    private List<Shape> composits;

    public Composite(){
        composits = new ArrayList<>();
    }

    public void addComponent(Shape shape){
        composits.add(shape);
    }

    public void removeComponent(Shape shape){
        composits.remove(shape);
    }

    public void draw(){
        for (Shape shape : composits){
            shape.draw();
        }
        System.out.println("=================");
    }
}
