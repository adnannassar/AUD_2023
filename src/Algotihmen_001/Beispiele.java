package Algotihmen_001;

public class Beispiele {
    public static void main(String[] args) {
        // 1 to 5 = 1 + 2+ 3 + 4+ 5 = 15
        int n = 6;
        System.out.println("Summe von 1 bis " + n + " = " +
                summerErsterNZahlen(n));

        int gesuchteZahlr= 200;
        System.out.println("Index of " + gesuchteZahlr + " in Array is " + lineareSuche(new int[]{-15, 200, 30, -2, 7, 8}, gesuchteZahlr));
    }

    public static int summerErsterNZahlen(int n) {
        int summe = 0;
        for (int i = 1; i <= n; i++) {
            summe += i;
        }
        return summe;
    }

    public static int lineareSuche(int[] array, int gesuchteZahl) {
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == gesuchteZahl) {
                return i;
            }
        }
        return -1;
    }
}
