package Part3.Modul3_4.Øvelse1_LagerSystem.presentation;

import Part3.Modul3_4.Øvelse1_LagerSystem.domain.Inventory;

public class ListCLI {
    public static void main (String[] args) {
        Inventory inventory = new Inventory();
        inventory.load("C:\\Users\\magnu\\Desktop\\Coding\\OOP\\OOP_exercises\\src\\Part3\\Modul3_4\\Øvelse1_LagerSystem\\inventory.txt");
        inventory.printInventory();

    }
}
