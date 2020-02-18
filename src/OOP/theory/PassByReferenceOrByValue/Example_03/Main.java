package OOP.theory.PassByReferenceOrByValue.Example_03;

//Pass by reference
public class Main {
    public static void main(String[] args) {
        Example_03 ex = new Example_03("Jhon");
        System.out.println(ex.getName());
        ex.switchName(ex.getName());
        System.out.println(ex.getName());
        ex.setName("Mikle");
        Example_03 ex1 = ex;
        System.out.println(ex1.getName());
    }
}
