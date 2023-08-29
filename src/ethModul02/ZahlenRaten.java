package ethModul02;

import java.util.Scanner;

public class ZahlenRaten {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Please enter a number between 0 and 100: ");
        int secret = 0;

        boolean secretCheck = false;
        while (!secretCheck) {
            secret = eingabe.nextInt();

            if (secret > 100 || secret < 0) {
                System.out.print("Please enter a valid secret (0-100): ");
            } else {
                secretCheck = true;
            }
        }
        int entry = -1;
        System.out.print("Please enter a number to guess the secret: ");
        for (int i = 1; entry != secret; i++) {
            int guess = eingabe.nextInt();
            if (guess == secret) {
                System.out.println("Congratulation! You found the secret! " + i + " tries were needed.");
            } else if (guess > secret) {
                System.out.print("Your try was too high! Retry: ");
            } else {
                System.out.print("Your try was too low! Retry: ");
            }
        }
    }
}
