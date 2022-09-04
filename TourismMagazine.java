package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class TourismMagazine extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
         •	След това поредица от два реда (до получаване на команда "Stop" или при заявка за купуване на продукт, чиято стойност е по-висока от наличния бюджет) :
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


        String nameOfProduct = "";
        double priceOfProduct, spendSum = 0.00;
        int productCount = 0;
        boolean isNegativeBudget = false;

        double currentBudget = Double.parseDouble(scan.nextLine());

        String command = scan.nextLine();
        while (!command.equals("Stop")) {
            nameOfProduct = command;
            priceOfProduct = Double.parseDouble(scan.nextLine());
            productCount++;

            if ((productCount % 3) == 0) {
                priceOfProduct = priceOfProduct / 2;     // 9-9/2 != 9/2
            }                                            // priceOfProduct -= priceOfProduct / 2 -> Същият резултат.
                                                         // Но Не Е -= не е правилният вариант в случая.

            spendSum += priceOfProduct;
            currentBudget -= priceOfProduct;

            if (currentBudget <= 0) {
                isNegativeBudget = true;
                break;
            }

            command = scan.nextLine();
        }

        if (!isNegativeBudget) {
            System.out.printf("You bought %d products for %.2f leva. %n", productCount, spendSum);
        } else {
            System.out.printf("You don't have enough money! %n");
            System.out.printf("You need %.2f leva! %n", Math.abs(currentBudget));
        }
    }
}

/*
54
Thermal underwear
24
Sunscreen
45

---------------------
You don't have enough money!
You need 15,00 leva!
---------------------
153.20
Backpack
25.20
Shoes
54
Sunglasses
30
Stop

---------------------
You bought 3 products for 94.20 leva.
---------------------
*/
