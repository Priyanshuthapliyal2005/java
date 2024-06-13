import java.lang.*;
import java.util.Scanner;

public class SaddlePoint {
    public static void findSaddlePoint(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int minRowValue = matrix[i][0];
            int colIndex = 0;

            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < minRowValue) {
                    minRowValue = matrix[i][j];
                    colIndex = j;
                }
            }

            boolean saddlePoint = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][colIndex] > minRowValue) {
                    saddlePoint = false;
                    break;
                }
            }

            if (saddlePoint) {
                System.out.println("Saddle point found at: (" + i + ", " + colIndex + ")"  + " Value: " + minRowValue);
                return;
            }
        }

        System.out.println("No saddle point found.");
    }

    public static void main(String[] args) {
        System.out.println("Program to find the saddle point coordinates in a given matrix.");
        System.out.println("A saddle point is an element in the matrix such that it is the minimum element in its row and maximum element in its column.");
        System.out.println("Example: In the matrix below, 7 is a saddle point at (2, 0).");
        System.out.println("1 2 3");
        System.out.println("4 5 6");
        System.out.println("7 8 9");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        findSaddlePoint(matrix);

        scanner.close();
        System.out.println("\n");
        System.out.println("********************************************************************");
        System.out.println("Implemented by : Priyanshu Thapliyal \tBtech CSE\tA2\t 46");
        System.out.println("********************************************************************");
        System.out.println("\n");
    }
}


