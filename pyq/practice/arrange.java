import java.util.*;

public class arrange {
    public static void rearrange (int []arr){
        int n=arr.length;
        int pivot=0;

        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(i!=pivot){
                    int temp=arr[i];
                    arr[i]=arr[pivot];
                    arr[pivot]=temp;

                }
                pivot++;
            }
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array elements separated by space:");
        String[] input=s.nextLine().split(" ");
        int[] arr=new int[input.length];
        for(int i=0;i<input.length;i++){
            arr[i]=Integer.parseInt(input[i]);

        }
        rearrange(arr);

        System.out.println("Rearranged array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
