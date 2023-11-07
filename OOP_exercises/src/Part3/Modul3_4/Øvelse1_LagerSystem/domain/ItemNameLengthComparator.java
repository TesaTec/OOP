package Part3.Modul3_4.Øvelse1_LagerSystem.domain;

import java.util.Comparator;

public class ItemNameLengthComparator implements Comparator<Item>{
    @Override
    public int compare (Item i1, Item i2) {
        return i1.getName().length() - i2.getName().length();
    }
}
