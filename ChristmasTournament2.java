package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class ChristmasTournament2 extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*

         Линк: https://judge.softuni.bg/Contests/Compete/Index/2275#10
         Напишете програма, която проследява представянето на вашия отбор на благотворителен коледен турнир.
         Всеки ден получавате имена на игри до команда "Finish".
         Със спечелването на всяка една игра печелите по 20лв. за благотворителност.
         Трябва да изчислите колко пари сте спечелили на края на деня.
         Ако имате повече спечелени игри, отколкото загубени –
         вие сте победители този ден и увеличавате парите от него с 10%.
         При приключване на турнира ако през повечето дни сте били победители печелите турнира и
         увеличавате всичките спечелени пари с 20%.
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


        double winMoneyForThatDay = 0, winMoneyForTournament = 0;
        int countWinGamesForThatDay = 0, countLoseGamesForThatDay = 0,
            countWinGamesForTournament = 0, countLoseGamesForTournament = 0;


        int tournamentDays = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < tournamentDays; i++) {

                                                       // TODO: Критично важни условия за крайният резултат Брат.
            winMoneyForThatDay = 0;
            countWinGamesForThatDay = 0;
            countLoseGamesForThatDay = 0;

            String command = scan.nextLine();

                                                        // TODO: Денят започва.
            while (!command.equals("Finish")) {
                String sport = command;
                String result = scan.nextLine();

                if (result.equals("win")) {
                    winMoneyForThatDay += 20;
                    countWinGamesForThatDay++;
                } else if (result.equals("lose")) {
                    countLoseGamesForThatDay++;
                }

                command = scan.nextLine();
            }
                                              // TODO: Денят е свършил.
                                             //   Заради условието на Ред: 77 е необходима магарията на Ред: 52, 53, 54.
                                             //   "Ако имате повече спечелени игри, отколкото загубени –
                                             //    вие сте победители ТОЗИ ДЕН и увеличавате парите от него с 10%".

            if (countWinGamesForThatDay > countLoseGamesForThatDay) {
                winMoneyForThatDay += winMoneyForThatDay * 0.10;
            }

                                                            // TODO: Критично важни условия за крайният резултат Брат.

            winMoneyForTournament += winMoneyForThatDay;
            countLoseGamesForTournament += countLoseGamesForThatDay;
            countWinGamesForTournament += countWinGamesForThatDay;

        }
                                                             // TODO: Турнира е свършил.

        if (countWinGamesForTournament > countLoseGamesForTournament) {
            winMoneyForTournament += winMoneyForTournament * 0.20;
            System.out.printf("You won the tournament! Total raised money: %.2f %n", winMoneyForTournament);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f %n", winMoneyForTournament);
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

-----------

You won the tournament! Total raised money: 132.00

-----------

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

-------------

You lost the tournament! Total raised money: 84.00



*/