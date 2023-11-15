package Part3.Modul3_3.Øvelse3_TurtleFortolker;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas(110,120);
        Turtle turtle = new Turtle(canvas);
        cmdFileUpScaler cmdF = new cmdFileUpScaler();
        cmdF.upScaler();
        turtle.mover();
        canvas.print();
    }
}
