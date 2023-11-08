package Part3.Modul3_5.Opg1_Find_en_fejl;


import java.util.Scanner;
public class Score {
    public static void main(String[] args) {
        int points = 0; //Imagine an arbitrary number of points between 0 and 100
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number between 0 - 100");
        points = (int)sc.nextInt();

        System.out.print("You ");
        if(points >= 50) {
            System.out.print("PASSED");
        }

        if(points < 50) {
            System.out.print("FAILED");
        }

        System.out.println("!");
    }
}
