package week5;

public class StudentProcess {

    void showStudentList(StudentData[] studentArray) {
        for (StudentData list : studentArray) {
            list.print();
            System.out.println();
        }
    }

    int showLowestScoreUTS(StudentData[] studentArray, int l, int r, int minscore) { //Devide and Conquer method
        if (l == r) {
            if (studentArray[l].Midterm < minscore) {
                return minscore = studentArray[l].Midterm;
            }
        }
        int mid = (l+r)/2;
        int LeftArray = showLowestScoreUTS(studentArray, l, mid, minscore);
        int RightArray = showLowestScoreUTS(studentArray, mid + 1, r, minscore);
        if (LeftArray < RightArray) {
            return LeftArray;
        } else {
            return RightArray;
        }
    }

    int showHighScoreUTS(StudentData[] studentArray, int l, int r, int highscore) { //Devide and Conquer method
        if (l == r) {
            if (studentArray[l].Midterm > highscore) {
                return highscore = studentArray[l].Midterm;
            }
        }
        int mid = (l+r)/2;
        int LeftArray = showHighScoreUTS(studentArray, l, mid, highscore);
        int RightArray = showHighScoreUTS(studentArray, mid + 1, r, highscore);
        if (LeftArray > RightArray) {
            return LeftArray;
        } else {
            return RightArray;
        }
    }

    double averageStudentUAS(StudentData[] studentArray, int element) {
        double total = 0;
        for (int i = 0; i < element; i++) {
            total = total + studentArray[i].FinalTerm;
        }
        return total / element;
    }
}
