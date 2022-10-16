package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class NewHouse extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();


        String nameOfFlowers = "";
        double costPerOne = 0.0,
                hasPay = 0.0, purchased = 0.0;

        String flowers = scan.nextLine();
        int countFlowers = Integer.parseInt(scan.nextLine());
        double familyBudget = Double.parseDouble(scan.nextLine());

        switch (flowers) {
            case "Roses" -> costPerOne = 5.00;
            case "Dahlias" -> costPerOne = 3.80;
            case "Tulips" -> costPerOne = 2.80;
            case "Narcissus" -> costPerOne = 3.00;
            case "Gladiolus" -> costPerOne = 2.50;
        }

        purchased = costPerOne * countFlowers;

        if (countFlowers > 80 && flowers.equals("Roses")) {
            purchased -= purchased * 0.10;
        } else if (countFlowers > 90 && flowers.equals("Dahlias")) {
            purchased -= purchased * 0.15;
        } else if (countFlowers > 80 && flowers.equals("Tulips")) {
            purchased -= purchased * 0.15;
        } else if (countFlowers < 120 && flowers.equals("Narcissus")) {
            purchased += purchased * 0.15;
        } else if (countFlowers < 80 && flowers.equals("Gladiolus")) {
            purchased += purchased * 0.20;
        }

        if (purchased < familyBudget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left. %n",
                    countFlowers, flowers, familyBudget - purchased);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more. %n",
                    purchased - familyBudget);
        }
    }
}
