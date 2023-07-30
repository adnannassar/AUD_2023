package Klausurvorbereitung.Listen.Klausur_32;

public class ListeGenerics<T> {
    public LinkGenerics<T> anfang, ende;

    public ListeGenerics()
    {
        anfang = ende = null;
    }

    public void anfuegen(T daten)
    {
        if (anfang == null) {
            anfang = new LinkGenerics<>(daten, null);
            ende = anfang;
        } else {
            ende.naechster = new LinkGenerics<>(daten, null);
            ende = ende.naechster;
        }
    }

    public ListeGenerics<T> kopieren()
    {
        ListeGenerics<T> kopie = new ListeGenerics<>();
        LinkGenerics<T> aktuell = anfang;
        while (aktuell != null) {
            kopie.anfuegen(aktuell.daten);
            aktuell = aktuell.naechster;
        }
        return kopie;
    }
}
