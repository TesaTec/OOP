package Part2.Modul2_1.Opg1And2;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer aCustomer = new Customer("Magnus",0, 500);
        Customer aSecondCustomer = new Customer("David",1, 350);

        aCustomer.deposit(250);
        aCustomer.withdraw(100);
         double newBalance = aCustomer.getBalance();

         System.out.println(newBalance);

         CustomerDatabase cDatabase = new CustomerDatabase();

        cDatabase.newCustomer(aCustomer);
        cDatabase.newCustomer(aSecondCustomer);

        cDatabase.printCustomerNames();

        System.out.println("Now a customer will get removed:");

        cDatabase.removeCustomer(0);

        cDatabase.printCustomerNames();
    }
}