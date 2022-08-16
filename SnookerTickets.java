package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class SnookerTickets extends Methods {

    private static double getPrice(double price,
                                   String typeOfTickets,
                                   double price1,
                                   double price2,
                                   double price3) {
        switch (typeOfTickets) {
            case "Standard" -> price = price1;
            case "Premium" -> price = price2;
            case "VIP" -> price = price3;
        }
        return price;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();


        double price = 0.0;

        String etapOfGames = scan.nextLine();
        String typeOfTickets = scan.nextLine();
        String pictureWithTrophy = scan.nextLine();
        int countOfTickets = Integer.parseInt(scan.nextLine());


        if (etapOfGames.equals("Quarter final")) {
            price = getPrice(price, typeOfTickets, 55.50, 105.20, 118.90);
        } else if (etapOfGames.equals("Semi final")) {
            price = getPrice(price, typeOfTickets, 75.88, 125.22, 300.40);
        } else if (etapOfGames.equals("Final")) {
            price = getPrice(price, typeOfTickets, 110.10, 160.66, 400);
        }

        price = price * countOfTickets;

        if (price > 4000) {
            price -= price * 0.25;
        } else if (price > 2500) {
            price -= price * 0.10;
            if (pictureWithTrophy.equals("Y")) {
                price = price + countOfTickets * 40;
            }
        }

        System.out.printf("%.2f ", price);


    }
}
