package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class ASCII extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /**
         От конзолата се подават последователно три двойки от символ и цяло число
         и трябва да се изведе на конзолата комбинацията от символи,
         които са се образували след като сме събрали съответно числото и ASCII кода на придружаващия го символ.
         Има обаче и два частни случая, в които може да приключи играта:
         •	Ако получите крайна комбинация от три поредни седмици (“777”) печелите големия джакпот и играта приключва
         •	Ако получите крайна комбинация от три поредни маймунски а-та (“@@@”), означава че автоматично губите играта

         Подборът на символи от ASCII таблицата ще бъде от 32-ри до 126-ти символ включително.

         От следния линк можете да видите всички нужни за задачата символи: ASCII Table

         Вход
         От конзолата се четат шест реда:
         •	символ n – първият начален символ от 32-ри до 126-ти символ от ASCII таблицата  включително
         •	число n1 – броят на промените по ASCII кода на n – цяло число в диапазона [1… 93]
         •	символ m – вторият начален символ от 32-ри до 126-ти символ от ASCII таблицата  включително
         •	число m1 – броят на промените по ASCII кода на m – цяло число в диапазона [1… 93]
         •	символ k – третият начален символ от 32-ри до 126-ти символ от ASCII таблицата  включително
         •	число k1 – броят на промените по ASCII кода на k – цяло число в диапазона [1… 93]

         */

        char charOne = scan.nextLine().charAt(0);
        int numberOne = Integer.parseInt(scan.nextLine());

        char charTwo = scan.nextLine().charAt(0);
        int numberTwo = Integer.parseInt(scan.nextLine());

        char charThird = scan.nextLine().charAt(0);
        int numberThird = Integer.parseInt(scan.nextLine());

        int resultOne = (int) (charOne) + numberOne;
        int resultTwo = (int) (charTwo) + numberTwo;
        int resultThird = (int) (charThird) + numberThird;

        char resultOne1 = (char) (charOne + numberOne);
        char resultTwo1 = (char) (charTwo + numberTwo);
        char resultThird1 = (char) (charThird + numberThird);

        String result = " " + (char) (resultOne) + (char) (resultTwo) + (char) (resultThird);
        System.out.println(result);

        if (result.equals("777")){
            System.out.println("*** JACKPOT ***");
        } else if(result.equals("@@@")){
            System.out.println("Game Over");
        }


    }
}

/**
 /
 a
 2
 a
 3
 a
 4

 */