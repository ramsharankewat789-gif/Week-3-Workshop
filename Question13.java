package Workshop;
class BankAccount13 {
    private int accountNumber;
    private double balance;
    BankAccount13() {
        accountNumber = 0;
        balance = 0.0;
    }
    BankAccount13(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    BankAccount13(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void display() {
        System.out.println("Account: " + accountNumber + " | Balance: " + balance);
    }
}
public class Question13 {
    public static void main(String[] args) {
        BankAccount13 obj1 = new BankAccount13();             
        BankAccount13 obj2 = new BankAccount13(101);          
        BankAccount13 obj3 = new BankAccount13(102, 5000);    
        obj1.display();
        obj2.display();
        obj3.display();
    }
}