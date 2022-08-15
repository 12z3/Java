package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class Traveling extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
          Ани обича да пътува и иска тази година да посети няколко различни дестинации.
          Като си избере дестинация, ще прецени колко пари ще й трябват,
          за да отиде до там и ще започне да спестява. Когато е спестила достатъчно, ще може да пътува.
          От конзолата всеки път ще се четат първо дестинацията и минималния бюджет, който ще е нужен за пътуването.
          След това ще се четат няколко суми,
          които Ани спестява като работи и когато успее да събере достатъчно за пътуването,
          ще заминава, като на конзолата трябва да се изпише:
          "Going to {дестинацията}!"
          Когато е посетила всички дестинации, които иска,
          вместо дестинация ще въведе "End и програмата ще приключи.
         */


        double minBudjet;
        double savedMoney = 0;
        StringBuilder allDestination = new StringBuilder(" ");

        String destination = scan.nextLine();
        while (!(destination.equals("End"))) {                           // Докато това не е изпълнено:
            minBudjet = Double.parseDouble(scan.nextLine());             // Чете бюджета
            savedMoney = 0;                                              // Нулира сумата

            while (savedMoney < minBudjet) {
                savedMoney += Double.parseDouble(scan.nextLine());
            }

            System.out.printf("Going to %s %n", destination);
            System.out.print("Take new destination: ");

            allDestination.append(" ").append(destination);
            destination = scan.nextLine();                                // Чете Дестинацията

        }
        System.out.printf("All destination is: %s%n", allDestination.toString());

        /*
Greece
1000
900
200
300
100
150
240
Spain
1200
300
500
193
423
End

------------------------

France
2000
300
300
200
400
190
258
360
Portugal
1450
400
400
200
300
300
Egypt
1900
1000
280
300
500
End

         */


    }
}
