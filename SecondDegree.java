package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class SecondDegree extends Methods {

    public static void secondDegree(int n) {
        double sum = 1;
        for (int i = 0; i <= n; i += 2) {
            sum = Math.pow(2, i);
        }
        System.out.printf("2 на %d -> %.0f %n", n, sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();
        secondDegree(4);


    }
}
