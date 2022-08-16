package aSoftUni;

import training.Methods;
import java.util.Scanner;


public class MobileOperator extends Methods {

    private static double getTax(double tax, String isMobileInternet) {
        if (isMobileInternet.equalsIgnoreCase("yes")) {
            if (tax <= 10) {
                tax += 5.50;
            } else if (tax <= 30) {
                tax += 4.35;
            } else if (tax > 30) {
                tax += 3.85;
            }
        }
        return tax;
    }

    private static boolean termValidaton(String condition) {
        if (condition.equalsIgnoreCase("one") ||
                condition.equalsIgnoreCase("two")) {
            return true;
        }
        return false;
    }

    private static boolean mobileValidaton(String condition) {
        if (condition.equalsIgnoreCase("yes") ||
                condition.equalsIgnoreCase("no")) {
            return true;
        }
        return false;
    }

    private static boolean typeValidaton(String condition) {
        if (condition.equalsIgnoreCase("Small") ||
                !condition.equalsIgnoreCase("Middle") ||
                !condition.equalsIgnoreCase("Large")  ||
                !condition.equalsIgnoreCase("ExtraLarge")){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         Линк: https://judge.softuni.bg/Contests/Compete/Index/1654#2
         Мобилен оператор предлага договори с различна месечна такса
         в зависимост от срока - 1 или 2 години.
         Да се напише програма, която изчислява дължимата сума,
         която трябва да се плати за определен брой месеци.

         срок / тип	     Small	     Middle	     Large	   ExtraLarge
         1 година(one)	9.98 лв.	18.99 лв.	25.98 лв.	35.99 лв.
         2 години(two)	8.58 лв.	17.09 лв.	23.59 лв.	31.79 лв.

         Условия:
         •	при добавен мобилен интернет, към таксата за един месец се добавя:
         o	при такса по-малка или равна на 10.00 лв.  5.50 лв.
         o	при такса по-малка или равна на 30.00 лв.  4.35 лв.
         o	при такса по-голяма от 30.00 лв.  3.85 лв.
         •	ако договорът e за две години, общата сума се намалява с 3.75%

         Вход
         От конзолата се четат 3 реда:
         1.	Срок на договор – текст – "one", или "two"
         2.	Тип на договор – текст – "Small",  "Middle", "Large"или "ExtraLarge"
         3.	Добавен мобилен интернет – текст – "yes" или "no"
         4.	Брой месеци за плащане - цяло число в интервала [1 … 24]

         Изход
         На конзолата се отпечатва 1 ред:
         •	Цената, която заплаща клиентът,
         форматирана до втория знак след десетичната запетая, в следния формат:  "{цената} lv."

         */

        double price = 0.0, tax = 0.0;

        // TODO: Странно... Как работи вярно при условие, че метода validateWord()) НЕ ЗНАЕ ПРАВИЛНАТА ДУМА?

        String contractTerm = scan.nextLine();        // "one" или "two"
        if (!termValidaton(contractTerm)) return;

        String contractType = scan.nextLine();        // "Small",  "Middle", "Large" или "ExtraLarge"
        if (!typeValidaton(contractType)) return;

        String isMobileInternet = scan.nextLine();    // "yes" или "no"
        if (!mobileValidaton(isMobileInternet)) return;


        int numberOfMonth = Integer.parseInt(scan.nextLine());

        if (contractTerm.equalsIgnoreCase("one")) {
            switch (contractType) {
                case "Small" -> {
                    tax += 9.98;
                    tax = getTax(tax, isMobileInternet);
                }
                case "Middle" -> {
                    tax += 18.99;
                    tax = getTax(tax, isMobileInternet);
                }
                case "Large" -> {
                    tax += 25.98;
                    tax = getTax(tax, isMobileInternet);
                }
                case "ExtraLarge" -> {
                    tax += 35.99;
                    tax = getTax(tax, isMobileInternet);
                }
            }

            price = tax * numberOfMonth;
        }

        if (contractTerm.equalsIgnoreCase("two")) {
            switch (contractType) {
                case "Small" -> {
                    tax += 8.58;
                    tax = getTax(tax, isMobileInternet);
                }
                case "Middle" -> {
                    tax += 17.09;
                    tax = getTax(tax, isMobileInternet);
                }
                case "Large" -> {
                    tax += 23.59;
                    tax = getTax(tax, isMobileInternet);
                }
                case "ExtraLarge" -> {
                    tax += 31.79;
                    tax = getTax(tax, isMobileInternet);
                }
            }

            price = tax * numberOfMonth;
            price -= price * 0.0375;
        }

        System.out.printf("%.2f lv. %n", price);

    }


}

/*
one
Small
yes
10

------------
154.80 lv.
------------
two
Large
no
10

------------
227.05 lv.
------------
*/
