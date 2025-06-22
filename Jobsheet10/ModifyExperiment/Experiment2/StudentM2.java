package ModifyExperiment.Experiment2;

public class StudentM2 {
    String name, nim, className;
    int grade;

    StudentM2(String name, String nim, String  className) {
        this.name = name;
        this.nim = nim;
        this.className = className;
        this.grade = -1;
    }

    void grading(int grade) {
        this.grade = grade;
    }
}