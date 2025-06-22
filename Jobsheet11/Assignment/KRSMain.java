package Assignment;

import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KRSQueue queue = new KRSQueue(10);
        int choice;
        do {
            System.out.println("\n=== KRS Approval Queue Menu ===");
            System.out.println("1. Register Student ");
            System.out.println("2. Process 2 Students ");
            System.out.println("3. Show All Students");
            System.out.println("4. Show First 2 Students");
            System.out.println("5. Show Last Student");
            System.out.println("6. Queue Size");
            System.out.println("7. Total Completed Approvals");
            System.out.println("8. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = input.nextInt(); 
            input.nextLine();

            switch (choice) {
                case 1: //enqueue
                    System.out.print("NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Name: ");
                    String name = input.nextLine();
                    System.out.print("Program: ");
                    String program = input.nextLine();
                    System.out.print("Class: ");
                    String cls = input.nextLine();
                    queue.enqueue(new Student(nim, name, program, cls));
                    break;
                case 2: //dequeue
                    queue.dequeue();
                    break;
                case 3: 
                    queue.printAll();
                    break;
                case 4:
                    queue.showFrontTwo();
                    break;
                case 5:
                    queue.showRear();
                    break;
                case 6:
                    queue.totalInQueue();
                    break;
                case 7:
                    queue.totalCompleted();
                    break;
                case 8:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Thank you for using KRS managamenet System");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        input.close();
    }
}
