package Sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 5, 3, 1, 9, 0, 6};
        System.out.println("Before:");
        Util.print(array);
        quicksort(array, 0, array.length - 1);
        System.out.println("After :");
        Util.print(array);
    }


    public static void quicksort(int[] array, final int links, final int rechts)
    {
        final int pivot = array[(links + rechts) / 2];
        int li = links;
        int re = rechts;

        do
        {
            // Linker Zeiger
            while (array[li] < pivot)
                li++;

            // Rechter Zeiger
            while (array[re] > pivot)
                re--;

            if (li <= re) {
                // Elemente tauschen und Zeiger weiterbewegen (WICHTIG!)
                int temp = array[li];
                array[li++] = array[re];
                array[re--] = temp;
            }
        } while (li <= re);

        // Divide and conquer: rekursive Aufrufe f�r neue Teilbereiche
        if (links < re)
            quicksort(array, links, re);

        if (li < rechts)
            quicksort(array, li, rechts);
    }
}
