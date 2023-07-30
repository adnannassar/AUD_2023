package Klausurvorbereitung.Listen.Klausur_32;

public class Link
{
    public int daten;
    public Link naechster;
    public Link(int daten, Link naechster)
    {
        this.daten = daten;
        this.naechster = naechster;
    }
}
