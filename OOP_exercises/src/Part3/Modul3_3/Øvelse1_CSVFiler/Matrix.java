package Part3.Modul3_3.Øvelse1_CSVFiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {
    double[][] data;

    Matrix(String fileName) {
        boolean success = load(fileName);
        if (!success) {
            System.out.println("Error happened when trying to load matrix");
        }
    }

    Matrix(int rows, int cols) {
        data = new double[cols][rows];
    }

    double getValue(int x, int y) {
        return data[y][x];

    }

    void setValue(int x, int y, double value) {
        data[y][x] = value;
    }

    int getHeight() {
        return data.length;
    }

    int getWidth() {
        return data[0].length;
    }

    boolean load(String filename) {
        try {
            File dataFile = new File(filename);
            Scanner scanner = new Scanner(dataFile);

            // Læser indholdet af filen
            ArrayList<String> lines = new ArrayList<String>();
            while (scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }
            scanner.close();
            int x = 0;
            int y = 0;

            try {
                data = new double[lines.size()][];
                for (y = 0; y < lines.size(); y++) {
                    String line = lines.get(y);
                    String[] cells = line.split(",");
                    ;
                    data[y] = new double[cells.length];
                    for (x = 0; x < cells.length; x++) {
                        data[y][x] = Double.parseDouble(cells[x]);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Unable to parse x = " + x + " y = " + y);
                return false;
            }

            return true;

        } catch (FileNotFoundException ex) {
            System.out.println(("file was not found"));
            return false;
        }
    }

    boolean save(String filename) {
        try {
            File saveFile = new File(filename);
            if(saveFile.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exist");
            }

            PrintWriter pw = new PrintWriter(saveFile);
            for(int i = 0; i < data.length; i++) {
                double[] row = data[i];
                for(int j = 0; j < data[i].length; j++) {
                    double cell = row[j];
                    pw.print((j ==0 ? "" : ",") + cell);
                }
                pw.println();
            }
            pw.close();
            return true;
        } catch (IOException ex) {
            System.out.println("There was an error when trying to save the file");
            return false;
        }
    }
}
