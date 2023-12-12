import java.util.Scanner;
import java.util.Arrays;
public class DiagonalSum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the square matrix: ");
        int size = sc.nextInt();

        int[][] matrix = new int[size][size];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("mat[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        
       int sum = 0;
       int PrimaryDiagonal = 0;
       int SecondaryDiagonal = 0;

       for(int i = 0; i < matrix.length; i++){
        for (int j = 0; j < matrix.length; j++) {
            if(i == j)  {
                PrimaryDiagonal = PrimaryDiagonal + matrix[i][j];
                }
            } 
            SecondaryDiagonal = SecondaryDiagonal + matrix[i][matrix.length-1-i];
        }  
    
            System.out.println("PrimaryDiagonal: "+ PrimaryDiagonal);
            System.out.println("SecondaryDiagonal: "+ SecondaryDiagonal);
            sum = PrimaryDiagonal + SecondaryDiagonal;
            System.out.println("Sum of the matrix diagonals is: "+sum);
    }
    }