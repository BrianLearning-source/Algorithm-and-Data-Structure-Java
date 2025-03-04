package week3;

public class Lecturer6 {
    String id;
    String LecturerName;
    Boolean gender;
    int age;
    
    public Lecturer6(String id, String name, Boolean gender, int age) {
        this.id = id;
        LecturerName = name;
        this.gender = gender;
        this.age = age;

    }

    void print() {
    System.out.println("\nLecturer ID : " + id);
    System.out.println("Name of lecturer : " + LecturerName);
    System.out.println("Gender : " + ((gender) ? "male" : "female"));
    System.out.println("Lecturer age : " + age);
    }
}
