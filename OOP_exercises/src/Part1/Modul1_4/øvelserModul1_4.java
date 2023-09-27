public class øvelserModul1_4 
{
	public static void main(String[] args) 
	{
		//1 Arrays: Daglige Differencer
		double[] temperatur = {21.5, 23.7, 19.6, 22.5, 25.3, 21.7, 18.9};

		for(int i = 1; i < temperatur.length; i++) 
		{
			System.out.println("Differencen mellem temperaturene er " +tempDiff(temperatur[i-1], temperatur[i]));
		}
		//2 Metoder: Sum
		System.out.println(sum(5, 12));
		System.out.println();

		//3 Metoder: Sudoku Prettyprinter
		int[] [] puzzle = {
		{7, 3, 6, 4, 5, 2, 9, 8, 1},
		{1, 9, 8, 6, 3, 7, 4, 5, 2},
		{4, 2, 5, 9, 8, 1, 3, 7, 6},
		{3, 6, 4, 5, 2, 8, 1, 9, 7},
		{9, 5, 2, 7, 1, 4, 6, 3, 8},
		{8, 1, 7, 3, 9, 6, 2, 4, 5},
		{2, 8, 9, 1, 7, 3, 5, 6, 4},
		{6, 7, 3, 2, 4, 5, 8, 1, 9},
		{5, 4, 1, 8, 6, 9, 7, 2, 3},
		};

		sudokuPrettyprinter(puzzle);

		//4 Metoder: Fakultet
		System.out.println(fakultet(4));

		//5 Metoder: Cirkler i tal

		System.out.println("Arealet er: " +areal(1.0));
		System.out.println("Omkredsen er: " +omkreds(1.0));
		System.out.println("Arealet er: " +areal(3.0));
		System.out.println("Omkredsen er: " +omkreds(3.0));
		System.out.println("Arealet er: " +areal(5.0));
		System.out.println("Omkredsen er: " +omkreds(5.0));

		//6 metoder: Egen kvadratrod
		System.out.println(SqrtRoot(25));


	}
	//1 Arrays: Daglige Differencer
	public static double tempDiff(double temp1, double temp2) 
	{
		double diff = temp1-temp2; 
		if (diff < 0) 
		{
			diff *= -1;
		}

		return diff;
	}

	//2 Metoder: Sum
	public static int sum(int tal1, int tal2) 
	{
		return tal1+tal2;
	}

	//3 Metoder: Sudoku Prettyprinter
	public static void sudokuPrettyprinter(int[][] sudoku) 
	{
		for(int rows = 0; rows < sudoku.length; rows++) 
		{
			for(int col = 0; col < sudoku[rows].length; col++)
			{
				System.out.print(sudoku[rows][col] + " ");
				if(col == 2 || col == 5) 
				{
					System.out.print("|" + " ");
				}
			}
			System.out.println();
			if(rows == 2 || rows == 5) 
				{
					System.out.println("---------------------");
				}
		}
	}
	//4 Metoder: Fakultet
	public static int fakultet(int num) 
	{
		if(num == 0) 
		{
			return 1;
		}

		return num * fakultet(num -1);
	}

	//5 Metoder: Cirkler i tal 
	public static double areal(double radius) 
	{
		double pi = 3.14;
		return pi * radius * radius;
	}
	public static double omkreds(double radius) 
	{
		double pi = 3.14;
		return 2 * pi * radius;
	}

	public static double SqrtRoot(double num) 
	{
		double kvadratrod = 0;
		for(double i = 0.000000001; i < 1000000000; i+=0.000000001 ) 
		{
			if(i * i > num) 
			{
				break;
			}

			kvadratrod = i;
		}
		return kvadratrod;
	}
}