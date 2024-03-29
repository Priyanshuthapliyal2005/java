import java.lang.*;
import java.util.Scanner;

public class ReverseWords {
    public static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }
        return reversedWord.toString();
    }

    public static String reverseWords(String str) {
        StringBuilder reversedString = new StringBuilder();
        String[] words = str.split(" ");

        for (String word : words) {
            reversedString.append(reverseWord(word)).append(" ");
        }

        return reversedString.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        String reversedString = reverseWords(inputString);

        System.out.println("Output: " + reversedString);

        scanner.close();
        System.out.println("\n");
        System.out.println("********************************************************************");
        System.out.println("Implemented by : Priyanshu Thapliyal \tBtech CSE\tA2\t 46");
        System.out.println("********************************************************************");
        System.out.println("\n");
    }
}
