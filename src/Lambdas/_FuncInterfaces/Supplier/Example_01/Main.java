package Lambdas._FuncInterfaces.Supplier.Example_01;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<User> userFactory = () -> {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter name: ");
            String str = scn.nextLine();
            return new User(str);
        };

        User user = userFactory.get();

        System.out.println(user.getName());

        Supplier<User> newUser = User::new;
        User user1 = newUser.get();
        user1.setName("Jhon");
        System.out.println(user1.getName());
    }
}
