package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class GroupPhase extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /**
         ->   https://softuni.bg/trainings/resources/video/
         39592/video-16-april-2019-konstantin-mitev-programming-basics-with-java-march-2019/2299  <-
         */

        int points = 0, allScoredAGoal = 0,
                allUnScoredAGoal = 0, scoredAGoal = 0, unScoredAGoal = 0;


        String teamName = scan.nextLine();
        int playingMach = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < playingMach; i++) {
            scoredAGoal = Integer.parseInt(scan.nextLine());
            unScoredAGoal = Integer.parseInt(scan.nextLine());

            if (scoredAGoal > unScoredAGoal) {
                points += 3;
            } else if (scoredAGoal == unScoredAGoal) {
                points += 1;
            }
            allScoredAGoal += scoredAGoal;
            allUnScoredAGoal += unScoredAGoal;
        }


        if (allScoredAGoal >= allUnScoredAGoal) {
            System.out.printf
                    ("%s has finished the group phase with %d points %n",
                            teamName, points);
            System.out.printf("Goal difference: %d %n",
                    allScoredAGoal - allUnScoredAGoal);
        } else {
            System.out.printf("%s has been eliminated from the group phase %n",
                    teamName);
            System.out.printf("Goal difference: %d %n",
                    Math.abs(allScoredAGoal - allUnScoredAGoal));
        }
    }
}

/**
Brazil
3
4
2
0
0
1
1
 */
