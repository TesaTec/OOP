package Part3.Modul3_2.Opg1_Collection_CPRRegister;

import java.util.ArrayList;
import java.util.HashMap;



public class Main {
    public static void main(String[] args)
    {
        ArrayList<Person> personRegister = new ArrayList<>();
        HashMap<String, Person> mappedRegister = new HashMap<>();

        personRegister.add(new Person("Magnus Christensen", 19, "010404-5853"));
        personRegister.add(new Person("David Andresen", 20, "010101-0101"));
        personRegister.add(new Person("Ronja Christensen", 19, "010404-2022"));
        personRegister.add(new Person("Sverre Christensen", 45, "555454-1234"));
        personRegister.add(new Person("Henrik Sørensen", 19, "010404-2021" ));

        for(int i = 0; i < personRegister.size(); i++)
        {
            if(personRegister.get(i).getCpr().equals("010101-0101"))
            {
                System.out.println(personRegister.get(i));
            }
            mappedRegister.put(personRegister.get(i).getCpr(), personRegister.get(i));
        }
        System.out.println("Done");

        System.out.println(mappedRegister.get("010101-0101"));


    }


}
