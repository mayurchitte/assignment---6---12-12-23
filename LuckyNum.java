import java.util.Scanner;
import java.util.Arrays;

public class LuckyNum {
    private static void PrintLuckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] minRow = new int[m];
        for (int i = 0; i < m; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < n; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            minRow[i] = min;
        }

        int[] maxColumn = new int[n];
        for (int j = 0; j < n; j++) {
            int max = matrix[0][j];
            for (int i = 1; i < m; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            maxColumn[j] = max;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == minRow[i] && matrix[i][j] == maxColumn[j]) {
                    System.out.println("Lucky Number: " + matrix[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };

        PrintLuckyNumbers(matrix);
    }
}