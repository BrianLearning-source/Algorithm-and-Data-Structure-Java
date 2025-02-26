public class LecturerMain6 {
    public static void main(String[] args) {
        Lecturer6 Dosen1 = new Lecturer6();
        Dosen1.lecturerID = "001";
        Dosen1.name = "Imam Fahrur Rozi";
        Dosen1.status = true;
        Dosen1.startYear = 2016;
        Dosen1.expertiseField = "Algorithm and Data Structure";
        Dosen1.print();
        Dosen1.changeExpertiseField("Object Oriented Program");
        System.out.println();
        Dosen1.print();
        Dosen1.calculateTenure(2025);
        System.out.println();

        Lecturer6 Dosen2 = new Lecturer6("002", "Cahya Rahmad", true, 2000, "Aljabar Linear");
        Dosen2.print();
    }
}
