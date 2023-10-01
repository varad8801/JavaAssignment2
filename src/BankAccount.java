import java.util.Scanner;

public class BankAccount {
    private String account_number;
    private String account_holder;
    private double balance;

    public BankAccount(String account_number, String account_holder, double balance) {
        this.account_number = account_number;
        this.account_holder = account_holder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds. Withdrawal not possible.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accNumber = scanner.nextLine();

        System.out.print("Enter account holder name: ");
        String accHolder = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(accNumber, accHolder, initialBalance);

        System.out.println("Account created successfully.");
        System.out.println("Account Holder: " + account.account_holder);
        System.out.println("Account Number: " + account.account_number);
        System.out.println("Initial Balance: " + account.balance);

        // Perform transactions
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        // Check balance
        System.out.println("Updated Balance: " + account.getBalance());

    
    }
}
