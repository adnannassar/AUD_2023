package Klausurvorbereitung.Trees.Klausur_39;

import java.util.Stack;

public class Binaerbaum {
    public Knoten wurzel;

    public Binaerbaum() {
        this.wurzel = null;
    }

    public int minimum(Knoten knoten) {
        assert (knoten != null);
        Knoten aktuellerKnoten = knoten;

        while (aktuellerKnoten.linkesKind != null) {
            aktuellerKnoten = aktuellerKnoten.linkesKind;
        }
        return aktuellerKnoten.schluessel;
    }

    public int maximum(Knoten knoten) {
        assert (knoten != null);
        Knoten aktuellerKnoten = knoten;

        while (aktuellerKnoten.rechtesKind != null) {
            aktuellerKnoten = aktuellerKnoten.rechtesKind;
        }
        return aktuellerKnoten.schluessel;
    }


    public void hinzufuegen(int schluessel) {
        wurzel = hinzufuegenRekursiv(wurzel, schluessel);
    }

    private Knoten hinzufuegenRekursiv(Knoten aktueller, int schluessel) {
        if (aktueller == null) {
            return new Knoten(schluessel);
        }

        if (schluessel < aktueller.schluessel) {
            aktueller.linkesKind = hinzufuegenRekursiv(aktueller.linkesKind, schluessel);
        } else if (schluessel > aktueller.schluessel) {
            aktueller.rechtesKind = hinzufuegenRekursiv(aktueller.rechtesKind, schluessel);
        }

        return aktueller;
    }

    public boolean istSuchbaum() {
        return istSuchbaum(wurzel, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean istSuchbaum(Knoten knoten, int min, int max) {
        if (knoten == null) {
            return true;
        }

        if (knoten.schluessel < min || knoten.schluessel > max) {
            return false;
        }

        return (istSuchbaum(knoten.linkesKind, min, knoten.schluessel - 1) &&
                istSuchbaum(knoten.rechtesKind, knoten.schluessel + 1, max));
    }

    public boolean istSuchbaumIterativ() {
        Stack<Knoten> stack = new Stack<>();
        double inorder = -Double.MAX_VALUE;

        while (!stack.isEmpty() || wurzel != null) {
            while (wurzel != null) {
                stack.push(wurzel);
                wurzel = wurzel.linkesKind;
            }

            wurzel = stack.pop();

            if (wurzel.schluessel <= inorder) return false;
            inorder = wurzel.schluessel;

            wurzel = wurzel.rechtesKind;
        }

        return true;
    }
}

