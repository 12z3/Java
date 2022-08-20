package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class SumOf extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();


        //  1! + 2! + 3! + … + 2018!?

        long factorial = 1;
        long sum = 0;

        for (int i = 1; i <= 2018; i++) {
            factorial = factorial * i;         // Новата стойност на factorial = старата * i
            sum = sum + factorial;
            System.out.printf("%d  %n", sum);
        }


    }
}
