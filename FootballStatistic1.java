package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class FootballStatistic1 extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        // TODO: https://softuni.bg/trainings/resources/video/62834/video-17-
        //  july-2021-desislava-topuzakova-programming-basics-with-java-june-2021/3439

        /**
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

        double points = 0.00;
        boolean isWin = false;
        int winCount = 0, remiCount = 0, loseCount = 0, allWinCount = 0;

        String teamName = scan.nextLine();
        int numberOfGames = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numberOfGames; i++) {
            String result = scan.nextLine();

            switch (result) {
                case "W" -> {
                    isWin = true;
                    winCount++;
                    points += 3;
                }
                case "D" -> {
                    points += 1;
                    remiCount++;
                }
                case "L" -> {
                    isWin = false;
                    points += 0;
                    loseCount++;
                }
            }
        }
        if (numberOfGames == 0) {
            System.out.printf("%s hasn't played any games during this season. %n", teamName);
        } else {
            System.out.printf("%s has won %.0f points during this season. %n", teamName, points);
            System.out.printf("Total stats: %n");
            System.out.printf("## W: %d %n", winCount);
            System.out.printf("## D: %d %n", remiCount);
            System.out.printf("## L: %d %n", loseCount);
            System.out.printf("Win rate: %.2f%% %n", ((double) (winCount * 100.00 / numberOfGames)));

            // TODO: System.out.printf("Win rate: %.2f%% %n", ((double) (winCount * 100.00 / countGames))); =  42,86%
            // TODO: System.out.printf("Win rate: %.2f%% %n", ((double) (winCount * 100 / countGames))); = 42.00%
        }


    }
}


// 10 = 100%
// a = x