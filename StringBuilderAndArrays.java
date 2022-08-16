package aSoftUni;

import training.Methods;
import java.util.Arrays;
import java.util.Scanner;

//import java.util.Arrays;

public class StringBuilderAndArrays extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         https://www.geeksforgeeks.org/how-to-convert-an-array-to-string-in-java/
         */

        /*
          -> string = Arrays.toString(a);
         */
        int[] a = {5, 3, 7, 8, 9, 1};
        StringBuilder strb = new StringBuilder();
        String string = "";
        int[] aSort = new int[a.length];
        Arrays.sort(a);


       // strb.append(a); // Result is: [I@1a6c5a9e - 1.
        /**
         strb.append(a); -> Implicit call to 'toString()' on array 'a':
         Wrap with java.util.Arrays.toString expression
         */
        strb.append(Arrays.toString(a)); // Result is: -> [1, 3, 5, 7, 8, 9] - 2.
        System.out.println(strb);
        System.out.println(strb.reverse()); // -> ]9 ,8 ,7 ,5 ,3 ,1[


        System.out.println();
        System.out.print(strb.length());

        /**
         1. strb.append(a); Result: [I@1a6c5a9e
         2. strb.append(Arrays.toString(a)); Result: 1, 3, 5, 7, 8, 9]
         Result: [I@1a6c5a9e[1, 3, 5, 7, 8, 9]

         */

    }
}
