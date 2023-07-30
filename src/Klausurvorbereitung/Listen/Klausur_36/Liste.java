package Klausurvorbereitung.Listen.Klausur_36;

public class Liste {
    private Link anfang, ende;


    public Link getAnfang() {
        return anfang;
    }

    public Link getEnde() {
        return ende;
    }

    public Liste() {
        anfang = ende = null; // Leere Liste
    }

    public void add(String daten) {
        Link newLink = new Link(daten, null);
        if (ende != null) {
            ende.naechster = newLink;
        }
        ende = newLink;
        if (anfang == null) {
            anfang = ende;
        }
    }

    public void kopieren() {
        if (anfang != null) {
            Link copiedLink = new Link(anfang.daten, null);
            if (ende != null) {
                ende.naechster = copiedLink;
            }
            ende = copiedLink;
            if (anfang.naechster == null) {
                anfang.naechster = ende;
            }
        }
    }

    public int zaehlen(String s) {
        assert (s != null);
        int count = 0;
        Link current = anfang;
        while (current != null) {
            if (current.daten.equals(s)) {
                count++;
            }
            current = current.naechster;
        }
        return count;
    }

}
