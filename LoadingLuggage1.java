package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class LoadingLuggage1 extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        double planeCapacity = Double.parseDouble(scan.nextLine());
        double suitcaseVolume, freeCapacity = 0, suitcaseCount = 0, numberOfLoadedSuitcase = 0;

        String command = scan.nextLine();
        while (!(command.equals("End")) || freeCapacity <= 0) {
            suitcaseVolume = Double.parseDouble(command);
            if (suitcaseCount % 3 == 0) {
                suitcaseVolume += suitcaseVolume * 0.1;
            }

            freeCapacity = planeCapacity - (suitcaseCount * suitcaseVolume);

            if (freeCapacity <= 0) {
                System.out.print("No more space!");
                break;
            } else {
                numberOfLoadedSuitcase++;
            }
            command = scan.nextLine();

            if (command.equals("End")) {
                System.out.print("Congratulations! All suitcases are loaded!");
            }
        }

        System.out.printf("Statistic: %.0f suitcases loaded.", numberOfLoadedSuitcase);
    }
}
