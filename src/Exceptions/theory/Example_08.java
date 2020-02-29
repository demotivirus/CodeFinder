package Exceptions.theory;

public class Example_08 {
    public static void main(String[] args) {
        try{
            throw new NullPointerException("In try");
        } finally {
            throw new OutOfMemoryError(Example_08.class.getName() + " in finally");
        }
    }
}
