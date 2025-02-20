package Assignments;

import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // array
        char CODE[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char city[][] = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        System.out.print("Enter vehicle plate number:");
        char inputCode = input.next().toUpperCase().charAt(0);

        boolean found = false;
        for (int i = 0; i < CODE.length; i++) {
            if (CODE[i] == inputCode) {
                System.out.print("City : ");
                for (char character : city[i]) {
                    System.out.print(character);
                }
                System.out.println();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Vehicle plate number not found.");
        }
        input.close();
    }
}
