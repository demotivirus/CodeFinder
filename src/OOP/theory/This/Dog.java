package OOP.theory.This;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
        this.name = "Dog";
        this.age = 0;
    }
}
