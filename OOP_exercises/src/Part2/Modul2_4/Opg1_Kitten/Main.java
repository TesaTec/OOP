package Part2.Modul2_4.Opg1_Kitten;

public class Main {
    public static void main(String[] args)
    {
        for(int i = 0; i < 10; i++)
        {
            Kitten kitten = new Kitten(Math.random() * 10);
            System.out.println("There is now: " + Kitten.count + " kittens");
        }
    }
}
