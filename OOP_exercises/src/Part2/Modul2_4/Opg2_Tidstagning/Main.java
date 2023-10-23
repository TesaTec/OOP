package Part2.Modul2_4.Opg2_Tidstagning;

public class Main {
    public static void main(String[] args)
    {
        double x = 1.0000001;
        System.out.println(Timing.fun(x, -1));
        for(int y = 1; y < 33; y++)
        {
           long time = System.currentTimeMillis();
           System.out.println(y + ": " + Timing.fun(x,y) + " it took: " + (System.currentTimeMillis() - time ) + " to calculate" );
        }
    }
}
