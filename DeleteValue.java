import java.util.Scanner;
import java.util.Arrays;

public class DeleteValue {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("mat[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int answer = 0;

            while (cols > 0) {
            int maxInRow = 0;

            for (int i = 0; i < rows; i++) {
                int maxVal = matrix[i][cols-1];
                maxInRow = Math.max(maxInRow, maxVal);
                matrix[i][cols - 1] = 0;
            }
            answer += maxInRow;
            cols--;
        }
        System.out.println("Output for grid1: " + (answer - 2) );
    }
 }