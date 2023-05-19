package Matrix;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Before: ");
        print(matrix);
        System.out.println();
        int[][] transposedMatrix = transpose(matrix, true, 270);
        System.out.println("After: ");
        print(transposedMatrix);


    }

    public static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    public static int[][] transpose(int[][] matrix, boolean rotate, int degree) {
        if (rotate) {
            switch (degree) {
                case 90:
                    return rotate90(matrix);
                case 180:
                    return rotate180(matrix);
                case 270:
                    return rotate270(matrix);
            }
        }
        return transpose(matrix);
    }

    private static int[][] rotate90(int[][] matrix) {
        int[][] transposedMatrix = transpose(matrix);
        for (int[] row : transposedMatrix) {
            reverse(row);
        }
        return transposedMatrix;
    }

    public static int[][] rotate180(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[matrix.length - 1 - i][matrix[i].length - 1 - j] = matrix[i][j];
            }
        }
        return result;
    }

    public static int[][] rotate270(int[][] matrix) {
        int[][] transposedMatrix = transpose(matrix);
        for (int i = 0; i < transposedMatrix.length / 2; i++) {
            int[] temp = transposedMatrix[i];
            transposedMatrix[i] = transposedMatrix[transposedMatrix.length - 1 - i];
            transposedMatrix[transposedMatrix.length - 1 - i] = temp;
        }
        return transposedMatrix;
    }

    private static void reverse(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }


}
