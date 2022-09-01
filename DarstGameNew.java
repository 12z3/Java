package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class DarstGameNew extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        int allPoints = 301, countShotsPositive = 0, countShotsNegative = 0;
        String nameofPlayers = scan.nextLine();
        boolean isWin = false;

        String command = scan.nextLine();
        while (!(command.equals("Retire"))) {
            String pole = command;
            int points = Integer.parseInt(scan.nextLine());

            switch (pole) {
                case "Single":
                    points = points * 1;
                    break;
                case "Double":
                    points = points * 2;
                    break;
                case "Triple":
                    points = points * 3;
                    break;
            }
            if (allPoints >= points) {
                allPoints -= points;
                countShotsPositive++;
            } else {
                countShotsNegative++;
            }
            if (allPoints == 0) {
                isWin = true;
                break;
            }
            command = scan.nextLine();
        }
        if (isWin) {
            System.out.printf("%s won the leg with %d shots.%n", nameofPlayers, countShotsPositive);

        } else {
            System.out.printf("%s retired after %d unsuccessful shots %n", nameofPlayers, countShotsNegative);
        }
    }
}

/*

 Michael van Gerwen
 Triple
 20
 Triple
 19
 Double
 10
 Single
 3
 Single
 1
 Triple
 20
 Triple
 20
 Double
 20

 Rob Cross
 Triple
 20
 Triple
 20
 Triple
 20
 Triple
 20
 Double
 20
 Triple
 20
 Double
 5
 Triple
 10
 Double
 6
 Retire

 */



