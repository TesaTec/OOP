package Part2.Modul2_1.Opg1And2;

public class CustomerDatabase {
    Customer[] customers;

    public CustomerDatabase()
    {
        customers = new Customer[10];
    }

    void newCustomer(Customer customer) throws Exception
    {
        for(int i = 0; i < customers.length; i++)
        {
            if(customers[i] == null)
            {
                customers[customer.id] = customer;
                return;
            }
        }
        throw new Exception("Du har ikke flere plads til customers");
    }

    void removeCustomer(int id)
    {
        for(int i = 0; i < customers.length; i++)
        {
            if(customers[i] != null) {
                if (customers[i].id == id) {
                    customers[i] = null;
                }
            }
        }
    }

    Customer[] getCustomer()
    {
        return customers;
    }

    void printCustomerNames()
    {

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                System.out.println(customers[i].name);
            }
        }
    }
}


