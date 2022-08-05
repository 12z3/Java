package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class FilmRating extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        double avgRating = 0, sumOfRatings = 0;
        String maxRatingFilmName = "";
        String minRatingFilmName = "";
        double maxRating = Double.MIN_VALUE, minRating = Double.MAX_VALUE;

        /*
         Линк към Judge: https://judge.softuni.bg/Contests/Practice/Index/1596#4
         Деси много обича да гледа филми, но често й е трудно да си избере подходящ за гледане.
         Набелязва си определен брой филми и иска да си избере кой филм да гледа спрямо рейтинга на филмите.
         Напишете програма, която показва кой филм е с най-висок рейтинг,
         кой е с най-нисък и колко е средният рейтинг от всички филми, които си е набелязала да гледа.

         Вход
         От конзолата първо се чете един ред:
         •	Брой филми, които си е набелязала Деси – цяло число в интервала [1…20]
         За всеки филм се прочитат два отделни реда:
         •	Име на филма – текст
         •	Рейтинг на филма - реално число в интервала [1.00…10.00]

         Изход
         Отпечатват се три реда в следния формат:
         •	"{име на филма с най-висок рейтинг} is with highest rating: {рейтинг на филма}"
         •	"{име на филма с най-нисък рейтинг} is with lowest rating: {рейтинг на филма}"
         •	"Average rating: {средният рейтинг на всички филми}"
         Максималният, минималният и средният рейтинг да се форматира до първата цифра след десетичния знак.
         */


        int countOfFilms = Integer.parseInt(scan.nextLine());

        for (int films = 0; films < countOfFilms; films++) {

            String nameOfFilm = scan.nextLine();
            double rating = Double.parseDouble(scan.nextLine());

            if (rating > maxRating) {
                maxRating = rating;
                maxRatingFilmName = nameOfFilm;
            } else if (rating < minRating) {
                minRating = rating;
                minRatingFilmName = nameOfFilm;
            }

            sumOfRatings += rating;
        }

        System.out.printf("%s is with highest rating: %.1f %n", maxRatingFilmName, maxRating);
        System.out.printf("%s is with lowest rating: %.1f %n", minRatingFilmName, minRating);
        System.out.printf("Average rating: %.1f %n", sumOfRatings / countOfFilms);


    }
}

/*
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

---------------------------------------------
A Star is Born is with highest rating: 7.8
Captain Marvel is with lowest rating: 7.1
Average rating: 7.3
---------------------------------------------
3
Interstellar
8.5
Dangal
8.3
Green Book
8.2
---------------------------------------------
Interstellar is with highest rating: 8.5
Green Book is with lowest rating: 8.2
Average rating: 8.3
---------------------------------------------


*/