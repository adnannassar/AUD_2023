package Klausurvorbereitung.Trees.Klausur_36;

import java.util.LinkedList;
import java.util.Queue;

public class BBaum {
    private BKnoten wurzel;

    // Aufrufen der rekursiven Methode zum Berechnen der Höhe des Baums
    public int hoeheRecursive() {
        return berechneHoeheRecursive(wurzel);
    }

    private int berechneHoeheRecursive(BKnoten knoten) {
        // Basisfall für die Rekursion: wenn der Knoten null ist, ist die Höhe 0
        if (knoten == null) {
            return 0;
        }

        int maxHoehe = 0;
        // Für jeden Kindknoten berechnen wir die Höhe des Unterbaums und behalten den höchsten Wert
        for (BKnoten kind : knoten.kinder) {
            maxHoehe = Math.max(maxHoehe, berechneHoeheRecursive(kind));
        }

        // Rückgabe der maximalen Höhe + 1 (für den aktuellen Knoten)
        return maxHoehe + 1;
    }

    // Berechnung der Höhe des Baums auf iterative Weise
    public int hoeheIterative() {
        // Wenn der Baum leer ist, ist seine Höhe 0
        if (wurzel == null) {
            return 0;
        }

        // Initialisiere die Queue für die Breitensuche
        Queue<BKnoten> knotenQueue = new LinkedList<>();
        knotenQueue.add(wurzel);

        int hoehe = 0;
        while (!knotenQueue.isEmpty()) {
            // Die Anzahl der Knoten auf der aktuellen Höhe
            int levelSize = knotenQueue.size();

            // Entferne Knoten der aktuellen Höhe und füge ihre Kinder hinzu
            for(int i = 0; i < levelSize; i++) {
                BKnoten aktuellerKnoten = knotenQueue.poll();

                for (BKnoten kind : aktuellerKnoten.kinder) {
                    if (kind != null) {
                        knotenQueue.add(kind);
                    }
                }
            }

            // Erhöhe die Höhe nachdem wir alle Knoten auf der aktuellen Höhe besucht haben
            hoehe++;
        }

        // Rückgabe der Höhe des Baums
        return hoehe;
    }

    // Aufrufen der rekursiven Methode zum Berechnen der Anzahl der Knoten im Baum
    public int anzahlKnoten() {
        return berechneAnzahlKnotenRecursive(wurzel);
    }

    private int berechneAnzahlKnotenRecursive(BKnoten knoten) {
        // Basisfall für die Rekursion: wenn der Knoten null ist, gibt es keinen Knoten zu zählen
        if (knoten == null) {
            return 0;
        }

        int count = 1; // Zählt den aktuellen Knoten

        // Für jedes Kind zählen wir die Anzahl der Knoten im Unterbaum
        for (BKnoten kind : knoten.kinder) {
            count += berechneAnzahlKnotenRecursive(kind);
        }

        // Rückgabe der Anzahl der Knoten
        return count;
    }

    // Berechnung der Anzahl der Knoten auf iterative Weise
    public int anzahlKnotenIterative() {
        // Wenn der Baum leer ist, gibt es keinen Knoten zu zählen
        if (wurzel == null) {
            return 0;
        }

        // Initialisiere die Queue für die Breitensuche
        Queue<BKnoten> knotenQueue = new LinkedList<>();
        knotenQueue.add(wurzel);

        int anzahlKnoten = 0;
        while (!knotenQueue.isEmpty()) {
            BKnoten aktuellerKnoten = knotenQueue.poll();
            anzahlKnoten++; // Erhöhe den Zähler für jeden besuchten Knoten

            // Füge die Kinder des aktuellen Knotens zur Queue hinzu
            for (BKnoten kind : aktuellerKnoten.kinder) {
                if (kind != null) {
                    knotenQueue.add(kind);
                }
            }
        }

        // Rückgabe der Anzahl der Knoten
        return anzahlKnoten;
    }
}
