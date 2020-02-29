package Exceptions.theory;

public class Example_05 {
    public static void main(String[] args) {
        try {
            System.exit(0);
        } finally {
            System.out.println("This message don't print");
        }
    }
}
