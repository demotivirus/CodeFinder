package Streams.Theory.Example_03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>(){{
           add(new User(0, "Jhon", 42, "man"));
           add(new User(1, "Philipp", 24, "man"));
           add(new User(2, "Sarah", 23, "women"));
           add(new User(3, "Katrin", 36, "women"));
           add(new User(4, "Adam", 77, "men"));
           add(new User(5, "Samanta", 65, "women"));
        }};

        List<User> sortsByName = sortUserByName(users);
        System.out.println(sortsByName);

        System.out.println("==================================================");

        List<User> sortsByAge = sortUserByAge(users);
        System.out.println(sortsByAge);
    }

    public static List<User> sortUserByName(List<User> users){
        List<User> sort = users.stream()
                .sorted(Comparator.comparing(User::getName))
                .collect(Collectors.toList());
        return sort;
    }

    public static List<User> sortUserByAge(List<User> users){
        List<User> sort = users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());
        return sort;
    }
}
