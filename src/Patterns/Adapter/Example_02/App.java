package Patterns.Adapter.Example_02;

public class App {
    public static void main(String[] args) {
        CardReaderAdapter adapter = new CardReaderAdapter(new MemoryCard());
        adapter.connect();
    }
}
