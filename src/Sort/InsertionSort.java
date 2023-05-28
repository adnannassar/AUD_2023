package Sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 5, 3, 1, 9, 0};
        System.out.println("Before:");
        Util.print(array);

        insertionSort(array);
        System.out.println("After :");
        Util.print(array);

    }


    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    Util.swap(array, j, j - 1);
                }
            }
        }
    }
}
