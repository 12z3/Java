package aSoftUni;

import training.Methods;

import java.util.Scanner;

class FootbalSouvenir extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();
        volumeOfWell(0.40);

        /**
    ->   https://softuni.bg/trainings/resources/video/
         39592/video-16-april-2019-konstantin-mitev-programming-basics-with-java-march-2019/2299  <-
         */

        String country = scan.nextLine();
        String souvenir = scan.nextLine();
        int countSouvenir = Integer.parseInt(scan.nextLine());

        double price = 0, allprice = 1;
        boolean isCountryInvalid = false;
        boolean isSouvenirInvalid = false;

        switch (country) {
            case "Argentina":
                switch (souvenir) {
                    case "flags":
                        price += 3.25;
                        break;
                    case "caps":
                        price += 7.20;
                        break;
                    case "posters":
                        price += 5.10;
                        break;
                    case "stickers":
                        price += 1.25;
                        break;
                    default:
                        isSouvenirInvalid = true;
                        break;
                }
            case "Brazil":
                switch (souvenir) {
                    case "flags":
                        price += 4.20;
                        break;
                    case "caps":
                        price += 8.50;
                        break;
                    case "posters":
                        price += 5.35;
                        break;
                    case "stickers":
                        price += 1.20;
                        break;
                    default:
                        isSouvenirInvalid = true;
                        break;
                }
            case "Croatia":
                switch (souvenir) {
                    case "flags":
                        price += 2.75;
                        break;
                    case "caps":
                        price += 6.90;
                        break;
                    case "posters":
                        price += 4.95;
                        break;
                    case "stickers":
                        price += 1.10;
                        break;
                    default:
                        isSouvenirInvalid = true;
                        break;
                }

            case "Denmark":
                switch (souvenir) {
                    case "flags":
                        price += 3.10;
                        break;
                    case "caps":
                        price += 6.50;
                        break;
                    case "posters":
                        price += 4.80;
                        break;
                    case "stickers":
                        price += 0.90;
                        break;
                    default:
                        isSouvenirInvalid = true;       // <- !
                        break;
                }
            default:
                isCountryInvalid = true;
                break;                                   // <- !
        }

        allprice = price * countSouvenir;


        if (isCountryInvalid){
            System.out.print("Invalid Country!");
        } else if (isSouvenirInvalid){
            System.out.print("Invalid stock!");
        } else {
            System.out.printf("Pepi both %d %s of %s for %.2f lv %n", countSouvenir, souvenir, country, allprice);
        }


//        if (country.equals("Argentina") || country.equals("Brazil")             // <- !
//                || country.equals("Croatia") || country.equals("Denmark")) {
//            if (souvenir.equals("flags") || souvenir.equals("caps")             // <- !
//                    || souvenir.equals("posters") || souvenir.equals("stickers")) {
//                System.out.printf("Pepi both %d %s of %s for %.2f lv %n", countSouvenir, souvenir, country, allprice);
//            } else {
//                System.out.print("Invalid stock!");
//            }
//        } else {
//            System.out.print("Invalid Country!");
//        }
    }
}

/**
Brazil
Flags
12

USA
Flags
12
 */