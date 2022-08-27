package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class FootballStatistic extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         Задачата ви е да напишете програма, която приема името на отбор и прави статистика за него.
         През един сезон всеки отбор изиграва определен брой футболни срещи,
         като за всяка среща на отбора се дават точки в зависимост от изхода от срещата.
         Има три възможни изхода от една среща:
         	W - Отборът е победител и получава 3 точки
         	D - Срещата е завършила без победител и отборът получава 1 точка
         	L - Отборът е загубил срещата и не получава точки
         Напишете програма, която приема името на футболен отбор и извежда неговата статистика,
         на база на изиграните срещи през този сезон.
         Неговата статистика трябва да включва общия брой спечелени точки през настоящия сезон,
         подробна статистика за изхода на изиграните игри и процент победи през сезона.
         Ако отборът по някаква причина не е играл мачове през настоящия сезон се извежда специално съобщение.
         Вход
         От конзолата се четат два реда:
         •	Името на футболния отбор, за който водим статистика - текст
         •	Броя изиграни срещи през настоящия сезон - цяло число в интервала [0… 100]
         За всяка изиграна среща се прочита отделен ред:
         o	Резултатът от изиграната среща в един от горепосочените формати – символ с възможности 'W', 'D' и 'L'
         Изход
         В зависимост от това дали отборът е играл мачове през настоящия сезон се извеждат два вида изход.
         •	Ако отборът не е изиграл нито един мач през настоящия сезон се извежда точно един ред в следния формат:
         o	"{името на отбора} hasn't played any games during this season."
         •	Ако отборът е изиграл един мач или повече се извеждат шест реда в следния формат:
         o	"{името на отбора} has won {брой спечелени точки} points during this season"
         o	"Total stats:"
         o	"## W: {брой спечелени игри}"
         o	"## D: {брой игри, завършили наравно}"
         o	"## L: {брой загубени игри}"
         o	"Win rate: {процент спечелени игри}%"
         Процентът спечелени игри трябва да бъде форматиран до втората цифра след десетичния знак.

         */

        int points = 0, countW = 0, countD = 0, countL = 0;

        String teamName = scan.nextLine();
        int gameCount = Integer.parseInt(scan.nextLine());

        if (gameCount <= 0) {
            System.out.printf("%s hasn't played any games during this season.%n", teamName);
        } else {
            for (int games = 0; games < gameCount; games++) {
                // Не нулирам "points" за всяка среща. Натрупват се.
                char result = scan.nextLine().charAt(0);
                switch (result) {
                    case 'W' -> {
                        points += 3;
                        countW++;
                    }
                    case 'D' -> {
                        points += 1;
                        countD++;
                    }
                    case 'L' -> {
                        points += 0;
                        countL++;
                    }
                }
            }

            System.out.printf("%s has won %d points during this season. %n", teamName, points);
            System.out.printf("%s %n", "Total stats:");
            System.out.printf("## W: %d %n", countW);
            System.out.printf("## D: %d %n", countD);
            System.out.printf("## L: %d %n", countL);
            System.out.printf("Win rate: %.2f%% %n", ((countW * 1.0) / gameCount) * 100);
        }
    }
}

/*

Barcelona
7
W
D
L
L
W
W
D

-----
Barcelona has won 11 points during this season.
Total stats:
## W: 3
## D: 2
## L: 2
Win rate: 42.86%

*/
