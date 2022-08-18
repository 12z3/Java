package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class LoadingLuggage2 extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        double ostavashtObem = 0;
        double broj = 0;

        double kapacitet = Double.parseDouble(scan.nextLine());
        String command = scan.nextLine();

        while (!(command.equals("End"))) {
            double obemNaKufar = Double.parseDouble(command);
            if (broj % 3 == 0) {
                obemNaKufar += obemNaKufar * 0.1;
            }
            ostavashtObem = kapacitet - (obemNaKufar * broj);
            if (ostavashtObem < 0) {
                System.out.printf("%s", "No more space!");
                System.out.printf("Statistic: %.0f suitcases loaded. ", broj);
                return;
            }
            broj++;
            command = scan.nextLine();
        }
        System.out.println("Congratulations! All suitcases are loaded!");
        System.out.printf("Statistic: %.0f suitcases loaded. ", broj);

    }
}
