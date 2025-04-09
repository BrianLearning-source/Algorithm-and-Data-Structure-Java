package week5;

public class StudentData {
    String name;
    int ID, Admission, Midterm, FinalTerm;

    StudentData (String Name, int NIM, int ADY, int UTS, int UAS) {
        name = Name;
        ID = NIM;
        Admission = ADY;
        Midterm = UTS;
        FinalTerm = UAS;
    }

    void print() {
        System.out.println("Student name : " + name);
        System.out.println("Student ID : " + ID);
        System.out.println("Student admission : " + Admission);
        System.out.println("Student midterm : " + Midterm);
        System.out.println("Student finalTerm : " + FinalTerm);
    }

}
