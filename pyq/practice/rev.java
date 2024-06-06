import java.util.*;

public class rev {
    public static String reverse(String word){
        StringBuilder reverseWord=new StringBuilder();
        for(int i=word.length()-1;i>=0;i--){
            reverseWord.append(word.charAt(i));
        }
        return reverseWord.toString();
    }

    public static String reverseWords(String str){
        // StringBuilder reversedString =new StringBuilder();
        // String[] words=str.split(" ");
        // for(String word: words){
        //     reversedString.append(reverse(word)).append(" ");

        // }
        // return reversedString.toString().trim();
        String ans="";
        String temp="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                temp+=str.charAt(i);
            }else{
                
                ans+=reverse(temp);;
                ans+=" ";
                temp="";
            }
        }
        ans+=reverse(temp);
        return ans;

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String inputString=sc.nextLine();

        String reversedString=reverseWords(inputString);

        System.out.println("Output : "+reversedString);
    }
}
