import java.util.Scanner;

public class Array {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int valueCourse; // Variable that store value input 
        double GPA; // Variable that save Final Result (IP)
        double multiples = 0; // Variable to collect multiple between Waight Value and SKS Weigth
        double sumSKS = 0; // Sum of all the SKS

        // Array
        String courseName[] = {"Pancasila", "Information Technology Concept", "Critical Thingking and Problem Solving", "Basic Mathemathic", "Basic Programming", "Basic Programming Practice", "Occupational Health and Safety", "Software Engineering"};
        double SKSWeight[] = {2, 2, 2, 3, 2, 3, 2, 2}; // Data SKS Array
        float gradeArray[] = new float[8]; // Input for course value
        double weightValue[] = new double[8]; // Array for weight value such as 4, 3.5, 3 and so on
        String letterArray[] = new String[8]; // Array letter for each course 

        System.out.println("==============================");
        System.out.println("CALCULATE GPA SEMESTER PROGRAM");
        System.out.println("==============================");

        for (int i = 0; i < courseName.length; i++) {
            System.out.print("Enter the value for " + courseName[i] + " Course: ");
            valueCourse = input.nextInt();
            gradeArray[i] = valueCourse;

            if (valueCourse <= 100 && valueCourse > 80) {
                letterArray[i] = "A";
                weightValue[i] = 4;
            } else if (valueCourse <= 80 && valueCourse > 73) {
                letterArray[i] = "B+";
                weightValue[i] = 3.5;
            } else if (valueCourse <= 73 && valueCourse > 65) {
                letterArray[i] = "B";
                weightValue[i] = 3;
            } else if (valueCourse <= 65 && valueCourse > 60) {
                letterArray[i] = "C";
                weightValue[i] = 2.5;
            } else if (valueCourse <= 60 && valueCourse > 50) {
                letterArray[i] = "C+";
                weightValue[i] = 2;
            } else if (valueCourse <= 50 && valueCourse > 39) {
                letterArray[i] = "D";
                weightValue[i] = 1;
            } else if (valueCourse <= 39) {
                letterArray[i] = "E";
                weightValue[i] = 0;
            } else {
                System.out.println("Invalid number");
            }
        }

        System.out.println("==============================");
        System.out.println("   Conversion Grade Report    ");
        System.out.println("==============================");
        System.out.printf("%-40s %-15s %-10s %-10s%n", "Course", "Value Grade", "Letter Grade", "Weight Value");

        for (int i = 0; i < courseName.length; i++ ) {
            System.out.printf("%-40s %-15.2f %-10s %-10.2f%n",courseName[i], gradeArray[i], letterArray[i], weightValue[i]);
            sumSKS += weightValue[i] * SKSWeight[i];
        }

        System.out.println("==============================");
        sumSKS = sumSKS / 18;
        System.out.printf("%.2f", sumSKS);
        }


    }

