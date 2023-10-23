package Part2.Modul2_4.Opg2_Tidstagning;

public class Timing {
    static double fun(double x, double y)
    {
        double result = 0;
        if(y <= 1)
        {
            result = Math.pow(x, y);
        } else if(y > 1)
        {
            result = fun(x,y-1) * fun(x, y-1);
        }
        return result;
    }
}
