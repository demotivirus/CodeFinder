package Patterns.Adapter.Example_04;

public class App {
    public static void main(String[] args) {
        Database db = new AdapterJavaToDatabase();
        db.create();
        db.read();
        db.update();
        db.delete();
    }
}
