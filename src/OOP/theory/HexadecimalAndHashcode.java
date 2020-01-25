package OOP.theory;

public class HexadecimalAndHashcode {
    public static void main(String[] args) {
        HexadecimalAndHashcode hexadecimalAndHashcode = new HexadecimalAndHashcode();

        String str = hexadecimalAndHashcode.toString().substring(34);
        long substring = Long.parseLong(str, 16); //parse hexadecimal to octal
        int hash = hexadecimalAndHashcode.hashCode();
        boolean isTrue = substring == hash;
        System.out.println(isTrue);
    }
}
