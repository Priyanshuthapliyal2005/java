import java.util.*;


public class contact {
    private String phone;
    private String sname;
    private int n;
    private double amt;

    public contact(String phone ,String sname, int n){
        this.phone=phone;
        this.sname=sname;
        this.n=n;
    }

    public void compute(){
        if(n<=100){
            amt=500;
        }else if (n <= 200) {
            amt = 500 + (n - 100) * 1;
        } else if (n <= 300) {
            amt = 500 + 100 + (n - 200) * 1.20; 
        } else {
            amt = 500 + 100 + 100 * 1.20 + (n - 300) * 1.50; 
        }
    }
    
    public void display() {
        System.out.println("Subscriber Name: " + sname);
        System.out.println("Phone Number: " + phone);
        System.out.println("Number of calls made: " + n);
        System.out.println("Bill Amount: Rs. " + amt);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String sname=sc.nextLine();
        String phone=sc.nextLine();
        int n=sc.nextInt();

        contact c=new contact(phone,sname,n);
        c.compute();
        c.display();
    }
}
