package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class Balls extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         В кутия имаме неопределен брой топки с различни цветове,
         които ни носят различен брой точки. Задачата ни е да извадим Х бр. топки,
         които ще бъдат въведени от конзолата, като се има в предвид,
         че всеки различен цвят влияе на точките ни по следния начин:
         •	Ако топката е “red” точките ни се повишават с 5.
         •	Ако топката е “orange” точките ни се повишават с 10.
         •	Ако топката е “yellow” точките ни се повишават с 15.
         •	Ако топката е “white” точките ни се повишават с 20.
         •	Ако топката е “black” точките ни се делят на 2.
         Ако топката е с какъвто и да е цвят, различен от по-горните,
         точките не се манипулират и програмата продължава да работи.

         Вход
         •	От конзолата се чете 1 цяло число N, което е броят на топките в диапазон (0-1000).
         •	След това се четат N на брой цветове - текст
         Изход
         Отпечатват се следните редове:
         “Total points: {всичките събрани топки}”
         “Points from red balls {броят червени топки}”
         “Points from orange balls {броят оранжеви топки}”
         “Points from yellow balls {броят жълти топки}”
         “Points from white balls {броят бели топки}”
         “Other colors picked: {броят на избраните топки извън зададените цветове}”
         “Divides from black balls: {броят на пътите, в които точките са били разделяни на 2}”

         */

        /*
         Първата топка е “white”, което означава, че към точките ни добавяме 20.
         Втората топка е “black”, което означава, че разделяме точките ни на 2....

         Точките в тялото на цикъла са с НАТРУПВАНЕ. Затова и променливата е една
         за всички цветове /points/. Няма blackPoints, yellowPoints и т.н.

         */

        double points = 0, countYellow = 0, countWhite = 0,
                countBlack = 0, countOrange = 0, otherCount = 0, countRed = 0;

        int countBalls = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < countBalls; i++) {
            String ballsColors = scan.nextLine();

            switch (ballsColors) {
                case "red" -> {
                    points += 5;
                    countRed++;
                }
                case "orange" -> {
                    points += 10;
                    countOrange++;
                }
                case "yellow" -> {
                    points += 15;
                    countYellow++;
                }
                case "white" -> {
                    points += 20;
                    countWhite++;
                }
                case "black" -> {
                    points /= 2.0;
                    countBlack++;
                }
                default -> otherCount++;

            }
        }

        System.out.printf("Total points: %.0f %n", points);
        System.out.printf("Points from red balls %.0f %n", countRed);
        System.out.printf("Points from orange balls %.0f %n", countOrange);
        System.out.printf("Points from yellow balls %.0f %n", countYellow);
        System.out.printf("Points from white balls %.0f %n", countWhite);
        System.out.printf("Other colors picked: %.0f %n", otherCount);
        System.out.printf("Points from black balls %.0f %n", countBlack);

    }
}

/*

3
white
black
pink
------------------------------
 Total points: 10
 Points from red balls: 0
 Points from orange balls: 0
 Points from yellow balls: 0
 Points from white balls: 1
 Other colors picked: 1
 Divides from black balls: 1

 */