import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ques33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers separated by spaces:");
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");
        int[] intArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            intArray[i] = Integer.parseInt(inputArray[i]);
        }

        System.out.println("Original array: " + Arrays.toString(intArray));

        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : intArray) {
            uniqueSet.add(num);
        }

        int[] uniqueArray = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            uniqueArray[i] = num;
            i++;
        }

        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
        System.out.println("*************************************************************************");
        System.out.println("Implemented By: Priyanshu Thapliyal\t Class Roll No. 46\t CSE4(A2)");
        System.out.println("*************************************************************************");
    }
}


