package Klausurvorbereitung.StudentnFragen.Frage_003;


import Klausurvorbereitung.Listen.Klausur_32.LinkGenerics;
import Klausurvorbereitung.Listen.Klausur_32.ListeGenerics;
import Klausurvorbereitung.StudentnFragen.Frage_001.Person;
import org.jetbrains.annotations.NotNull;

public class Hygienekonzept {
    public static void eintritt(@NotNull ListeGenerics<Person> warteschlange, ListeGenerics<Person> freibad) {
        if (warteschlange.anfang == null)
            return;

        LinkGenerics<Person> neuePerson = warteschlange.anfang;
        warteschlange.anfang = warteschlange.anfang.naechster;

        if (freibad.anfang == null)
            freibad.anfang = freibad.ende = neuePerson;
        else {
            neuePerson.naechster = freibad.anfang;
            freibad.anfang = neuePerson;
        }

    }
}
