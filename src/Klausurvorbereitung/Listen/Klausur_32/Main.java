package Klausurvorbereitung.Listen.Klausur_32;

public class Main {
    public static void main(String[] args) {
        Liste liste = new Liste();
        liste.anfuegen(1);
        liste.anfuegen(2);

        Liste liste2 = liste.kopieren();


        ListeGenerics<String> listeGenerics = new ListeGenerics<>();
        listeGenerics.anfuegen("Hello");
        listeGenerics.anfuegen("World");
        ListeGenerics<String> kopie = listeGenerics.kopieren();
    }
}
