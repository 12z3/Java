package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class FootballGoals extends Methods {
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

        int maxGoals = Integer.MIN_VALUE, goals = 0;
        String bestPlayerName = "", playerName = "";
        boolean isHaTrick = false;


        String command = scan.nextLine();
        while (!command.equals("END")) {
            playerName = command;
            goals = Integer.parseInt(scan.nextLine());   // TODO: <-..., а Не "Integer.parseInt(command) ;)"

            if (goals > maxGoals) {            // TODO: if(if)) - конструкция: Я виж -> FootballGoals1 ;)
                maxGoals = goals;              // Какво става ако goals = 4, maxGoals = 5?
                bestPlayerName = playerName;   // Няма да провери if (goals >= 3) на Ред: 50.
                                               // TODO: ТАКА ЧЕ if(if)) Не е Необходима. <- !

                if (goals >= 3) {             // Търси се дали футболиста с макс.голове е направил Хе-трик.
                    isHaTrick = true;         // А не дали от всички футболисти някой е направил Трика.
                }                             // За това конструкцията е if((if)).
            }

            if (goals >= 10) {
                command = "END";              // Командата е END. Следва "continue" в резултат на което се
        // TODO: "break" също върши работа    // пресакча следващият ред 59: "command = scan.nextLine();"
                continue;                     // и се връща на входа на while цикъла като "command = END".
            }                                 // TODO: "continue" -> е Много Важен ХОД ;)

            command = scan.nextLine();
        }

        System.out.printf("%s is the best player! %n", bestPlayerName);

        if (isHaTrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!! %n", goals);
        } else {
            System.out.printf("He has scored %d goals.%n", goals);
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
