import java.util.*;
import java.io.*;
public class Ques20 {

    public static void divide(int a, int b) {
        int result = a / b; // Could throw ArithmeticException (unchecked)
        System.out.println("Result: " + result);
    }

    public static void readFile(String filename) throws IOException {
        //Reading a file (could throw IOException) (checked)
        throw new IOException("Simulated file read error"); 
    }

    public static void callReadFile(String filename) throws IOException {
        readFile(filename);
    }

    public static void main(String[] args) {
        try {
            callReadFile("non-existent.txt"); // Checked exception 
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage() + "\n Checked Exception");
        }

        // Unchecked exception (divide by zero)
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage() + "\n Unchecked Exception");
        }
        System.out.println();
        System.out.println("Demonstration of Checked and Unchecked Exceptions");
        System.out.println("");
        System.out.println("Implemented by- Priyanshu Thapliyal \t RollNumber- 46 \t CS4(A2)");
        System.out.println("");
    }
}
