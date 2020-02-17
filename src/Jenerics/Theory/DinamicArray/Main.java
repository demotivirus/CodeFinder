package Jenerics.Theory.DinamicArray;

public class Main {
    public static void main(String[] args) {
        DynamicArray<String> array = new DynamicArray<>();
        int count = 0;
        while (count < 20){
            System.out.println(array.length() + " length");
            array.add("One");
            System.out.println(array.get(count));
            System.out.println(array.size());
            count++;
        }
    }
}
