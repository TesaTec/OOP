package Part2.Modul2_5.Opg2_Polymorfi;

import java.util.ArrayList;

public class Inventory {

    ArrayList<Item> items = new ArrayList<Item>();
    void addItem(Item item)
    {
        if(!items.contains(item)) {
            items.add(item);
        }
    }
    void removeItem(Item item)
    {
            items.remove(item);
    }
    double getInventoryValue()
    {
        double value = 0;
        for(int i = 0; i < items.size(); i++)
        {
            value += items.get(i).getPrice();
        }
        return value;
    }
    public void printInventory()
    {
        System.out.println("Inventory: ");
        for(int i = 0; i < items.size(); i++)
        {
            System.out.println("- " + items.get(i).toString());
        }
    }
    public void printStatus(Inventory inventory)
    {
        inventory.printInventory();
        System.out.println("Total: " +inventory.getInventoryValue());
        System.out.println();
    }

}
