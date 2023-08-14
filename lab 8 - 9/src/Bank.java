class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class bankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public bankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successfully made. New balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successfully made. New balance: " + balance);
        } else {
            throw new InsufficientFundsException("Insufficient funds. Withdrawal amount exceeds the account balance.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        bankAccount account = new bankAccount("1234567890", "danish mansoor", 1000.0);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        try {
            account.deposit(500.0);
            account.withdraw(200.0);
            account.withdraw(1500.0); // This will throw InsufficientFundsException
        } catch (InsufficientFundsException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }
    }
}
