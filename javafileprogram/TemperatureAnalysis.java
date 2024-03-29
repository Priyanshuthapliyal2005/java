import java.util.Scanner;
public class TemperatureAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cities = {"Delhi", "Mumbai", "Kolkata", "Chennai", "Dehradun"};
        int[][] temperatures = new int[5][4];

        for (int i = 0; i < cities.length; i++) {
            System.out.println("Enter temperatures for " + cities[i] + ":");
            for (int j = 0; j < 4; j++) { 
                System.out.print("Day " + (j + 1) + ": ");
                temperatures[i][j] = scanner.nextInt();
            }
        }

        int maxTemp = Integer.MIN_VALUE;
        int minTemp = Integer.MAX_VALUE;
        String maxCity = "", minCity = "";
        int maxDay = 0, minDay = 0;

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (temperatures[i][j] > maxTemp) {
                    maxTemp = temperatures[i][j];
                    maxCity = cities[i];
                    maxDay = j + 1;
                }
                if (temperatures[i][j] < minTemp) {
                    minTemp = temperatures[i][j];
                    minCity = cities[i];
                    minDay = j + 1;
                }
            }
        }

        System.out.println("Maximum Temperature is " + maxTemp + " on Day " + maxDay + " of this month in " + maxCity);
        System.out.println("Minimum Temperature is " + minTemp + " on Day " + minDay + " of this month in " + minCity);

        scanner.close();

        System.out.println("\n");
        System.out.println("********************************************************************");
        System.out.println("Implemented by : Priyanshu Thapliyal \tBtech CSE\tA2\t 46");
        System.out.println("********************************************************************");
        System.out.println("\n");
    }
}
