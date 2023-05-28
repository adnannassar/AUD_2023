package Sort;

public class Util {
    public static void swap(int[] array, int a, int b) {
        if (array != null && array.length > 0 && (a >= 0 && a < array.length) && (b >= 0 && b < array.length)) {
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
    }


    public static void print(int array[]) {
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
