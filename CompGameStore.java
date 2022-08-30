package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class CompGameStore extends Methods {

    private static int getLastSymbolOfString(String word){
        int countChar = 0, count = 0;

        String[] name = word.split("");              // Star Craft 2    Hearthstone 3   Diablo          = in
        String lastString = name[name.length - 1];         //           "2"              "3"      "o" = 1     = out
        char lastChar = lastString.charAt(0);              //           '2'              '3'      'o'

        return countSymbolAsInteger(lastString, lastChar);   //          2                3        1
    }

    private static int countSymbolAsInteger(String lastString, char lastChar) {
        int countInteger, countChar = 0;

        countChar = countChar(countChar, lastChar);       //                7
        return countInteger(countChar, lastString);       //                2              3           1
    }

    private static int countChar(int countChar, char lastChar) {
        for (char i = 'a'; i <= 'z' ; i++) {
            countChar = 0;
            if (lastChar == i){
                countChar++;                              //                7
                break;
            }
        }
        return countChar;                                 //                7
    }

    private static int countInteger(int countChar, String lastString) {
        int countInteger;
        if (countChar > 0){                                //                7
            countInteger = 1;                              //                o = 1
        } else {
            countInteger = Integer.parseInt(lastString);   //         2 = 2            3 = 3
        }
        return countInteger;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         Линк: https://judge.softuni.bg/Contests/Compete/Index/1745#8
         Магазин за компютърни игри ви наема за да направите статистика на процента продажби на игрите
         от последния месец, като изчислите по колко процента от общите продажби са за някоя от игрите.
         Процентите трябва да бъдат разделени на четири части, три заглавия на игри и всички останали :
         •	Hearthstone
         •	Fornite
         •	Overwatch
         •	Others

         Вход
         От конзолата се четат:
         •	Брой продадени игри- n - цяло положително число в интервала [1… 100]
         За следващите n реда се чете по един ред:
         o	Име на игра - текст

         Изход
         На конзолата да се изпишат четири реда:
         "Hearthstone - {процент продажби на Hearthstone}%"
         "Fornite - {процент продажби на Fornite}%"
         "Overwatch - {процент продажби на Overwatch}%"
         "Others - {процент продажби на всички останали игри}%"
         Резултатът да бъде закръглен до втората цифра след десетичния знак.


         ->   Име на игра     Брой на Игрите с това Име (Hearthstone 3) = Това съм написал Аз.
         Напиши метод "getLastSymboloFString"

         */

        int countHearthstone = 0, countFornite = 0, countOverwatch = 0, countOthers = 0;
        int countAllHearthstone = 0, countAllFornite = 0,
                countAllOverwatch = 0, countAllOthers = 0, count = 0, countSome = 0, allGames = 0;


        int countGames = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < countGames; i++) {
            String gameNames = scan.nextLine();        // Star Craft 2    Hearthstone 3

            count = getLastSymbolOfString(gameNames);
//            String[] name = gameNames.split("");
//            String lastSymbol = name[name.length - 1];
//            char lastChar = lastSymbol.charAt(0);
//
//            for (char j = 'a'; j <= 'z'; j++) {      // Дива проверка дали последнят чар от Стринга е Цифра.
//                countSome = 0;                       // <- ИЗЯДЕ МИ ГЛАВАТА. За Проден Път....
//                if (lastChar == j) {
//                    countSome++;
//                    break;
//                }
//            }
//
//            if (countSome > 0) {
//                count = 1;
//            } else {
//                count = Integer.parseInt(lastSymbol);
//            }

           // System.out.printf("%d - '%c' - %s %n", count, lastChar, lastSymbol);
            switch (gameNames) {
                case "Hearthstone" -> {
                    countHearthstone++;
                    countAllHearthstone = countHearthstone * count;
                }
                case "Fornite" -> {
                    countFornite++;
                    countAllFornite = countFornite * count;
                }
                case "Overwatch" -> {
                    countOverwatch++;
                    countAllOverwatch = countOverwatch * count;
                }
                default -> {
                    countOthers++;
                    countAllOthers = countOthers * count;
                }
            }

            allGames += count;
        }

        System.out.printf("Are bought the number %d games %n", allGames);

        System.out.printf("Hearthstone - %.2f %% %n", ((double) countAllHearthstone * 100 / allGames));
        System.out.printf("Fornite - %.2f %% %n", ((double) countAllFornite * 100 / allGames));
        System.out.printf("Overwatch - %.2f %% %n", ((double) countAllOverwatch * 100 / allGames));
        System.out.printf("Others - %.2f %% %n", ((double) countAllOthers * 100 / allGames));
    }
}

/*
4
Hearthstone
Fornite
Overwatch
Counter-Strike

------------------
Hearthstone - 25.00%
Fornite - 25.00%
Overwatch - 25.00%
Others - 25.00%
------------------
3
Hearthstone
Diablo 2
Star Craft 2

------------------
Hearthstone - 33.33%
Fornite - 0.00%
Overwatch - 0.00%
Others - 66.67%
*/