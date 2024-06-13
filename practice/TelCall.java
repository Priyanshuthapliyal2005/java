import java.lang.*;
import java.util.Scanner;

public class TelCall {
    private String phno;
    private String sname;
    private int n;
    private double amt;

    public TelCall(String phno, String sname, int n) {
        this.phno = phno;
        this.sname = sname;
        this.n = n;
    }

    public void compute() {
        if (n <= 100) {
            amt = 500;
        } else if (n <= 200) {
            amt = 500 + (n - 100) * 1;
        } else if (n <= 300) {
            amt = 500 + 100 + (n - 200) * 1.20; 
        } else {
            amt = 500 + 100 + 100 * 1.20 + (n - 300) * 1.50; 
        }
    }

    public void display() {
        System.out.println("Subscriber Name: " + sname);
        System.out.println("Phone Number: " + phno);
        System.out.println("Number of calls made: " + n);
        System.out.println("Bill Amount: Rs. " + amt);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Subscriber Name: ");
        String sname = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phno = scanner.nextLine();
        System.out.print("Enter Number of calls made: ");
        int n = scanner.nextInt();

        TelCall telCall = new TelCall(phno, sname, n);

        telCall.compute();

        telCall.display();

        scanner.close();
        System.out.println("\n");
        System.out.println("********************************************************************");
        System.out.println("Implemented by : Priyanshu Thapliyal \tBtech CSE\tA2\t 46");
        System.out.println("********************************************************************");
        System.out.println("\n");
    }
}
