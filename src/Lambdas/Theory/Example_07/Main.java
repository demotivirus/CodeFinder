package Lambdas.Theory.Example_07;

public class Main {
    public static void main(String[] args) {
        Greeting goodMorning = n -> "Good morning " + n;
        Greeting goodEvening = n -> "Good evening " + n;

        System.out.println(goodMorning.getName("Luci"));
        System.out.println(goodEvening.getName("Frank"));
    }
}
