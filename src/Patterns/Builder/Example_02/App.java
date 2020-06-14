package Patterns.Builder.Example_02;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Person Jhon = new Person.Builder()
                .name("Jhon")
                .age(18)
                .parents(new HashSet<Person>(){{
                    add(new Person.Builder().name("Sarah").age(48).build());
                    add(new Person.Builder().name("Mike").age(56).build());
                }})
                .weight(64)
                .build();

        System.out.println(Jhon);
    }
}
