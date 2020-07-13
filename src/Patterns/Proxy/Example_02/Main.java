package Patterns.Proxy.Example_02;

public class Main {
    public static void main(String[] args) {
        DBExecuter user1 = new DBProxy("sdfsdf", "sdfsdfsdf");
        user1.createQuery("SELECT * FROM Users");
        user1.createQuery("DELETE");

        System.out.println("========================");
        DBExecuter user2 = new DBProxy("admin", "admin");
        user2.createQuery("DELETE");
    }
}
