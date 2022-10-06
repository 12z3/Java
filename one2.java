package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class one2 extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        double startPoints = 301.00, points = 0.0,
                currentPoints = 0.0, areaPoints = 0.0;

        int goodShot = 0, badShot = 0;
        String typeOfArea = "";
        boolean gameOver = false;

        String name = scan.nextLine();

        String command = scan.nextLine();
        while (!command.equals("Retire")) {
            typeOfArea = command;
            points = Double.parseDouble(scan.nextLine());

            switch (typeOfArea) {
                case "Single" -> {
                    startPoints -= points * 1;
                    areaPoints = points * 1;
                    goodShot++;
                }
                case "Double" -> {
                    startPoints -= points * 2;
                    areaPoints = points * 2;
                    goodShot++;
                }
                case "Triple" -> {
                    startPoints -= points * 3;
                    areaPoints = points * 3;
                    goodShot++;
                }
            }

            if (startPoints < areaPoints) {
                badShot++;
            }

            if (startPoints == 0) {
                gameOver = true;
                break;
            } else if (startPoints < 0){
                                             // TODO: ??????
            }

            command = scan.nextLine();
        }

        if (gameOver) {
                System.out.printf("%s won the leg with %d shots.%n", name, goodShot);
            }






    }
}
