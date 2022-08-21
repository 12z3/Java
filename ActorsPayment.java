package aSoftUni;

import java.util.Scanner;

public class ActorsPayment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double budjeet = Double.parseDouble(scan.nextLine());
        double actorPayment = 0;

        String command = scan.nextLine();
        while (!(command.equals("ACTION"))) {
            String actorName = command;

            if (actorName.length() > 15) {
                actorPayment = budjeet * 0.2;
            } else {
                actorPayment = Double.parseDouble(scan.nextLine());
            }

            budjeet -= actorPayment;
            if (budjeet == 0) {
                break;
            }

            command = scan.nextLine();
        }
        if (budjeet == 0) {
            System.out.printf("We need %.2f leva for our actors.%n", budjeet);

        } else if (budjeet > 0) {
            System.out.printf("We are left with %.2f leva. %n", budjeet);
        }

        /**
Test:
170000
Ben Affleck
40000.50
Zahari Baharov
80000
Tom Hanks
2000.99
ACTION
         */

    }
}
