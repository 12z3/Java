package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class ASCII_Important extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /**
         Комбинация от символи
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

        char result = '@', symbol = '@', symbollMax = '@';
        String symboll = "", symbollDigits = "", symbollABC = "",
                symbollabc = "", symbollOther1 = "",
                symbollOther2 = "", symbollOther3 = "", symbollMaX = "";
        boolean isTrue = false;


        int countSymbols = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < countSymbols; i++) {  // от 0 до 4 -> 5 пъти.
            isTrue = false;
            if (i == 0) {
                isTrue = true;
            }
            symbol = scan.nextLine().charAt(0);
            if (isTrue) {
                max = symbol;
            }
            //На всяка итерация нулира max:
            // max = 0;
            // Ако е число ще се набута тука:
            if ((int) symbol >= 48 && (int) symbol <= 57) {       // 123
                sumDigits += (int) symbol;

                if (sumDigits > max) {   // Намира max.
                    max = sumDigits;

                    result = (char) symbol;
                    // symboll = "" + (char) result; <- НЕ
                    symbollDigits += (char) result;    // Конкатенира
                    symbollMax = result;
//                    System.out.printf("%s %n", symbollDigits);   // Печата

                    // Щом съм влезнал в if значи съм намерил max.
                    // Остава само да разпечатам чара който съответства на този max.
                    // Трябва да изпринти max чар след като провери всички налични.
                    // Взима 1-я чар -> проверява и запомня max. Взима 2-я и пак така и т.н.

                    // Стойността на max не се нулира никъде. Така че би трябвало да НЕ е вярно.????
                    // Вярно е. Няма смисъл да се нулира. Не работи с натрупване, с със сравнение. If-те са независими.
                    // Ако е влезнало в един не може да се намърда в друг за същата итераци.

                    // ... Е ще трябват 6 maxa, за всеки чар които да се сравняват на края - отпада за сега.
                    // Не. При i = 0 -> max = на стойността на първият чар. След което сравнява новата стойност
                    // на max с нея.// Взима 2-я чар -> проверява го и запомня max. Взима 3-я и пак така и т.н.
                    // Ако намери по -голяма стойност я запаматява и т.н. Избягвам сравняването на 6-те
                    // стойности на max в края на кода.
                }
            }

            if ((int) symbol >= 65 && (int) symbol <= 90) {       // ABC
                sumABC += (int) symbol;

                if (sumABC > max) {
                    max = sumABC;

                    result = (char) symbol;
                    symbollABC += (char) result;
                    symbollMax = result;
//                    System.out.printf("%s %n", symbollABC);
                }
            }
            if ((int) symbol >= 97 && (int) symbol <= 122) {      // abc
                sumabc += (int) symbol;

                if (sumabc > max) {
                    max = sumabc;

                    result = (char) symbol;
                    symbollabc += (char) result;
                    symbollMax = result;
//                    System.out.printf("%s %n", symbollabc);
                }
            }
            if ((int) symbol >= 33 && (int) symbol <= 47) {       // @#$
                sum4 += (int) symbol;

                if (sum4 > max) {
                    max = sum4;

                    result = (char) symbol;
                    symbollOther1 += (char) result;
                    symbollMax = result;
//                    System.out.printf("%s %n", symbollOther1);
                }
            }
            if ((int) symbol >= 91 && (int) symbol <= 96) {       // @#$
                sum5 += (int) symbol;

                if (sum5 > max) {
                    max = sum5;

                    result = (char) symbol;
                    symbollOther2 += (char) result;
                    symbollMax = result;
//                    System.out.printf("%s %n", symbollOther2);
                }
            }
            if ((int) symbol >= 123 && (int) symbol <= 126) {     // @#$
                sum6 += (int) symbol;

                if (sum6 > max) {
                    max = sum6;

                    result = (char) symbol; // int <-
                    symbollOther3 += (char) result; // String <-
                    symbollMax = result;
//                    System.out.printf("%s %n", symbollOther3);
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
        System.out.printf("Char with max sum is: %c", symbollMax);


    }
}
/*
In:
5  ASCII
9 - 57
a - 97
v - 118
] - 93
7 - 55

5
9
a
v
]
7
0
0
0
0
0



3
C
+
+
0
0
0
0
0


*/
/**
 * Out:
 * Biggest ASCII sum is:112
 * Combination of characters ASCII sum is:97
 */