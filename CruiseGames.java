package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class CruiseGames extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         Възможните игри били волейбол, тенис и бадминтон, като в зависимост от трудността
         на играта получените точки се увеличавали както следва: волейболът увеличавал точките със
         тенисът с, а бадминтонът с 2%. Играчът печели ако, в противен случай губи.
         Напишете програма, която
         7%,   5% средноаритметичният брой точки от всеки един вид игра е поне 75
         пресмята дали играчът е победил или загубил и изчислява общият му брой ЗАБЕЛЕЖКА:
         При пресмятане на средноаритметичните точки и общият брой точки да се закръгли към по-
         точки.
         малкото цяло число.

         Вход
         От конзолата първоначално се прочитат два реда:
         • Име на играч – текст
         • Брой изиграни игри – цяло число в интервала [1...10] За всяка една игра се четат по два реда:
         • Име на играта – текст с възможности "volleyball", "tennis", "badminton"
         • Брой точки – цяло число в интервала [1...100]

         Изход
         На конзолата да се отпечата един ред:
         • Ако играчът е спечелил:
         o "Congratulations,{именаиграча}!Youwonthecruisegameswith{общиятброй точки} points."
         • Ако играчът е загубил:
         o "Sorry, {име на играча}, you lost. Your points are only {общият брой точки}
         */

        // TODO: "+=" Старата стойност се сумира с новата. Работи с НАТРУПВАНЕ.
        // TODO: "=" Презаписва новата стойност върху старата. Стара се губи.

        // TODO: ред 54: На всяка итерация се четат нови стойности за "gameName" и "gamePoint".
        // TODO: ред 61: Всеки път когато се влезе в "volleyball", Стойносттта на "volleyballPoints" ще се ъпдейтва
        // TODO: (натрупва) с новата стойност на "gamePoint". Респективно "allVolleyballPoints" с "volleyballPoints".

        int volleyballCount = 0, tennisCount = 0, badmintonCount = 0;
        double volleyballPoints = 0, tennisPoints = 0,
                badmintonPoints = 0, allPoints = 0, avgVolleyballPoints = 0,
                avgBadmintonPoints = 0, avgTennisPoints = 0, allVolleyballPoints = 0,
                allTennisPoints = 0, allBadmintonPoints = 0;



        String playerName = scan.nextLine();
        int countFinishGames = Integer.parseInt(scan.nextLine());

        for (int games = 1; games <= countFinishGames; games++) {

            // TODO: "gamePoint = 0 " не е необходимо в началото на всяка следваща итерация,
            //  защото то така или иначе си променя стойността по условие.

            String gameName = scan.nextLine();
            double gamePoint = Double.parseDouble(scan.nextLine());

            switch (gameName) {
                case "volleyball" -> {
                    volleyballCount++;
                    volleyballPoints = gamePoint + (gamePoint * 0.07);
                    allVolleyballPoints += volleyballPoints;
                    avgVolleyballPoints = Math.floor(allVolleyballPoints / volleyballCount);
                }
                case "tennis" -> {
                    tennisCount++;
                    tennisPoints = gamePoint + (gamePoint * 0.05);
                    allTennisPoints += tennisPoints;
                    avgTennisPoints = Math.floor(allTennisPoints / tennisCount);
                }
                case "badminton" -> {
                    badmintonCount++;
                    badmintonPoints = gamePoint + (gamePoint * 0.02);
                    allBadmintonPoints += badmintonPoints;
                    avgBadmintonPoints = Math.floor(allBadmintonPoints / badmintonCount);
                }
            }
        }

        allPoints = Math.floor(allVolleyballPoints + allTennisPoints + allBadmintonPoints);

        if (avgVolleyballPoints > 75 && avgTennisPoints > 75 && avgBadmintonPoints > 75) {
            System.out.printf("Congratulations, %s! You won the cruise games with %d points. %n",
                    playerName, (int) allPoints);
        } else {
            System.out.printf("Sorry, %s, you lost. Your points are only %d. %n",
                    playerName, (int) allPoints);
        }
    }
}

/*

Ivan
7
volleyball
70
tennis
100
badminton
64
volleyball
125
tennis
62
tennis
72
badminton
87

---------

Congratulations, Ivan! You won
the cruise games with 608
points.

---------------

Ivan
2
volleyball
70
volleyball
70

*/