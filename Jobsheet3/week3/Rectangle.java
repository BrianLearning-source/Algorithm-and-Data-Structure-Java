package week3;
import java.util.Scanner;

public class Rectangle {
    public int length;
    public int width;

    public class ArrayOfObjects {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Input the length of array of object : " );
            int i = sc.nextInt();
            Rectangle[] rectangleArray = new Rectangle[i];
            // Assign the values for each attributes in objects

            for (int j = 0; j < rectangleArray.length; j++) {
               rectangleArray[j] = new Rectangle();
                System.out.println("Rectangle " + j);

                System.out.print("Input length : ");
                rectangleArray[j].length = sc.nextInt();

                System.out.print("Input width : ");
                rectangleArray[j].width = sc.nextInt();
            }

            // Display the result in console
            for (int k = 0; k < 10; k++) {
                System.out.println("Rectangle " + k);
                System.out.println("Width : " + rectangleArray[0].width + ", length : " + rectangleArray[0].length);
            }

            rectangleArray[0] = new Rectangle();
            rectangleArray[0].length = 100;
            System.out.println(rectangleArray[0]);
            rectangleArray[0] = new Rectangle();

        }
    }
}
