package aSoftUni;

import training.Methods;

import java.util.Random;
import java.util.Scanner;

public class SequenceOfDigits extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        // TODO: Given a number of integers, combine them so it would create the largest number.

//        String input = scan.nextLine();
//        String[] inputArr = input.split("\s");
//
//        for (String abc: inputArr){
//            System.out.print(abc);
//        }

        StringBuilder txt = new StringBuilder();
        Random random = new Random();
        String number = "";
        Long numbeR ;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int temp = 0, index = -1;


        int[] a = {17, 7, 2, 45, 72};
        int[] b = new int[a.length];

//        while (b >= 0) {
//            // Трябва да взимаа числата в произволна последователност ?
//            for (int i = 0; i < a.length; i++) {
//                //index = random.nextInt(i+1);
//                txt += "" + String.valueOf(a[index]);
//                b = Integer.parseInt(txt);
//
//            }
//        }
//
//        System.out.println(b);

        //        Input:  [17, 7, 2, 45, 72]
        //        Output:  7 72 45 2 17

        //        Input:  [17, 7, 2, 45, 72] -> 5 digits.
        //        Output:  7 72 45 2 17


        for (int element = 0; element < a.length; element++) {
            for (int thisElelement = element; thisElelement < a.length; thisElelement++) {
                numbeR = Long.parseLong(String.valueOf(txt.append(thisElelement)));

//                if (a[thisElelement] / 10 == 0) {
//                    if (a[thisElelement] > max1) {
//                        max1 = a[thisElelement];
//
//                    }
//
////                    number += " " + max1;

                System.out.println(numbeR);

            }
        }


        //System.out.printf("%s %n", number);
        //System.out.println(random.nextInt(10));







        /*

        TODO:
         Given a sorted list of positive numbers,
         find the smallest positive number that cannot be a sum of any subset in the list.
         Example:
         Input: [1, 2, 3, 8, 9, 10]
         Output: 7
         Numbers 1 to 6 can all be summed by a subset of the list of numbers, but 7 cannot.

         */


    }
}

