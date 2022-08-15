package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class ChristmasTournament extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         - Всеки ден получавате имена на игри до команда "Finish".
         Със спечелването на всяка една игра печелите по 20лв. за благотворителност.
         Трябва да изчислите колко пари сте спечелили на края на деня.
         Ако имате повече спечелени игри, отколкото загубени
         – вие сте победители този ден и увеличавате парите от него с 10%.
         При приключване на турнира ако през повечето дни сте били победители печелите турнира
         и увеличавате всичките спечелени пари с 20%.
         -> Out:  "You won the tournament! Total raised money: 132.00"
         */

        double money = 0, countWin = 0, counLost = 0;


        int days = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= days; i++) {

            String command = scan.nextLine();      // TODO: <- Важното е, че след for-а.
            while (!(command.equals("Finish"))) {
                String sport = command;
                String result = scan.nextLine();

                if (result.equals("win")) {
                    money += 20;
                    countWin++;
                }
                if (result.equals("lose")) {
                    counLost++;
                }
                command = scan.nextLine();
            }
            System.out.printf("End of daY %s, money is %.2f lv. %n", i, money);
            if (countWin > counLost) {         // TODO: <- Имам Finish, Край на деня. Излизам от while.
                money += money * 0.1;
            }
        }                                     // TODO: <- Излизам от for-a, Край на Турнира.
//        System.out.printf("End of Tournament, money is %d lv. %n", money);
        if (countWin > counLost) { // TODO: Тук е грешката. Трябват още 2 променливи-за Деня. "countDayWin" и "countDayLose"
            money += money * 0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f lv. %n", money);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f lv.", money);
        }

        /**
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

         */

        //Out: You lost the tournament! Total raised money: 84.00





    }
}
