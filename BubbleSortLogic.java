package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class BubbleSortLogic extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();
                                                                                // {1, 13, 5, 8, 9, 12};
                                                                                // {1, 13, 5, 8, 9, 12};
        int[] arr = {1, 13, 5, 8, 9, 12};

        for (int thisElement = 0; thisElement < arr.length; thisElement++) {   //thisElement = 1; arr[thisElement] = 13
            for (int element = thisElement + 1; element < arr.length; element++) {  // element = 2; arr[element] = 5
                if ((int)arr[thisElement] > (int)arr[element]) {                         // 13 > 5 -> ... Ако е Вярно ?

                    int temp = 0;                             // ... То Им Размени Местата.
                    temp = arr[thisElement];                  // temp = 13
                    arr[thisElement] = arr[element];          // 5 => 13: 5 става 13.
                    arr[element] = temp;                      // 13 => 5: 13 става на 5.

                }
            }

        }

        printIntArray(arr);


    }
}
