package ModifyP13;
public class StudentM {
    String nim, name, className;
    double gpa;

    public StudentM() {

    }

    public StudentM(String nm, String nama, String kls, double ip ) {
        nim = nm;
        name = nama;
        className = kls;
        gpa = ip;
    }

    void print () {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }
} 