package Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String java = "This is java. It's perfectly language everywhere. ";
        java.replaceAll("a", "b");
        System.out.println(java);

        System.out.println(java.replaceAll("a", "b"));
        System.out.println(java.replace("y", "x"));
        System.out.println(java.replaceAll(" ", ""));

        char[] chars = java.toCharArray();
        System.out.println(chars);

        System.out.println(java.toLowerCase());

        int hash = java.hashCode();
        System.out.println(hash);

        System.out.println((java.length() == chars.length) + " " + java.length());

        System.out.println(java.trim());

        System.out.println(java.substring(0, 18));

        System.out.println(java.codePointAt(0));

        System.out.println(java.indexOf("a"));
        System.out.println(java.lastIndexOf("a"));

        String[] strings = java.split(" ");
        System.out.println(Arrays.toString(strings));

        System.out.println(java.contains("lang"));

        System.out.println(java.join("+ ", java, "Good luck!"));
    }
}
