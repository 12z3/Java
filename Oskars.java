package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class Oskars extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         Задача 4. Оскари
         Линк: https://judge.softuni.bg/Contests/Compete/Index/1699#9
         Поканени сте от академията да напишете софтуер, който да пресмята точките за актьор/актриса.
         Академията ще ви даде първоначални точки за актьора. След това всеки оценяващ ще дава своята оценка.
         Точките, които актьора получава се формират от: дължината на името на оценяващия умножено по точките,
         които дава делено на две.
         Ако резултатът в някой момент надхвърли 1250.5 програмата трябва да прекъсне и да се отпечата,
         че дадения актьор е получил номинация.

         Вход
         •	Име на актьора – текст
         •	Точки от академията - реално число в интервала [2.0... 450.5]
         •	Брой оценяващи n – цяло число в интервала[1… 20]
         На следващите n-на брой реда:
         o	Име на оценяващия – текст
         o	Точки от оценяващия – реално число в интервала [1.0... 50.0]

         Изход
         Да се отпечата на конзолата един ред:
         •	Ако точките са над 1250.5:
         "Congratulations, {име на актьора} got a nominee for leading role with {точки}!"
         •	Ако точките не са достатъчни:
         "Sorry, {име на актьора} you need {нужни точки} more!"
         Резултатът да се форматирана до първата цифра след десетичния знак!

         */


        double value = 0.0, allValue = 0.0;
        boolean isStop = false;


        String actorName = scan.nextLine();
        double pointOfAcademy = Double.parseDouble(scan.nextLine());

        int numberOfEvaluators = Integer.parseInt(scan.nextLine());
        allValue = pointOfAcademy;

        for (int i = 0; i < numberOfEvaluators; i++) {
            value = 0;

            String nameOfEvaluators = scan.nextLine();
            double evaluation = Double.parseDouble(scan.nextLine());

            value = ((nameOfEvaluators.length() * evaluation) / 2);
            allValue += value;

            if (allValue >= 1250.5) {
                isStop = true;
                break;
            }
        }

        if (isStop) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f! %n",
                    actorName, allValue);
        } else {
            System.out.printf("Sorry, %s you need %.1f more! %n", actorName, Math.abs(allValue - 1250.5));
        }
    }
}

/*

Zahari Baharov
205
4
Johnny Depp
45
Will Smith
29
Jet Lee
10
Matthew Mcconaughey
39
------------

Sorry, Zahari Baharov you need 247.5 more!

------------

Sandra Bullock
340
5
Robert De Niro
50
Julia Roberts
40.5
Daniel Day-Lewis
39.4
Nicolas Cage
29.9
Stoyanka Mutafova
33

---------------

Congratulations, Sandra Bullock got a nominee for leading role with 1268.5!
*/