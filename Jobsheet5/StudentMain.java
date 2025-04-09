package week5;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentData[] studentArray = new StudentData[8];
        studentArray[0] = new StudentData("Ahmad", 220101001, 2022, 78, 82);
        studentArray[1] = new StudentData("Budi", 220101002, 2022, 85, 88);
        studentArray[2] = new StudentData("Cindy", 220101003, 2021, 90, 87);
        studentArray[3] = new StudentData("Dian", 220101004, 2021, 76, 79);
        studentArray[4] = new StudentData("Eko", 220101005, 2023, 92, 95);
        studentArray[5] = new StudentData("Fajar", 220101006, 2020, 88, 85);
        studentArray[6] = new StudentData("Gina", 220101007, 2023, 80, 83);
        studentArray[7] = new StudentData("Hadi", 220101008, 2020, 82, 84);
        StudentProcess load = new StudentProcess();
        System.out.println(load.showHighScoreUTS(studentArray, 0, studentArray.length - 1, 0));
        System.out.println(load.showLowestScoreUTS(studentArray, 0, studentArray.length - 1, 100));
        System.out.println(load.averageStudentUAS(studentArray, studentArray.length));
        load.showStudentList(studentArray);
    
        input.close();
    }
}
