package Part3.Modul3_3.Øvelse3_TurtleFortolker;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class cmdFileUpScaler {
    String readPath = System.getProperty("user.dir") + "\\src\\Part3\\Modul3_3\\Øvelse3_TurtleFortolker\\cmdFile.txt";
    String writePath = System.getProperty("user.dir") + "\\src\\Part3\\Modul3_3\\Øvelse3_TurtleFortolker\\cmdFile1.txt";
    public void upScaler() {

        try {
            Scanner sc = new Scanner(readPath);
            PrintWriter pw = new PrintWriter(writePath);
            while(sc.hasNextLine()) {
                String line = sc.nextLine().toLowerCase();
                if(line.equals("draw" ) || line.equals("stopdraw")) {
                    for(int i = 0; i < 10; i++) {
                        pw.println(line);
                    }
                }
            }

        } catch(FileNotFoundException ex) {
            System.out.println("File was not found");
        }
    }
}
