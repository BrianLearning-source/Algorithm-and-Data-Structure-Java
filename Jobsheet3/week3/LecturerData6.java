package week3;

public class LecturerData6 {

    void showAllLecturerData(Lecturer6 lecturerArray[]) {
        for (Lecturer6 i : lecturerArray) {
            i.print();
            System.out.println();
        }
    }

    void countLecturerByGender(Lecturer6 lecturerArray[]) {
        int male = 0;
        int female = 0;
        for (int j = 0; j < lecturerArray.length; j++) {
            if (lecturerArray[j].gender) {
                male++;
            } else {
                female++;
            }
        }
        int countMale = male;
        int countFemale = female;
        System.out.println();
        System.out.println("Many lecturerman is " + male);
        System.out.println("Many lecturerwoman is " + female);
    }

    void averageLectureAgeByGender(Lecturer6 lecturerArray[]) {
        int male = 0;
        int countMale = 0;
        int female = 0;
        int countFemale = 0;
        for (int j = 0; j < lecturerArray.length; j++) {
            if (lecturerArray[j].gender) {
                countMale += lecturerArray[j].age;
                male++;
            } else {
                countFemale += lecturerArray[j].age;
                female++;
            }
        }
        System.out.println("\nAverage age all lecturerman is " + (countMale / male));
        System.out.println("Average age all lecturerwoman is " + (countFemale / female));
    }

    void showOldestLectureInfo(Lecturer6 lecturerArray[]) {
        int older = 0;
        for (int k = 0; k < lecturerArray.length; k++) {
            if (lecturerArray[k].age > lecturerArray[older].age) {
                older = k;
            }
        }
        System.out.println("\nThe oldest lecturer : ");
        lecturerArray[older].print();
    }

    void showYoungestLectureInfo(Lecturer6 lecturerArray[]) {
        int young = 0;
        for (int l = 0; l < lecturerArray.length; l++) {
            if (lecturerArray[l].age < lecturerArray[young].age) {
                young = l;
            }
        }
        System.out.println("\nThe youngest lecturer : ");
        lecturerArray[young].print();
    }
}
