package Klausurvorbereitung.Trees.Klausur_37;

import java.util.LinkedList;
import java.util.Queue;

public class BBaum {
    public BKnoten wurzel;

    // Methode zum Überprüfen, ob der Baum höher als eine gegebene Zahl n ist
    public boolean istHoeherAls(int n) {
        // Wenn der Baum leer ist, kann er nicht höher als n sein
        if (wurzel == null) {
            return false;
        }

        // Initialisiere die Queue für die Breitensuche
        Queue<BKnoten> knotenQueue = new LinkedList<>();
        knotenQueue.add(wurzel);
        // Beginnen wir bei -1, weil wir die Höhe der Wurzel selbst auch zählen
        int aktuelleHoehe = -1;

        while (!knotenQueue.isEmpty()) {
            // Die Anzahl der Knoten auf der aktuellen Höhe
            int anzahlKnotenAufDieserHoehe = knotenQueue.size();

            // Erhöhen der aktuellen Höhe
            aktuelleHoehe++;

            // Überprüfen, ob die aktuelle Höhe bereits größer als n ist
            if (aktuelleHoehe > n) {
                return true;
            }

            // Entfernen der Knoten der aktuellen Höhe und Hinzufügen der Knoten der nächsten Höhe
            for(int i = 0; i < anzahlKnotenAufDieserHoehe; i++) {
                BKnoten aktuellerKnoten = knotenQueue.poll();

                // Füge die Kinder des aktuellen Knotens zur Queue hinzu
                if (aktuellerKnoten.kinder != null) {
                    for (BKnoten kind : aktuellerKnoten.kinder) {
                        if (kind != null) {
                            knotenQueue.add(kind);
                        }
                    }
                }
            }
        }

        // Wenn wir die Schleife ohne vorzeitiges Beenden durchlaufen haben, ist der Baum nicht höher als n
        return false;
    }

    // Methode zur Überprüfung, ob der Baum binär ist
    public boolean istBinaer() {
        // Beginnt mit der Wurzel
        return pruefeObBinaer(wurzel);
    }

    private boolean pruefeObBinaer(BKnoten knoten) {
        // Ein leerer Baum (null Knoten) ist binär
        if (knoten == null) {
            return true;
        }

        // Ein Baum ist nicht binär, wenn ein Knoten mehr als zwei Kinder hat
        if (knoten.kinder.length > 2) {
            return false;
        }

        // Überprüft alle Kindknoten rekursiv
        for (BKnoten kind : knoten.kinder) {
            if (!pruefeObBinaer(kind)) {
                return false;
            }
        }

        // Wenn keiner der Knoten mehr als zwei Kinder hat, ist der Baum binär
        return true;
    }

    // Iterative Methode zur Überprüfung, ob der Baum binär ist
    public boolean istBinaerIterativ() {
        // Ein leerer Baum (null Knoten) ist binär
        if (wurzel == null) {
            return true;
        }

        // Initialisiere die Queue für die Breitensuche
        Queue<BKnoten> knotenQueue = new LinkedList<>();
        knotenQueue.add(wurzel);

        while (!knotenQueue.isEmpty()) {
            BKnoten aktuellerKnoten = knotenQueue.poll();

            // Ein Baum ist nicht binär, wenn ein Knoten mehr als zwei Kinder hat
            if (aktuellerKnoten.kinder.length > 2) {
                return false;
            }

            // Füge die Kinder des aktuellen Knotens zur Queue hinzu
            for (BKnoten kind : aktuellerKnoten.kinder) {
                if (kind != null) {
                    knotenQueue.add(kind);
                }
            }
        }

        // Wenn alle Knoten maximal zwei Kinder haben, ist der Baum binär
        return true;
    }
}


