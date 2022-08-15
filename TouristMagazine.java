package aSoftUni;

import training.Methods;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TouristMagazine extends Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        timeAndData();

        /*

        Линк към Judge: https://judge.softuni.bg/Contests/Practice/Index/1654#3

         Времето се затопля и туристите започват да си правят разходки високо в планината,
         където все още има сняг, като за целта те трябва да закупят нужната туристическа екипировка.
         Вашата задача е да напишете програма, която да изчислява, стойността на екипировката,
         както и дали определения бюджет е достатъчен или не, като се знае, че в магазина има следната промоция:
         Всеки трети продукт е на половин цена.

         Вход
         От конзолата се чете:
         •	На първи ред – бюджетът - реално число в интервала [1.00… 100000.00]
         •	След това поредица от два реда
         (до получаване на команда "Stop"
         или при заявка за купуване на продукт, чиято стойност е по-висока от наличния бюджет) :
         o	Име на продукта – текст
         o	Цена на продукта – реално число в интервала [1.00… 5000.00]

         Изход
         На конзолата да се отпечатат следните редове според случая:
         •	При получаване на командата "Stop", на един ред:
         o	"You bought {брой на закупените продукти} products for {цена на покупките} leva."
         •	При заявка за покупка на продукт, чиято цена е по-висока от останалите пари, на два реда:
         o	"You don't have enough money!"
         o	"You need {недостигащи пари} leva!"

         */

        String brand;
        List<String> ownPurchase = new ArrayList<>();
        double price, allSpendMoney = 0;
        int count = 0;

        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            brand = command;
            price = Double.parseDouble(scanner.nextLine());

            if (budget < price) {
                System.out.print("You don't have enough money!\n");
                System.out.printf("You need %.2f leva!", Math.abs(budget - price));
                return;
            }
            count++;
            ownPurchase.add(brand);

            if (count % 3 == 0) {
                price /= 2;
            }

            budget -= price;
            allSpendMoney += price;

            command = scanner.nextLine();
        }
        System.out.printf("You bought %d products for %.2f leva.\n", count, allSpendMoney);
        for (String s : ownPurchase) {
            System.out.printf("%s \n", s);
        }
    }
}

/*
153.20
Backpack
25.20
Shoes
54
Sunglasses
30
Stop

You bought 3 products for 94.20 leva.
-----------------

54
Thermal underwear
24
Sunscreen
45

You don't have enough money!
You need 15.00 leva!
-----------------
*/