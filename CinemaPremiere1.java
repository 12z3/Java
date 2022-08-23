package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class CinemaPremiere1 extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         За предстояща премиера на три известни продукции, местно кино ви наема да напишете софтуер,
         който да изчислява цената, която клиентите трябва да заплатят, според филма и пакета, който са избрали.

                            John Wick	    Star Wars	    Jumanji
         Напитка	        12 лв./бр.	    18 лв. /бр.	    9 лв. /бр.
         Пуканки	        15 лв. /бр.	    25 лв. /бр.	    11 лв. /бр.
         Меню	            19 лв. /бр.	    30 лв. /бр.	    14 лв. /бр.

         Напишете програма, която изчислява цената, която трябва да се заплати, като имате в предвид следните отстъпки:
         •	При избран филм "Star Wars" и закупени поне четири билета, има 30% семейна отстъпка.
         •	При избран филм "Jumanji" и закупени точно два билета, има 15% отстъпка за двама.
         Вход
         Входът се чете от конзолата и се състои от три реда:
         •	Първи ред - прожекция - текст с възможности"John Wick", "Star Wars" или "Jumanji"
         •	Втори ред - пакет за филм - текст  с възможности "Drink", "Popcorn" или "Menu"
         •	Трети ред - брой билети - цяло число в интервала [1… 30]
         Изход
         На конзолата трябва да се отпечата един ред:
         "Your bill is {крайна цена} leva."
         Цената да бъде закръглена до втората цифра след десетичния знак.

         */

        String[] listOfNameOfFilms = new String[]{"John Wick", "Star Wars", "Jumanji"};
        String[] listOfPackage = new String[]{"Drink", "Popcorn", "Menu"};
        double pricePerOne = 0, allPrice = 0;

        int countOfWrongFilmS = 0;
        int countOfPackages = 0;

        boolean wrongFilmName = false;
        boolean itSOk = true;


        String readNameOfFilm = scan.nextLine();
        String readPackageOfFilm = scan.nextLine();
        int countOfTickets = Integer.parseInt(scan.nextLine());

        for (String listOfNameOfFilm : listOfNameOfFilms) {
            if (!readNameOfFilm.equalsIgnoreCase(listOfNameOfFilm)) {
                countOfWrongFilmS++;
            }
        }

        if ((countOfWrongFilmS == listOfNameOfFilms.length)) {
            System.out.print("Wrong Name of Films");
            itSOk = false;
            return;

        } else {
            switch (readPackageOfFilm) {
                case "Drink" -> {
                    if (readNameOfFilm.equalsIgnoreCase("John Wick")) {
                        pricePerOne += 12;
                        allPrice = pricePerOne * countOfTickets;
                    } else if (readNameOfFilm.equalsIgnoreCase("Star Wars")) {
                        pricePerOne += 18;
                        allPrice = pricePerOne * countOfTickets;
                        if (countOfTickets > 4) {
                            allPrice -= allPrice * 0.30;
                        }
                    } else if (readNameOfFilm.equalsIgnoreCase("Jumanji")) {
                        pricePerOne += 9;
                        allPrice = pricePerOne * countOfTickets;
                        if (countOfTickets == 2) {
                            allPrice -= allPrice * 0.15;
                        }
                    }
                }
                case "Popcorn" -> {
                    if (readNameOfFilm.equalsIgnoreCase("John Wick")) {
                        pricePerOne += 15;
                        allPrice = pricePerOne * countOfTickets;
                    } else if (readNameOfFilm.equalsIgnoreCase("Star Wars")) {
                        pricePerOne += 25;
                        allPrice = pricePerOne * countOfTickets;
                        if (countOfTickets >= 4) {
                            allPrice -= allPrice * 0.30;
                        }
                    } else if (readNameOfFilm.equalsIgnoreCase("Jumanji")) {
                        pricePerOne += 11;
                        allPrice = pricePerOne * countOfTickets;
                        allPrice = pricePerOne * countOfTickets;
                        if (countOfTickets == 2) {
                            allPrice -= allPrice * 0.15;
                        }
                    }
                }
                case "Menu" -> {
                    if (readNameOfFilm.equalsIgnoreCase("John Wick")) {
                        pricePerOne += 19;
                        allPrice = pricePerOne * countOfTickets;
                    } else if (readNameOfFilm.equalsIgnoreCase("Star Wars")) {
                        pricePerOne += 30;
                        allPrice = pricePerOne * countOfTickets;
                        if (countOfTickets > 4) {
                            allPrice -= allPrice * 0.30;
                        }
                    } else if (readNameOfFilm.equalsIgnoreCase("Jumanji")) {
                        pricePerOne += 14;
                        allPrice = pricePerOne * countOfTickets;
                        allPrice = pricePerOne * countOfTickets;
                        if (countOfTickets == 2) {
                            allPrice -= allPrice * 0.15;
                        }
                    }
                }
            }
        }

        if (itSOk) {
            System.out.printf("Your bill is %.2f leva.", allPrice);
        }
    }
}
/*
John Wick
Drink
6

----------
Your bill is 72.00 leva.
-----------
Star Wars
Popcorn
4

-----------
Your bill is 70.00 leva.
-----------
Jumanji
Menu
2

-----------
Your bill is 23.80 leva.


*/