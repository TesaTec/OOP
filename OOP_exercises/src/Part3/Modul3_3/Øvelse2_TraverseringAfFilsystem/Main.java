package Part3.Modul3_3.Øvelse2_TraverseringAfFilsystem;

import java.io.File;
import java.util.ArrayList;

public class Main {


    public static void main(String args[]) {
        FsTraverse FST = new FsTraverse();

        if(args.length != 1) {
            System.out.println("Syntax: You need to put in a valid path, without spacing");
            System.out.println("Etc: C:\\Damn\\Gamer\\test.csv");
            return;
        }
        String path = args[0];

        System.out.println("Calculating...");
        ArrayList<String> matches = new ArrayList<String>();
        FST.traverse(matches, new File(path), "csv");

        System.out.println("Matches:");
        for(String match: matches) {
            System.out.println(" - " + match);
        }

    }
}
