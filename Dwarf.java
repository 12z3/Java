package aSoftUni;

import training.Methods;

import java.io.IOException;
import java.util.Scanner;

public class Dwarf extends Methods {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        double spentMoney = 0;

        int countOfDwarf = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());

        for (int i = 0; i < countOfDwarf; i++) {
            String podaruk = scan.nextLine();
            switch (podaruk) {
                case "sand clock" -> {
                    spentMoney += 2.20;
                }
                case "magnet" -> {
                    spentMoney += 1.50;
                }
                case "cup" -> {
                    spentMoney += 5.0;
                }
                case "t-shirt" -> {
                    spentMoney += 10.00;
                }
            }
        }

        if (spentMoney > budget){
            System.out.printf("We loking for %.2f money %n ",spentMoney-budget);
        }else {
            System.out.printf("Ok he have %.2f %n", budget-spentMoney);
        }

    }
}

/**
5
100
sand clock
magnet
cup
t-shirt
magnet

 */
