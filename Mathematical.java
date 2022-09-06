package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class Mathematical extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        double ab = 1.7;
        long t = Math.round(ab);
        double d = Math.ceil(ab);  // Закръгляне на ГОРЕ;
        double f = Math.floor(ab); // Закръгляне на ДОЛУ;

        System.out.printf("Math.round(%.2f) = %d %.2f", ab, t);
        System.out.printf("Math.ceil(%.2f) = %f  %n", ab, d);
        System.out.printf("Math.floor(%.2f) = %f %n", ab, f);







    }
}
