package OOP.theory.Static;

public class StudentBefore {
    private String name;
    private int course;
    private int count;

    StudentBefore(String name, int course){
        this.name = name;
        this.course = course;
        count++;
        System.out.println("Student before static #" + count + " create");
    }
}
