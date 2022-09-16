package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class OddEndEven extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();


        for (int i = 0; i < 10; i++) {
            int a = (2 * i);               // <- Четно.
            int b = (2 * i) + 1;           // <- НеЧетно.

            System.out.printf("%d ", a);
            System.out.printf("%d ", b);

        }


    }
}
