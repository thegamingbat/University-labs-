public class CertificateOfDeposit extends BankAccount {
    private int term;

    public CertificateOfDeposit(String account, double balance, int term) {
        super(account, balance);
        this.term = term;
    }
}