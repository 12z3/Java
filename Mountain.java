package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class Mountain extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        double mousala = 0, monblan = 0, kilimandjaro = 0,
                k2 = 0, everest = 0, allPeople = 0;


        int groupCount = Integer.parseInt(scan.nextLine());             // Броя на Групите.

        // За ВСЯКА ЕДНА група чете броя на хората в групата:
        for (int i = 1; i <= groupCount; i++) {
            int peopleOfGroup = Integer.parseInt(scan.nextLine());

            if (peopleOfGroup <= 5) {                                   // • Група до 5 човека .
                mousala += peopleOfGroup;
            }
            if (peopleOfGroup >= 6 && peopleOfGroup <= 12) {            // • Група ОТ 6 ДО 12.
                monblan += peopleOfGroup;
            }
            if (peopleOfGroup >= 13 && peopleOfGroup <= 25) {
                kilimandjaro += peopleOfGroup;
            }
            if (peopleOfGroup >= 26 && peopleOfGroup <= 40) {           // • Група ОТ 41 или повече.
                k2 += peopleOfGroup;
            }
            if (peopleOfGroup >= 41) {
                everest += peopleOfGroup;
            }
            allPeople += peopleOfGroup;
        }

        System.out.printf("%.2f%% %n", mousala / allPeople * 100);
        System.out.printf("%.2f%% %n", monblan / allPeople * 100);
        System.out.printf("%.2f%% %n", kilimandjaro / allPeople * 100);
        System.out.printf("%.2f%% %n", k2 / allPeople * 100);
        System.out.printf("%.2f%% %n", everest / allPeople * 100);

    }
}
