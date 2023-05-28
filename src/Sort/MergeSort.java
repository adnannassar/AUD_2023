package Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 5, 3, 1, 9, 0, 6};
        System.out.println("Before:");
        Util.print(array);
        mergeSort(array);
        System.out.println("After :");
        Util.print(array);


    }

    public static void mergeSort(int array[]) {
        if (array.length > 1) {
            int firstHalf[] = new int[array.length / 2];
            System.arraycopy(array, 0, firstHalf, 0, firstHalf.length);
            mergeSort(firstHalf);
            int secondHalf[] = new int[array.length - firstHalf.length];
            System.arraycopy(array, firstHalf.length, secondHalf, 0, secondHalf.length);
            mergeSort(secondHalf);
            merge(firstHalf, secondHalf, array);
        }

    }

    public static void merge(int a[], int b[], int c[]) {
        int aIndex = 0;
        int bIndex = 0;
        int cIndex = 0;
        while (aIndex < a.length && bIndex < b.length) {
            if (a[aIndex] < b[bIndex]) {
                c[cIndex++] = a[aIndex++];
            } else {
                c[cIndex++] = b[bIndex++];
            }
        }
        while (aIndex < a.length) {
            c[cIndex++] = a[aIndex++];
        }
        while (bIndex < b.length) {
            c[cIndex++] = b[bIndex++];
        }
    }

    public static void PritntArray(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
