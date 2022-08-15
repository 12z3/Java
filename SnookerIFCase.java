package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class SnookerIFCase extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        //TODO: Виж водеото.

        /*

  ->  https://youtu.be/CbEWs2asiGE.  Много Доър Урок <-

  ->  https://softuni.bg/trainings/resources/video/41543/
         video-04-july-2019-simona-simeonova-programming-basics-with-java-may-2019/2370      <-
         *
  ->  https://softuni.bg/trainings/resources/video/44880/
         video-23-november-2019-martin-paunov-programming-basics-with-java-october-2019/2506  <-
         */

        /*
         Задача 3. Билети за снукър
         С наближаването на световното първенство по снукър в театъра Крусибъл в Шефилд,
         Англия, феновете нямат търпение да се сдобият с ценните билети.
         Заради големия наплив от хора, организаторите ви молят да напишете програма
         за продаване на билети, като се има предвид следния ценоразпис:

                        Четвъртфинал	       Полуфинал	          Финал
         Стандартен	    55.50 £/бр.	          75.88 £/бр.	       110.10 £/бр.
         Премиум	   105.20 £/бр.	         125.22 £/бр.	       160.66 £/бр.
         ВИП	       118.90 £/бр.	         300.40 £/бр.	          400 £/бр.

         При закупуване на билет, зрителят може да избере опция, снимка с трофея, на цена 40 лири.
         При достигане на определена сума има отстъпки:
         •	Над 4000 лири има 25% отстъпка и безплатни снимки с трофея
         (ако  опцията за снимки е избрана, таксата от 40 лири за билет не се включва)
         •	Над 2500 лири има 10% отстъпка
         При избрана опция за снимки с трофея, цената се начислява след изчисляването на отстъпките.
         Вход
         От конзолата се четат 3 реда:
         1.	Етап на първенството – текст - “Quarter final ”, “Semi final” или “Final”
         2.	Вид на билета – текст - “Standard”, “Premium” или “VIP”
         3.	Брой билети – цяло число в интервала [1 … 30]
         4.	Снимка с трофея – символ – 'Y' (да) или 'N' (не)
         Изход
         На конзолата се отпечатва 1 ред:
         •	"Цената, която трябва да се заплати, форматирана до втората цифра след десетичния знак"

         */


        double ticketsPrice = 0, allPrice = 0, discount = 0;

        String stageOfTournament = scan.nextLine();
        String typeOfTicket = scan.nextLine();

        int countOfTickets = Integer.parseInt(scan.nextLine());
        String isPicture = scan.nextLine();

        if (typeOfTicket.equals("Standard")) {
            if (stageOfTournament.equals("Quarter final")) {
                ticketsPrice += 55.50;
            } else if (stageOfTournament.equals("Semi final")) {
                ticketsPrice += 75.88;
            } else {
                ticketsPrice += 110.10;
            }
        }
        if (typeOfTicket.equals("Premium")) {
            if (stageOfTournament.equals("Quarter final")) {
                ticketsPrice += 105.20;
            } else if (stageOfTournament.equals("Semi final")) {
                ticketsPrice += 125.22;
            } else {
                ticketsPrice += 160.66;
            }
        }
        if (typeOfTicket.equals("VIP")) {
            if (stageOfTournament.equals("Quarter final")) {
                ticketsPrice += 118.90;
            } else if (stageOfTournament.equals("Semi final")) {
                ticketsPrice += 300.40;
            } else {
                ticketsPrice += 400.00;
            }
        }

        allPrice = ticketsPrice * countOfTickets;

        if (allPrice > 4000 && isPicture.equals("Y")) {
            discount = allPrice * 0.25;
            allPrice -= discount;

        } else if (allPrice > 2500 && isPicture.equals("Y")) {
            discount = allPrice * 0.10;
            allPrice = allPrice - discount + countOfTickets * 40;
        }
        System.out.printf("%.2f ", allPrice);
    }
}


/*

Final
Premium
25
Y

----------
3012.38
----------

Semi final
VIP
9
Y

----------
2793.24
----------

Quarter final
Standard
11
N

-----------
610.50

*/