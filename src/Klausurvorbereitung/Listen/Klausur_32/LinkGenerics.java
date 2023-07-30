package Klausurvorbereitung.Listen.Klausur_32;

public class LinkGenerics<T> {

    public T daten;
    public LinkGenerics<T> naechster;

    public LinkGenerics(T daten, LinkGenerics<T> naechster) {
        this.daten = daten;
        this.naechster = naechster;
    }
}
