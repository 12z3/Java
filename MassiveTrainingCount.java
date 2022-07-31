package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class MassiveTrainingCount extends Methods {

    // TODO: Wiv "MyProblemX"

   /**
    * [1, 2, 5, 7, 0, 12, 0, 3]
    * - Търси последната свободна позиция и общият брой на свободните позиции.
    * - Дали трябва да се сортира масива или не?
    * - Как ще се реализира метод добавящ (премаващ) нов елемент?
    */

    /**
     * - За даден масив от числа намира:
     * - Максималният брой повторения.
     * - Минималният брой повторения.
     * - За въведено от конзолота число търси броя на повторенията му в масива.
     */

    public static void massiveTrainingCount(int[] massive) {
        int count = 0, element = 0, maxCount = Integer.MIN_VALUE;

        for (int k : massive) {                         // k: Елемента който ще се сравнява.
            count = 0;                                  // <- Нулира брояча при всяка смяна на числото.
            for (int i : massive) {                     // i: Елемента от масива в който търсим.

                if (k == i) {
                    count++;
                }
                if (count > maxCount) {                 // <-
                    maxCount = count;
                    element = k;
                }
            }
        }
        System.out.printf("Number %d is repeating %d times; %n%n", element, maxCount);

        /**
         * - За всяко число извежда броя на повторенията му.
         */
        for (int j : massive) {
            count = 0;
            for (int k : massive) {

                if (j == k) {
                    count++;
                    element = j;
                }
            }
            System.out.printf("Number %d is repeating %d times; %n", element, count);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        int[] massive = new int[]{1, 3, 1, 3, 6, 3, 5, 3, 3, 1, 3};
        massiveTrainingCount(massive);


    }
}
