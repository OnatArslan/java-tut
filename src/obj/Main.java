package obj;

import java.util.ArrayList;

/* All java class inherit from Object class */
public class Main extends Object{
    public static void main(String[] args) {

        Student max = new Student("Max", 21);
        System.out.println(max.toString());

        PrimaryStudent primaryStudent = new PrimaryStudent("Onat", 13, "Rugi");
        System.out.println(primaryStudent.toString());
    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //    @Override
    // public String toString() {
    //     return super.toString();
    // }

    @Override
    public String toString() {
        return name + " is " + age + " years old.";
    }
}

class PrimaryStudent extends Student{
    private String parentName;

    public PrimaryStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}