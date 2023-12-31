package Part3.Modul3_3.Øvelse3_TurtleFortolker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Turtle {
    int x = 0;
    int y = 0;
    boolean draw = false;
    Canvas canvas;

    public Turtle (Canvas canvas) {
        this.canvas = canvas;
    }

    public void mover() {
        String filePath = System.getProperty("user.dir") + "\\src\\Part3\\Modul3_3\\Øvelse3_TurtleFortolker\\cmdFile.txt";
        String filePathSmiley = System.getProperty("user.dir") + "\\src\\Part3\\Modul3_3\\Øvelse3_TurtleFortolker\\smFile.txt";
        File cmdFile = new File(filePath);
        try{
            Scanner drawer = new Scanner(cmdFile);
            while(drawer.hasNextLine()) {
                String cmd = drawer.nextLine().toLowerCase();
                switch (cmd) {
                    case "startdraw":
                        draw = true;
                        break;
                    case "stopdraw":
                        draw = false;
                        break;
                    case "gonorth":
                        if( y >= 0) {
                            y-=1;
                            canvas.setValue(draw, x, y);
                        }
                        break;
                    case "gosouth":
                        if( y <= canvas.height) {
                            y+=1;
                            canvas.setValue(draw, x, y);
                        }
                        break;
                    case "goeast":
                        if(x <= canvas.width) {
                            x+=1;
                            canvas.setValue(draw, x, y);
                        }
                        break;
                    case "gowest":
                        if(x >= 0) {
                            x-=1;
                            canvas.setValue(draw, x, y);
                        }
                        break;
                    case "gone":
                        if(y>=0 && x <= canvas.width) {
                            y-=1;
                            x+=1;
                            canvas.setValue(draw, x, y);
                        }
                        break;
                    case "gonw":
                        if(y>=0 && x >= 0) {
                            y-=1;
                            x-=1;
                            canvas.setValue(draw, x, y);
                        }
                        break;
                    case "gose":
                        if(y <= canvas.height && x <= canvas.width) {
                            y+=1;
                            x+=1;
                            canvas.setValue(draw, x, y);
                        }
                        break;
                    case "gosw":
                        if(y <= canvas.height && x >= 0) {
                            y+=1;
                            x-=1;
                            canvas.setValue(draw, x, y);
                        }
                        break;
                    case "fill":
                        for(int placeOnLine = 0; placeOnLine < canvas.width; placeOnLine++ ) {
                            canvas.setValue(true, placeOnLine,y );
                        }
                }

            }
        } catch(FileNotFoundException ex) {
            System.out.println("Couldnt find commandFile");
        }

    }
}
