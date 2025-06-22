package Assignment;

import java.util.Scanner;

public class MainExcuse {
    public static void main(String[] args) {

        ExcuseLetterStack stack = new ExcuseLetterStack(10);
        Scanner input = new Scanner(System.in);
        int choose;

        do {
            System.out.println("========= PROCESSING OF EXCUSE LETTER =========");
            System.out.println("1. Submit Excuse Letter"); // --input a new excuse letter data
            System.out.println("2. Process Excuse Letter"); // -- process or verify the latest excuse letter
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for letter");
            System.out.println("0. Exit");
            System.out.print("Choose the menu(1-4) : ");
            choose = input.nextInt(); // kalau mau, tambahkan code supaya input yang masuk selain dari tipe data int,
                                      // ngulang lagi dari halaman menu
            input.nextLine();
            switch (choose) {
                case 1:
                    System.out.print("Enter the student ID \t: ");
                    String id = input.nextLine();
                    System.out.print("Enter the student name \t: ");
                    String name = input.nextLine();
                    System.out.print("Enter the name class \t: ");
                    String className = input.nextLine();
                    System.out.println("S : Sick | I : Other personal reason");
                    System.out.print("Enter the type of excuse (S/I): ");
                    char type = input.next().charAt(0);
                    System.out.print("Enter the duration \t: ");
                    int duration = input.nextInt();
                    ExcuseLetter6 letter = new ExcuseLetter6(id, name, className, type, duration);
                    stack.submitLetter(letter);
                    System.out.println("====================== ACCEPTED ======================");
                    break;

                case 2:
                    ExcuseLetter6 proccess = stack.processExcuseLetter();
                    if (proccess != null) {
                        System.out.println("Student ID \t: " + proccess.id);
                        System.out.println("Student name \t: " + proccess.name);
                        System.out.println("Student class \t: " + proccess.className);
                        System.out.println("Type of permission:" + proccess.typeOfExcuse);
                        System.out.println("Duration \t: " + proccess.duration);
                    }
                    break;

                case 3:
                    ExcuseLetter6 latest = stack.viewLatestExcuseLetter();
                    if (latest != null) {
                        System.out.println("Student id \t: " + latest.id);
                        System.out.println("Student name \t: " + latest.name);
                        System.out.println("Student class \t: " + latest.className);
                        System.out.println("Type of excuse \t: " + latest.typeOfExcuse);
                        System.out.println("Duration \t: " + latest.duration);
                    }
                    break;

                case 4:
                    System.out.print("Enter student name to search : ");
                    String student = input.nextLine();
                    stack.searchForLetter(student);
                    break;

                default:
                    System.out.println("Sorry, invalid menu number!");
                    break;
            }

        } while (choose != 0);
    }
}
