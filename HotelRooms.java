package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class HotelRooms extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        double priceStudio = 0, priceApartment = 0;

        String mounth = scan.nextLine();
        int countNight = Integer.parseInt(scan.nextLine());

        switch (mounth) {
            case "May", "October" -> {
                priceApartment = 65.00;
                priceStudio = 50;

                if (countNight > 7 && countNight < 14) {
                    priceStudio -= priceStudio * 0.05;
                } else if (countNight > 14) {
                    priceStudio -= priceStudio * 0.30;
                }
            }
            case "June", "September " -> {
                priceApartment = 68.70;
                priceStudio = 75.20;

                if (countNight > 14) {
                    priceStudio -= priceStudio * 0.20;
                }
            }
            case "July", "August " -> {
                priceApartment = 77.00;
                priceStudio = 76.00;
            }
        }

        priceApartment = priceApartment * countNight;
        if (countNight > 14) {
            priceApartment -= priceApartment * 0.10;
        }
        priceStudio = priceStudio * countNight;

        System.out.printf("Apartment: %.2f lv. %n", priceApartment);
        System.out.printf("Studio: %.2f lv. %n", priceStudio);

    }
}

/**

June
14

-----------------------------
 Out: Apartment: 961,80 lv.
 Studio: 1052,80 lv.


*/