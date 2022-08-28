package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class ChristmasDecoration extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         Задача 6. Великденска украса
         Линк към Judge: https://judge.softuni.bg/Contests/Practice/Index/1637#11

         За великденските празници, магазин започва да продава три вида великденска украса
         – кошнички за яйца (basket), великденски венци (wreath) и шоколадови зайци (chocolate bunny).
         Вашата задача е да напишете програма, която да изчислява каква сметка
         трябва да плати всеки един клиент на магазина, като се има в предвид,
         че всеки клиент закупил четен брой продукти, ще получи 20% отстъпка от крайната цена.
         След като всички клиенти приключат с покупките,
         трябва да се отпечата средно по колко пари е похарчил всеки човек.

         Цените на продуктите са:
         •	кошничка за яйца (basket) – 1.50 лв.
         •	великденски венец (wreath) – 3.80 лв.
         •	шоколадов заек (chocolate bunny) – 7 лв.
         Вход
         От конзолата първоначално се чете един ред:
         •	Брои на клиентите в магазина – цяло число [1… 100]
         •	След това за всеки един клиент на нов ред до получаване на командата "Finish" се чете:
         o	Покупката която клиента е избрал – текст ("basket", "wreath" или "chocolate bunny")
         Изход
         •	При получаване на командата "Finish" да се отпечата един ред:
         o	"You purchased {броя на покупките} items for {крайната цена} leva."
         •	Накрая, след като всички клиенти приключат с покупките, да се отпечата на един ред
         o	"Average bill per client is: {средно аритметично на парите които е похарчил всеки един клиент} leva."
         Всички пари трябва да бъдат форматирани до втората цифра след десетичния знак.

      -> https://softuni.bg/trainings/resources/video/56240/
         video-12-december-2020-kaloyan-kostadinov-programming-basics-with-java-november-2020/3071 <-
         */

        double basketPrise = 1.50, wreathPrice = 3.80,
                bunnyPrice = 7.00, totalPrice = 0.00, price = 0.00;
        int countBasket = 0, countWreath = 0, countBunny = 0, allPayStocks = 0;


        int countClients = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < countClients; i++) {
            String command = scan.nextLine();

            price = 0;
            allPayStocks = 0;
            countBasket = 0;
            countBunny = 0;
            countWreath = 0;

            while (!(command.equals("Finish"))) {
                switch (command) {
                    case "basket":
                        countBasket++;
                        price += basketPrise;
                        break;
                    case "wreath":
                        countWreath++;
                        price += wreathPrice;
                        break;
                    case "chocolate bunny":
                        countBunny++;
                        price += bunnyPrice;
                        break;
                }
                command = scan.nextLine();
            }
            allPayStocks = countBasket + countBunny + countWreath;
            if (allPayStocks % 2 == 0) {
                price = price * 0.8; // 20 % - Отстъпка от цената. Плащам price * 0.8;
            }
            totalPrice += price;
            System.out.printf("You purchased %d items for %.2f leva. %n", allPayStocks, price);
        }
        System.out.printf("Average bill per client is: %.2f leva. %n", totalPrice / countClients);
    }
}

/*
 2
 basket
 wreath
 chocolate bunny
 Finish
 wreath
 chocolate bunny
 Finish

 1
 basket
 wreath
 chocolate bunny
 wreath
 basket
 chocolate bunny
 Finish
 */
