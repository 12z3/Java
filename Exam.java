package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class Exam extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        double countEvalution1 = 0.00, countEvalution2 = 0.00,
                countEvalution3 = 0.00, countEvalution4 = 0.00;
        double examEvalution, percent1 = 0.00,
                percent2 = 0.00, percent3 = 0.00, percent4 = 0.00, allEvalution = 0.00;

        /**
         При условие: "students <= countOfStudents;"
         сметката за "Fail" е 30,00%. Иска се "Fail 20,00%".
         Т.е. равното "бърка" общата бройка и от там и резултата.
         "Бъдете Внимателни" "=" може да е проблем, но меже и да Не е.

         За да не се получава такава конфузна ситуация е необходимо вместо от
         students = 0 броенето да започва от students = 1. Тогава условието
         "students <= countOfStudents;" ще дава правилен резултат, а
         "students < countOfStudents;" грешен.
         */

        int countOfStudents = Integer.parseInt(scan.nextLine());
        for (int students = 0; students < countOfStudents; students++) {
            examEvalution = Double.parseDouble(scan.nextLine());

            if (examEvalution >= 4.00 && examEvalution <= 4.99) {
                countEvalution1++;
                percent1 = (countEvalution1 / countOfStudents) * 100;
            }
            if (examEvalution >= 3.00 && examEvalution <= 3.99) {
                countEvalution2++;
                percent2 = (countEvalution2 / countOfStudents) * 100;
            }

            if (examEvalution < 3) {
                countEvalution4++;
                percent4 = (countEvalution4 / countOfStudents) * 100;
            }

            if (examEvalution >= 5) {
                countEvalution3++;
                percent3 = (countEvalution3 / countOfStudents) * 100;

            }
            allEvalution += examEvalution;
        }

        System.out.printf("Top students: %n %.2f%% %n", percent3);
        System.out.printf("Between 4.00 and 4.99: %n %.2f%% %n", percent1);
        System.out.printf("Between 3.00 and 3.99: %n %.2f%% %n", percent2);
        System.out.printf("Fail %.2f%% %n", percent4);
        System.out.printf("Average %.2f%% %n", allEvalution / countOfStudents);

    }
}

/**
 * 10
 * 3.00
 * 2.99
 * 5.68
 * 3.01
 * 4
 * 4
 * 6.00
 * 4.50
 * 2.44
 * 5

 * <p>
 Top students:
 30,00%
 Between 4.00 and 4.99:
 30,00%
 Between 3.00 and 3.99:
 20,00%
 Fail 20,00%
 Average 4,06%

 */