package Sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {10, 2, 5, 3, 1, 9, 0, 6};
        System.out.println("Before:");
        Util.print(array);
        bubbleSort(array);
        System.out.println("After :");
        Util.print(array);

    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    Util.swap(array, j, j+1);
                }
            }
        }
    }


}
