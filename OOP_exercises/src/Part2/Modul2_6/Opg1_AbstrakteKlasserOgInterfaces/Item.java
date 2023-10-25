package Part2.Modul2_6.Opg1_AbstrakteKlasserOgInterfaces;

public abstract class Item implements Expireable {
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
