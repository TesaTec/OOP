public class øvelserModul1_3
{
	public static void main(String[] args) 
	{
		//1 Arrays: Typer af indhold vs Type af Array
		/*Sammenhængen mellem typen af et array og de data som det kan indeholde kan let beskrives:
		Typen arrayet har kaldes base typen og betyder at den data som arrayet kan indeholde kun må være af den type*/

		//2 Arrays: Erklæring af Størrelse
		/*Når man skal oprette en array og angive den størrelse kan man bruge følgende syntax:
		int[] age;
		age = new int[12]. Hvor 12 angiver at arrayet age skal være 12 lang
		*/

		//3 Arrays: Størst i Array
		int[] forskelligeTal = {5,1,7,2,4,6,10,8,3,9};
		int størsteTal = 0;
		int indexForTal = 0;

		for(int i = 0; i < forskelligeTal.length; i++) 
		{
			if(størsteTal < forskelligeTal[i]) 
			{
				størsteTal = forskelligeTal[i];
				indexForTal = i;
			}
		}
		System.out.println("Det største tal er på plads: "+indexForTal+ " i arrayet");


		//4 Arrays: Sudoku Plade
		/*For at kunne repræsentere en sudoku plade i Java, ville jeg lave et 2D array, aka et array som indeholder arrays
		  Et array allokere noget plads i memorien, "den peger derfor på en måde ned i memorien på et bestemt sæt af bits
		  og bytes. Et 2D array peger derfor altså ned på et array som derefter peger ned på nogen bits og bytes i memorien*/

		//5 Arrays: Areal af Cirker
		  int[] radius = {1,3,5};
		  float pi = 3.145f;

		  for(int i : radius) 
		  {
		  	System.out.println(pi*i*i);
		  }

		//6 Arrays: Kalender
		 int[] normalÅr = {31,28,31,30,31,30,31,31,30,31,30,31};
		 int[] skudÅr = {31,29,31,30,31,30,31,31,30,31,30,31};
		
		for(int i = 2000; i < 2021; i++) 
		{
			int[] nuværendeÅr = normalÅr;

			if(i%4==0) 
			{
				nuværendeÅr = skudÅr;
			}

			System.out.println("I år "+ i + " vil det være følgende dage i februar: " + nuværendeÅr[1]);
			System.out.println();
		}

		//7 Arrays: Sudoku Checker
		int[][] sudoku = {
			{1,4,5,3,2,7,6,9,8},
			{8,3,9,6,5,4,1,2,7},
			{6,7,2,9,1,8,5,4,3},
			{4,9,6,1,8,5,3,7,2},
			{2,1,8,4,7,3,9,5,6},
			{7,5,3,2,9,6,4,8,1},
			{3,6,7,5,4,2,8,1,9},
			{9,8,4,7,6,1,2,3,5},
			{5,2,1,8,3,9,7,6,4}};

		for(int i = 0; i < sudoku.length; i++) 
		{
			for(int j = 0; j < sudoku[i].length; j++) 
			{
				System.out.print(sudoku[i][j] + " ");
			}
			System.out.println();
		}
		for(int i = 0; i < sudoku.length; i++) 
		{
			
			for(int j = 0; j < sudoku[i].length; j++) 
			{
				if(sudoku[i][j] <= 0 ) 
				{
					System.out.println("\nFirst test failed: All cells have not been filled");
					break;
				}
			}
		}

		for(int rows = 0; rows < sudoku.length; rows++) 
		{
			boolean[] notValid = new boolean[9];
			for(int col = 0; col < sudoku[rows].length; col++) 
			{
				if(notValid[sudoku[rows][col]-1] == true) 
				{
					System.out.println("Second test failed: Duplicate numbers in a row ");
					break;
				} else 
				{
					notValid[sudoku[rows][col]-1] = true;	
				}
				
			} 
		}

		for(int rows = 0; rows < sudoku.length; rows++) 
		{
			boolean[] notValid = new boolean[9];
			for(int col = 0; col < sudoku[rows].length; col++) 
			{
				if(notValid[sudoku[col][rows]-1] == true) 
				{
					System.out.println("Third test failed: Duplicate numbers in column");
					break;
				} else 
				{
					notValid[sudoku[col][rows]-1] = true;
				}
			}
		}
			for(int rows= 0; rows < sudoku.length; rows++) 
			{
				boolean[] notValid = new boolean[9];
				for (int col =0; col < sudoku[rows].length; col++) 
				{
					System.out.println(sudoku[0][rows]);
					if(notValid[sudoku[(rows/3) * 3+ col /3][rows * 3 % 9 + col % 3]-1] == true) 
					{
						System.out.print("Fourth test failed: Duplicate numbers in 3x3 squares");
						break;	
					} else 
					{
						notValid[sudoku[(rows/3) * 3+ col /3][rows * 3 % 9 + col % 3]-1] = true;	
					}
					
				}
			}
		

	}
}