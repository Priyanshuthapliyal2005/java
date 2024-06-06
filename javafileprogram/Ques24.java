class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw " + amount);
        }
    }
}

class Customer1 extends Thread {
    private BankAccount account;

    public Customer1(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(500);
    }
}

class Customer2 extends Thread {
    private BankAccount account;

    public Customer2(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(1000);
    }
}

public class Ques24 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1200);
        Customer1 customer1 = new Customer1(account);
        Customer2 customer2 = new Customer2(account);
        customer1.start();
        customer2.start();
        System.out.println(" *************************************************************************");
        System.out.println("Implemented By: Priyanshu Thapliyal\t Class Roll No. 46\t CSE4(A2)");
        System.out.println(" *************************************************************************");
    }
}
