package Recusrion;

import java.util.Stack;

public class Recursion {
    private static int counter = 0;

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Fakultät Iterative von " + n + " = " + fakultät_Iterative(n));
        System.out.println("Fakultät Recursive von " + n + " = " + fakultät_Recursive(n));

        for (int i = 3; i <= 6; i++) {
            proz1(i);
            System.out.println(i + " --> " + counter);
            counter = 0;
        }
    }

    public static int fakultät_Iterative(int n) {
        int summ = 1;
        for (int i = 1; i <= n; i++) {
            summ *= i;
        }
        return summ;
    }

    public static int fakultät_Recursive(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fakultät_Recursive(n - 1);
        }
    }

    public static void proz1(int n) {
        tuwas();
        if (n > 1) {
            proz1(n - 1);
            proz1(n - 1);
        }
    }


    private static void tuwas() {
        counter++;
    }
}




