import java.util.*;

public class permutation {
    public static void printPermutation(String s,int n,String prefix){
        if(prefix.length()==n){
            System.out.println(prefix);
            return;
        }

        for(int i=0;i<s.length();i++){
            printPermutation(s,n,prefix + s.charAt(i));
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("The permuted strings are:");
        printPermutation(str, str.length(), "");

    }
}
