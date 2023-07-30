package Klausurvorbereitung.StudentnFragen.Frage_002;

public class Main {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable(10);
        ht.hinzufuegen(1);
        ht.hinzufuegen(2);

        System.out.println(ht.suche(0)); // Sollte false ausgeben
        System.out.println(ht.suche(1)); // Sollte true ausgeben
        System.out.println(ht.suche(2)); // Sollte true ausgeben
        System.out.println(ht.suche(3)); // Sollte false ausgeben
    }
}
