package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class Dogy extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        int countOfFoodInGrams = Integer.parseInt(scan.nextLine()) * 1000;
        int gramsPerEath = 0;

//  @  На всеки следващ ред до получаване на команда Adopted ще получавате колко грама
//  изяжда кученцето на всяко хранене - цяло число в интервала [10 ...1000]

        String command = scan.nextLine();
        while (!command.equals("Adopted")) {
            gramsPerEath += Integer.parseInt(command); // <- @ ВАЖНО: входа е "command", а не "scan.nextLine"

            if (gramsPerEath >= countOfFoodInGrams) {
                command = "Adopted";
            } else {
                command = scan.nextLine();
            }

            if (gramsPerEath <= countOfFoodInGrams) {
                System.out.printf("Food is enough! Leftovers: %d grams.%n", Math.abs(gramsPerEath - countOfFoodInGrams));
            } else {
                System.out.printf("Food is not enough. You need %d grams more.", Math.abs(gramsPerEath - countOfFoodInGrams));
            }
        }


    }
}