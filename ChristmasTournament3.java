package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class ChristmasTournament3 extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         *Напишете програма, която проследява представянето на вашия отбор на благотворителен коледен турнир.
         * Всеки ден получавате имена на игри до команда "Finish".
         * Със спечелването на всяка една игра печелите по 20лв. за благотворителност.
         * Трябва да изчислите колко пари сте спечелили на края на деня.
         * Ако имате повече спечелени игри, отколкото загубени – вие сте победители този ден
         * и увеличавате парите от него с 10%.
         * При приключване на турнира ако през повечето дни сте били победители печелите турнира и
         * увеличавате всичките спечелени пари с 20%.
         * Никога няма да имате равен брой спечелени и загубени игри.
         *
         * Вход
         * Първоначално от конзолата се прочита броя дни на турнира – цяло число в интервала [1… 20]
         * До получаване на командата "Finish" се чете:
         * •	Спорт  – текст
         * За всеки спорт се прочита:
         * o	Резултат  – текст с възможности: "win" или "lose"
         *
         * Изход
         * Накрая се отпечатва един ред:
         * •	Ако сте спечелили турнира:
         *      	"You won the tournament! Total raised money: {спечелените пари}"
         * •	Ако сте загубили на турнира:
         * "You lost the tournament! Total raised money: {спечелените пари}"
         * Парите да бъдат форматирани до втората цифра след десетичния знак.
         */

        // TODO: Най доброто решение като структура в сравнение с другите две.

        int counWinGames = 0, countLossGames = 0, dayWin = 0, dayLose = 0;
        double dayMoney = 0.0, allMoney = 0, winMoney = 0;
        String result = "", sport = "";

        int daysOfTournament = Integer.parseInt(scan.nextLine());

        for (int day = 0; day < daysOfTournament; day++) {
            winMoney = 0; counWinGames = 0; countLossGames = 0;     // Пак Ми ИЗЯДЕ ГЛАВАТА !!!    <-

            String command = scan.nextLine();
            while (!command.equals("Finish")) {
                sport = command;
                result = scan.nextLine();

                if (result.equals("win")) {
                    winMoney += 20;
                    counWinGames++;
                } else if (result.equals("lose")) {
                    countLossGames++;
                    winMoney += 0;
                }
                command = scan.nextLine();
            }

            if (counWinGames > countLossGames) {
                winMoney += winMoney * 0.10;                    // Дали е "+=" или "+" няма съществено значение.
                dayWin++;                                       // ... Кода не е в тялото на никакъв цикъл.
            } else {
                dayLose++;
            }

            allMoney += winMoney;                       // Края на Текущият Ден.
        }
                                                        // Края на Турнира.
        if (dayWin > dayLose) {
            allMoney += allMoney * 0.20;
            System.out.printf("You won the tournament! Total raised money: %.2f %n", allMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f %n", allMoney);
        }
    }
}

/*
------------------------------------
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

------------------------------------
You won the tournament! Total raised money: 132.00
------------------------------------
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

------------------------------------
You lost the tournament! Total raised money: 84.00

*/