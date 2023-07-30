package Klausurvorbereitung.Trees.Klausur_39;

public class Main {
    public static void main(String[] args) {
        Binaerbaum baum = new Binaerbaum();

        baum.hinzufuegen(50);
        baum.hinzufuegen(30);
        baum.hinzufuegen(20);
        baum.hinzufuegen(40);
        baum.hinzufuegen(70);
        baum.hinzufuegen(60);
        baum.hinzufuegen(80);

        System.out.println("Ist der Baum ein Suchbaum? " + baum.istSuchbaum());

        // Das Minimum und das Maximum im Baum ausgeben
        System.out.println("Das Minimum im Baum ist: " + baum.minimum(baum.wurzel));
        System.out.println("Das Maximum im Baum ist: " + baum.maximum(baum.wurzel));



        System.out.println("Ist Baum ein Suchbaum (rekursiv)? " + baum.istSuchbaum());
        System.out.println("Ist Baum ein Suchbaum (iterativ)? " + baum.istSuchbaumIterativ());

        baum.hinzufuegen(85);
        baum.hinzufuegen(15);
        baum.hinzufuegen(45);

        System.out.println("Ist Baum ein Suchbaum (rekursiv)? " + baum.istSuchbaum());
        System.out.println("Ist Baum ein Suchbaum (iterativ)? " + baum.istSuchbaumIterativ());
    }

}
