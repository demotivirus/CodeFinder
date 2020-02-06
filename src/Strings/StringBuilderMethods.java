package Strings;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("This is java. It's perfectly language everywhere. ");
        System.out.println(sb.append(10));
        System.out.println(sb);

        System.out.println(sb.append(" " + "Good. Go to next tips"));

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        System.out.println(sb.reverse());
        System.out.println(sb);

        System.out.println(sb.deleteCharAt(8));

        System.out.println(sb.reverse().replace(0, 40, "java"));

        System.out.println(sb.substring(0, 18));
    }
}
