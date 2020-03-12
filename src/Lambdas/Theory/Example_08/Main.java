package Lambdas.Theory.Example_08;

public class Main {
    public static void main(String[] args) {
        Stringer string = str -> {
          String res = "";

          for (int i = str.length()-1; i >= 0; i--)
              res += str.charAt(i);

          return res;
        };

        System.out.println(string.reverse("I need more time"));
    }
}
