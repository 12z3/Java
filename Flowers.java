package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class Flowers extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        int countChrysantemus = Integer.parseInt(scan.nextLine());
        double priceChrysantemus = 0;

        int countRoses = Integer.parseInt(scan.nextLine());
        double priceRoses = 0;

        int countTulips = Integer.parseInt(scan.nextLine());
        double priceTulips = 0;
        double allPrice = 0;

        String season = scan.nextLine();
        char isHolladay = scan.nextLine().charAt(0);

        switch (season) {
            case "Spring", "Summer" -> {
                priceChrysantemus += 2.00;
                priceRoses += 4.10;
                priceTulips += 2.50;
            }
            case "Autumn", "Winter" -> {
                priceChrysantemus += 3.75;
                priceRoses += 4.50;
                priceTulips += 4.15;
            }
        }

        allPrice += (countChrysantemus * priceChrysantemus) +
                (countRoses * priceRoses) + (countTulips * priceTulips);

        if (isHolladay == 'Y') {
            allPrice += allPrice * 0.15; // текущата цена -/+ отстъпката.
        }

        if (countTulips > 7 && season.equals("Spring")) {
            allPrice -= allPrice * 0.05;
        }
        if (countRoses > 10 || season.equals("Winter")) {
            allPrice -= allPrice * 0.10;
        }

        int allCount = countChrysantemus + countRoses + countTulips;
        if (allCount > 20) {
            allPrice -= allPrice * 0.20;
        }
        allPrice += 2;
        System.out.printf("%.2f %n", allPrice);

    }
}
