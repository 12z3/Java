package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class Fitnes extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        Double cash = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();

        int age = Integer.parseInt(scan.nextLine());
        String sport = scan.nextLine();

        Double price = 1.00;

        if (gender.equals("m")) {
            switch (sport) {
                case "Gym" -> price *= 42;
                case "Boxing" -> price *= 41;
                case "Yoga" -> price *= 45;
                case "Zumba" -> price *= 34;
                case "Dances" -> price *= 51;
                case "Pilates" -> price *= 39;
            }

        } else if (gender.equals("f")) {
            switch (sport) {
                case "Gym" -> price *= 35;
                case "Boxing" -> price *= 37;
                case "Yoga" -> price *= 42;
                case "Zumba" -> price *= 31;
                case "Dances" -> price *= 53;
                case "Pilates" -> price *= 37;
            }
            if (age < 19) {
                price *= 0.8;
            }
        }
        if (cash > price) {
            System.out.printf("You purchased a 1 month pass for %s%n", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more", Math.abs(cash - price));
        }
    }
}
