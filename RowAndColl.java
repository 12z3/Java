package java_Nakov;//package java_Nakov;

import training.Methods;
import java.util.Scanner;

public class RowAndColl extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // timeAndData();

        // 
        //       За всеки ред искам да отпечатам определен брой колони.


        for (int row = 1; row <= 5; row++) {

            for (int coll = 1; coll <= row; coll++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int row = 4; row >= 1; row--) {

            for (int coll = row; coll >= 1; coll--) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
