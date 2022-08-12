package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class EasterTrip extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        double allPay = 0;

        int countNight = Integer.parseInt(scan.nextLine()), price = 1;

        String destination = scan.nextLine();
        String date = scan.nextLine();

        if (date.equals("21-23")) {
            if (destination.equals("France")) {
                price *= 30;
            } else if (destination.equals("Italy")) {
                price *= 28;
            } else {
                price *= 32;
            }
        }
        if (date.equals("24-27")) {
            if (destination.equals("France")) {
                price *= 35;
            } else if (destination.equals("Italy")) {
                price *= 32;
            } else {
                price *= 37;
            }
        }
        if (date.equals("28-31")) {
            if (destination.equals("France")) {
                price *= 40;
            } else if (destination.equals("Italy")) {
                price *= 39;
            } else {
                price *= 43;
            }
        }
        allPay += price * countNight;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, allPay);

    }
}
