package week06;

public class LecturerData {
    Lecture6[] listLecturer = new Lecture6[10];
    int idx;

    public void addLecturer(Lecture6 lecturer) { // Method to add Lecturer data to array (Array of objects)
        if (idx < listLecturer.length) {
            listLecturer[idx] = lecturer;
            idx++;
        }
        else {
            System.out.println("List lecturer is full");
        }
        }

    public void printLecturerList() {
        for (Lecture6 lecture : listLecturer) {
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
    //     for (int i = 0; i < listLecturer.length - 1; i++) {
    //         for (int j = 0; j < listLecturer.length - i - 1; j++ ) {
    //             if (listLecturer[j].age > listLecturer[j+1].age) {
    //                 int temp = listLecturer[j].age;
    //                 listLecturer[j].age = listLecturer[j+1].age;
    //                 listLecturer[j+1].age = temp;
    //             }
    //         }
    //     }
    // }

    public void sortingASC() { // Bubble sort ascending age
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++ ) {
                if (listLecturer[j].age > listLecturer[j+1].age) {
                    Lecture6 temp = listLecturer[j];
                    listLecturer[j] = listLecturer[j+1];
                    listLecturer[j+1] = temp;
                }
            }
        }
    }

    // public void sortingDSC() { // Selection sort descending age
    //     for (int i = 0; i < listLecturer.length - 1; i++) {
    //         int minIndex = i;
    //             for (int j = i + 1; j < listLecturer.length; j++) {
    //                 if (listLecturer[j].age < listLecturer[minIndex].age) {
    //                     minIndex = j;
    //                 }
    //             }
    //             int temp = listLecturer[minIndex].age;
    //             listLecturer[minIndex].age = listLecturer[i].age;
    //             listLecturer[i].age = temp;
    //     }
    // }

    public void sortingDSC() { // Selection sort descending age
        for (int i = 0; i < idx - 1; i++) {
            int minIndex = i;
                for (int j = i + 1; j < idx; j++) {
                    if (listLecturer[j].age > listLecturer[minIndex].age) {
                        minIndex = j;
                    }
                }
                Lecture6 temp = listLecturer[minIndex];
                listLecturer[minIndex] = listLecturer[i];
                listLecturer[i] = temp;
        }
    }

    

    }

