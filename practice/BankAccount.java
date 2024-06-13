
public class BankAccount {
    private String depositorName;
    private int accountNumber;
    private String accountType;
    private double balance;

    public BankAccount(String depositorName, int accountNumber, String accountType, double initialBalance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(amount + " withdrawn successfully.");
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Invalid amount for withdrawal.");
        }
    }

    public void displayInfo() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 123456789, "Savings", 1000.0);
        
        System.out.println("Initial Account Info:");
        account.displayInfo();
        
        account.deposit(500);
        account.withdraw(200);
        
        System.out.println("\nUpdated Account Info:");
        account.displayInfo();
        System.out.println("\n");
        System.out.println("********************************************************************");
        System.out.println("Implemented by : Priyanshu Thapliyal \tBtech CSE\tA2\t 46");
        System.out.println("********************************************************************");
        System.out.println("\n");
    }
}

