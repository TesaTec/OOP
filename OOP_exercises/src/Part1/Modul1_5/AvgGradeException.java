package Part1.Modul1_5;

public class AvgGradeException {
    static int[] grades = {4, 7, 02, 10, 4, 12};

    public static int getGrade(int courseid) throws Exception
    {
        int grade = grades[courseid];
        if (grade >= 2)
        {
            return grade;
        } else {
            throw new Exception("DU BESTOD IKKE DIN DUMME RETARD. GG BARE DROP UD");
        }
    }

    public static void main(String[] args) throws Exception
    {
        int count = 0, sum = 0;

        for(int courseid = 0; courseid < grades.length; courseid++)
        {
            try {
                count++;
                sum += getGrade(courseid);

            } catch(Error _e) {

            }
        }
        System.out.println(sum/count);
    }
}