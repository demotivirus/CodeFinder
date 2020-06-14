package Patterns.Builder.Example_02;

import java.util.Set;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private Set<Person> parents;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Set<Person> getParents() {
        return parents;
    }

    public static class Builder{
        private Person person;

        public Builder(){
            person = new Person();
        }

        public Builder name(String name){
            person.name = name;
            return this;
        }

        public Builder surname(String surname){
            person.surname = surname;
            return this;
        }

        public Builder age(int age){
            person.age = age;
            return this;
        }

        public Builder height(int height){
            person.height = height;
            return this;
        }

        public Builder weight(int weight){
            person.weight = weight;
            return this;
        }

        public Builder parents(Set<Person> parents){
            person.parents = parents;
            return this;
        }

        public Person build(){
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", parents=" + parents +
                '}';
    }
}
