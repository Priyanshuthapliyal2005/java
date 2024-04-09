import java.util.*;

public class temp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String cities[] = { "delhi", "bombay", "calcutta", "dehradun", "madras" };
        int temp[][] = new int[5][3];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter temperature for " + cities[i] + "=");
            for (int j = 0; j < 3; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temp[i][j] = sc.nextInt();
            }
        }

        int maxTemp[] = new int[5];
        String maxCities[] = new String[5];
        int minTemp[] = new int[5];
        String minCities[] = new String[5];

        for(int i=0;i<5;i++){
            int max=Integer.MIN_VALUE;
            String maxCity="";
            int min=Integer.MAX_VALUE;
            String minCity="";

            for(int j=0;j<3;j++){
                if(temp[i][j]>max){
                    max=temp[i][j];
                    maxCity=cities[i];
                }
                if(temp[i][j]<min){
                    min=temp[i][j];
                    minCity=cities[i];
                }
                maxTemp[i]=max;
                maxCities[i]=maxCity;
                minTemp[i]=min;
                minCities[i]=minCity;
            }
        }

        for(int i=0;i<5;i++){
            System.out.println("Maximum Temperature is " + maxTemp[i] + " on Day " + (i + 1) + " of this month in " + maxCities[i]);
            System.out.println("Minimum Temperature is " + minTemp[i] + " on Day " + (i + 1) + " of this month in " + minCities[i]);
        }
        

        // for (int j = 0; j < 3; j++) { // loop for each day
        //     int max = Integer.MIN_VALUE;
        //     int min = Integer.MAX_VALUE;
        //     String maxCity = "";
        //     String minCity = "";
        //     for (int i = 0; i < 5; i++) { // loop for each city on the same day
        //         if (temp[i][j] > max) {
        //             max = temp[i][j];
        //             maxCity = cities[i];
        //         }
        //         if (temp[i][j] < min) {
        //             min = temp[i][j];
        //             minCity = cities[i];
        //         }
        //     }
        //     maxTemp[j] = max;
        //     maxCities[j] = maxCity;
        //     minTemp[j] = min;
        //     minCities[j] = minCity;
        // }

        // for (int i = 0; i < 3; i++) {
        //     System.out.println("Maximum Temperature is " + maxTemp[i] + " on Day " + (i + 1) + " of this month in " + maxCities[i]);
        //     System.out.println("Minimum Temperature is " + minTemp[i] + " on Day " + (i + 1) + " of this month in " + minCities[i]);
        // }

        sc.close();
    }
}
