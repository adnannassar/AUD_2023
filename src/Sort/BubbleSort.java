package Sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {10, 2, 5, 3, 1, 9, 0};
        System.out.println("Before:");
        print(array);
        bubbleSort(array);
        System.out.println("After :");
        print(array);

    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                        swap(array, j, j+1);
                }
            }
        }

    }

    private static void swap(int[] array, int a, int b) {
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
