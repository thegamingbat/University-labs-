public class BankManager {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("C12345", 1000, 500);
        SavingsAccount savingsAccount = new SavingsAccount("S67890", 5000, 0.05);
        CertificateOfDeposit cdAccount = new CertificateOfDeposit("CD54321", 20000, 12);

        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
        System.out.println(cdAccount);

        checkingAccount.deposit(200);
        savingsAccount.withdraw(1000);
        cdAccount.withdraw(5000);

        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
        System.out.println(cdAccount);
    }
}