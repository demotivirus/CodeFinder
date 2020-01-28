package PrimitiveTypes;

import java.util.Arrays;

public class StringToChar {
    public static void main(String[] args) {
        String greetings = "Hello my friends!";
        char[] chars = greetings.toCharArray();

        System.out.println(Arrays.toString(chars));
    }
}
