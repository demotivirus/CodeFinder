package OOP.theory.This;

public class Animal {
    protected String name;
    protected int age;

    public void setName(String name){
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(){
        this("Animal", 0);
    }
}
