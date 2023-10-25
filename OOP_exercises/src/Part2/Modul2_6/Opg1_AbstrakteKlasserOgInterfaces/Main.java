package Part2.Modul2_6.Opg1_AbstrakteKlasserOgInterfaces;

import java.util.Date;
public class Main {
    public static void main(String[] args)
    {
        Inventory inventory = new Inventory();
        Item i1 = new FoodItem("Banan", 7.5, new Date(52L*365*1000*60*60*24));
        Item i2 = new FoodItem("Chokolade", 10, new Date(53L*365*1000*60*60*24));
        Item i3 = new FoodItem("Honningkage", 27.5, new Date(12*1000*60*60*24));
        Item i4 = new NonFoodItem("Jet", 140.50, new String[] {"Metal,", "Elektronik,","Gummi"});

        Item[] items = new Item[] {i1, i2, i3, i4};

        inventory.printStatus(inventory);
        for(int i = 0;i < items.length; i++)
        {
            inventory.addItem(items[i]);
            inventory.printStatus(inventory);
        }
        System.out.println("done");
        inventory.removeItem(i1);
        inventory.printStatus(inventory);

        inventory.removeExpiredItem();
        inventory.printStatus(inventory);
    }
}
