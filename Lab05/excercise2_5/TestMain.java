package excercise2_5;

public class TestMain {
    public static void main(String[] args) {
        // Test Customer class
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm');
        System.out.println(c1);  // Customer's toString()

        System.out.println(c1);
        System.out.println("id is: " + c1.getID());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());

        // Test Invoice class
        Account acc1 = new Account(101, c1, 888.8);
        System.out.println(acc1);

        System.out.println(acc1);
        System.out.println("id is: " + acc1.getID());
        System.out.println("customer is: " + acc1.getCustomer());  // Customer's toString()
        System.out.println("balance is: " + acc1.getBalance());
        System.out.println("customer's name is: " + acc1.getCustomerName());
        System.out.println("balance after deposit: " + acc1.deposit(111.1));
        System.out.println("balance after withdraw: " + acc1.withdraw(1111.1));

        Account acc2 = new Account(102,c1);
        acc1.setBalance(999.9);

        System.out.println(acc2);
        System.out.println("id is: " + acc2.getID());
        System.out.println("customer is: " + acc2.getCustomer());  // Customer's toString()
        System.out.println("balance is: " + acc2.getBalance());
        System.out.println("customer's name is: " + acc2.getCustomerName());
        System.out.println("balance after deposit: " + acc1.deposit(111.1));
        System.out.println("balance after withdraw: " + acc1.withdraw(1111.1));
    }
}
