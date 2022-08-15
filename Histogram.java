package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class Histogram extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        int n = Integer.parseInt(scan.nextLine());
        double p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;

        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(scan.nextLine());

            if (number < 200) {
                p1++;
            } else if (number >= 200 && number < 400) {
                p2++;

            } else if (number >= 400 && number < 600) {
                p3++;

            } else if (number >= 600 && number < 800) {
                p4++;

            } else if (number > 800) {
                p5++;
            }

        }
        // System.out.printf("%.2f -> %.2f%% %n",p1, (p1 * 100) / n); %.2f%% = 32%
        System.out.printf("%.2f -> %.2f%s %n",p1, (p1 * 100) / n, "%");
        System.out.printf("%.2f -> %.2f%s %n",p2, (p2 * 100) / n, "%");
        System.out.printf("%.2f -> %.2f%s %n",p3, (p3 * 100) / n, "%");
        System.out.printf("%.2f -> %.2f%s %n",p4, (p4 * 100) / n, "%");
        System.out.printf("%.2f -> %.2f%s %n",p5, (p5 * 100) / n, "%");


    }
}
