package Algotihmen_001;

import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
     * 1. range setzen
     * 2. selectedNr <- random between 0 and range
     * 3. guessedNR <- selectedNr - 1
     * 4. ausgabe -> Erraten Sie eine NR zwischen 0 und range
     * 5. while guessedNR != selectedNr do
     * 6. einlesen von guessedNR
     * 7. if guessedNR smaller than selectedNr then
     * 8. ausgabe NR ist klein
     * 9. else if guessedNR > selectedNr then
     * 10. ausgabe NR ist groß
     * 11. else ausgabe BINGO!
     * 12. end if
     * 13. end while
     * */

    public static void main(String[] args) {
        int range = 10;
        int selectedNr = new Random().nextInt(range + 1);
        Scanner scanner = new Scanner(System.in);
        int guessedNR = selectedNr - 1;
        System.out.print("Erraten Sie eine NR zwischen 0 und " + range + ": ");
        while (guessedNR != selectedNr) {
            guessedNR = scanner.nextInt();
            if (guessedNR < selectedNr) {
                System.out.println("NR ist klein");
            } else if (guessedNR > selectedNr) {
                System.out.println("NR ist groß");
            } else {
                System.out.println("BINGO!");
            }
        }
    }

    static void add(int x) {
        for (int i = 1; i <= x; i += 2) {
            System.out.println(i);
        }
    }
}
