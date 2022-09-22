package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class ChristmasDecorationNew extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*

    ->   https://softuni.bg/trainings/resources/video/44880/
         video-23-november-2019-martin-paunov-programming-basics-with-java-october-2019/2506  <-

    ->   https://softuni.bg/trainings/resources/video/41543/
         video-04-july-2019-simona-simeonova-programming-basics-with-java-may-2019/2370       <-

         Семейство Иванови решават да подменят коледната украса в своя дом и да поръчат нова по интернет.
         Вашата задача е да напишете програма, която изчислява, дали бюджетът ще им стигне за украсата.

        ->  Цената на всеки предмет ще представялва сумата от ASCII кодовете на всеки символ от думата.

         Вход
         Първия ред от входа представлява:
         •	Бюджетът за украсата - цяло число в интервала [1 … 50000]
         След това се четат поредица от редове до получаване на команда "Stop":
         •	Име на предмет - текст
         Изход
         При успешна покупка (т.е ако цената на предмета е по-малка или равна на наличните пари), на конзолата да се отпечата:
         •	"Item successfully purchased!"
         При неуспешна покупка (т.е ако цената е по-голяма от останалите пари), да се отпечата:
         •	"Not enough money!" и програмата да приключи
         При получаване на команда "Stop", на конзолата да се отпечата:
         •	"Money left: {останалият бюджет}" и програмата да приключи

         */


        double freeMoney = 0;
        int sum = 0, sumASCII = 0, codeASCII = 0;

        double budjet = Double.parseDouble(scan.nextLine());

        String command = scan.nextLine();
        while (!command.equals("Stop")) {
            String word = command;

            sumASCII = 0;                                   // Нулира сумата.    <- Важно Е Брат.
            for (int charPos = 0; charPos < word.length(); charPos++) {
                char toChar = word.charAt(charPos);

                codeASCII = (int)toChar;                   // int = char -> Взима ASCII кода на chara.

                System.out.println();
                System.out.print(toChar + " is = " + codeASCII);
                System.out.println();

                sumASCII += codeASCII;                     // -> сумира ASCII кодовете на всеки символ от думата.

                System.out.println("Sum is: " + sumASCII);
            }
            if (sumASCII <= budjet) {
                freeMoney = budjet - sumASCII;
                System.out.printf("Item successfully purchased! %n");
            } else {
                System.out.printf("Not enough money! %n");
                break;

            }
            command = scan.nextLine();
        }
        if (command.equals("Stop")){
            System.out.println();
            System.out.printf("Money left: %.2f", freeMoney);
        }
    }
}

/*

3000
star
Christmas tree
tinsel
Tree stand

5000
Christmas lights
wreath
Stop

 */