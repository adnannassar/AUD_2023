package Klausurvorbereitung.StudentnFragen.Frage_001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListenSortierer {
    public static void sortiere(Liste liste) {
        ArrayList<Person> persons = new ArrayList<>();
        Person p;
        while ((p = liste.loesche()) != null) {
            persons.add(p);
        }

        Collections.sort(persons, Comparator.comparingInt(o -> o.alter));

        for (Person person : persons) {
            liste.fuegeEin(person);
        }
    }
}
