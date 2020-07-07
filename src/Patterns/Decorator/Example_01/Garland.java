package Patterns.Decorator.Example_01;

public class Garland extends TreeDecorator{

    public Garland(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    private String decorateWithGarland(){
        return "With garland";
    }

    @Override
    public String decorate(){
        return super.decorate() + " " + decorateWithGarland();
    }
}
