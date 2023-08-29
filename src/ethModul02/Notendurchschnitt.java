package ethModul02;
import java.util.Scanner;
public class Notendurchschnitt {
    public static void main(String[] args){
        Scanner eingabe = new Scanner(System.in);

        System.out.println("Bitte geben Sie ihre Noten ein (0 für Eingabe beenden): ");
        double note = 20.00;                                                                                // Wie Initialisieren?
        double total = 0.00;
        int counter = 1;

        while (note != 0.00){
            System.out.print(counter + ". Note: ");
            note = eingabe.nextDouble();
            total += note;
            counter++;
            }
        counter = counter - 2;                                                                              // Gäbe es hier eine schönere Lösung?
        double average = total / counter;
        System.out.println("Sie haben " + counter + " Noten eingegeben. Schnitt = " + average);
    }
}
