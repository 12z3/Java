package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class AgainChristmas extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        double winMoney = 0, lostMoney = 0;
        int dayWin = 0, dayLost = 0;

        int tournamentDay = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= tournamentDay; i++) {

            String command = scan.nextLine();
            while (!(command.equals("Finish"))) {
                String sport = command;
                String result = scan.nextLine();

                if (result.equals("win")) {
                    winMoney += 20;
                    dayWin++;
                } else {
                    dayLost++;
                }

                command = scan.nextLine();
            }                                   // <-  Края на деня.

            if (dayWin > dayLost) {
                winMoney += winMoney * 0.1;
            }
        }                                                                           // <- Края на турнира.

        if (dayWin > dayLost) {
            winMoney += winMoney * 0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f%n", winMoney);
        }else {
            System.out.printf("You lost the tournament! Total raised money: %.2f%n", winMoney);
        }
    }
}
