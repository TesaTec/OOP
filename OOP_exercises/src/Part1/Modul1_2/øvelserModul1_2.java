import java.util.Scanner;

public class øvelserModul1_2 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Vælg en opgave mellem 1-7");
		int ans = sc.nextInt();

		switch(ans) 
		{
		case 1: //1. Booleans: Terninger
			
			byte dice = (byte)((Math.random()*6)+1);
			boolean diceThrow = (dice >= 3);
			System.out.println(diceThrow + " " + dice);
			break;

		case 2: //2. Branches: juleudsalg
			int sekSidenNytår = 21816000;
			float pris = 599.95f;
			int julISekunder = 30585600;

			if(sekSidenNytår == julISekunder) 
			{
				float nyPris = (float)(pris * 0.7);

				System.out.println("Det er jul. Prisen er derfor: " + nyPris);
			}
			else {

				System.out.println("Det er ikke jul. Prisen er derfor: " + pris);
		
			}

				break;

		case 3: //3. Branches ferie:

			byte måned = (byte)((Math.random()*12)+1);
		switch(måned) 
		{

		case 4, 7, 8, 10, 12:
			switch(måned) 
			{
			case 4:
				System.out.println("Påskeferie");
				break;
			case 7, 8:
				System.out.println("Sommerferie");
				break;
			case 10:
				System.out.println("Efterårsferie");
				break;
			case 12:
				System.out.println("Juleferie");
				break;
			}
		default:
			System.out.println("Hårdt arbejde");
			break;
		}

			break;

		case 4: //4. Loops: Celcius til Fahrenheit
			for(double c = -5; c <= 40; c+=0.5) 
		{
			double fahrenheit = c * 9/5 + 32;

			System.out.println("Celcius: " + c + " Fahrenheit: " + fahrenheit);
		}
			break;

		case 5: //5. Loops Areal af Cirkler

			for(int r = 1; r <=5; r+=2) 
			{
				double pi = 3.145;
				double areal = pi * r * r;
				System.out.println("Radius er: " + r + " Derfor er arealet: " + areal);
			}
			break;

		case 6: //6. Branches: Længden af en måned
			byte månedNr = (byte)((Math.random()*12)+1);
			byte dage;

			System.out.println(månedNr);
			if(månedNr%2 != 0) 
			{	
				dage = 31;
				System.out.println("Der er " + dage + " dage");
			} else 
			{
				if(månedNr == 2) 
				{
					dage = 28;
					System.out.println("Der er " + dage + " dage");
				} else 
				{
					dage = 30;
					System.out.println("Der er " + dage + " dage");
				}
			}
			
			break;

		case 7: //7. Loops: primtal
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
		break;

		}
	}
}