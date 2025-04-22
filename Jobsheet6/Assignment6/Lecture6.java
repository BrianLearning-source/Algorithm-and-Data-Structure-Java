package week06;

public class Lecture6 {
    String id, name;
    boolean gender;
    int age;

    public Lecture6 (String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print() {
        System.out.println("\nLecture ID      : " + id);
        System.out.println("Lecture name    : " + name);
        String gender = (this.gender == true)? "Male" : "Female";
        System.out.println("Lecturer gender : " + gender);
        System.out.println("Lecturer age    : " + age);
        
    }
} 
