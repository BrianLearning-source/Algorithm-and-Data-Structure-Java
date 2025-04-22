package week06;

public class StudentDemo6 {
    public static void main(String[] args) {
        TopStudent topStudents = new TopStudent(5);
        
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
        System.out.println("Sorted student list (by GPA, ascending) using Insertion Sort: ");
        topStudents.print();
    }
}
