package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class SequenceOfDigitsASCII extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         Създава всички възможни комбинации между три букви, в диапазона
         от firstChar до endChar. Идеята е ако в тези комбинации се съдържа
         буквата missingCharInt то комбинацията не трябва да се печата.
         - Печатането здраво куца!

         contains(): Returns true if and only if
         this string contains the specified sequence of char values.      <-
         */

        char firstChar = scan.nextLine().charAt(0);
        char secondChar = scan.nextLine().charAt(0);
        char endChar = scan.nextLine().charAt(0);

        String missing = "" + endChar;
        int missingCharInt = (int) (endChar), count = 0;

        for (char first = firstChar; first <= endChar; first++) {
            for (char second = firstChar; second <= endChar; second++) {
                for (char third = firstChar; third <= endChar; third++) {

                    String result = " " + first + second + third;
                    int resultInt = first + second + third;

                    if (!(result.contains(missing))) {         //   <-
                        count++;
                        System.out.printf("%s %d %n", result, count);
                    }
                }
            }
        }


    }
}

/**
 In:
 a
 b
 c
 -----
 Out:
 aaa 1
 aab 2
 aba 3
 abb 4
 baa 5
 bab 6
 bba 7
 bbb 8
 */