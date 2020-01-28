package OOP.theory.Static;

public class StudentAfter {
    private String name;
    private int course;
    private static int count; //Static modifier is an instance of the class

    StudentAfter(String name, int course){
        this.name = name;
        this.course = course;
        count++;
        System.out.println("Student after static #" + count + " create");
    }
}
