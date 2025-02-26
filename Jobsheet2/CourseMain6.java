public class CourseMain6 {
    public static void main(String[] args) {
        Course6 crs1 = new Course6(); // instantiation the object crs1 connected with default constructor 
        crs1.courseID = "100001";
        crs1.name = "Algorithm and Data Structure";
        crs1.credit = 3;
        crs1.hour = 4;
        crs1.addHour(1);
        crs1.reducehour(2);
        crs1.print();
        Course6 crs2 = new Course6("100002", "Opeartion System", 3, 4); //Instantiation the object and give the value directly to object crs2
        crs2.addHour(2);
        crs2.reducehour(1);
        crs2.print();
    }
}
