package Komplexität.Aufgabe001;

import java.util.LinkedList;
import java.util.Map;

public class Aufgabe_001 {
    public static void main(String[] args) {
        gewinnerFürN(5);
    }

    public static int fak(int n) {
        if (n <= 1) return 1;
        return n * fak(n - 1);
    }

    public static double A1(int n) {
        return n * 1000;
    }

    public static double A2(int n) {
        return n * 100 * Math.log(n + 1);
    }

    public static double A3(int n) {
        return 10 * Math.pow(n, 2);
    }

    public static double A4(int n) {
        return Math.pow(n, 3);
    }

    public static double A5(int n) {
        return Math.pow(2, n);
    }

    public static double A6(int n) {
        return fak(n);
    }

    public static void gewinnerFürN(int n) {
        double[] array = {A1(n), A2(n), A3(n), A4(n), A5(n), A6(n)};
        double min = array[0];
        int indexOfMix = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexOfMix = i;
            }
        }
        System.out.println("Gweinner für n = " + n + " is A(" + (indexOfMix + 1) + ")");
    }


}
