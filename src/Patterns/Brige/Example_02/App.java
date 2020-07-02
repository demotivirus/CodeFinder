package Patterns.Brige.Example_02;

public class App {
    public static void main(String[] args) {
        Program[] programs = {
                new InternetShop(new PythonDeveloper()),
                new BankSystem(new JavaDeveloper()),
                new InternetShop(new CppDeveloper())
        };

        for (Program program : programs){
            program.developProgram();
            System.out.println("=================================");
        }
    }
}
