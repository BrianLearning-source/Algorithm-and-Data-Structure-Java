package ModifyExperiment.Experiment1;
import java.util.Scanner;

public class StudentDemo6 {
    public static void main(String[] args) {
        StudentAssignmentStack stack = new StudentAssignmentStack(5);
        Scanner input = new Scanner(System.in);
        int choose;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit the assignment");
            System.out.println("2. Grading grade");
            //System.out.println("3. View the latest assignment");
            System.out.println("3. View the first assignment");
            System.out.println("4. View Assignment list");
            System.out.println("5. View Stored Assignment");
            System.out.print("Choose: ");
            choose = input.nextInt();
            input.nextLine();
            switch (choose) {
                case 1:
                    System.out.print("Name: ");
                    String nama = input.nextLine();
                    System.out.print("NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Class: ");
                    String kelas = input.nextLine();
                    Student6 std = new Student6(nama, nim, kelas);
                    stack.push(std);
                    System.out.printf("Task %s successfull to submitted\n", std.name);
                    break;
                case 2:
                    Student6 graded = stack.pop();
                    if (graded != null) {
                        System.out.println("Grading assignment from " + graded.name);
                        System.out.print("Enter grade (0-100): ");
                        int grade = input.nextInt();
                        graded.grading(grade);
                        System.out.printf("The assignment %s is %d\n", graded.name, grade);
                    }
                    break;
                case 3:
                    Student6 look = stack.peek();
                    if (look != null) {
                        System.out.println("Final assignment submited by " + look.name);
                        //System.out.println("First student who submit assignment first is " + look.name);
                    }
                    break;
                case 4:
                    System.out.println("List all assignment");
                    System.out.println("Name\tNIM\tClass");
                    stack.print();
                    break;
                case 5:
                    int i = stack.countNumber();
                    System.out.println("Count of Stored Assignment : " + i);
                    break;
                default:
                    System.out.println("Invalid choose");
                    break;
            }
        } while (choose >= 1 && choose <= 5);

        input.close();
    }
}
