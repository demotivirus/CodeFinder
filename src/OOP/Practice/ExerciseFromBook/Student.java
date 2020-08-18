package OOP.Practice.ExerciseFromBook;

import java.util.Calendar;

public class Student {

    private Long id;
    private String name, surname;
    private Calendar birthDate;
    private String address;
    private String phoneNumber;
    private String faculty, course, group;

    private Student[] initArrOfStudents;

    public void printAllStudents(){
        for (int i = 0; i < initArrOfStudents.length; i++) {
            System.out.println(initArrOfStudents[i]);
        }
    }

    public void searchStudentsOnFaculty(String faculty){
        for (int i = 0; i < initArrOfStudents.length; i++) {
            if (initArrOfStudents[i].faculty.equalsIgnoreCase(faculty))
                System.out.println(initArrOfStudents[i]);
        }
    }

    public void fillInitArrOfStudents() {
         initArrOfStudents = new Student[]{
                 new Builder()
                         .name("Thomas")
                         .faculty("Jurisprudence")
                         .build(),
                 new Builder()
                         .name("Jake")
                         .faculty("Philosophy")
                         .build(),
                 new Builder()
                         .name("Joana")
                         .faculty("Jurisprudence")
                         .build()
         };
    }

    public static class Builder {
        private Student student;

        public Builder() {
            student = new Student();
        }

        public Builder id(Long id) {
            student.id = id;
            return this;
        }

        public Builder name(String name) {
            student.name = name;
            return this;
        }

        public Builder surname(String surname) {
            student.surname = surname;
            return this;
        }

        public Builder birthDate(Calendar birthDate) {
            student.birthDate = birthDate;
            return this;
        }

        public Builder address(String address) {
            student.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            student.phoneNumber = phoneNumber;
            return this;
        }

        public Builder faculty(String faculty) {
            student.faculty = faculty;
            return this;
        }

        public Builder course(String course) {
            student.course = course;
            return this;
        }

        public Builder group(String group) {
            student.group = group;
            return this;
        }

        public Student build() {
            return student;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
