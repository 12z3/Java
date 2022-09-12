package aSoftUni;

import training.Methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyProblemX extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        // TODO: RESOLVED!

        int element = 0, thisElement = 0;
        int[] arr = new int[]{1, 3, 3, 23, 3, 4, 4, 1};
        int[] tmp = new int[arr.length];
        int[] resultArray = new int[arr.length];
        int count = 0;
        List indexes = new ArrayList<>();
        int[] a = new int[arr.length];

                                                 // TODO: Три месеца Чесане на Репата за Пет реда код?  .... Ша стане.

        for (thisElement = 0; thisElement < arr.length; thisElement++) {
            count = 0;
                                                // TODO:   {1, 3, 3, 23, 3, 4, 4, 1};
            for (element = 0; element < arr.length; element++) {                     // [0,1]
                // За всяка стойност на array[thisElement], array[Element] се променя 8 = array.length - пъти.
                if (arr[thisElement] == arr[element]) {

                    count++;                                         // [1, 3, 3, 23, 3, 4, 4, 1] - arr.
                    if (count > 1) {                                 // [2, 3, 3, 1,  3, 2, 2, 2] - resultArray[]
                        tmp[element] = -1;                           // [0, 0,-1, 0, -1, 0,-1,-1] - tmp.
                        a[element] = element;
                    }
                    resultArray[thisElement] = count;
//                    a[Element] = Element;
                }
            }
        }

                                                // TODO: ... Element 3 find 3 times on index 1, 4, 6. <- Това търсим.

        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] == 0) {
                System.out.printf("Element %d on index %d find %d times %n",
                        arr[i], i, resultArray[i]);
            }
        }

        printIntArray(a);


//            printIntArray(array);
//            printIntArray(resultArray);
//            printIntArray(cc);
//            printIntArray(brr);


    }
}
