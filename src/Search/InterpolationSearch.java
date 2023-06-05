package Search;

public class InterpolationSearch {

    public static int interpolationSearch(int[] array, int elementToSearch) {
        int startIndex = 0, endIndex = (array.length - 1);
        int attempts = 0;  // to count the number of attempts

        while (startIndex <= endIndex && elementToSearch >= array[startIndex] && elementToSearch <= array[endIndex]) {
            // Increase attempt count
            attempts++;

            // Estimate mid point
            int pos = startIndex + ((elementToSearch - array[startIndex]) *
                    (endIndex - startIndex)) / (array[endIndex] - array[startIndex]);

            // If element is found
            if (array[pos] == elementToSearch) {
                System.out.println("Element found after " + attempts + " attempts.");
                return pos;
            }

            // If element is larger, element is in upper part
            if (array[pos] < elementToSearch) {
                startIndex = pos + 1;
            }

            // If element is smaller, element is in lower part
            else {
                endIndex = pos - 1;
            }
        }
        System.out.println("Element not found after " + attempts + " attempts.");
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int index = interpolationSearch(array, 18);

        // If element was found
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
