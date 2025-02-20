package Assignments;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {

        System.out.println("=====================================");
        System.out.println("        FIND YOUR ANSWER CUBE        ");
        System.out.println("=====================================");
        System.out.println("1. Volume");
        System.out.println("2. Surface Area");
        System.out.println("3. Total Edge Length");
        System.out.print("Enter your number (1-3): ");
        choice = input.nextInt();
        

        System.out.print("Enter side of cube: ");
        double side = input.nextDouble();
        

        switch (choice) {
            case 1:
                System.out.println("Cube Volume: " + calculateVolume(side));
                break;
            case 2:
                System.out.println("Surface Area: " + calculateSurfaceArea(side));
                break;
            case 3:
                System.out.println("Total Edge Length: " + calculatePerimeter(side));
                break;
            case 4:
                System.out.println("Exit");
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
    }
 
    static double calculateVolume(double side) {
        double Volume = side * side * side;
        return Volume;
    }
    
    static double calculateSurfaceArea(double side) {
        double SurfaceArea = 6 * (side * side);
        return SurfaceArea;
    }

    static double calculatePerimeter(double side) {
        double Perimeter = 12 * side;
        return Perimeter;
    }
}
