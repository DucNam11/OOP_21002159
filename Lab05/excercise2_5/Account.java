package excercise2_5;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer.getName() + "(" + customer.getID() + ")";
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        return new Account(id, customer, balance + amount);
    }

    public Account withdraw(double amount) {
        return new Account(id, customer, balance - amount);
    }
}
