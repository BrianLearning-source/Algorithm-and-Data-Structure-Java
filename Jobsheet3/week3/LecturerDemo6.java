package week3;

import java.util.Scanner;

public class LecturerDemo6 {
    
    Lecturer6 lecturerArray[] = new Lecturer6[4];

    public static void main(String[] args) {

        LecturerDemo6 object = new LecturerDemo6();
        object.input();
        LecturerData6 allData = new LecturerData6();
        allData.showAllLecturerData(object.lecturerArray);
        allData.countLecturerByGender(object.lecturerArray);
        allData.averageLectureAgeByGender(object.lecturerArray);
        allData.showOldestLectureInfo(object.lecturerArray);
        allData.showYoungestLectureInfo(object.lecturerArray);

    }

    void input() {
        for (int i = 0; i < lecturerArray.length; i++ ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nLecturer ID : ");
        String id = sc.nextLine();
        System.out.print("Lecturer name : ");
        String name = sc.nextLine();
        System.out.print("Lecturer gender : ");
        boolean gender = sc.nextBoolean();
        sc.nextLine();
        System.out.print("Lecturer age : ");
        int age = sc.nextInt();
        sc.nextLine();
        
        lecturerArray[i] = new Lecturer6(id, name, gender, age);
        }
    }
    //for loop create an array of object
    //foreach loop to display the data on the screen
}
