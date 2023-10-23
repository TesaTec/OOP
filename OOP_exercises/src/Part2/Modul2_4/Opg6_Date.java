package Part2.Modul2_4;

import java.util.Date;

public class Opg6_Date {
    public static void main(String[] args) {
        Date date = new Date();
        for (int i = 1000; i < 1000001; i *= 10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}