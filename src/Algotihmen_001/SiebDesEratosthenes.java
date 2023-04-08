package Algotihmen_001;

public class SiebDesEratosthenes {
    private static int[] array;

    public static void main(String[] args) {
        siebDesEratosthenes(25);

        print(array);
    }

    public static void siebDesEratosthenes(int n) {
        array = new int[n];
        for (int i = 1; i <= n; i++) {
            array[i - 1] = i;
        }
        print(array);
        druchstreichen(1);
        int i = 2;
        while ((i * i) <= n) {
            if (!istDeuchgestrichen(i)) {
                streicheVielfaches(i, n);
            }
            i++;
        }
    }

    private static void streicheVielfaches(int i, int n) {
        for (int a = i; a <= n; a += i) {
            if (a != i) {
                druchstreichen(a);
            }
        }
    }

    public static void druchstreichen(int a) {
        array[a - 1] = 0;
    }

    public static boolean istDeuchgestrichen(int a) {
        return array[a - 1] == 0;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

}
