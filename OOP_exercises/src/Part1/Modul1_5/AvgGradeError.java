class AvgGradeError 
{
	int[] grades = {4, 7, 02, 10, 4, 12};
	
	public static int getGrade(int courseid) 
	{
		int grade = grades[courseid];
		if (grade >= 2) 
		{
			return grade;
		} else {
			throw new RuntimeException("DU BESTOD IKKE DIN DUMME RETARD. GG BARE DROP UD");
		}
	}

	public static void main(String[] args) 
	{
		int count, sum;

		for(int courseid = 0; grades.length; courseid++) 
		{
			
		}
	}	
}