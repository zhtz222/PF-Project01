package model;

public class Student {

    //基础属性
    private String ID;
    private String name;
    private int age;
    private char gender;
    private String major;

    //构造方法
    //空参构造
    public Student() {
    }

    //带全部参数的构造
    public Student(String ID, String name, int age, char gender, String major) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;
    }

    //Getter&Setter
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                '}';
    }


}
