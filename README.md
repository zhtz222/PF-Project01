# PF-Project01

## Project Name
Student Management System

## Description
This is the final assignment of Group 2 for the Fundamentals of Programming course.

**Group Members:** Ziyang Zhang (20119439), Yiming Huang (20119415), Tangjia Tao (20119427), Ruibo Zhou (20119438)

**Project Description:** The program runs in the console and allows users to manage basic student information using a menu.

## Features
The system provides the following functions:

- **Add Student**
  - Add a new student by entering basic information.
  - Each student ID must be unique.

- **View Students**
  - Display all students that have been added.

- **Update Student**
  - Modify the information of an existing student.

- **Delete Student**
  - Remove a student from the system by ID.

## Task Distribution

### Member 1: Entity Class Development (Student.java)
- Responsible for designing and implementing the Student class
- Encapsulate student attributes (ID, name, age, major)
- Implement getter/setter methods and toString()
- **Workload:** Light, suitable for members with foundational skills

### Member 2: Data Management Module (StudentManager.java)
- Implement CRUD operations for student data
- Use ArrayList to manage the student collection
- Develop removeStudentById and findStudentById methods
- **Workload:** Medium, requires understanding of collection operations

### Member 3: User Interface Layer (Main.java UI portion)
- Design the menu system (printMenu method)
- Implement user input/output interaction logic
- Handle input validation and exception handling
- **Workload:** Medium, requires understanding of console interaction

### Member 4: Main Controller & Integration Testing
- Responsible for main method flow control
- Integrate all modules and perform system testing
- Write test cases and project documentation
- **Workload:** Heavy, requires big-picture perspective and debugging skills

## AI Usage
We used AI to identify code omissions and unreasonable parts, which we then improved. For issues difficult to handle perfectly with our existing knowledge, AI helped supplement additional information to optimize the code. For example, `@Override` enables compile-time safety checks to ensure that the annotated method correctly overrides a method from the parent class/interface; otherwise, compilation will fail.

## How to Run

### Method 1: Run with JAR file
1. Make sure Java is installed on your computer
2. Double-click `run.bat`
3. The program will start in the console

### Method 2: Run in IntelliJ IDEA
1. Open the project in IntelliJ IDEA
2. Run `Main.java`
