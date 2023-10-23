package Part2.Modul2_4.Opg3_Indkapsling;

public class Circle {
    private double x, y;
    private double d;

    public Circle(double x, double y, double diameter)
    {
        this.x = x;
        this.y = y;
        this.d = diameter;
    }
    double getX()
    {
        return this.x;
    }
    double getY()
    {
        return this.y;
    }
    double getD()
    {
        return this.d;
    }

    double setX(double x)
    {
        return this.x = x;
    }
    double setY(double y)
    {
        return this.y = y;
    }
    double setD(double d)
    {
        return this.d = d;
    }
}

class Coordinate
{
    double coordinateX;
    double coordinateY;

    Coordinate(double x, double y)
    {
        this.coordinateX = x;
        this.coordinateY = y;
    }
    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }
}

class TestCircle
{
    public static void main(String[] args)
    {
        Coordinate cor = new Coordinate(5,10);
        Circle c = new Circle(cor.getCoordinateX(), cor.getCoordinateY(), 12.7);
        System.out.println("x="+c.getX()+" y="+c.getY()+" d="+c.getD());

        c.setD(c.getD()* 1.37);
        c.setX(c.getX()+ 0.65);
        System.out.println("x="+c.getX()+" y="+c.getY()+" d="+c.getD());
    }
}
/*
1: Beskriv sprogligt hvad programmetsmain metodegør. Fokusér på detal-jerne:
    I main metoden bliver der instansieret en instance af classen circle ved navn c. Denne instance
    kalder classens constructor, og indsætter værdierne: x = 1.24, y = 2.83, radius = 12.7.
    Bagefter det printes der til konsollen hvad klassens c, værdier nu er hvor overstående værdier bliver
    printet.
    Bagefter erklærer den c's radius til at stige med 37% og c's x værdi får lagt 0.65 til værdien.
    Bagefter bliver de nye værdier printet ud, hvor r og x har ændret sig.

4: Skriv ned hvilke ændringer I lavede på denne kopi?
    De steder hvor der før stod r har jeg ændret til d, og de steder hvor der før stod radius er ændret
    til diameter

 10: Skriv ned hvilke ændringer I lavede på denne kopi?
    Har lavet en ny klasse ved navn Coordinate, hvilket har fået 2 attributer, coordinateX og coordinate Y,
    samt 2 getters til at få attributterne. I main funktionen er der nu tilføjet at et objekt cor, bliver
    instansieret med Coordinate som typen, og gennem konstrukteren for den tildelt værdierne x = 5, y = 10

    Getters funktionerne bliver derefter brugt til at give en x og y koordinat til c.
    */