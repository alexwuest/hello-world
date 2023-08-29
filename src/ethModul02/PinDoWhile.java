package ethModul02;
import java.util.Scanner;
public class PinDoWhile {
    public static void main(String[] args){
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the 3 digit pin!");
        boolean i = false;
        int t = 3;

        // Do loop
        do {
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
                t++;
                System.out.println("You have entered the correct pin. Welcome!");
            }
            else {
                t--;
                System.out.println("Entered pin not correct! " + t + " attempts left.");
            }
        } while ((i == false) && (t != 0));

        // If there are to many attempts the customer will get an extra notice
        if (t == 0){
            System.out.println("You entered three times the wrong pin. Please retry later!");
        }
    }

}
