import java.util.*;

public class q2 {
    public String rewrite(String str){
        char []ch=str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        q2 obj=new q2();
        String str=sc.next();
        System.out.println("Origional String: "+str);
        System.out.println("sorted String " + obj.rewrite(str));

    }
}
