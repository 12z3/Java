package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class DartsGame1 extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         В тази игра играчът започва с
         определен брой точки   намаляват
         печели. На мишената има следните сектори – сектор с конкретен брой точки (number section),
         сектор, който удвоява точките (double ring), сектор, който утроява точките (triple ring)
         и център на мишената (bullseye). Ако играчът уцели центъра на мишената, автоматично печели играта.
         Играчът губи ако точките му станат отрицателни.

         Вход
         От конзолата първо се чете един ред:
         • Първоначален брой точки – цяло положително число в интервала [1 ... 1000];
         След това последователно се четат по два реда:
         • Сектор на мишената – текст с възможности: "number section", "double ring",
         , които се
         постепенно и при достигането на
         "triple ring", "bullseye"
         • Брой точки – цяло положително число в интервала [1 ... 100]

         Изход
         На конзолата се отпечатва един ред:
         • Ако играчът спечели чрез достигане на нула точки:
         "Congratulations! You won the game in {брой ходове} moves!" •

         Ако играчът спечели чрез уцелване на центъра на мишената:
         "Congratulations! You won the game with a bullseye in {брой ходове} moves!" •

         Ако играчът загуби:
         "Sorry, you lost. Score difference: {брой отрицателни точки}."
         */

        // TODO: "+=" Старата стойност се сумира с новата.
        // TODO:  "=" Новата стойност се Презаписва върху Старата. Старата се Губи.

        int resultPoints = 0, count = 0, countMissingSectors = 0;
        boolean isMisingSectors = false, isItMatch = false;

        String[] countOfSectors = new String[]
                {"number section", "double ring", "triple ring", "bullseye"};


        int firstPoints = Integer.parseInt(scan.nextLine());
        while (true) {                                                      // 1.
            String sector = scan.nextLine();

//            for (int sectors = 0; sectors < countOfSectors.length; sectors++) {
//                // compareWords(sector, countOfSectors[sectors]);
//
//                if (!sector.equals(countOfSectors[sectors])) {
//                    countMissingSectors++;
//                    isMisingSectors = true;
//                }
//            }

//            if (isMisingSectors && countMissingSectors > 1) {           // TODO: ! ОПРАВИ ГО. <-
//                System.out.printf("%s %n", "It's No Ok!");
//                return;
//            }

//                if (compareWords(sector, countOfSectors[sectors])){
//                    System.out.printf("Congratulations! " +
//                            "You won the game with a bullseye in %d moves! %n", count);
//                    return;
//                }

                if (sector.equals("bullseye")) {                            // 2.
                    count++;
                    System.out.printf("Congratulations! " +
                            "You won the game with a bullseye in %d moves! %n", count);
                    return;
                } else {                                                    // 3.

                    int countsOfPoints = Integer.parseInt(scan.nextLine());

                    // TODO: "resultPoints" се Презаписва, "firstPoints" ce Ъпдейтва в switch-a. <-
                    // TODO:  "firstPoints" - намаляват/нарастват на всяка итерация = f(resultPoints, countsOfPoints).

                    switch (sector) {                                        // 4.
                        case "number section" -> {
                            resultPoints = firstPoints - countsOfPoints; // TODO: Старата стойност се забравя и се присвоява нова.
                            firstPoints = resultPoints;                  //  <- Важно. Във който и от трите switch-a -
                            count++;                                     //  да се влезе е необходимо равенството:
                        }                                                //  "firstPoints = resultPoints;" То гарантира, че
                        case "double ring" -> {                          //  firstPoints правилно ще се ъпдейтва в switch-а.
                            countsOfPoints = countsOfPoints * 2;
                            resultPoints = firstPoints - countsOfPoints;
                            firstPoints = resultPoints;                          // TODO: <- Важно.
                            count++;
                        }
                        case "triple ring" -> {
                            countsOfPoints = countsOfPoints * 3;
                            resultPoints = firstPoints - countsOfPoints; // TODO: Старата стойност се забравя и се присвоява нова.
                            firstPoints = resultPoints;                          // TODO: <- Важно.
                            count++;
                        }
                    }

                    if (resultPoints == 0) {
                        System.out.printf("Congratulations! You won the game in %d moves! %n", count);
                        break;
                    } else if (resultPoints < 0) {
                        System.out.printf("Sorry, you lost. Score difference: %d. %n", Math.abs(resultPoints));
                        break;
                    }
                }
            }                                                             // 5 -> И обратно в 1 докато: "while (true)"



        }
    }


/*

150
double ring
20
triple ring
10
number section
20
triple ring
20

-------------

Congratulations! You
won the game in 4
moves!

-------------

101
triple ring
7
double ring
19
bullseye

--------------

Congratulations! You
won the game with a
bullseye in 3 moves!

---------------

75
triple ring
17
number section
16
triple ring
13
double ring
10

---------------

Sorry, you lost. Score
difference: 31.

----------------

*/