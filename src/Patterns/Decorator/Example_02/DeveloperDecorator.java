package Patterns.Decorator.Example_02;

public class DeveloperDecorator implements Developer{
    private Developer developer;

    public DeveloperDecorator(Developer developer){
        this.developer = developer;
    }

    @Override
    public String writeCode() {
        return developer.writeCode();
    }
}
