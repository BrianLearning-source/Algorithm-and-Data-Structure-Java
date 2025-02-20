import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nim; // variable NIM digit
         
        System.out.print("Input your NIM: "); // Entering NIM
        nim = input.nextLine(); 
        String angka = nim.substring(nim.length()-2, nim.length()); // capture some part of string specially to catch many number in NIM digit.
        int n = Integer.parseInt(angka); // convert from String to int (only if String was only number)

        if (n < 10) { // if n in last number NIM < 10, add 10 
            n+= 10;
        }

        System.out.println("=======================");
        
        System.out.println(n);
        for (int i = 1; i <= n; i++) { // looping 
            if (i != 6 && i != 10) {
                if (i % 2 == 0) {
                    System.out.print( " " + i );
                } else { 
                    System.out.print(" *");
                }
            }
        } // closed brachet

        }
    }

