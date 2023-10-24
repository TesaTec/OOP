package Part2.Modul2_5.Opg2_Polymorfi;

import java.util.Date;
public class Main {
    public static void main(String[] args)
    {
        Inventory inventory = new Inventory();
        Item i1 = new Item("Chokolade", 13.00);
        Item i2 = new Item("Burger", 25.00);
        Item i3 = new FoodItem("Banan", 7.5, new Date(12*1000*60*60*24));
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
    }
}
