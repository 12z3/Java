package task.aSoftUni;

import java.util.Scanner;

public class SnookerTickets2 {
    /**
     * @Source: <a href="https://judge.softuni.bg/Contests/Compete/Index/1538#5">...</a>
     *С наближаването на световното първенство по снукър в театъра Крусибъл в Шефилд, Англия,
     * феновете нямат търпение да се сдобият с ценните билети. Заради големия наплив от хора,
     * организаторите ви молят да напишете програма за продаване на билети, като се има предвид следния ценоразпис:
     *
     * При закупуване на билет, зрителят може да избере опция, снимка с трофея, на цена 40 лири.
     * При достигане на определена сума има отстъпки:
     * Над 4000 лири има 25% отстъпка и безплатни снимки с трофея
     * (ако  опцията за снимки е избрана, таксата от 40 лири за билет не се включва)
     * Над 2500 лири има 10% отстъпка
     * При избрана опция за снимки с трофея, цената се начислява след изчисляването на отстъпките.
     *
     * 	     Четвъртфинал	Полуфинал	Финал
     * Стандартен	55.50 £/бр.	75.88 £/бр.	110.10 £/бр.
     * Премиум	105.20 £/бр.	125.22 £/бр.	160.66 £/бр.
     * ВИП	       118.90 £/бр.	300.40 £/бр.	400 £/бр.
     *
     * Вход:
     * От конзолата се четат 3 реда:
     * Етап на първенството – текст - “Quarter final ”, “Semi final” или “Final”
     * Вид на билета – текст - “Standard”, “Premium” или “VIP”
     * Брой билети – цяло число в интервала [1 … 30]
     * Снимка с трофея – символ – 'Y' (да) или 'N' (не)
     *
     * Изход:
     * На конзолата се отпечатва 1 ред:
     * "Цената, която трябва да се заплати, форматирана до втората цифра след десетичния знак"
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String typeOfTicket = scanner.nextLine();
        int ticketsCount = scanner.nextInt();
        char trophyPictures = scanner.next().charAt(0);

        double price = getPrice(stage, typeOfTicket);
        solveAllPrice(ticketsCount, trophyPictures, price);
    }

    private static void solveAllPrice(int ticketsCount, char trophyPictures, double price) {
        double allPrice;
        allPrice = price * ticketsCount;

        if (allPrice > 4000) {
            allPrice -= allPrice * 0.25;
            trophyPictures = 'N';
        } else if (allPrice > 2500) {
            allPrice -= allPrice * 0.10;
        }
        if (trophyPictures == 'Y') {
            allPrice += ticketsCount * 40;
        }

        System.out.printf("%.2f %n", allPrice);
    }

    private static double getPrice(String stage, String typeOfTicket) {
        double price = 0.0, allPrice = 0.0;

        switch (stage) {
            case "Quarter final" -> {
                switch (typeOfTicket) {
                    case ("Standard") -> {
                        price = 55.50;
                    }
                    case ("Premium") -> {
                        price = 105.20;
                    }
                    case ("VIP") -> {
                        price = 118.90;
                    }
                }
            }
            case "Semi final" -> {
                switch (typeOfTicket) {
                    case ("Standard") -> {
                        price = 75.88;
                    }
                    case ("Premium") -> {
                        price = 125.22;
                    }
                    case ("VIP") -> {
                        price = 300.40;
                    }

                }
            }
            case "Final" -> {
                switch (typeOfTicket) {
                    case ("Standard") -> {
                        price = 110.10;
                    }
                    case ("Premium") -> {
                        price = 160.66;
                    }
                    case ("VIP") -> {

                        price = 400.00;
                    }
                }
            }
        }
        return price;
    }
}
