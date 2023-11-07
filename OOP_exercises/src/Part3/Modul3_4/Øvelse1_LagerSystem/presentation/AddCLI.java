package Part3.Modul3_4.Øvelse1_LagerSystem.presentation;

import Part3.Modul3_4.Øvelse1_LagerSystem.domain.Inventory;
import Part3.Modul3_4.Øvelse1_LagerSystem.domain.Item;
import Part3.Modul3_4.Øvelse1_LagerSystem.domain.NonFoodItem;

public class AddCLI {
    public static void main (String[] args) {
        Item i1 = new NonFoodItem("USB_Charger", 17.45, new String[] {"plastic", "stuff"});

        Inventory inventory = new Inventory();
        inventory.load("C:\\Users\\magnu\\Desktop\\Coding\\OOP\\OOP_exercises\\src\\Part3\\Modul3_4\\Øvelse1_LagerSystem\\inventory.txt");
        inventory.addItem(i1);
        inventory.store("C:\\Users\\magnu\\Desktop\\Coding\\OOP\\OOP_exercises\\src\\Part3\\Modul3_4\\Øvelse1_LagerSystem\\inventory.txt");
    }
}
