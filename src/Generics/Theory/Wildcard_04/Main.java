package Generics.Theory.Wildcard_04;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        unbox(box);
    }

    private static void unbox(Box<?> box){
        //box.put(box);

        captureBox(box);
        System.out.println(box.getT());
    }

    private static<V> void captureBox(Box<V> box){
        box.put(box.getT());
    }
}
