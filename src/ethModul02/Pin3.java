package ethModul02;

import java.util.Scanner;

public class Pin3 {
    public static void main(String[] args) {
        int a, b, c;

        for (int i=0; i<3; i++) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bitte geben sie den 3 stelligen Pin ein!");
            System.out.print("1. Ziffer: ");
            a = scanner.nextInt();
            System.out.print("2. Ziffer: ");
            b = scanner.nextInt();
            System.out.print("3. Ziffer: ");
            c = scanner.nextInt();
            System.out.println("Sie haben eingegeben: "+a+b+c);

            // Pin Abfrage in einer dreifachen IF Abfrage
            // Verschachtelte IF Anweisung
            if (a == 0 && b == 0 && c == 7) {
                System.out.println("Offen");
                i = 3;
            }
            else {
                System.out.println("Falsche Pin");
            }
        }


    }
}