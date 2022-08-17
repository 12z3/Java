package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class BakingThings extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         Всеки един от участниците избирал колко и кои от възможните сладкиши да направи,
         а те били следните - сладки, торти и гофрети.
         След като се изпекат, сладкишите се продават на следните цени за брой:
         сладки - 1,50, торти - 7,80, гофрети - 2,30, а събраната сума се дарява за благотворителност.
         Напишете програма, която проследява колко и кои сладкиши е изпекъл всеки един от участниците,
         колко е общият брой на продадените сладкиши и колко е събраната сума за благотворителност.

         Вход
         От конзолата се четат следните редове:
         • Първи ред – брой участници в състезанието – цяло положително число в интервала [1...10]
         За всеки един от участниците се четат следните редове до прочитане на командата "Stop baking!":
         • Първи ред – име на участник - текст
         • Втори ред – вид сладкиш - текст с възможности: "cookies", "cakes", "waffles"
         • Трети ред – брой изпечени сладкиши от дадения вид - цяло число в интервала [1...1000]
         © Software University Foundation. This work is licensed under the CC-BY-NC-SA license. Follow us:
         Page 6 of 8

         Изход
         За всеки един от участниците се отпечатва по един ред:
         • "{име на съответния участник} baked {брой изпечени сладки} cookies, {брой изпечени торти}
         cakes and {брой изпечени гофрети} waffles."
         Накрая да се отпечатат два реда, съдържащи съответно общия брой на изпечените сладкиши и
         събраната сума за благотворителност, форматирани по следния начин:
         • "All bakery sold: {брой сладкиши}"
         • "Total sum for charity: {сума за благотворителност} lv."
         Сумата да бъде форматирана до втората цифра след десетичния знак.
         */


        int countOfBakingCake = 0, allCake = 0, count = 0;
        double cookiesPrice = 0, cakesPrice = 0, wafflesPrice = 0, totalSum = 0;
        boolean isCakeMissing = false;

        String nameOfPlayer = "", typeOfCake = "", command = "";
        String[] typeOfCakeS = new String[]{"cookies", "cakes", "waffles"};


        int countOfPlayers = Integer.parseInt(scan.nextLine());

        for (int players = 0; players < countOfPlayers; players++) {
            int countCakes = 0, countCookie = 0, countWaffles = 0;                    // <-

            nameOfPlayer = scan.nextLine();
            command = scan.nextLine();

            while (!command.equals("Stop baking!")) {
                typeOfCake = command;
                countOfBakingCake = Integer.parseInt(scan.nextLine());

                for (String ofCake : typeOfCakeS) {                                    // <-
                    if (!typeOfCake.equals(ofCake)) {
                        isCakeMissing = true;
                        count++;
                    }
                }

                if (isCakeMissing && count == 3) {                                     // <-
                    System.out.println("It's No Ok. There missing cakes!");
                    return;
                }

                switch (typeOfCake) {
                    case "cookies" -> {
                        cookiesPrice += (1.50 * countOfBakingCake);
                        countCookie += countOfBakingCake;
                    }
                    case "cakes" -> {
                        cakesPrice += (7.80 * countOfBakingCake);
                        countCakes += countOfBakingCake;
                    }
                    case "waffles" -> {
                        wafflesPrice += (2.30 * countOfBakingCake);
                        countWaffles += countOfBakingCake;
                    }
                }

                allCake += countOfBakingCake;                                           // <-
                command = scan.nextLine();
            }

            System.out.printf("%s baked %d cookies, %d " +
                    "cakes and %d waffles. %n", nameOfPlayer, countCookie, countCakes, countWaffles);
        }

        totalSum = cookiesPrice + cakesPrice + wafflesPrice;                            // <-

        System.out.printf("All bakery sold: %d %n", allCake);
        System.out.printf("Total sum for charity: %.2f lv. %n", totalSum);
    }
}


/*

3
Iva
cookies
5
cakes
3
Stop baking!
George
cakes
7
waffles
2
Stop baking!
Ivan
cookies
6
Stop baking!

-------------

Iva baked 5 cookies, 3 cakes and 0 waffles.
George baked 0 cookies, 7 cakes and 2 waffles.
Ivan baked 6 cookies, 0 cakes and 0 waffles.
All bakery sold: 23
Total sum for charity: 99,10 lv.


*/