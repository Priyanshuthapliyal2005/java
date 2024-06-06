import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ques31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int[] letterCount = new int[26];

        // Convert the input string to lowercase and iterate through the characters
        for (char c : input.toLowerCase().toCharArray()) {
            // Check if the character is a lowercase letter between 'a' and 'z'
            if (c >= 'a' && c <= 'z') {
                // Calculate the index of the letter in the letterCount array
                int index = c - 'a';
                // Increment the count at the calculated index
                letterCount[index]++;
            }
        }

        List<LetterCount> letterCountList = new ArrayList<>();

        // Iterate through the letterCount array and create LetterCount objects
        for (int i = 0; i < 26; i++) {
            if (letterCount[i] > 0) {
                char letter = (char) ('a' + i);
                int count = letterCount[i];
                LetterCount letterCountObj = new LetterCount(letter, count);
                letterCountList.add(letterCountObj);
            }
        }

        // Sort the letterCountList using Collections.sort()
        Collections.sort(letterCountList);

        System.out.println("Letter count:");

        // Iterate through the sorted letterCountList and print the LetterCount objects
        for (LetterCount lc : letterCountList) {
            System.out.println(lc);
        }
        System.out.println("*************************************************************************");
        System.out.println("Implemented By: Priyanshu Thapliyal\t Class Roll No. 46\t CSE4(A2)");
        System.out.println("*************************************************************************");
    }
}

class LetterCount implements Comparable<LetterCount> {
    char letter;
    int count;

    public LetterCount(char letter, int count) {
        this.letter = letter;
        this.count = count;
    }

    @Override
    public int compareTo(LetterCount other) {
        return this.letter - other.letter;
    }

    @Override
    public String toString() {
        return "{" + this.letter + "=" + this.count + "}";
    }
}

