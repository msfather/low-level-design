package org.example;

public class Student implements prototype<Student>{
    private int x;
    private int y;

    public Student(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Student Object called");
    }
    public Student(){}

    @Override
    public String toString() {
        return "Student{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    @Override
    public Student Clone() {
        System.out.println("Student Object called");
        Student student=new Student();
        student.x=x;
        student.y=y;
        return student;
    }
}
