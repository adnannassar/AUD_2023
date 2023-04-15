package Komplexität;

import java.util.Random;

public class Komplexität {

    public static void main(String[] args) {
        int array[] = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt();
        }

        long start = System.nanoTime();
        //boolean erg = M(array, new Random().nextInt());
        N(array);
        long stop = System.nanoTime();
        long duration = stop - start;
       // System.out.println(erg + " --> linearSearch hat " + duration + "ns gedauert");
         System.out.println("linearSearch hat " + duration / 1000 + "ms gedauert");

        //proz1(100);

    }

    public static boolean M(int[] n, int nr) {
        boolean found = false;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == nr) {
                found = true;
            }
        }
        return found;
    }

    public static void N(int[] array) {
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }

    public static void proz1(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Test");
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Test");
        }

    }
}
