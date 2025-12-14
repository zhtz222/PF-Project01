package modle;

import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    // 添加学生
    public void addStudent(Student student) {
        students.add(student);
    }

    // 删除学生（修正：用下标循环）
    public boolean removeStudentById(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }

    // 查找学生
    public Student findStudentById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    // 获取学生列表（供 Main 使用）
    public ArrayList<Student> getAllStudents() {
        return students;
    }
}
