package Workshop;
class BankAccount {
    int accountNumber;
    double balance;
    String accountHolderName;
    String accountHolderAddress;
}
public class Question3And4 {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.accountNumber = 101;
        obj.balance = 5000;
        obj.accountHolderName = "Ram Sharan";
        obj.accountHolderAddress = "Biratnagar";
        System.out.println("Account Number: " + obj.accountNumber);
        System.out.println("Balance: " + obj.balance);
        System.out.println("Account Holder Name: " + obj.accountHolderName);
        System.out.println("Account Holder Address: " + obj.accountHolderAddress);
    }
}