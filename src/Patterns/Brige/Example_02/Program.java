package Patterns.Brige.Example_02;

public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer){
        this.developer = developer;
    }

    public abstract void developProgram();
}
