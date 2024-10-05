package obj;

import java.util.ArrayList;

/* All java class inherit from Object class */
public class Main extends Object{
    public static void main(String[] args) {

        Student max = new Student("Max", 21);
        System.out.println(max.toString());

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