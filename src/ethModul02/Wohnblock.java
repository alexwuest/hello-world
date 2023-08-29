package ethModul02;

import java.util.Scanner;

public class Wohnblock {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        // Ask how many floors
        System.out.println("How many floors: ");
        int floors = eingabe.nextInt();

        // Ask how many flats
        System.out.println("How many flats on each floor: ");
        int flats = eingabe.nextInt();

        for (int b = (floors - 1); b != -1; b--) {
            for (int i = 1; i <= flats; i++) {
                System.out.print("[" + b + "," + i + "]");
            }
            System.out.println("");
        }
    }
}
