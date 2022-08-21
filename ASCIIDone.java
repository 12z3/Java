package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class ASCIIDone extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /**
         Комбинация от символи 10 и 11 Март 2018.
         От конзолата се въвежда цяло число, отговарящо на броя символи,
         които ще бъдат въвеждани след това.

         От вас се изисква да намерите най-високата ASCII сума
         и съответно последователността от символите, които я образуват,
         и да ги изведете на конзолата. Има четири основни групи, за които трябва да следите:

         •	Цифри (0-9)
         •	Главни латински букви (A-Z)
         •	Малки латински букви (a-z)
         •	Всички останали символи (.,?@#$% и тн.)

         Вход
         От конзолата се четат 1 число и брой символи, равни на числото,като всеки символ се чете на нов ред:
         •	На първи ред  – N символи в интервала [1..19]
         •	На всеки следващ ред – N символa от ASCII таблицата

         Изход
         Отпечатват се два реда:
         1.	"Biggest ASCII sum is:{стойността на ASCII сумата}"
         2.	"Combination of characters is:{комбинацията от символи с най-висока ASCII сума от съответната група}"
         При наличие на различни комбинации от символи с еднаква ASCII сума
         да се изведе на конзолата комбинацията от символи със следните приоритети:
         най-висок приоритет да имат цифрите, след това главните букви,
         последвани от малките букви и най-нисък приоритет всички останали символи.

         */

        int max = Integer.MIN_VALUE;
        int sumDigits = 0, sumABC = 0, sumabc = 0,
                sum4 = 0, sum5 = 0, sum6 = 0;

        char result = '@', symbol = '@', symbollMaxChar = '@';
        String symboll = "", symbollDigits = "", symbollABC = "",
                symbollabc = "", symbollOther1 = "",
                symbollOther2 = "", symbollOther3 = "", symbollMaxString = "";


        int countSymbols = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < countSymbols; i++) {
            boolean isTrue = false;
            if (i == 0) {                                        // Хитро  <-
                isTrue = true;
            }
            symbol = scan.nextLine().charAt(0);
            if (isTrue) {
                max = (int) symbol;
            }

            if ((int) symbol >= 48 && (int) symbol <= 57) {       // 123
                sumDigits += (int) symbol;

                if (sumDigits > max) {
                    max = sumDigits;

                    symbollMaxChar = (char) symbol;  // char
                    symbollMaxString += (char) symbol;  // String of char
                    // symbollMaxString.append((char) symbol); == symbollMaxString += (char) symbol;
                }
            }

            if ((int) symbol >= 65 && (int) symbol <= 90) {       // ABC
                sumABC += (int) symbol;

                if (sumABC > max) {
                    max = sumABC;

                    symbollMaxChar = (char) symbol;
                    symbollMaxString += (char) symbol;
                }
            }
            if ((int) symbol >= 97 && (int) symbol <= 122) {      // abc
                sumabc += (int) symbol;

                if (sumabc > max) {
                    max = sumabc;

                    symbollMaxChar = (char) symbol; // symbollMaxChar = symbol; <- няма последователност от чарове
                    symbollMaxString += (char) symbol;
                }
            }
            if ((int) symbol >= 33 && (int) symbol <= 47) {       // @#$
                sum4 += (int) symbol;

                if (sum4 > max) {
                    max = sum4;

                    symbollMaxChar = (char) symbol;
                    symbollMaxString += (char) symbol;
                }
            }
            if ((int) symbol >= 91 && (int) symbol <= 96) {       // @#$
                sum5 += (int) symbol;

                if (sum5 > max) {
                    max = sum5;

                    symbollMaxChar = (char) symbol;
                    symbollMaxString += (char) symbol;
                }
            }
            if ((int) symbol >= 123 && (int) symbol <= 126) {     // @#$
                sum6 += (int) symbol;

                if (sum6 > max) {
                    max = sum6;

                    symbollMaxChar = (char) symbol;
                    symbollMaxString += (char) symbol;
                }
            }
        }
        System.out.printf("Sum Digits = %d %n", sumDigits);
        System.out.printf("Sum ABC = %d %n", sumABC);
        System.out.printf("Sum abc = %d %n", sumabc);
        System.out.printf("Sum4 %s = %d %n", "@#$", sum4);
        System.out.printf("Sum5 %s = %d %n", "@#$", sum5);
        System.out.printf("Sum6 %s = %d %n", "@#$", sum6);

        System.out.printf("Max sum = %d %n", max);
        System.out.printf("Char with max sum is: %s %n", symbollMaxChar);
        System.out.printf("Char sequence with max sum is: %s", symbollMaxString);
    }
}
