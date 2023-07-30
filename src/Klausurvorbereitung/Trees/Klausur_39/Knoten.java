package Klausurvorbereitung.Trees.Klausur_39;

public class Knoten {
    public int schluessel;
    public Knoten linkesKind;
    public Knoten rechtesKind;

    public Knoten(int schluessel) {
        this.schluessel = schluessel;
        this.linkesKind = null;
        this.rechtesKind = null;
    }
}
