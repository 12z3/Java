package aSoftUni;

import training.Methods;
import java.util.Arrays;
import java.util.Scanner;

public class Solution extends Methods {

    public static void maxNumberStringBuilder(int number) {
        StringBuilder strBuilder = new StringBuilder(number);
        System.out.println(strBuilder.reverse());
    }

    public static StringBuilder maxNumberStringBuilder(int[] massive) {
        StringBuilder strb = new StringBuilder();
        Arrays.sort(massive);
        for (int i = massive.length - 1; i >= 0; i--) {
            strb.append(massive[i]);
        }
        System.out.println(" -> " + strb);
        return strb;
    }

    public static void maxNumberForDigitsWithArray(int numbeR) {
        String numberRToString = String.valueOf(numbeR);
        int[] temp = new int[numberRToString.length()];

        for (int i = 0; i < numberRToString.length(); i++) {
            temp[i] = Integer.parseInt(String.valueOf(numberRToString.charAt(i)));
        }

        bubbleSortArray(temp);
        for (int i = temp.length - 1; i >= 0; i--) {
            System.out.print(temp[i]);
        }
        System.out.println();
    }

    public static String maxNumberForDigits(int[] digits) {
        String result = "";
        Arrays.sort(digits);                                    // <-
        for (int i = digits.length - 1; i >= 0; i--) {
            result += digits[i];
        }
        return result;
    }

    public static void maxNumberForDigitsWithString(int[] digitS) {
        String result = "";
        int max = Integer.MIN_VALUE;
        for (int i = digitS.length - 1; i >= 0; i--) {
            if (digitS[i] > max) {
                max = digitS[i];
//                digitS[i] = 0;
            }

            result += max;
        }
        System.out.println(max);
        printIntArray(digitS);
        System.out.println();
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        int[] digits = {1, 3, 7, 9, 7, 9, 4, 3};
//        int number = 1789584;

        /**
         - Да се състави най-голямото число с тези числа.
         -> Сортира, печата на обратно и Готово.
         */

//        maxNumberForDigitsWithArray(number);
        maxNumberForDigitsWithString(digits);

//        maxNumberStringBuilder(digits);
//        System.out.print(maxNumberForDigits(digits));
//        System.out.print(maxNumberForDigitsWithString(digits));

        /**
         -> Взимам най-голямото число. - 1
         strB.append() и го премахвам от number. И пак така и Т'ва е. - 2
         */

        int numbeR = 1789589, max1 = Integer.MIN_VALUE;
//        String numberToStrinG = String.valueOf(numbeR);
//        StringBuilder strB = new StringBuilder(numberToStrinG);
//        int[] temp1 = new int[numberToStrinG.length()];
//
//        System.out.println();
//        for (int i = 0; i < numberToStrinG.length(); i++) {
//            int numberToInT = Integer.parseInt
//                    (String.valueOf                      // Взима го като String(char), обръща го в int и го сравнява.
//                            (numberToStrinG.charAt(i)));
//            if (numberToInT > max1) {                        // 1
//                max1 = numberToInT;
//            }
////            System.out.println(strB.append(max1));
//            numberToInT = 0;
//
//        }

//        System.out.println(numbeR);
//        System.out.println(strB.append(max1));                 // 2
//        System.out.println(strB.reverse()); // ;) Его Е <-


        maxNumberStringBuilder(numbeR);

    }
}
