import java.util.Scanner;

public class MainAssignment6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the max student queue: ");
        int n = input.nextInt();
        input.nextLine();

        LinkedListAssignment6 lla = new LinkedListAssignment6(n);
        int menu = 0;

        while (menu != 9) {
            System.out.println("============ Register Student Queue ============");
            System.out.println("1. Add Student");
            System.out.println("2. Check if Full");
            System.out.println("3. Check if Empty");
            System.out.println("4. Call Next Student");
            System.out.println("5. Show First & Last Student");
            System.out.println("6. Total Students in Queue");
            System.out.println("7. Show All Students");
            System.out.println("8. Clear All Data");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            menu = input.nextInt();
            input.nextLine();  

            switch (menu) {
                case 1:
                    System.out.print("Student name: ");
                    String name = input.nextLine();
                    System.out.print("Student NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Student class: ");
                    String cls = input.nextLine();
                    System.out.print("Student GPA: ");
                    double gpa = input.nextDouble();
                    input.nextLine();

                    DataAssignment6 student = new DataAssignment6(name, nim, cls, gpa);
                    lla.enqueue(student);
                    break;
                case 2:
                    lla.isFull();
                    break;
                case 3:
                    if (lla.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue is not empty.");
                    }
                    break;
                case 4:
                    lla.dequeue();
                    break;
                case 5:
                    lla.peekFront();
                    lla.peekLast();
                    break;
                case 6:
                    lla.count();
                    break;
                case 7:
                    lla.print();
                    break;
                case 8:
                    lla.clear();
                    break;
                case 9:
                    System.out.println("Thank you. Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        input.close();
    }
}
