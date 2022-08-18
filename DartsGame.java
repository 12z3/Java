package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class DartsGame extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        // TODO: Има Грешка в кода - Погледни го!

        int gameSteps = 0;
        boolean bullseye = false;

        int count = Integer.parseInt(scan.nextLine());

        while (count > 0) {
            String mishenSectror = scan.nextLine();

            if (mishenSectror.equals("bullseye")) {
                bullseye = true;
                gameSteps++;
                System.out.printf("Congratulations! You won the game in" +
                        " a bullseye in %d moves! %n", gameSteps);
                return;
            }
            int misheneCount = Integer.parseInt(scan.nextLine());

            // Switch Statement:
            switch (mishenSectror) {
                case "number section":
                    count -= misheneCount;
                    gameSteps++;
                    break;
                case "double ring":
                    count -= misheneCount * 2;
                    gameSteps++;
                    break;
                case "triple ring":
                    count -= misheneCount * 3;
                    gameSteps++;
                    break;

//                case "bullseye":
//                    hod++;
//                    System.out.printf("Congratulations! You won the game in" +
//                            " a bullseye in %d moves! %n", hod);
//                    return;
            }

                // if - Statement:
//            if (misheneSectror.equals("number section")) {
//                count -= misheneCount;
//            } else if (misheneSectror.equals("double ring")) {
//                misheneCount *= misheneCount;
//                count -= misheneCount;
//            } else if (misheneSectror.equals("trplle ring")) {
//                misheneCount = 3 * misheneCount;
//                count -= misheneCount;
//            } else {
//                count -= misheneCount;
//                System.out.printf("You won the game with a bullseye in %d moves %n", count);
//                return;
//            }

//            if (bullseye) {
//                System.out.printf("Congratulations! You won the game in" +
//                        " a bullseye in %d moves! %n", hod);
//                return;
//            }
        }
        if (count == 0) {
            System.out.printf("Congratulations! You won the game in %d moves! %n", gameSteps);
        } else {
            System.out.printf("You don't win. Your movie is %d. %n", Math.abs(gameSteps));
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

Congratulations! You won the game win 4 moves
*/


    }
}
