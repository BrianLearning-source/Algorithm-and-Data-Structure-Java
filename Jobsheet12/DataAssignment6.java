public class DataAssignment6 {
    String name, nim, className; 
    double grade;

    public DataAssignment6() {
        
    }
    
    public DataAssignment6 (String name, String nim, String cls, double gpa) {
        this.name = name;
        this.nim = nim;
        className = cls;
        grade = gpa;;
    }

    public void print() {
        System.out.printf("%-10s %s-20s %-10s %.2f\n", nim, name, className, grade);
    }
}
