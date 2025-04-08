package week5;

import java.util.Scanner;

public class PowerMainModification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input element number : ");
        int elemen = input.nextInt();

        PowerModification[] pjg = new PowerModification[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Input base number for the element "+ (i + 1) + ": ");
            int basis = input.nextInt();
            System.out.print("Input exponent for the element " + (i + 1) + ": ");
            int exp = input.nextInt();
            pjg[i] = new PowerModification(basis, exp);
        }

        System.out.println("POWER RESULT USING BRUTEFORCE:");
        for (PowerModification p : pjg) {
             System.out.println(p.basis + "^" + p.expo + ": " + p.powerModifBF());
            }
        System.out.println( "POWER RESULT USING DEVIDE AND CONQUER: ");
        for (PowerModification p : pjg) {
            System.out.println(p.basis + "^" + p.expo + ": " + p.powerModifDC(p.basis, p.expo));
        }
        input.close();
    }
}
