package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class Serials extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        //•	Thrones – 50%
        //•	Lucifer – 40%
        //•	Protector – 30%
        //•	TotalDrama – 20%
        //•	Area – 10%


        double budget = Double.parseDouble(scan.nextLine());
        int countOfSerials = Integer.parseInt(scan.nextLine());
        double allPrice = 0;

        for (int i = 0; i < countOfSerials; i++) {
            String nameOfSerial = scan.nextLine();
            double pricePerSerial = Double.parseDouble(scan.nextLine());

            switch (nameOfSerial) {
                case "Thrones":
                    pricePerSerial -= pricePerSerial * 0.5;
                    break;
                case "Lucifer":
                    pricePerSerial -= pricePerSerial * 0.4;
                    break;
                case "Protector":
                    pricePerSerial -= pricePerSerial * 0.3;
                    break;
                case "Area":
                    pricePerSerial -= pricePerSerial * 0.2;
                    break;
            }

            allPrice += pricePerSerial;
        }

        if (budget >= allPrice) {
            System.out.printf("You bought all the series and left with %.2f lv. %n", budget - allPrice);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget - allPrice));
        }
    }
}
