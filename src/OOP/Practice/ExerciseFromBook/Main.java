package OOP.Practice.ExerciseFromBook;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.fillInitArrOfStudents();
        student.searchStudentsOnFaculty("Jurisprudence");
        student.searchStudentsOnFaculty("NULL");
    }
}
