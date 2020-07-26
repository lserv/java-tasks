package io.lenur.array;

public class MatrixHelper {
    public static int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static int[][] sum(int[][] from, int[][] to) {
        int[][] result = new int[from.length][from[0].length];

        for (int i = 0; i < from.length; i++) {
            for (int j = 0; j < from[0].length; j++) {
                result[i][j] = from[i][j] + to[i][j];
            }
        }

        return result;
    }
}
