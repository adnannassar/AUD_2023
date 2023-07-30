package Klausurvorbereitung.Listen.Klausur_39;

public class Prioritaetsliste {

    private Link anfang;

    public Prioritaetsliste() {
        anfang = null; // Leere Liste
    }

    public void einfuegen(String aktion, int prioritaet) {
        assert (aktion != null);
        anfang = new Link(aktion, prioritaet, anfang);
    }

    public Link findeHoechstePrioritaet() {
        if (anfang == null) {
            return null;
        }
        Link current = anfang;
        Link maxPrioritaet = anfang;
        while (current != null) {
            if (current.prioritaet > maxPrioritaet.prioritaet) {
                maxPrioritaet = current;
            }
            current = current.naechster;
        }
        return maxPrioritaet;
    }

    public String entferneAktionMitHoechsterPrioritaet() {
        Link maxLink = findeHoechstePrioritaet();
        if (maxLink == null) {
            return null;
        }

        if (maxLink == anfang) {
            anfang = anfang.naechster;
            return maxLink.aktion;
        } else {
            Link current = anfang;
            while (current.naechster != maxLink) {
                current = current.naechster;
            }
            current.naechster = maxLink.naechster;
            return maxLink.aktion;
        }
    }
}
