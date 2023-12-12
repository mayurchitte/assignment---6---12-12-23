import java.util.Scanner;
import java.util.Arrays;

public class CountNegative {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the matrix: ");
        int m = sc.nextInt();

        int[][] matrix = new int[m][m];

        System.out.println("Enter the elements of the matrix:");

        int count =0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("mat[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] < 0) {
                count++;
         }
        }
    }   
        System.out.println("There are"+ " " + count + " " + "negative numbers in the matrix");
}
}