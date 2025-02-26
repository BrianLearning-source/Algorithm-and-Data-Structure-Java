public class Course6 {
    // class attributes    
    String courseID;
    String name;
    int credit;
    int hour;

    public Course6() { //default constructor

    }

    public Course6(String id, String name, int SKS, int hr) { // perimeter constructor
        courseID = id;
        this.name = name;
        credit = SKS;
        hour = hr;
    }

    // class method 

    void print() { //display all course details
        System.out.printf("Code of course \t\t\t: %5s \n", courseID);
        System.out.printf("Full name of course \t\t: %s \n" + name);
        System.out.printf("Semester Credit System \t\t: %d \n" + credit);
        System.out.printf("Total weekly meeting hours \t: %d \n" + hour);
    }

    void changeCredit(int newCredit) { //Changes the SKS and informs the user
        credit = newCredit;
    }

    void addHour(int newTime) { //Adds extra hours to the course
        hour = hour + newTime;
    }

    void reducehour(int newTime) { //Reduces course hours, ensuring enough hours remain

        if (hour <= newTime) {
            System.out.println("Not enough class hour ");
        } else {
            hour = hour - newTime;
        }
        
    }


}
