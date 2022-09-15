package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class OutfitOldSwitch extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        String outfit = "", shoes = "";

        String dayTime = scan.nextLine();
        int degree = Integer.parseInt(scan.nextLine());

        switch (dayTime) {
            case "Morning":
                if (degree >= 10 && degree <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (degree >= 18 && degree <= 24){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if(degree >= 25 ) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (degree >= 10 && degree <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degree >= 18 && degree <= 24){
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if(degree >= 25 ) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (degree >= 10 && degree <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degree >= 18 && degree <= 24){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if(degree >= 25 ) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
        }

        System.out.printf("It's %d degrees, get your %s and %s. %n", degree, outfit, shoes);

    }
}

/**
28
Evening
 */