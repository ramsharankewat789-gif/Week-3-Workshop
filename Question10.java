package Workshop;
class BankAccountQ10 {
    int accountNumber;
    private double balance;
    String accountHolderName;
    BankAccountQ10(int accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public int getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
}
public class Question10 {
    public static void main(String[] args) {
        BankAccountQ10 obj = new BankAccountQ10(101, 5000, "Ram Sharan");
        System.out.println("Account Number : " + obj.getAccountNumber());
        System.out.println("Account Holder : " + obj.getAccountHolderName());
        System.out.println("Balance        : " + obj.getBalance());
    }
}