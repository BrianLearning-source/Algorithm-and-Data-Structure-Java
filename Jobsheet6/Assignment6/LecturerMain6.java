package week06;

public class LecturerMain6 {
    public static void main(String[] args) {
        LecturerData data = new LecturerData();

        //Enter the Lecturer data to array of objects
        data.addLecturer(new Lecture6("200", "John", true, 45));
        data.addLecturer(new Lecture6("201", "Frost", false, 26));
        data.addLecturer(new Lecture6("203", "Andik", true, 39));
        data.addLecturer(new Lecture6("204", "Atiq", false, 50));
        data.addLecturer(new Lecture6("205", "Mudi", true, 60));

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
    }
}
