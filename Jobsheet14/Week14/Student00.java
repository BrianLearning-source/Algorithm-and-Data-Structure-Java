package Week14;

public class Student00 {
    String nim, name, className;
    double ipk;

    public Student00() {

    }

    public Student00(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        ipk = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + ipk);
    }
}