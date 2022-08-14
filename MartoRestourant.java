package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class MartoRestourant extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         Задача 4. Ергенско Парти
         Сватбата наближава и Марто ще организира ергенското парти на Иван в своя ресторант,
         като знаете, че Иван ще покани няколко групи свой познати.
         Марто има нужда от вашата помощ. Напишете програма, която пресмята колко гости ще събере ресторанта,
         какви ще са приходите му от ергенското парти, както и
         дали Марто ще може да си позволи да плати на гост изпълнител, като знаете че:
         •	Ако резервацията е за група с по-малко от 5 човека, куверта за един човек ще е 100 лв.
         •	Ако резервацията е за група с 5 или повече човека, куверта за един човек ще е 70 лв.
         Вход
         От конзолата се чете:
         •	Сумата предвидена за гост изпълнителя - цяло число в интервала [1… 4500]
         •	На всеки следващ ред (до получаване на команда "The restaurant is full") - броят на хората във всяка група.
         Изход
         Да се отпечата на конзолата един от следните редове:
         •	Ако Марто успее да си позволи гост изпълнител:
         "You have {брой гости} guests and {останалата сума} leva left."
         •	Ако Марто не успее да си позволи гост изпълнител:
         "You have {брой гости} guests and {приходи} leva income, but no singer."

   ->    https://softuni.bg/trainings/resources/video/44880/
         video-23-november-2019-martin-paunov-programming-basics-with-java-october-2019/2506  <-

         */

        double couvert = 1, allsum = 0;
        int allGost = 0;

        double priseStar = Double.parseDouble(scan.nextLine());
        String command = scan.nextLine();

        while (!(command.equals("The restaurant is full"))) {
            int countPeopleOfGroup = Integer.parseInt(command);

            if (countPeopleOfGroup >= 5) {
                couvert = 70.0;
                allsum += couvert * countPeopleOfGroup;
            } else {
                couvert = 100.0;
                allsum += couvert * countPeopleOfGroup;
            }
            allGost += countPeopleOfGroup;
            command = scan.nextLine();
        }
        if (allsum > priseStar) {
            System.out.printf("You have %d guests and %.2f leva left. %n", allGost, allsum - priseStar);
        } else {
            System.out.printf("You have %d guests and %.2f leva income, but no singer. %n", allGost, allsum);
        }
    }
}

/*
 * 3200
 * 5
 * 12
 * 6
 * 6
 * 12

 * The restaurant is full


 * 2800
 * 5
 * 5
 * 4
 * 6
 * 6
 * 12
 * 12

 * The restaurant is full
 */