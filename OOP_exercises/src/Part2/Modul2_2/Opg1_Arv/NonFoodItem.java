package Part2.Modul2_2.Opg1_Arv;

public class NonFoodItem extends Item{
    String[] materials;
    public NonFoodItem(String name, double price, String[] materials)
    {
        this.name = name;
        this.price = price;
        this.materials = materials;
    }

    String[] getMaterials(String[] materials)
    {
        return materials;
    }

    String convertToString(String[] mats)
    {
        String list = "";
        System.out.println("List of materials");
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
