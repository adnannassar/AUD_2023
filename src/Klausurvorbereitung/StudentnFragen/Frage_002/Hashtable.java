package Klausurvorbereitung.StudentnFragen.Frage_002;

public class Hashtable {
    private Link[] tabelle;

    public Hashtable(int n) {
        tabelle = new Link[n];
    }

    public void hinzufuegen(int n) {
        int index = hashFunktion(n); // Angenommen, Person hat eine Methode getId(), die eine eindeutige ID zurückgibt.
        tabelle[index] = new Link(n, tabelle[index]);
    }

    private int hashFunktion(int d) {
        return d % tabelle.length;
    }

    public boolean suche(int d) {
        int index = hashFunktion(d);

        Link current = tabelle[index];

        while (current != null) {
            if (current.daten == d) {
                return true;
            }
            current = current.naechster;
        }

        return false;
    }
}
