package Part1.Modul1_5;

public class ArrayIncrementer {
    public static void main(String[] args)
    {
        int iterationer = 10;
        int[] array = {1,2,3,4,5};

        //increment
        for(int i = 0; i < iterationer; i++) {
            array[i]++;
        }

        //print
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}

/*
Der bliver kastet en out of bounds exception, fordi at det første for loop kører 10 gange og prøver
at access en array plads på 5+, hvilket resulterer i en out of bounds index, da arrayet kun er 5 pladser.
 */
