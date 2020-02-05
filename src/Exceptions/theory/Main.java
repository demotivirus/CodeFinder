package Exceptions.theory;

public class Main {
    public static void main(String[] args) throws MyNewException{
        testExp();
    }

    public static void testExp() throws MyNewException{
        throw new MyNewException();
    }
}
