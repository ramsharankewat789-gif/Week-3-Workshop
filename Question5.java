package Workshop;
class BankAccount5 {
    double balance = 1000;
    public void depositMoney(double amount) {
        balance += amount;
        System.out.println("Deposited : " + amount);
        System.out.println("Current Balance   : " + balance);
    }
    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn : " + amount);
            System.out.println("Current Balance   : " + balance);
        } else {
            System.out.println("Insufficient Balance");
            System.out.println("Current Balance   : " + balance);
        }
    }
}
public class Question5 {
    public static void main(String[] args) {
        BankAccount5 obj = new BankAccount5();
        obj.depositMoney(500);
        System.out.println();
        obj.withdrawMoney(300);
        System.out.println();
        obj.withdrawMoney(2000);
    }
}