package week7;

public class Students {
    int nim, age;
    String name;
    double gpa;

    public Students(int nim, String name, int age, double gpa) {
        this.nim = nim;
        this.age = age;
        this.name = name;
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("NIM \t= " + nim);
        System.out.println("Name \t= " + name);
        System.out.println("Age \t= " + age);
        System.out.println("GPA \t= " + gpa);
    }
    
}