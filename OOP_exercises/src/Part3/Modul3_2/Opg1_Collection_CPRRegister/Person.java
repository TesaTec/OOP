package Part3.Modul3_2.Opg1_Collection_CPRRegister;

public class Person {
    String name;
    int age;
    String cpr;
    public Person(String name, int age, String cpr)
    {
        this.name = name;
        this.age = age;
        this.cpr = cpr;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getCpr()
    {
        return cpr;
    }
    @Override
    public String toString()
    {
        return "name: " +name + "\nage: " + age + "\ncpr: " + cpr;
    }
}
