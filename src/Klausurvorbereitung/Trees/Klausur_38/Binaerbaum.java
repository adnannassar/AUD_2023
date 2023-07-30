package Klausurvorbereitung.Trees.Klausur_38;

public class Binaerbaum {
    private Knoten wurzel;

    public Knoten getWurzel() {
        return wurzel;
    }

    public void add(int schluessel) {
        wurzel = addRekursiv(wurzel, schluessel);
    }

    private Knoten addRekursiv(Knoten aktueller, int schluessel) {
        if (aktueller == null) {
            return new Knoten(schluessel);
        }

        if (schluessel < aktueller.schluessel) {
            aktueller.linkesKind = addRekursiv(aktueller.linkesKind, schluessel);
        } else if (schluessel > aktueller.schluessel) {
            aktueller.rechtesKind = addRekursiv(aktueller.rechtesKind, schluessel);
        }

        return aktueller;
    }
    public int hoehe() {
        return hoehe(wurzel);
    }

    private int hoehe(Knoten knoten) {
        if (knoten == null) {
            return 0;
        } else {
            return 1 + Math.max(hoehe(knoten.linkesKind), hoehe(knoten.rechtesKind));
        }
    }

    public boolean istBlatt(Knoten knoten) {
        assert(knoten != null);
        return knoten.linkesKind == null && knoten.rechtesKind == null;
    }

    public int anzahlBlaetter() {
        return anzahlBlaetter(wurzel);
    }

    private int anzahlBlaetter(Knoten knoten) {
        if (knoten == null) {
            return 0;
        } else if (istBlatt(knoten)) {
            return 1;
        } else {
            return anzahlBlaetter(knoten.linkesKind) + anzahlBlaetter(knoten.rechtesKind);
        }
    }

    public boolean istVollstaendig() {
        int knotenAnzahl = countNodes(wurzel);
        int blaetterAnzahl = anzahlBlaetter();

        return Math.pow(2, hoehe()) - 1 == knotenAnzahl && Math.pow(2, hoehe() - 1) == blaetterAnzahl;
    }

    private int countNodes(Knoten knoten) {
        if (knoten == null) {
            return 0;
        } else {
            return 1 + countNodes(knoten.linkesKind) + countNodes(knoten.rechtesKind);
        }
    }
}
