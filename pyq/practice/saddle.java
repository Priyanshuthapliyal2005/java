import java.util.*;

public class saddle {

    public static void findSaddle(int [][]matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;

        for(int i=0;i<rows;i++){
            int minRval=matrix[i][0];
            int colIndex=0;

            for(int j=1;j<cols;j++){
                if(matrix[i][j]<minRval){
                    minRval=matrix[i][j];
                    colIndex=j;
                }
            }

            boolean SaddlePoint=true;
            for(int k=0;k<rows;k++){
                if(matrix[k][colIndex] >minRval){
                    SaddlePoint=false;
                    break;
                }
            }

            if(SaddlePoint){
                System.out.println("Saddle point found at :("+i+","+colIndex+")"+" Value: "+minRval);
                return;
            }

        }
        System.out.println("No saddle point found.");
    }
    public static void main(String args[]){
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

        findSaddle(matrix);
    }
}
