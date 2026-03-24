package Workshop;
class BankAccount12 {
    private double balance;
    BankAccount12(double balance) {
        this.balance = balance;
    }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}
class Customer {
    private int customerId;      
    private String name;         
    private BankAccount12 account;  
    Customer(int customerId, String name, BankAccount12 account) {
        this.customerId = customerId;
        this.name = name;
        this.account = account;
    }
    public int getCustomerId() { return customerId; }
    public String getName() { return name; }
    public BankAccount12 getAccount() { return account; }
    public void display() {
        System.out.println("ID: " + customerId + " | Name: " + name + " | Balance: " + account.getBalance());   }
}
public class Question12 {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Ram",  new BankAccount12(5000));
        Customer c2 = new Customer(2, "Sita", new BankAccount12(15000));
        Customer c3 = new Customer(3, "Hari", new BankAccount12(8500));
        System.out.println("--- Initial Values ---");
        c1.display();
        c2.display();
        c3.display();
        System.out.println("\n--- Using Getters ---");
        System.out.println("Customer 1 Name    : " + c1.getName());
        System.out.println("Customer 1 Balance : " + c1.getAccount().getBalance());
        System.out.println("\n--- After Update (c1) ---");
        c1.getAccount().setBalance(7000);
        c1.display();
    }
}