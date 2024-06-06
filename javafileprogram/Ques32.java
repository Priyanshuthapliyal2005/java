import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Ques32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the items (key-value pairs separated by a space): ");
        String input = scanner.nextLine();
        scanner.close();


        Map<String, Double> items = new HashMap<>();
        String[] pairs = input.split(" ");
        for (int i = 0; i < pairs.length; i += 2) {
            items.put(pairs[i], Double.parseDouble(pairs[i + 1]));
        }


        Map<String, Double> sortedItems = new LinkedHashMap<>();
        items.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(3)
                .forEach(entry -> sortedItems.put(entry.getKey(), entry.getValue()));


        System.out.println("Top three items:");
        for (Map.Entry<String, Double> entry : sortedItems.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("*************************************************************************");
        System.out.println("Implemented By: Priyanshu Thapliyal\t Class Roll No. 46\t CSE4(A2)");
        System.out.println("*************************************************************************");
    }
}
