package Assignment7;

import java.util.Scanner;

public class LecturerDemo6 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LecturerData6 data = new LecturerData6();

        //Enter the Lecturer data to array of objects
        data.addLecturer(new Lecturer6("200", "John", true, 45));
        data.addLecturer(new Lecturer6("201", "Frost", false, 26));
        data.addLecturer(new Lecturer6("203", "Andik", true, 39));
        data.addLecturer(new Lecturer6("204", "Atiq", false, 50));
        data.addLecturer(new Lecturer6("205", "Mudi", true, 60));
        data.addLecturer(new Lecturer6("206", "John", true, 50));

        //Dislpay all list of lecturer data
        data.printLecturerList();
        
        // Sorting ascending age 
        System.out.println("Sort ASC - Sort lecturers by age from youngest to oldest using Bubble Sort.");
        data.sortingASC();
        data.printLecturerList();
        System.out.println();

        // Sorting descending age
        System.out.println("Sort DSC - Sort lecturers by age from oldest to youngest using Selection Sort.");
        data.sortingDSC();
        data.printLecturerList();
        System.out.println();

        // Search lecturer data by name using Sequential Search
        System.out.println("==== Search Lecturer by Name ====");
        System.out.print("Input the lecturer name : ");
        String Lecturername = input.nextLine();
        data.sequentialSearch(Lecturername);
        System.out.println();

        // Seach lecturer data by age using Binary Search

        System.out.println("==== Search Lecturer by Age ====");
        System.out.print("Input the lecturer age : ");
        int lecturerAge = input.nextInt();
        data.sortingASC();
        int positionAge = data.BinarySearch(lecturerAge, 0, data.idx - 1);
        data.showLecturerData(positionAge);
        
        input.close();
    }
}
