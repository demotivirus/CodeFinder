package Jenerics.Theory.Example_07;

public class Main {
    public static void main(String[] args) {
        //Human human = new Human((short) 20);
        Human human = new Human((byte) 20);
        System.out.println(human);

        Text text = new Text("This is new day");
        System.out.println(text);

        //Text brokenText = new Text(new Integer(28));
    }
}
