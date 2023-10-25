package Part2.Modul2_5.Opg2_DiskriminanterOgRødder;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println(quadricFunction(10, 5, 2));
    }

    public static double Discriminant(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public static ArrayList<Double> quadricFunction(double a, double b, double c) {
        ArrayList<Double> roots = new ArrayList<>();
        double discriminant = Discriminant(a, b, c);
        if (discriminant < 0) {
           System.out.println("There is no real roots");
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            roots.add(x1);
            roots.add(x2);
        }
        return roots;
    }
}
