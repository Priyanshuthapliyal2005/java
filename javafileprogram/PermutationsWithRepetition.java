import java.lang.*;
import java.util.Scanner;

public class PermutationsWithRepetition {
    public static void printPermutations(String str, int n, String prefix) {
        if (prefix.length() == n) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            printPermutations(str, n, prefix + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        System.out.println("The permuted strings are:");
        printPermutations(str, str.length(), "");

        scanner.close();
        System.out.println("\n");
        System.out.println("********************************************************************");
        System.out.println("Implemented by : Priyanshu Thapliyal \tBtech CSE\tA2\t 46");
        System.out.println("********************************************************************");
        System.out.println("\n");
    }
}
