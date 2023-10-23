package Part2.Modul2_2.Opg2_Primtal;

public class Primtal {


    void primeNumberCalculator()
    {
        int highestPrime =0;
        for(int numberToCheck = 2; numberToCheck <= 1000000; numberToCheck++) {

            boolean isPrime = true;

            for (int factor =2; factor <= Math.sqrt(numberToCheck); factor++) {

                if (numberToCheck % factor == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
            {
                highestPrime = numberToCheck;
            }
        }
        System.out.println(highestPrime);

    }

}
