package Klausurvorbereitung.StudentnFragen.Frage_001;

public class Liste {
    private Link anfang;

    public Link getAnfang() {
        return anfang;
    }

    public void fuegeEin(Person p) {
        anfang = new Link(p, anfang);
    }

    public Person loesche() {
        if (anfang == null) {
            return null;
        } else {
            Person p = anfang.daten;
            anfang = anfang.naechster;
            return p;
        }
    }

    public int getAnzahl() {
        int count = 0;
        Link current = anfang;
        while (current != null) {
            count++;
            current = current.naechster;
        }
        return count;
    }
}
