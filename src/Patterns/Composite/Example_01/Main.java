package Patterns.Composite.Example_01;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();

        Developer javaDev = new JavaDeveloper();
        Developer cppDev = new CppDeveloper();
        Developer pythonDev = new PythonDeveloper();

        team.addDeveloper(javaDev);
        team.addDeveloper(cppDev);
        team.addDeveloper(pythonDev);

        team.createProject();

        team.removeDeveloper(cppDev);
        team.createProject();
    }
}
