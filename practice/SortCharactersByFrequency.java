import java.lang.*;
import java.util.Scanner;
import java.util.*;

public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

        maxHeap.addAll(frequencyMap.keySet());

        StringBuilder sortedString = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char currentChar = maxHeap.poll();
            int frequency = frequencyMap.get(currentChar);
            for (int i = 0; i < frequency; i++) {
                sortedString.append(currentChar);
            }
        }

        return sortedString.toString();
    }

    public static void main(String[] args) {
        System.out.println("Program to sort characters of a given string s, sort it in decreasing order based on ");
        System.out.println(
                "The frequency of the characters. The frequency of a character is the number of times it appears in the string . ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        String result = frequencySort(input);
        System.out.println("Output: " + result);
        scanner.close();
        System.out.println("\n");
        System.out.println("********************************************************************");
        System.out.println("Implemented by : Priyanshu Thapliyal \tBtech CSE\tA2\t 46");
        System.out.println("********************************************************************");
        System.out.println("\n");
    }
}
