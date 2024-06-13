import java.util.Scanner;

public class StringOccurrenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.println("Enter the substring to find: ");
        String subString = scanner.nextLine();
        int count = countOccurrences(mainString, subString);
        System.out.println("'" + subString + "' has occurred " + count + " times in '" + mainString + "'");
        scanner.close();
        System.out.println("\n");
  System.out.println("********************************************************************");
        System.out.println("Implemented by : Priyanshu Thapliyal \tBtech CSE\tA2\t 46");
        System.out.println("********************************************************************");
        System.out.println("\n");
    }
    public static int countOccurrences(String text, String search) {
        int count = 0;
        int index = 0;
        
        while ((index = text.indexOf(search, index)) != -1) {
            count++;
            index += search.length(); 
        }
        
        return count;
   

    }
}