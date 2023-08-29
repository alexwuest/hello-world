package ethModul02;

import java.util.Scanner;

public class PinWhile {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie den 3 stelligen Pin ein!");
        boolean i = false;
        while (i != true){
            // Pin entered by user
            System.out.println("Please enter the 1st digit of the pin: ");
            a = scanner.nextInt();
            System.out.println("Please enter the 2nd digit of the pin: ");
            b = scanner.nextInt();
            System.out.println("Please enter the 3rd digit of the pin: ");
            c = scanner.nextInt();

            // Check if correct Pin is entered
            if (a == 0 && b == 0 && c == 7) {
                i = true;
            }
            else {
                System.out.println("Entered pin is not correct!");
            }
        }
        System.out.println("You have entered the correct pin. Welcome!");
    }
}
