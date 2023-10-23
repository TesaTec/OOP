package Part2.Modul2_5.Opg2_Polymorfi;

import java.util.Date;
public class Main {
    public static void main(String[] args)
    {
        String[] mats = {"Stone", "Plastic", "Dirt"};
        FoodItem[] foodItems = new FoodItem[10];
        NonFoodItem[] nonFoodItems = new NonFoodItem[10];

        for(int i = 0; i < foodItems.length; i++) {
            foodItems[i] = new FoodItem("Food " +(i+1), i * 12.5, new Date(i*1000*60*60*24));
        }

        for(int i = 0; i < nonFoodItems.length; i++) {
            nonFoodItems[i] = new NonFoodItem("Item " + (i+1), i * 17.5, mats);
        }

        for(int i = 0; i < foodItems.length; i++) {
            System.out.println(foodItems[i].toString());
        }

        for(int i = 0; i < nonFoodItems.length; i++) {
            System.out.println(nonFoodItems[i].toString());
        }
    }
}
