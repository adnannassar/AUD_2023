package Klausurvorbereitung.StudentnFragen.Frage_002;

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
