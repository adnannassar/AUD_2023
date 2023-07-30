package Klausurvorbereitung.Listen.Klausur_32;

public class Liste {
    private Link anfang, ende;

    public Liste() {
        anfang = ende = null;
    }

    public void anfuegen(int daten) {
        if (anfang == null) {
            anfang = new Link(daten, null);
            ende = anfang;
        } else {
            ende.naechster = new Link(daten, null);
            ende = ende.naechster;
        }
    }

    public Liste kopieren() {
        Liste kopie = new Liste();
        Link aktuell = anfang;
        while (aktuell != null) {
            kopie.anfuegen(aktuell.daten);
            aktuell = aktuell.naechster;
        }
        return kopie;
    }
}
