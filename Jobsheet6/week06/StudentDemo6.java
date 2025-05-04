package week06;

import java.util.Scanner;

public class StudentDemo6 {
    public static void main(String[] args) {
        TopStudent topStudents = new TopStudent(5);
        Scanner input = new Scanner(System.in);

        // for (int i = 0; i < topStudents.listStudents.length; i++) {
        //     System.out.print("\nEnter the student NIM\t: ");
        //     String nim = input.nextLine();
        //     System.out.print("Enter the student name\t: ");
        //     String name = input.nextLine();
        //     System.out.print("Enter the student class\t: ");
        //     String stdclass = input.nextLine();
        //     System.out.print("Enter the student GPA\t: ");
        //     double gpa = input.nextDouble();
        //     input.nextLine();
        //     Student std = new Student(nim, name, stdclass, gpa);
        //     topStudents.add(std);
        // }
       // Adding student data
        topStudents.add(new Student("2201","Alice","A",3.9));
        topStudents.add(new Student("2202","Bob","B", 3.7));
        topStudents.add(new Student("2203", "Charlie", "C", 3.8));
        topStudents.add(new Student("2204", "David", "D", 3.6));
        topStudents.add(new Student("2205", "Eve","E", 4.0));

        // Display original List
        System.out.println("original student list: ");
        topStudents.print();

        // Sorting students by GPA using Bubble Sort
        topStudents.bubbleSort();
        System.out.println("Sorted student list (by GPA, descending): ");
        topStudents.print();

        // Sorting students by GPA using Selection Sort
        topStudents.selectionSort();
        System.out.println("Sorted student list (by GPA, ascending) using Selection Sort:");
        topStudents.print();

        // Sorting students by GPA using Insertion Sort
        topStudents.insertionSort();
        System.out.println("Sorted student list (by GPA, descending) using Insertion Sort: ");
        topStudents.print();
    
        input.close();
    }
}
