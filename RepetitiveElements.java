package aSoftUni;
import training.Methods;

import java.util.Arrays;

public class RepetitiveElements extends Methods {

    // Виж: MassiveTrainingCount <--

    public static void repetativeElements(int[] massive) {
        int index = 0, count = 0, element = 0;
        boolean[] elementArray = new boolean[massive.length];

        for (int i = 0; i < massive.length; i++) {              //Елемента i който ще се търси. <-
            count = 0; // <- Важно
            element = massive[i];
            index = i;

            // Ако i-я елемент е проверен и съвпаденията са > 1 то
            // elementArray[i] -> true:

            for (int k = 0; k < massive.length; k++) {          // Елементите k в които ще се търси i. <-
                if (massive[i] == massive[k]) {
                    count++;

                    if (count > 1) {
                        elementArray[k] = true;
                    }
                }
            }

            if (!(elementArray[i]) && count <= 100) {        // Крайно весел критерий, Но работи Мамка Му.
                System.out.printf("Element %d on index %d is count %d times - %s %n",
                        element, index, count, elementArray[i]);
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(elementArray));
        printIntArray(massive);
    }

    public static void main(String[] args) {
        timeAndData();

        // Виж: MassiveTrainingCount <--

        /**
         Намира максималната редица от еднакви елементи в масив.
         Пример: {2, 1, 1, 2, 3, 3, 2, 2, 2, 1};
         à = {2, 2, 2}.
         */

        int[] a = {7, 1, 1, 1, 3, 13, 13, 13, 5};
        int[] b = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};

        repetativeElements(b);


        // Бах мааМу т'Ва КЪРТИ !!!
//        for (int k : a) {
//            for (int j = 0; j < size - 3; j++) {
//                if (k == a[j] && k == a[j + 1]
//                        && k == a[j + 2] && k == a[j + 3]) {
//                    System.out.print(" " + a[j]);
//                    count++;
//                }
//            }
//        }
//
//        System.out.println("\n" + "Number of counts = " + count);
        //arrayPractis.bubbleSortArray(a);
        //arrayPractis.printArray(a);

    /*
    Намира най-често срещания елемент в масив. Пример:
    {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3}
    à = 4, (5 times).
     */
//        int[] temp = new int[b.length];
//        for (int k = 0; k < b.length; k++) {
//            for (int i = 0; i <= b.length - 2; i++) {
//                if (b[k] == b[i + 1]) {
//                    temp[k] = b[i + 1];
//                    count++;
//                    System.out.print(" " + temp[k]);
//                }
//            }
//        }
//        //System.out.print(" " + temp);
//        System.out.print("\n" + "Number of counts1 = " + count1 + "\n");
//        // printArray(temp);
//        bubbleSortArray(temp);
//        printIntArray(temp);
        //System.out.println(Arrays.binarySearch(b,4));


    }
}
