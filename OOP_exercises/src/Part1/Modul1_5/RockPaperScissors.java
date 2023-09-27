//1. Exceptions: Sten-Saks-Papir
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

class RockPaperScissors 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String[] choices = {"rock", "paper", "scissors"};
		int player_number = 0, computer_number;

		while(true) 
		{
			//human play
			System.out.println("Please enter your choice of rock (0), paper (1), scissors (2):");
			try {
				player_number = scanner.nextInt();
			}
			catch(InputMismatchException e) 
			{
				e.getMessage();
			}
			System.out.println("Player plays "+choices[player_number]);

			//computer play
			computer_number = (int)(Math.random()*3);
			System.out.println("Computer plays "+choices[computer_number]);

			// outcome
			switch (10*player_number+computer_number) {
				case 00:
				case 11:
				case 22:
					System.out.println("That's a draw!");
					break;
				case 02:
				case 10:
				case 21:
					System.out.println("You win!");
					break;
				case 20:
				case 01:
				case 12:
					System.out.println("You loose!");
					break;
				default:
					System.out.println("Internal error :-(");
					System.out.println("- Player chose:"+player_number);
					System.out.println("- Computer chose:"+computer_number);}
					System.out.println("Let's play again ...");
		}
	}
}

/*1.2 Hvilke 2 ting kan gå galt: 
De to ting som kan gå galt, er at brugeren kan skrive et input som ikke er en int eller 
skrive en int som ikke er mellem 0-2

1.3 Verificer at du har ret ved at give programmet de rette inddata.
Det havde jeg

1.4 Hvad er den rigtige måde at håndtere denne situation på?
Det rigtige ville være at lave en try catch blok, som tester der hvor useren skriver inputtet ind, også lave to 
catch statements, hvor den ene fanger mismatch execptions og den anden fanger outOfIndex exceptions

1.5
*/