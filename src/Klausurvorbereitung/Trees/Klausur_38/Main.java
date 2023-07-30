package Klausurvorbereitung.Trees.Klausur_38;

public class Main {
    public static void main(String[] args) {
        Binaerbaum baum = new Binaerbaum();

        // Hinzufügen von Knoten zum Baum
        baum.add(5);
        baum.add(3);
        baum.add(7);
        baum.add(2);
        baum.add(4);
        baum.add(6);
        baum.add(8);

        // Höhe des Baums berechnen
        System.out.println("Die Höhe des Baums ist: " + baum.hoehe());

        // Anzahl der Blätter berechnen
        System.out.println("Die Anzahl der Blätter im Baum ist: " + baum.anzahlBlaetter());

        // Überprüfung, ob der Baum vollständig ist
        System.out.println("Der Baum ist vollständig: " + baum.istVollstaendig());

        // Prüfen, ob ein spezifischer Knoten ein Blatt ist
        System.out.println("Knoten mit Schlüssel 4 ist ein Blatt: " + baum.istBlatt(baum.getWurzel().linkesKind.rechtesKind));
    }
}

