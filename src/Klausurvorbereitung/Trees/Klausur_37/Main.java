package Klausurvorbereitung.Trees.Klausur_37;

public class Main {
    public static void main(String[] args) {
        BKnoten[] kinderVonKnoten1 = new BKnoten[3];
        kinderVonKnoten1[0] = new BKnoten(new int[]{3});
        kinderVonKnoten1[1] = new BKnoten(new int[]{7});
        kinderVonKnoten1[2] = new BKnoten(new int[]{11});

        BKnoten wurzel = new BKnoten(new int[]{5, 10}, kinderVonKnoten1);

        BBaum baum = new BBaum();
        baum.wurzel = wurzel;

        System.out.println("Ist die Höhe des Baumes größer als 2 (iterativ)? " + baum.istHoeherAls(2));
        System.out.println("Ist der Baum binär (iterativ)? " + baum.istBinaerIterativ());
    }
}

