package Part2.Modul2_2.Opg1_Arv;

import java.util.Date;

public class FoodItem extends Item{
    Date expires;

    public FoodItem(String name, double price, Date expires)
    {
        this.name = name;
        this.price = price;
        this.expires = expires;
    }
    Date getExpires(Date expires)
    {
        return expires;
    }

    @Override
    public String toString()
    {
        return "Maden er: " +name + "\nPrisen er: " + price + "\nMaden udløber: " + expires;
    }
}
