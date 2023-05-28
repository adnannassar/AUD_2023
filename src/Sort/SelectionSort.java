package Sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 5, 3, 1, 9, 0};
        System.out.println("Before:");
        Util.print(array);
        selectionSort(array);
        System.out.println("After :");
        Util.print(array);

    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            Util.swap(array, i, min);
        }
    }
}
