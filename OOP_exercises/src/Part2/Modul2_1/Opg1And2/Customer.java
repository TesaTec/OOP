package Part2.Modul2_1.Opg1And2;

public class Customer {
    String name;
    int id;
    double balance;

    public Customer(String name, int id)
    {
        this.id = id;
        this.name = name;
        balance = 0;
    }

    public Customer(String name, int id, double balance)
    {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        if(balance > amount)
        {
            balance -= amount;
        }
    }

    public double getBalance()
    {
        return balance;
    }
}
