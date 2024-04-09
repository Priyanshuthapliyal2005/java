import java.util.Scanner;

public class RearrangePositiveNegative {
    public static void rearrange(int[] arr) {
        int n = arr.length;
        int pivot = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != pivot) {
                    int temp = arr[i];
                    arr[i] = arr[pivot];
                    arr[pivot] = temp;
                }
                pivot++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(" problem to rearrange positive and negative numbers in an array .");
        System.out.println("Example: Input: 1 -2 3 -4 5 -6 7 -8 9 -10");
        System.out.println("Output: -2 -4 -6 -8 -10 1 3 5 7 9");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array elements separated by space:");
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        rearrange(arr);

        System.out.println("Rearranged array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
        System.out.println("\n");
        System.out.println("********************************************************************");
        System.out.println("Implemented by : Priyanshu Thapliyal \tBtech CSE\tA2\t 46");
        System.out.println("********************************************************************");
        System.out.println("\n");
    }
}
