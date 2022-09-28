package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class Search extends Methods {

    /*
     https://practice.geeksforgeeks.org/problems/
     value-equal-to-index-value1330/1/
     ?category[]=Searching&category[]=
     Searching&page=1&query=category[]
     Searchingpage1category[]Searching


     https://practice.geeksforgeeks.org/
     explore/?category%5B%5D=Searching&page=1&category%5B%5D=Searching
     */

    /*
     * Given an array Arr of N positive integers.
     * Your task is to find the elements
     * whose value is equal to that of its index value.
     */

    /**
     * 1. Да се намери най-често срещаният елемент, колко пъти и на кой индекс.
     * 2. Ако даден елемент се среща повече от един път,
     * да се намери броя и на кои позиции се среща.
     * 3. Да направи същото но с предварително известен елемент, като в примера от долу.
     */

    static void search(int[][] matrix, int element) {
        boolean isMatch = false;
        int indexI = 0, indexJ = 0, count = 0;
        int countIteration = 0;

        int[][] index = new int[matrix.length][matrix[0].length]; // <- ?
        for (int i = 0; i < matrix.length; i++) {            // <- Числото което се сравнява.
            for (int j = 0; j < matrix[0].length; j++) {     // <- Числата с който се сравнява.
                if (element == matrix[i][j]) { // Намира елемента
                    isMatch = true;
                    countIteration++;
                    count++;                  // Брои колко пъти се среща този елемент.
                    indexI = i;               // На кои Индекс i е елемента.
                    indexJ = j;               // На кои Индекс j е елемента.
                                              // Трябва да се запазят намерените индекси от всяка итерация за,
                                              // които "element == matrix[i][j]".
                    // Това трябва да стане след завършване на 1-я for цикъл и преди края на 2-я.
                    // index [indexI][indexJ] = matrix[indexI][indexJ]; // <-
                }
                // Нямаме работа в тялото на 2-я for вече. Елемента е намерен.
                // Трябва да се запазят намерените индекси от всяка итерация.
                index[indexI][indexJ] = matrix[indexI][indexJ];

                if (isMatch){
                    System.out.printf("Output: Element %d on index %d%d is find %d times %n",
                            index[indexI][indexJ], indexI, indexJ, count);
                }
            }
            // Тук:
        }
        if (isMatch) { // Индексите куцат. -> Output: Element 1 on index 02? 02? 02 is find 3 times.
            // Печата Само последният индекс = 2-ред 0-колона, другите се губят.

//            System.out.printf("Output: Element %d on index %d%d %d%d %d%d is find %d times %n",
//                    index[indexI][indexJ], indexI, indexJ, indexI, indexJ, indexI, indexJ, count);
            //Ако броя съвпадения е различен то печатането на броя Индекси също трябва да е различно.

            System.out.printf("Number of Iteration is: %d %n", countIteration);
        } else {
            System.out.print("Output: " + isMatch);
        }

        for (int k = 0; k < matrix.length ; k++) {          // Редове - matrix.length = 3 в случая.
            for (int m = 0; m < matrix[0].length; m++) {    // Колони - matrix[0].length = Дължината на 0-1 Ред.
                System.out.print(index[indexI][indexJ]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        int[][] abs = new int[][]{{1, 1, 12}, {13, 34, 45}, {13, 5, 6}};
        int[][] abc = new int[][]{{1, 1, 1}, {3, 3, 3}, {13, 5, 5}};

        search(abc, 3);



    }
}
