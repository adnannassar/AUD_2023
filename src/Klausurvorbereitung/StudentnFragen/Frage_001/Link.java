package Klausurvorbereitung.StudentnFragen.Frage_001;

public class Link
{
    public Person daten;
    public Link naechster;
    public Link(Person daten, Link naechster)
    {
        this.daten = daten;
        this.naechster = naechster;
    }
}
