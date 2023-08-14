public class BankAccount {
    protected String account;
    protected double balance;

    public BankAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public String toString() {
        return "Account: " + account + ", Balance: $" + balance;
    }
}