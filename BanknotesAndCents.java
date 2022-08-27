package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class BanknotesAndCents extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /**
         Условието: printf("%d * 1lv + %d * 2lv + %d * 5lv = %d lv %n", one, two, five, sumOfCents);
         Подсказва решението: if (sumOfCents == 1 * one + 2 * two + 5 * five) -> doSome.

         */

        int oneCent = Integer.parseInt(scan.nextLine());
        int twoCent = Integer.parseInt(scan.nextLine());
        int fiveCent = Integer.parseInt(scan.nextLine());
        int sumOfCents = Integer.parseInt(scan.nextLine());


        for (int one = 0; one <= oneCent; one++) {
            for (int two = 0; two <= twoCent; two++) {
                for (int five = 0; five <= fiveCent; five++) {

                    if (sumOfCents == 1 * one + 2 * two + 5 * five) {          //TODO: <- ! Разкошно.
                        System.out.printf("%d * 1lv + %d * 2lv + %d * 5lv = %d lv %n", one, two, five, sumOfCents);
                    }
                }
            }
        }


    }
}
