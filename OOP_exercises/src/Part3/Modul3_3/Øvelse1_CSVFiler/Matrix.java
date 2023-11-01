package Part3.Modul3_3.Øvelse1_CSVFiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Matrix {
    double[][] data;

    Matrix(String fileName) {
        
    }

    Matrix(int rows, int cols) {

        data = new double[rows][cols];
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[rows-1].length; i++)
            {
                data[i][j] = 0;
            }
        }
    }
}
