package Exceptions.theory;

import java.io.IOException;

public class Example_07 extends IOException {
    public static void main(String[] args) throws Example_07 {
        throw new Example_07("Test exception");
    }

    private static String name;

    public Example_07(String name) {
        this.name = name;
    }

    public static void printMessage() throws Example_07 {
        //System.err.println("This exception in Example_07 " + name);
        throw new Example_07(name);
    }


}
