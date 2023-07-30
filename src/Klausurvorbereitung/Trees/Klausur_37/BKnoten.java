package Klausurvorbereitung.Trees.Klausur_37;

public class BKnoten {
    public int[] schluessel;
    public BKnoten[] kinder;

    // Für Blätter
    public BKnoten(final int[] schluessel) {
        assert (schluessel != null);
        this.schluessel = schluessel;
        this.kinder = new BKnoten[schluessel.length + 1];
    }


    // Für innere Knoten
    public BKnoten(final int[] schluessel, final BKnoten[] kinder) {
        assert (schluessel != null);
        assert (kinder != null);
        assert (schluessel.length + 1 == kinder.length);
        this.schluessel = schluessel;
        this.kinder = kinder;
    }
}
