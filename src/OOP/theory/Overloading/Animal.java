package OOP.theory.Overloading;

import java.beans.Transient;

public class Animal {
    private String name;
    private int age;
    private double weight;

    public void setAll(String name){
        this.name = name;
    }

    public void setAll(int age){
        this.age = age;
    }

    public void setAll(double weight){
        this.weight = weight;
    }

    public String setAll(String name, int age){
        this.name = name;
        this.age = age;
        return name + " " + age;
    }

    public Double setAll(String name, double weight){
        this.name = name;
        this.weight = weight;
        return weight;
    }

    public Double setAll(int age, double weight){
        this.age = age;
        this.weight = weight;
        return weight;
    }

    @Deprecated @Transient
    private final static void setAll(int age, String name, double weight) throws Exception{

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
