package Jenerics.Theory.Example_08;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {9, 38, 2, 87, 11, 18};
        Box<Integer> blackBox = new Box<>(arr);
        System.out.println(blackBox.min());
        System.out.println(blackBox);

        Character[] chars = {'J', 'a', 'v', 'a'};
        Box<Character> characterBox = new Box<>(chars);
        System.out.println(characterBox);
    }
}
