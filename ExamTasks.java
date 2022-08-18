package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class ExamTasks extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        double budget = Double.parseDouble(scan.nextLine()); // Размер на бюджета.
        double actorSalary = 0;

        // След това се четат МНОГОКРАТНО по един или два реда
        // до команда "ACTION" или до изчерпване на бюджета:

        String input = scan.nextLine(); // Чете ред от конзолата. <- ! 1 <-
        while (!input.equals("ACTION")) {
            String actorName = input; // Прочетеният "input" го присвоява на "actorName". <- ! ВАЖНО 2<-

            if (actorName.length() > 15) {
                actorSalary = budget * 0.2;
            } else {
                actorSalary = Double.parseDouble(scan.nextLine());
            }

            budget -= actorSalary;
            if (budget <= 0) {
                break;
            }

            input = scan.nextLine(); // Чете следващия актиор от входа.
        }

        if (budget > 0) {
            System.out.printf("We are left with %.2f leva. %n", budget);
        } else {
            System.out.printf("We need %.2f leva for our actors. %n", Math.abs(budget));
        }
    }
}
