package week5;

import java.util.Scanner;

public class PowerMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input element number : ");
        int elemen = input.nextInt();

        Power[] png = new Power[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Input base number for the element "+ (i + 1) + ": ");
            int basis = input.nextInt();
            System.out.print("Input exponent for the element " + (i + 1) + ": ");
            int exp = input.nextInt();
            png[i] = new Power(basis, exp);
        }

        System.out.println("POWER RESULT USING BRUTEFORCE:");
        for (Power p : png) {
             System.out.println(p.baseNumber + "^" + p.exponent + ": " + p.powerBF(p.baseNumber, p.exponent));
            }
        System.out.println( "POWER RESULT USING DEVIDE AND CONQUER: ");
        for (Power p : png) {
            System.out.println(p.baseNumber + "^" + p.exponent + ": " + p.powerDC(p.baseNumber, p.exponent));
        }
        input.close();
    }
}
