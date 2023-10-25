package Part2.Modul2_6.Opg1_AbstrakteKlasserOgInterfaces;

import java.util.ArrayList;
import java.util.Arrays;

public class NonFoodItem extends Item {
    ArrayList<String> materials = new ArrayList<>();
    public NonFoodItem(String name, double price, String[] materials)
    {
        super(name, price);
        this.materials = new ArrayList<String>(Arrays.asList(materials));
    }
    public NonFoodItem(String name, double price, ArrayList<String> materials)
    {
        super(name, price);
        this.materials = materials;
    }

    ArrayList<String> getMaterials()
    {
        return materials;
    }

    String convertToString(ArrayList<String> mats)
    {
        String list = "";
        for(int i = 0; i < mats.size(); i++)
        {
            list +=  mats.get(i)+ " ";
        }
        return list;
    }
    @Override
    public String toString()
    {
        return "Name: " +name + "\nPrice: "+ price + "\nMaterials list: " + convertToString(materials);
    }

    @Override
    public boolean isExpired()
    {
        return false;
    }
}
