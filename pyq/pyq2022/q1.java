import java.util.*;

public class q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int []marks=new int[150];

        System.out.println("Enter marks:");
        for(int i=0;i<150;i++){
            marks[i]=sc.nextInt();
        }

        int []count=new int[5];

        for (int mark :marks){
            if(mark>=101 && mark<=150){
                count[0]++;
            }
            else if(mark>=51 && mark<=100){
                count[1]++;
            }
            else if(mark>=0 && mark<=50){
                count[2]++;
            }
            else if(mark==-1){
                count[3]++;
            }
            else{
                count[4]++;
            }
        }

        System.out.println("Number of students in range 101-150: "+count[0]);
        System.out.println("Number of students in range 51-100: "+count[1]);
        System.out.println("Number of students in range 0-50: "+count[2]);
        System.out.println("Number of students absent: "+count[3]);
        System.out.println("Number of students with invalid marks: "+count[4]);

        sc.close();
    }
}