package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class GamesOfInterval extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        double points = 0;
        int count1 = 0, count2 = 0, count3 = 0,
                count4 = 0, count5 = 0, countInvalid = 0;


        int steps = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < steps; i++) {
            int number = Integer.parseInt(scan.nextLine()); // == "Integer.parseInt(String.valueOf(scan.nextInt()));" <-

            if (number < 0 || number > 50) {
                countInvalid++;
                points = points / 2;  // Не points += points / 2 <-
            }

            if (number >= 0 && number < 9) {
                points += number * 0.2;
                count1++;
            } else if (number >= 10 && number <= 19) {
                points += number * 0.3;
                count2++;
            } else if (number >= 20 && number <= 29) {
                points += number * 0.4;
                count3++;
            } else if (number >= 30 && number <= 39) {
                points += 50;
                count4++;
            } else if (number >= 40 && number <= 50) {
                points += 100;
                count5++;
            }
        }

        System.out.printf("%.2f %n", points);
        System.out.printf("From 0 to 9: %d%% %n", (count1 * 100) / steps);
        System.out.printf("From 10 to 19: %d%% %n", (count2 * 100) / steps);
        System.out.printf("From 20 to 29: %d%% %n", (count3 * 100) / steps);
        System.out.printf("From 30 to 39: %d%% %n", (count4 * 100) / steps);
        System.out.printf("From 40 to 50: %d%% %n", (count5 * 100) / steps);
        System.out.printf("Invalid Numbers %d%% %n", (countInvalid * 100) / steps);
    }
}
/*
10
43
57
-12
23
12
0
50
40
30
20


*/

