package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class ChristmasTournament1 extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /**

         Всеки ден получавате имена на игри до команда "Finish".
         Със спечелването на всяка една игра печелите по 20лв. за благотворителност.

        ->  Трябва да изчислите колко пари сте спечелили на КРАЯ на ДЕНЯ.
         Aко имате повече спечелени игри, отколкото загубени
         – вие сте победители ТОЗИ ДЕН и увеличавате парите от него с 10%.

        ->  При приключване на турнира ако през ПОВЕЧЕТО ДНИ сте били победители
         печелите турнира и увеличавате всичките спечелени пари с 20%.

         Никога няма да имате равен брой спечелени и загубени игри.
         Вход
         Първоначално от конзолата се прочита броя дни на турнира – цяло число в интервала [1… 20]
         До получаване на командата "Finish" се чете:
         •	Спорт  – текст
         За всеки спорт се прочита:
         o	Резултат  – текст с възможности: "win" или "lose"

         Изход
         Накрая се отпечатва един ред:
         •	Ако сте спечелили турнира:
         "You won the tournament! Total raised money: {спечелените пари}"
         •	Ако сте загубили на турнира:
         "You lost the tournament! Total raised money: {спечелените пари}"
         Парите да бъдат форматирани до втората цифра след десетичния знак.

         */


        int daysOfTournament = Integer.parseInt(scan.nextLine());
        int money = 0, countWin = 0, countLose = 0,
                daysMoney = 0, countDayWin = 0, countDayLose = 0;
        String sport = "", reusult = "";

        for (int days = 0; days < daysOfTournament; days++) {
            // TODO: Критично Важни Условия               // <- НАЧАЛО НА ДЕНЯ.
            money = 0;                                    // За всеки нов ден парите се нулират -
            countWin = countLose = 0;                     // Нулира се и резултат. Много е важно това. <-

            String command = scan.nextLine();
            while (!command.equals("Finish")) {
                sport = command;
                reusult = scan.nextLine();

                if (reusult.equals("win")) {
                    countWin++;
                    money += 20;
                } else if (reusult.equals("lose")) {
                    countLose++;
                }

                command = scan.nextLine();
            }                                             // <- Край на Игрите за деня.
            if (countWin > countLose) {
                money += money * 0.10;
            }

                                                        // TODO: Критично Важни Условия !
            daysMoney += money;
            countDayWin += countWin;                     // Пази резултата ЗА ДЕНЯ в countDayWin.
            countDayLose += countLose;                   // Пази резултата ЗА ДЕНЯ в countDayLose.
                                                         // <- КРАЙ НА ДЕНЯ.
        }
        if (countDayWin > countDayLose) {                // <- Край на турнира. Край на дните.

            //..... -> ако през повечето дни <- сте били победители -
            // печелите турнира и увеличавате всичките спечелени пари с 20%.

            daysMoney += daysMoney * 0.20;
            System.out.printf("You won the tournament! Total raised money: %d %n", daysMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %d %n", daysMoney);
        }
    }
}

/*

2
volleyball
win
football
lose
basketball
win
Finish
golf
win
tennis
win
badminton
win
Finish
----------

You won the tournament! Total raised money: 132.00

----------
3
darts
lose
handball
lose
judo
win
Finish
snooker
lose
swimming
lose
squash
lose
table tennis
win
Finish
volleyball
win
basketball
win
Finish
-----------
You lost the tournament! Total raised money: 84.00

*/