package Patterns.Decorator.Example_01;

public class BubbleLights extends TreeDecorator{

    public BubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    private String decorateWithBubbleLights(){
        return "With bubble lights";
    }

    @Override
    public String decorate(){
        return super.decorate() + " " + decorateWithBubbleLights();
    }
}
