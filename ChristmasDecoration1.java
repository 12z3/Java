package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class ChristmasDecoration1 extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        String product = "";
        double price = 0, allprice = 0, pricePerMen = 0, count = 0;

        int countOfClients = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < countOfClients; i++) {
            count = 0;
            price = 0;

            String command = scan.nextLine();
            while (!command.equals("Finish")) {
                product = command;
                switch (product) {
                    case "basket" -> {
                        price += 1.50;
                        count++;
                    }
                    case "wreath" -> {
                        price += 3.80;
                        count++;
                    }
                    case "chocolate bunny" -> {
                        price += 7;
                        count++;
                    }
                }
                command = scan.nextLine();
            }

            if (count % 2 == 0) {
                price -= price * 0.20;
            }

            allprice += price;              //  <-- !!!
            System.out.printf("You purchased %.0f items for %.2f leva. %n", count, price);
        }

        System.out.printf("Average bill per client is: %.2f leva.", allprice / countOfClients);


    }
}
