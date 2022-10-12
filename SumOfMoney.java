package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class SumOfMoney extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /**
         Банкнотите са по 1лв, 2лв и 5лв. Да се намерят всички възможни комбинации
         между тях така, че сумата им да бъде = sum.
         */

        int count1Lv = Integer.parseInt(scan.nextLine());
        int count2Lv = Integer.parseInt(scan.nextLine());
        int count5Lv = Integer.parseInt(scan.nextLine());
        double sum = Double.parseDouble(scan.nextLine());

        double price1Lv = 1, price2Lv = 2, price5Lv = 5;
        double sumLv = 0;

        for (int i = 0; i <= count1Lv; i++) {
            for (int j = 0; j <= count2Lv; j++) {
                for (int k = 0; k <= count5Lv; k++) {
                    sumLv = i * price1Lv + j * price2Lv + k * price5Lv;             // <-

                    if (sumLv == sum) {                                          // <-
                        System.out.printf("%d * 1lv + %d * 2lv + %d * 5lv = %.0flv %n", i, j, k, sumLv);
                    }
                }
            }
        }
    }
}

/**
3
2
3
10
 -----------------------
 0 * 1lv + 0 * 2lv + 2 * 5lv = 10
 1 * 1lv + 2 * 2lv + 1 * 5lv = 10
 3 * 1lv + 1 * 2lv + 1 * 5lv = 10
 */



