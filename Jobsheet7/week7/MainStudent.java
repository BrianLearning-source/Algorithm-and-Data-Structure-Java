package week7;
import java.util.Scanner;
public class MainStudent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        
        SearchStudent data = new SearchStudent();
        int amountStudent = 5;

        // user input if needed to match the amount of student

        /*SearchStudent data = new SearchStudent();
        int amountStudent;
        System.out.println("======================");
        System.out.print("Input amount of student: ");
        amountStudent = s.nextInt();
        data.listStd = new Students[amountStudent];*/

        System.out.println("-----------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("-----------");
            System.out.print("NIM\t: " );
            int nim = s.nextInt();
            System.out.print("Name\t: ");
            String name = sl.nextLine();
            System.out.print("Age\t: ");
            int age = s.nextInt();
            System.out.print("GPA\t: ");
            double gpa = s.nextDouble();

            Students std = new Students (nim, name, age, gpa);
            data.add(std);
        }

        System.out.println("-----------------------");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.print("Search student by NIM: ");
        int search = s.nextInt();
        System.out.println("Using Sequential Search");
        int position = data.findSeqSearch(search);

        data.showPosition(search, position);
        data.showData(search, position);

        System.out.println("======================");
        System.out.print("Search student by NIM: ");
        
        System.out.println("Using binary Search");
        int positian1 = data.findBinarySearch(search, 0, amountStudent - 1);

        data.showPosition(search, positian1);
        data.showData(search, positian1);

        s.close();
        sl.close();
    }
}
