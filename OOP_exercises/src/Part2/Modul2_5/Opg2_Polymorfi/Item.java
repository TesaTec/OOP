package Part2.Modul2_5.Opg2_Polymorfi;

public class Item {
    String name;
    double price;
    Item(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    String getName()
    {
        return name;
    }

    double getPrice()
    {
        return price;
    }
    @Override
    public String toString()
    {
        return "Produketet er: " +name + "\nPrisen er: " + price;
    }
}
