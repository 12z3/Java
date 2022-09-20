package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class StudentsCredit extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         Първоначално трябва да се прочете едно число от конзолата,
         което представлява броят записани курсове.
         След това последователно за всеки курс се въвежда по едно число:
         •	Цифрите на единиците на това число представляват оценката. Те са в интервала [2…6].
         •	Останалите цифри са броят кредити, които студентът взима при успешното завършване на този курс.
         Кредитната система се скалира на база оценката:
         •	Студент с оценка 2 взима 0% от кредитите.
         •	Студент с оценка 3 взима 50% от кредитите.
         •	Студент с оценка 4 взима 70% от кредитите.
         •	Студент с оценка 5 взима 85% от кредитите.
         •	Студент с оценка 6 взима 100% от кредитите.
         Вход
         От конзолата се прочита:
         На първият ред:
         •	n - Броят курсове - цяло число в интервала [1…10]
         На следващите n реда:
         •	Числото, представляващо кредитите и оценката - цяло число в интервала [32…306]
         Изход
         На конзолата се отпечатват 2 редa:
         •	Броят взети кредити, форматиран до втората цифра след десетичната запетая
         •	Средноаритметичната оценка за всички курсове, форматирана до втората цифра след десетичната запетая

         */

        int digits = 0, evelution = 0, credit = 0, evalutionSum = 0;
        double evalutionResult = 0;
        String digitS = "";

        double courseCount = Double.parseDouble(scan.nextLine());
        for (int course = 0; course < courseCount; course++) {
            digits = Integer.parseInt(scan.nextLine());

            evelution = digits % 10; // ВЗИМА единиците от "digits": 103 % 10 = 3.
            credit = digits / 10;    // ПРЕМАХВА единиците от "digits": 103 / 10 = 10.
            evalutionSum += evelution;

           // Integer.parseInt(digitS.chars(0)) -> Взима единиците от "digits"
           // Integer.parseInt(digitS.chars(1)) -> Взима десетиците от "digits"

            switch (evelution) {           // Сортира по "evelution" и сумира с натрупване "evalutionResult".
                case 2 -> {
                    evalutionResult += 0;
                }
                case 3 -> {
                    evalutionResult += (credit * 0.5);
                }
                case 4 -> {
                    evalutionResult += (credit * 0.7);
                }
                case 5 -> {
                    evalutionResult += (credit * 0.85);
                }
                case 6 -> {
                    evalutionResult += (credit);
                }
            }
        }

        System.out.printf("%.2f %n", (evalutionResult));
        System.out.printf("%.2f %n", (evalutionSum / courseCount));

    }
}

/*

5
122
156
202
214
185
----
45.00
3.80

*/