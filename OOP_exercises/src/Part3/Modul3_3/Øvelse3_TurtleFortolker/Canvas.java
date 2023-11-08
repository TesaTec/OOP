package Part3.Modul3_3.Øvelse3_TurtleFortolker;

public class Canvas {
    int width;
    int height;
    boolean[][] data;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.data = new boolean[height][width];
    }

    public void setValue(boolean value, int width, int height) {
        data[height][width] = value;
    }

    public boolean getValue(int width, int height) {
        return data[height][width];
    }

    public void print() {
        System.out.print("+");
        for(int x = 0; x < width; x++) {
            System.out.print("-");
        }
        System.out.println("+");

        for(int y = 0; y < height; y++) {
            System.out.print("|");
            for(int x = 0; x < width; x++) {
                if(getValue(x, y)) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }

        System.out.print("+");
        for(int x = 0; x < width; x++) {
            System.out.print("-");
        }
        System.out.println("+");

    }
}
