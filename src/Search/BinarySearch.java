package Search;

import Sort.Util;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {57, 16, 62, 30, 80, 7, 21, 78, 87, 15, 41};

        // Sorting the array before performing binary search
        Sort.QuickSort.quicksort(array, 0, array.length-1);
        Util.print(array);

        int n = 80;
        int m = 200;

        // Test iterative binary search
        int searchResultNIterative = binarySearchIterative(array, n);
        int searchResultMIterative = binarySearchIterative(array, m);

        // Test recursive binary search
        int searchResultNRecursive = binarySearchRecursive(array, 0, array.length - 1, n);
        int searchResultMRecursive = binarySearchRecursive(array, 0, array.length - 1, m);

        System.out.println("\nIterative and Recursive for " + n);
        printSearchResult("Iterative", n, searchResultNIterative);
        printSearchResult("Recursive", n, searchResultNRecursive);

        System.out.println("\nIterative and Recursive for " + m);
        printSearchResult("Iterative", m, searchResultMIterative);
        printSearchResult("Recursive", m, searchResultMRecursive);
    }

    public static void printSearchResult(String method, int nr, int result) {
        if (result != -1) {
            System.out.println(method + " : is " + nr + " exist ? --> true,  in the index " + result);
        } else {
            System.out.println(method + " : is " + nr + " exist ? --> false");
        }
    }


    public static int binarySearchIterative(int[] array, int nr) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int m = left + (right - left) / 2;
            if (array[m] == nr) {
                return m;
            }
            if (array[m] < nr) {
                left = m + 1;
            } else {
                right = m - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] array, int left, int right, int nr) {
        if (left <= right) {
            int m = left + (right - left) / 2;
            if (array[m] == nr) {
                return m;
            }
            if (array[m] < nr) {
                return binarySearchRecursive(array, m + 1, right, nr);
            } else {
                return binarySearchRecursive(array, left, m - 1, nr);
            }
        }
        return -1;
    }
}
