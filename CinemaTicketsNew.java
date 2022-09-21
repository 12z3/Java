package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class CinemaTicketsNew extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();


        int countOfStudent = 0, countOfStandard = 0, capacity = 0,
                countOfKid = 0, totalTickets = 0, countPeople = 0, allCapacity = 0,
                allCountOfStudent = 0, allCountOfStandard = 0, allCountOfKid = 0, allTotalTickets = 0;


        String command = scan.nextLine();
        while (!command.equals("Finish")) {

            String nameOfFilm = command;
            capacity = Integer.parseInt(scan.nextLine());

            /*
             Ако е при другите ред: 65, if-> прекратява програмката.
             totalTickets > allCapacity (1 > 0)
             */

            allCapacity += capacity;                                // <- !!!
            countOfStudent = countOfKid = countOfStandard = 0;      // <- !!!

            String typeCommand = scan.nextLine();
            while (!typeCommand.equals("End")) {

                String typeOfTickets = typeCommand;
                countPeople++;

                switch (typeOfTickets) {
                    case "student" -> countOfStudent++;
                    case "standard" -> countOfStandard++;
                    case "kid" -> countOfKid++;
                }

                totalTickets = (countOfStudent + countOfKid + countOfStandard);
                if (allCapacity < totalTickets) {
                    return;
                }
                typeCommand = scan.nextLine();   // <- Отива на следващият ред от входа и Чете командата.
            }

            System.out.printf("%s %d%% full %n", nameOfFilm, (totalTickets * 100) / capacity);

            /*
             Когато приключи вторият Филм и се прочете командата "Finish"
             тези стойности не се ъпдейтват в блок - кода.
             Прескачат се и резултатите са грешни. Виж -> "CinemaTickets".
             За това се намират тук. Ред: 69.
             След тялото на блок - кода и Преди да се прочете следващата команда.

             "allCountOfStudent, allCountOfStandard, allCountOfKid, allTotalTickets" <-
             пазят общият брой, а не конкретният. Той е необходим по условие.
             */

// !
            allCountOfStudent += countOfStudent;
            allCountOfStandard += countOfStandard;
            allCountOfKid += countOfKid;
            allTotalTickets += totalTickets;

            command = scan.nextLine(); // <- Отива на следващият ред от входа и Чете командата.
        }

        System.out.printf("Total tickets: %d %n", countPeople);
        System.out.printf("%.2f %% studets tickets %n", (double) (allCountOfStudent * 100) / allTotalTickets);
        System.out.printf("%.2f %% standard tickets %n", (double) (allCountOfStandard * 100) / allTotalTickets);
        System.out.printf("%.2f %% kids tickets %n", (double) (allCountOfKid * 100) / allTotalTickets);
        System.out.printf("all capacity: %d", allCapacity);
    }
}
