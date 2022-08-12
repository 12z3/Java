package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class PhotoStudio extends Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        timeAndData();

        double price = 0;

        int countOfPicthures = Integer.parseInt(scanner.nextLine());
        String typeOfPicthures = scanner.nextLine();
        String offer = scanner.nextLine();

        switch (typeOfPicthures) {
            case "9X13" -> {
                price += 0.16;
                if (countOfPicthures > 50) {
                    price -= price * 0.05;
                }
            }
            case "10X15" -> {
                price += 0.16;
                if (countOfPicthures > 80) {
                    price -= price * 0.03;
                }
            }
            case "13X18" -> {
                price += 0.38;
                if (countOfPicthures > 50 && countOfPicthures <= 100) {
                    price -= price * 0.03;
                } else if (countOfPicthures > 100) {
                    price -= price * 0.05;
                }

            }
            case "20X30" -> {
                price += 2.90;
                if (countOfPicthures > 10 && countOfPicthures <= 50) {
                    price -= price * 0.07;
                } else if (countOfPicthures > 50) {
                    price -= price * 0.09;
                }
            }
        }
        price = price * countOfPicthures;
        if (offer.equals("online")) {
            price -= price * 0.02;
        }
        System.out.printf("%.2fBGN %n", price);
    }
}

