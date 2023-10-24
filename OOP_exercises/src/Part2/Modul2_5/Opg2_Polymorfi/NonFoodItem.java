package Part2.Modul2_5.Opg2_Polymorfi;

public class NonFoodItem extends Item {
    String[] materials;
    public NonFoodItem(String name, double price, String[] materials)
    {
        super(name, price);
        this.materials = materials;
    }

    String[] getMaterials(String[] materials)
    {
        return materials;
    }

    String convertToString(String[] mats)
    {
        String list = "";
        for(int i = 0; i < mats.length; i++)
        {
            list +=  mats[i]+ " ";
        }
        return list;
    }
    @Override
    public String toString()
    {
        return "Name: " +name + "\nPrice: "+ price + "\nMaterials list: " + convertToString(materials);
    }
}
