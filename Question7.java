package Workshop;
class BankAccount7 {
    int accountNumber;
    double balance;
    String accountHolderName;
    String accountHolderAddress;
    BankAccount7(int accountNumber, double balance, String accountHolderName, String accountHolderAddress) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountHolderAddress = accountHolderAddress;
    }
}
public class Question7 {
    public static void main(String[] args) {
        BankAccount7 obj = new BankAccount7(101, 5000, "Ram Sharan Kewat", "Biratnagar");
        System.out.println("Account Number : " + obj.accountNumber);
        System.out.println("Balance        : " + obj.balance);
        System.out.println("Account Holder : " + obj.accountHolderName);
        System.out.println("Address        : " + obj.accountHolderAddress);
    }
}