package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class CinemaRating extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        int countOfFilms = Integer.parseInt(scan.nextLine());

        String nameOfFilm = "", nameOfMax = "", nameOfMin = "";
        double maxRejting = Double.MIN_VALUE;
        double minRejting = Double.MAX_VALUE;
        double sumOfRajtings = 0;

        for (int i = 0; i < countOfFilms; i++) {
            nameOfFilm = scan.nextLine();
            double rejting =
                    Double.parseDouble(scan.nextLine());

            sumOfRajtings += rejting;

            if (rejting > maxRejting) {
                maxRejting = rejting;
                nameOfMax = nameOfFilm;            // <-  nameOfMax.

            } else if (rejting < minRejting) {
                minRejting = rejting;
                nameOfMin = nameOfFilm;            // <-  nameOfMin.

            }
        }
        System.out.printf("%s is with highest rating: %.1f %n", nameOfMax, maxRejting);
        System.out.printf("%s is with lowest rating: %.1f %n", nameOfMin, minRejting);
        System.out.printf("Average rating: %.1f ", (sumOfRajtings / countOfFilms));
    }
}

/**
5
A Star is Born
7.8
Creed 2
7.3
Mary Poppins
7.2
Vice
7.2
Captain Marvel
7.1

 */
