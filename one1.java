package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class one1 extends Methods {

    public static void figure(String figure1, String spaces, int n) {
        String text1 = "", text2 = "", text = "";
        for (int i = 0; i < n; i++) {
            text2 += spaces;
            text1 += figure1;
        }
        System.out.print(text1 + text2);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();


        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {

                //System.out.print(" ");
                System.out.print("#");

            }
            System.out.println();
        }





    }
}
