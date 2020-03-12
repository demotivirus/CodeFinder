package Lambdas.Theory.Example_09;

public class Main {
    public static void main(String[] args) {
        Gen<String> string = str -> {
            String res = "";

            for (int i = str.length() - 1; i >= 0; i--)
                res += str.charAt(i);

            return res;
        };

        Gen<Integer> factorial = x -> {
            int res = 1;

            for (int i = 1; i <= x; i++)
                res *= i;

            return res;
        };

        System.out.println(string.func("This string is reverse"));
        System.out.println(factorial.func(19));
    }
}
