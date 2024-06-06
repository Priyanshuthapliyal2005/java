
import java.util.*;

class InvalidTimeException extends Exception {
    InvalidTimeException(String s, int temp) {
        System.out.println(s + " is not valid value i.e. =" + temp);
    }

    public String toString() {
        return "Invalid Time entered";
    }
}

class Ques19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int hrs, min, sec;
        System.out.println("Enter Time (HOURS)");
        hrs = sc.nextInt();
        System.out.println("Enter Time (MINUTES)");
        min = sc.nextInt();
        System.out.println("Enter Time (SECONDS)");
        sec = sc.nextInt();
        try {
            if (!(hrs > 0 && hrs <= 24)) {
                InvalidTimeException ite = new InvalidTimeException("hour", hrs);
                throw ite;
            } else if (!(min > 0 && min <= 60)) {
                InvalidTimeException ite = new InvalidTimeException("Minutes", min);
                throw ite;
            } else if (!(sec > 0 && sec <= 60)) {
                InvalidTimeException ite = new InvalidTimeException("Seconds", sec);
                throw ite;
            } else
                System.out.println(hrs + ":" + min + ":" + sec);
        } catch (InvalidTimeException ite) {
            System.out.println("Exception Occured " + ite);
        }
        System.out.println("Implementation of Exception Handeling");
        System.out.println("");
        System.out.println("Implemented by- Priyanshu Thapliyal \t RollNumber- 46 \t CS4(A2)");
        System.out.println("");
    }
}
