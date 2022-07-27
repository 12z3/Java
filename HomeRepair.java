package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class HomeRepair extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         Линк: https://judge.softuni.bg/Contests/Compete/Index/1745#7
         Пешо решава, че иска да направи ремонт вкъщи.
         Неговата задача е да боядиса стените в хола, като знаете височината и ширината на една стена.
         Холът на Пешо има 4 стени с еднакви размери, определен процент от които се заемат от прозорци и врати,
         които няма да бъдат боядисвани.
         Той не е сигурен дали ще успее наведнъж, затова моли Вас да му помогнете да изчисли
         дали ще му остава още работа за следващия ден и, ако да, колко кв. м. има да довърши,
         а в случай, че успее да боядиса хола, колко боя му е останала
         (трябва да се има предвид, че с един литър боя се боядисва един квадратен метър от стената).

         Вход
         От конзолата се четат следните редове:
         1.	Височина на стената - цяло число [0… 100]
         2.	Ширина на стената - цяло число [0… 100]
         3.	Процент от общата площ на стените, който няма да бъде боядисан - цяло число [5… 95]
         На следващите редове до получаване на командата "Tired!"
         или докато не бъдат боядисани всички стени, се чете по едно число:
         •	Литри боя – цяло число [0…100]:
         Забележка: Площта за боядисване да бъде закръглена нагоре до най-близкото цяло число.

         Изход
         Да се отпечата на конзолата един от следните редове:
         •	При получаване на командата "Tired!":
         "{квадратни метри} quadratic m left."
         {квадратни метри} е повърхнината, която му остава да боядисана.

         •	Aко е останала боя в излишък:
         "All walls are painted and you have {литри боя} l
         paint left!"

         •	Aко след боядисването на всички стени, не е останала боя:
         "All walls are painted! Great job, Pesho!"

         */

        double leftPaint = 0.0;

        int height = Integer.parseInt(scan.nextLine());
        int weight = Integer.parseInt(scan.nextLine());

        double wallArea = (height * weight) * 4;
        int percentForScrab = Integer.parseInt(scan.nextLine());
        double areaForPainting = wallArea - (wallArea * percentForScrab / 100.0);

        String command = scan.nextLine();
        while (!command.equals("Tired!")) {

            int number = Integer.parseInt(command);
            areaForPainting -= number;
            leftPaint = areaForPainting;

            if (areaForPainting <= 0) {
                break;
            }
            command = scan.nextLine();
        }

        if (areaForPainting > 0) {
            System.out.printf("%.0f quadratic m left. %n ", areaForPainting);
        } else if (areaForPainting == 0) {
            System.out.print("All walls are painted! Great job, Pesho! %n");
        } else if (areaForPainting < 0) {
            System.out.printf("All walls are painted and you have" +
                    " %.0fl paint left! %n", Math.abs(leftPaint));
        }
    }
}

/*

3
5
10
2
3
4
Tired!

------------
45 quadratic m left.
------------

2
3
25
6
7
8

--------------
All walls are painted and you have 3 l paint left!


*/