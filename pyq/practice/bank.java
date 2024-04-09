import java.util.*;

public class bank {
    static int amount;
    static String name;
    static String accNum;

    bank(String name,String accNum,int amount){
        this.name = name;
        this.accNum = accNum;
        this.amount = amount;
    }

    static int deposit(int n){
        amount+=n;
        return n;
    }
    static int withdraw(int n){
        if(n<amount){
            amount-=n;
            return n;
        }
        else{
            System.out.println("less balance. Try again");
            return 0;
        }
    }
    void showBalance(){
        System.out.println("Total balance is :"+amount);
    }
    void showdetails(){
        System.out.println("name is "+name+ " account number is : "+accNum);
    }

    public static void main(String args[]){
        bank b=new bank("manu","123",500);
        System.out.println("Succesfully deposit :"+b.deposit(500));
        b.showdetails();
        b.showBalance();
        System.out.println("Succesfully withdraw :"+b.withdraw(500));
        b.showdetails();
        b.showBalance();
    }
}
