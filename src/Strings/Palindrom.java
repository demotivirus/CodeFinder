package Strings;

import java.util.Arrays;

public class Palindrom {
    public static void main(String[] args) {
        String str = "Was it a cat I saw?".toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String str2 = new StringBuilder(str).reverse().toString();
        System.out.println(str2);
        System.out.println(str.equalsIgnoreCase(str2));

    }

    public static boolean isPalindrome(String text) {
        String str = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String str2 = new StringBuilder(str).reverse().toString();
        boolean res = str.equals(str2);
        return res;
    }
}
