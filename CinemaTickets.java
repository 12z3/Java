package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class CinemaTickets extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        int freePlasec = 0, countPayTickets = 0, capacity = 0,
                countStudent = 0, countStandart = 0, countKid = 0;

        String command = scan.nextLine();
        while (!command.equals("Finish")) {
            String nameOfFilm = command;

             capacity = Integer.parseInt(scan.nextLine());

            String filmCommand = scan.nextLine();
            while (!filmCommand.equals("End")) {
                String typeOfTicket = filmCommand;

                switch (typeOfTicket) {
                    case "student" -> countStudent++;
                    case "standard" -> countStandart++;                  //    cps sa 100 %
                                                                         //    count sa x %
                    case "kid" -> countKid++;
                }

                countPayTickets = countKid + countStandart + countStudent;
                freePlasec = capacity - countPayTickets;
                if (freePlasec == 0 ){
                    break;
                }

                filmCommand = scan.nextLine();
            }
            System.out.printf("%s %d%% %n", nameOfFilm, (100 * countPayTickets) / capacity);

            command = scan.nextLine();
        }
        System.out.printf("Total tickets: %d %n", countPayTickets);
        System.out.printf("%d%% students tickets %n", countStudent * 100 / countPayTickets);
        System.out.printf("%d%% standard tickets %n", countStandart * 100 / countPayTickets);
        System.out.printf("%d%% kids tickets %n", countKid * 100 / countPayTickets);


    }
}


/*
Taxi
10
standard
kid
student
student
standard
standard
End
ScaryMovie
6
student
student
student
student
student
student
End
Finish

 */
