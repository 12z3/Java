package aSoftUni;

import training.Methods;

public class Permutation extends Methods {
    public static void main(String[] args) {
        timeAndData();

        int n = 3, m = 3, l = 3;

        // 1, 2, 3. Всички възможни комбинаций на Три числа => 3!=6.

        /**
         31 юли 2021, сб -> 18:06:40 ч
         i j k
         1 1 1  1 1 2  1 1 3  1 2 1  1 2 2  1 2 3  1 3 1  1 3 2  1 3 3
         2 1 1  2 1 2  2 1 3  2 2 1  2 2 2  2 2 3  2 3 1  2 3 2  2 3 3
         3 1 1  3 1 2  3 1 3  3 2 1  3 2 2  3 2 3  3 3 1  3 3 2  3 3 3
         */


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {              // -> i @ j
                for (int k = 1; k <= l; k++) {          //  -> i @ j @ k
                    System.out.printf("%d %d %d  ", i, j, k);
                }
            }
            System.out.println();
        }




    }
}
