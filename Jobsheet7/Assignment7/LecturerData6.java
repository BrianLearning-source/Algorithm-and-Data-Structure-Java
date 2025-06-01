package Assignment7;

public class LecturerData6 {
    Lecturer6[] listLecturer = new Lecturer6[10];
    int idx;

    public void addLecturer(Lecturer6 lecturer) { // Method to add Lecturer data to array (Array of objects)
        if (idx < listLecturer.length) {
            listLecturer[idx] = lecturer;
            idx++;
        } else {
            System.out.println("List lecturer is full");
        }
    }

    public void printLecturerList() {
        for (Lecturer6 lecture : listLecturer) {
            if (lecture != null) {
                lecture.print();
            } else {
                break;
            }
        }
        System.out.println();
    }

    public void printSorting() {
        for (int i = 0; i < idx; i++) {
            listLecturer[i].print();
        }
    }

    // public void sortingASC() { // Bubble sort ascending age
    // for (int i = 0; i < listLecturer.length - 1; i++) {
    // for (int j = 0; j < listLecturer.length - i - 1; j++ ) {
    // if (listLecturer[j].age > listLecturer[j+1].age) {
    // int temp = listLecturer[j].age;
    // listLecturer[j].age = listLecturer[j+1].age;
    // listLecturer[j+1].age = temp;
    // }
    // }
    // }
    // }

    public void sortingASC() { // Bubble sort ascending age
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listLecturer[j].age > listLecturer[j + 1].age) {
                    Lecturer6 temp = listLecturer[j];
                    listLecturer[j] = listLecturer[j + 1];
                    listLecturer[j + 1] = temp;
                }
            }
        }
    }

    // public void sortingDSC() { // Selection sort descending age
    // for (int i = 0; i < listLecturer.length - 1; i++) {
    // int minIndex = i;
    // for (int j = i + 1; j < listLecturer.length; j++) {
    // if (listLecturer[j].age < listLecturer[minIndex].age) {
    // minIndex = j;
    // }
    // }
    // int temp = listLecturer[minIndex].age;
    // listLecturer[minIndex].age = listLecturer[i].age;
    // listLecturer[i].age = temp;
    // }
    // }

    public void sortingDSC() { // Selection sort descending age
        for (int i = 0; i < idx - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (listLecturer[j].age > listLecturer[minIndex].age) {
                    minIndex = j;
                }
            }
            Lecturer6 temp = listLecturer[minIndex];
            listLecturer[minIndex] = listLecturer[i];
            listLecturer[i] = temp;
        }
    }

    public void sequentialSearch(String Lctrname) {
        int total = 0;
        
        for (int i = 0; i < idx; i++) {
            if (listLecturer[i] != null && listLecturer[i].name.equalsIgnoreCase(Lctrname)) {
                total++;
                System.out.println("\nLecture ID      : " + listLecturer[i].id);
            System.out.println("Lecture name    : " + listLecturer[i].name);
            String gender = (this.listLecturer[i].gender == true) ? "Male" : "Female";
            System.out.println("Lecturer gender : " + gender);
            System.out.println("Lecturer age    : " + listLecturer[i].age);
            }
        }
        if (total > 1) {
            System.out.println("WARNING -- Multiple matched data have found" + total + " results");
        } else if (total == 0) {
            System.out.println("No matched data");
        }
    }

    public void showLecturerData(int position) {
        if (position != -1) {
            System.out.println("\nLecture ID      : " + listLecturer[position].id);
            System.out.println("Lecture name    : " + listLecturer[position].name);
            String gender = (this.listLecturer[position].gender == true) ? "Male" : "Female";
            System.out.println("Lecturer gender : " + gender);
            System.out.println("Lecturer age    : " + listLecturer[position].age);
        } else {
            System.out.println("No matched data");
        }
    }

    public int BinarySearch(int lecturerAge, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (lecturerAge == listLecturer[mid].age) {
                return mid;
            } else if (listLecturer[mid].age > lecturerAge) {
                return BinarySearch(lecturerAge, left, mid - 1);
            } else {
                return BinarySearch(lecturerAge, mid + 1, right);
            }
        }
        return -1;
    }
}
