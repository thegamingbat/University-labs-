public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String account, double balance, double interestRate) {
        super(account, balance);
        this.interestRate = interestRate;
    }
}