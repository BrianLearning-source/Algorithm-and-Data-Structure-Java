package Assignments;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of course: ");
        int n = input.nextInt();
        input.nextLine(); 
        
        String courseNames[] = new String[n];
        int creditHours[] = new int[n];
        int semesters[] = new int[n];
        String lectureDays[] = new String[n];
        
        // Input data mata kuliah
        for (int i = 0; i < n; i++) {
            System.out.println("Entering data number " + (i + 1) + ":");
            System.out.print("Course Name: ");
            courseNames[i] = input.nextLine();
            
            System.out.print("Sum of SKS: ");
            creditHours[i] = input.nextInt();
            
            System.out.print("Number Semester: ");
            semesters[i] = input.nextInt();
            input.nextLine(); // Membuang newline
            
            System.out.print("Day of class: ");
            lectureDays[i] = input.nextLine();

            System.out.println();
        }
        
        // Menu
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Display all course");
            System.out.println("2. Display the course based on day");
            System.out.println("3. Display the course based on semester");
            System.out.println("4. Find course based on name");
            System.out.println("5. Exit");
            System.out.print("Choose the option (1-5): ");
            int choice = input.nextInt();
            input.nextLine(); 
            
            if (choice == 1) {
                displayAllCourses(courseNames, creditHours, semesters, lectureDays);
            } else if (choice == 2) {
                System.out.print("Enter the day: ");
                String day = input.nextLine();
                displayCoursesByDay(courseNames, creditHours, semesters, lectureDays, day);
            } else if (choice == 3) {
                System.out.print("Enter the semester: ");
                int semester = input.nextInt();
                displayCoursesBySemester(courseNames, creditHours, semesters, lectureDays, semester);
            } else if (choice == 4) {
                System.out.print("Enter the name of course: ");
                String searchName = input.nextLine();
                searchCourse(courseNames, creditHours, semesters, lectureDays, searchName);
            } else if (choice == 5) {
                System.out.println("Exit.");
                break;
            } else {
                System.out.println("Invalid number");
            }
            System.out.println();
        }
        
        input.close();
    }
    

    static void displayAllCourses(String[] names, int[] credits, int[] semesters, String[] days) {
        System.out.println("\nList of Course:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + credits[i] + " SKS, Semester " + semesters[i] + ", Day: " + days[i]);
        }
    }
    

    static void displayCoursesByDay(String[] names, int[] credits, int[] semesters, String[] days, String day) {
        System.out.println("Course on " + day + ":");
        for (int i = 0; i < names.length; i++) {
            if (days[i].equalsIgnoreCase(day)) {
                System.out.println(names[i] + " - " + credits[i] + " SKS, Semester " + semesters[i]);
            }
        }
    }
    

    static void displayCoursesBySemester(String[] names, int[] credits, int[] semesters, String[] days, int semester) {
        System.out.println("Course in Semester " + semester + ":");
        for (int i = 0; i < names.length; i++) {
            if (semesters[i] == semester) {
                System.out.println(names[i] + " - " + credits[i] + " SKS, Hari " + days[i]);
            }
        }
    }
    
    // Mencari mata kuliah berdasarkan nama
    static void searchCourse(String[] names, int[] credits, int[] semesters, String[] days, String searchName) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("\nCourse Detail :");
                System.out.println("Name: " + names[i]);
                System.out.println("SKS: " + credits[i]);
                System.out.println("Semester: " + semesters[i]);
                System.out.println("Day: " + days[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    
    }
}
