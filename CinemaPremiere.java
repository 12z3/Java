package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class CinemaPremiere extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();
        /**
         За предстояща премиера на три известни продукции, местно кино ви наема да напишете софтуер,
         който да изчислява цената, която клиентите трябва да заплатят,
         според филма и пакета, който са избрали.

         John Wick	 Star Wars	    Jumanji
         Напитка	12 лв./бр.	 18 лв. /бр.	9 лв. /бр.
         Пуканки	15 лв. /бр.	 25 лв. /бр.	11 лв. /бр.
         Меню	    19 лв. /бр.	 30 лв. /бр.	14 лв. /бр.

         Напишете програма, която изчислява цената, която трябва да се заплати,
         като имате в предвид следните отстъпки:
         •	При избран филм "Star Wars" и закупени поне четири билета, има 30% семейна отстъпка.
         •	При избран филм "Jumanji" и закупени точно два билета, има 15% отстъпка за двама.
         Вход
         Входът се чете от конзолата и се състои от три реда:
         •	Първи ред - прожекция - текст с възможности"John Wick", "Star Wars" или "Jumanji"
         •	Втори ред - пакет за филм - текст  с възможности "Drink", "Popcorn" или "Menu"
         •	Трети ред - брой билети - цяло число в интервала [1… 30]

         */

        String movie = scan.nextLine();
        String moviePackage = scan.nextLine();
        int countOfTickets = Integer.parseInt(scan.nextLine());

        double price = 0;
        int countWrongName = 0;
        boolean wrongName = false, isItWrong = false;

        String[] moviE = new String[]{"John Wick", "Star Wars", "Jumanji"};
        String[] moviePackagE = new String[]{"Drink", "Popcorn", "Menu"};

        for (int movies = 0; movies < moviE.length; movies++) {
            if (!movie.equals(moviE[movies])) {
                countWrongName++;
                wrongName = true;
            }
        }
        if (wrongName && (countWrongName == moviE.length)) {
            isItWrong = true;
            System.out.printf("%s %n", "НеМа такЪв Филм !");
        }

        switch (movie) {
            case "John Wick" -> {
                switch (moviePackage) {
                    case "Drink" -> price += (countOfTickets * 12);
                    case "Popcorn" -> price += (countOfTickets * 15);
                    case "Menu" -> price += (countOfTickets * 19);
                }
            }
            case "Star Wars" -> {
                if (moviePackage.equals("Drink")) {
                    price += (countOfTickets * 18);
                } else if (moviePackage.equals("Popcorn")) {
                    price += (countOfTickets * 25);
                } else if (moviePackage.equals("Menu")) {
                    price += (countOfTickets * 30);
                }
                if (countOfTickets >= 4) {
                    price -= price * 0.30;
                }
            }
            case "Jumanji" -> {
                if (moviePackage.equals("Drink")) {
                    price += (countOfTickets * 9);
                } else if (moviePackage.equals("Popcorn")) {
                    price += (countOfTickets * 11);
                } else if (moviePackage.equals("Menu")) {
                    price += (countOfTickets * 14);
                }
                if (countOfTickets == 2) {
                    price -= price * 0.15;
                }
            }
            default -> {
                price = 0;
            }
        }

        if (!isItWrong) {
            System.out.printf("Your bill is %.2f leva. %n", price);
        }
    }
}

/*

Star Wars
Popcorn
4

---------

Your bill is 70.00 leva.

*/