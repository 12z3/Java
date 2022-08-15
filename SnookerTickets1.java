package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class SnookerTickets1 extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();


        double price = 0.0, money = 0.0;

        String stage = scan.nextLine();
        String typeOfTicket = scan.nextLine();
        int countOfTickets = Integer.parseInt(scan.nextLine());
        String isPickcher = scan.nextLine();


        switch (stage) {
            case "Quarter final" -> {
                if (typeOfTicket.equals("Standard")) {
                    price += 55.50;
                } else if (typeOfTicket.equals("Premium")) {
                    price += 105.20;
                } else if (typeOfTicket.equals("VIP")) {
                    price += 118.90;
                }
            }
            case "Semi final" -> {
                if (typeOfTicket.equals("Standard")) {
                    price += 75.88;
                } else if (typeOfTicket.equals("Premium")) {
                    price += 125.22;
                } else if (typeOfTicket.equals("VIP")) {
                    price += 300.40;
                }
            }
            case "Final" -> {
                if (typeOfTicket.equals("Standard")) {
                    price += 110.10;
                } else if (typeOfTicket.equals("Premium")) {
                    price += 160.66;
                } else if (typeOfTicket.equals("VIP")) {
                    price += 400;
                }
            }
        }

        money = price * countOfTickets;

        if (money >= 4000) {
            isPickcher = "N";                            // <- Хитро.
            money -= money * 0.25;
        } else if (money >= 2500) {
            money -= money * 0.10;
        }

        if (isPickcher.equals("Y")) {
            money += countOfTickets * 40;
        }

        System.out.printf("%.2f %n", money);

    }
}
