package Klausurvorbereitung.StudentnFragen.Frage_001;

public class Main {


    public static void main(String[] args) {
        // Create a new Liste
        Liste liste = new Liste();

        // Add some Person objects to the list
        liste.fuegeEin(new Person("Smith", "John", 45));
        liste.fuegeEin(new Person("Doe", "Jane", 25));
        liste.fuegeEin(new Person("Murray", "Bill", 70));

        // Print the initial state of the list
        System.out.println("Initial state:");
        printList(liste);

        // Print the initial count of the list
        System.out.println("Initial count: " + liste.getAnzahl());

        // Remove the first element of the list
        Person deletedPerson = liste.loesche();
        System.out.println("\nDeleted: " + deletedPerson.vorname + " " + deletedPerson.name + ", age " + deletedPerson.alter);

        // Print the state of the list after deletion
        System.out.println("State after deletion:");
        printList(liste);

        // Print the count of the list after deletion
        System.out.println("Count after deletion: " + liste.getAnzahl());

        // Sort the list
        ListenSortierer.sortiere(liste);

        // Print the sorted list
        System.out.println("\nSorted state:");
        printList(liste);

        // Print the final count of the list
        System.out.println("Final count: " + liste.getAnzahl());
    }

    public static void printList(Liste liste) {
        Link current = liste.getAnfang();
        while (current != null) {
            Person p = current.daten;
            System.out.println(p.vorname + " " + p.name + ", age " + p.alter);
            current = current.naechster;
        }
    }
}
