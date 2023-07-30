package Klausurvorbereitung.Listen.Klausur_39;

public class Link {
    public String aktion;
    public int prioritaet;
    public Link naechster;

    public Link(String aktion, int prioritaet, Link naechster) {
        this.aktion = aktion;
        this.prioritaet = prioritaet;
        this.naechster = naechster;
    }
}
