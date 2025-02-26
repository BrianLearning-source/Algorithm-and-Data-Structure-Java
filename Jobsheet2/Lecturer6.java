public class Lecturer6 {
    // Class attributes
    String lecturerID;
    String name;
    boolean status;
    int startYear;
    String expertiseField;

    public Lecturer6() { // default constructor

    };

    public Lecturer6(String id, String name, boolean sts, int year, String field) { // perimeter constructor
        lecturerID = id;
        this.name = name;
        status = sts;
        startYear = year;
        expertiseField = field;
    };

    // Class method

    void print() { // Display lecturer information
        System.out.printf("ID lecturer number \t\t: %s\n", lecturerID);
        System.out.printf("Full lecturer name \t\t: %s\n", name);
        System.out.printf("Active lecturer ?  \t\t: %b\n", status);
        System.out.printf("Year lecture joined university  : %d\n", startYear);
        System.out.printf("Lecurer's field of expertise    : %s\n", expertiseField);
    }

    void setStatus(boolean stats) { // Indicating whtever the lecturer is active or no with true or false answer
        status = stats;
    }

    void calculateTenure(int yearNow) { // Calculate years of service
        startYear = yearNow - startYear;
        System.out.println("Years of service is " + startYear);
    }

    void changeExpertiseField(String newField) { // Changes the lecturer's expertise field
        expertiseField = newField;
    }

}
