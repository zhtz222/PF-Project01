package model;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean remobeStudentByID(String ID) {
        return students.removeIf(student -> student.getID().equals(ID));
    }

    public Student findStudentByID(String ID) {
        for (Student student : students) {
            if (student.getID().equals(ID)) {
                return student;
            }
        }
        return null;
    }
    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
