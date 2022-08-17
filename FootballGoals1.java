package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class FootballGoals1 extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         Пепи иска да напишете програма, чрез която да разбере кой е най-добрият играч
         от световното първенство. Информацията, която получавате ще бъде
         играч и колко гола е отбелязал. От вас се иска да отпечатате кой е
         играчът с най-много голове и дали е направил хет-трик.
         Хет-трик е, когато футболистът е вкарал 3 или повече гола.
         Ако футболистът е вкарал 10 или повече гола, програмата трябва да спре.

         Вход:
         От конзолата се четат по два реда до въвеждане на команда "END":
         •	Име на играч – текст
         •	Брой вкарани голове  – цяло положително число в интервала [1 … 10000]

         Изход:
         На конзолата да се отпечатат 2 реда :
         •	На първия ред:
         "{име на играч} is the best player!"
         •	На втория ред :
         o	 Ако най-добрият футболист е направил хеттрик:
         "He has scored {брой голове} goals and made a hat-trick !!!"
         o	Ако най-добрият футболист не е направил хеттрик:
         "He has scored {брой голове} goals."

         */


        // TODO: Виж кода в -> FootballGoals.

        String nameOfPlayer = "", bestPlayerName = "";
        boolean isHatTrick = false, isTheBestPlayer = false;
        int maxGoals = Integer.MIN_VALUE, countGoalsOfPlayer = 0;


        String command = scan.nextLine();
        while (!command.equals("END")) {

            nameOfPlayer = command;
            countGoalsOfPlayer = Integer.parseInt(scan.nextLine());

            if (countGoalsOfPlayer >= 10){
                isTheBestPlayer = true;             // TODO: Може малко да се дообмисли. Ако maxGoals = 20?
                isHatTrick = true;
                break;

            } else if (countGoalsOfPlayer >= 3) {
                isHatTrick = true;
            }

            if (countGoalsOfPlayer > maxGoals) {
                maxGoals = countGoalsOfPlayer;
                bestPlayerName = nameOfPlayer;
                isTheBestPlayer = true;
            }

            command = scan.nextLine();
        }

        // TODO: Печатането на резултата трябва да е извън тялото на  "while".
        //  В противен случай ще се печата всичко без значение на критериите в условието.

        if (isTheBestPlayer) {
            System.out.printf("%s is the best player! %n", bestPlayerName);
        }

        if (isHatTrick){
            System.out.printf("He has scored %d goals and made a hat-trick !!! %n", countGoalsOfPlayer);
        } else {
            System.out.printf("He has scored %d goals. %n", countGoalsOfPlayer);
        }
    }
}

/*

Neymar
2
Ronaldo
1
Messi
3
END

-----
Messi is the best player!
He has scored 3 goals and made a hat-trick !!!
-----

Petrov
2
Drogba
11
-----

Drogba is the best player!
He has scored 11 goals and made a hat-trick !!!

*/
