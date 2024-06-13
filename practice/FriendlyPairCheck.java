import java.util.Scanner;
public class FriendlyPairCheck {
    public static int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean areFriendlyPair(int num1, int num2) {
      int divisor_Sum1 = divisorSum(num1);
      int divisor_Sum2 = divisorSum(num2);
      if(divisor_Sum1 == num1 && divisor_Sum2 == num2)
          System.out.println("Abundant Numbers");
      else 
         System.out.println("Not Abundant Numbers");
      return (divisor_Sum1/num1 == divisor_Sum2/num2);
    }

    public static void main(String[] args) {
        System.out.println(" Friendly Pair are two or more numbers with a common abundance.");
        System.out.println("Example: (220, 284) is a friendly pair.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (areFriendlyPair(num1, num2)) {
            System.out.println("Friendly Pair");
        } else {
            System.out.println("Not Friendly Pair");
        }

        scanner.close();
        System.out.println("\n");
        System.out.println("********************************************************************");
        System.out.println("Implemented by : Priyanshu Thapliyal \tBtech CSE\tA2\t 46");
        System.out.println("********************************************************************");
        System.out.println("\n");
    }
}
