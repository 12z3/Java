package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class MaxASCII extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /**
         Търси чара с максимална ASCII стойност от редицата "abc" и го печата.
         */

        String abc = "cbcahefgj";
        String result = "", resulT = "";
        int ch = 0, count = 0, max = Integer.MIN_VALUE, indexI = 0;

        for (int j = 0; j < abc.length(); j++) {
            ch = abc.charAt(j);
            if (ch > max) {
                max = ch;
                result += abc.charAt(j);
            }
        }
        System.out.printf("MAx ASCII digits is %d -> %c, %s %n", max, (char) max, result);

    }
}
