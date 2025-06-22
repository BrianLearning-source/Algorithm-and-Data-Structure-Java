package Jobsheet10.Experiment1;
public class Student6 {
    String name, nim, className;
    int grade;

    Student6(String name, String nim, String  className) {
        this.name = name;
        this.nim = nim;
        this.className = className;
        this.grade = -1;
    }

    void grading(int grade) {
        this.grade = grade;
    }
}