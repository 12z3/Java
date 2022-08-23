package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class Basketball extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();                                 // Чете ред по ред от горе на долу.

        double countWin = 0, countLost = 0, pointDessy = 0, pointEnemy = 0;
        int allMatches = 0;


        String nameOfTournament = scan.nextLine();     // <- Име на турнира – текст.                   <-
        while (!nameOfTournament.equals("End of tournaments ")) {
            int numberOfMatches = Integer.parseInt(scan.nextLine());  // <- Броя мачове.               <-

            for (int i = 1; i <= numberOfMatches; i++) {  // <- Броя мачове за ВСЕКИ турнир.           <-
                pointDessy = Integer.parseInt(scan.nextLine());
                pointEnemy = Integer.parseInt(scan.nextLine());

                if (pointDessy > pointEnemy) {
                    countWin++;
                    System.out.printf("Game %d of tournament %s: win with %.1f points. %n",
                            i, nameOfTournament, pointDessy - pointEnemy);
                } else {
                    countLost++;
                    System.out.printf("Game %d of tournament %s: lost with %.1f points. %n",
                            i, nameOfTournament, pointEnemy - pointDessy);
                }
            }

            allMatches += numberOfMatches;
            nameOfTournament = scan.nextLine();  // Докато това не стане = "End of tournaments" изпълнява цикъла.  <-
                                                // С това се прочита СЛЕДВАЩИЯТ НОВ РЕД...
        }
        System.out.printf("%.2f%% matches win %n", countWin * 100 / allMatches);
        System.out.printf("%.2f%% matches win %n", countLost * 100 / allMatches);


    }
}


