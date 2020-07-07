package Patterns.Decorator.Example_01;

public class TreeDecorator implements ChristmasTree{
    private ChristmasTree christmasTree;

    public TreeDecorator(ChristmasTree christmasTree){
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return christmasTree.decorate();
    }
}
