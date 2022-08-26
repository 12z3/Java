package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class ChristmasBazar extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         https://softuni.bg/trainings/resources/video/44880/       <-
         video-23-november-2019-martin-paunov-programming-basics-with-java-october-2019/2506  <-
         */

        double allMoney = 0, bonus = 0, taxMoney = 0;

        double neededMoney = Double.parseDouble(scan.nextLine());
        int countOfFentasy = Integer.parseInt(scan.nextLine());
        int countOHorror = Integer.parseInt(scan.nextLine());
        int countOfRomance = Integer.parseInt(scan.nextLine());

        allMoney += countOfFentasy * 14.90 + countOfRomance * 4.30 + countOHorror * 9.80;

        taxMoney = allMoney * 0.2;
        allMoney -= taxMoney;

        if (allMoney >= neededMoney) {
            bonus = Math.floor((allMoney - neededMoney) * 0.10);    //  -> Math.floor(); <- закръглена към
                                                                   // най-близкото цяло число надолу.
            allMoney -= bonus;

            System.out.printf("%.2f leva donated %n", allMoney);
            System.out.printf("Sellers will receive %.2f leva. %n", bonus);
        } else {
            System.out.printf("%.2f money needed", Math.abs(allMoney - neededMoney));
        }
    }
}


 /*

 200
 15
 10
 5

 267,40 leva donated
 Sellers will receive 7,00 leva.
 */
