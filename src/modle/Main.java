package modle;

import java.util.Scanner;

public class Main {

    private static StudentManager manager = new StudentManager();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> deleteStudent();
                case 3 -> findStudent();
                case 4 -> listStudents();
                case 0 -> {
                    System.out.println("Bye.");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n===== Student Management System =====");
        System.out.println("1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Find Student");
        System.out.println("4. List All Students");
        System.out.println("0. Exit");
        System.out.print("Choose: ");
    }

    private static void addStudent() {
        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Major: ");
        String major = sc.nextLine();

        manager.addStudent(new Student(id, name, age, major));
        System.out.println("Student added.");
    }

    private static void deleteStudent() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        if (manager.removeStudentById(id)) {
            System.out.println("Deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void findStudent() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        Student s = manager.findStudentById(id);
        if (s != null) {
            System.out.println(s);
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void listStudents() {
        if (manager.getAllStudents().isEmpty()) {
            System.out.println("No students.");
            return;
        }

        for (Student s : manager.getAllStudents()) {
            System.out.println(s);
        }
    }
}
