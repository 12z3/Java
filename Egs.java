package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class Egs extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         -> https://softuni.bg/trainings/resources/video/56240/
         video-12-december-2020-kaloyan-kostadinov-programming-basics-with-java-november-2020/3071 <-
         */

        String collor = "";
        int countEges = Integer.parseInt(scan.nextLine()),
                redPoint = 0, orangePoint = 0, bluePoint = 0, greenPoint = 0, maxEgs = 0;
        int maxCount = Integer.MIN_VALUE;
        String maxColor = "";

        for (int i = 0; i < countEges; i++) {
          collor = scan.nextLine();

            switch (collor) {
                case "red" -> {
                    redPoint++;
                    if (redPoint > maxCount) {
                        maxCount = redPoint;
                        maxColor = "red";
                    }
                }
                case "orange" -> {
                    orangePoint++;
                    if (orangePoint > maxCount) {
                        maxCount = orangePoint;
                        maxColor = "orange";
                    }
                }
                case "blue" -> {
                    bluePoint++;
                    if (bluePoint > maxCount) {
                        maxCount = bluePoint;
                        maxColor = "blue";
                    }
                }
                case "green" -> {
                    greenPoint++;
                    if (bluePoint > maxCount) {
                        maxCount = bluePoint;
                        maxColor = "green";
                    }
                }
            }
        }
        maxEgs = Math.max(Math.max(Math.max(redPoint,bluePoint), greenPoint),orangePoint);
        System.out.printf("Red eggs: %d%n", redPoint);
        System.out.printf("Orange eggs: %d%n", orangePoint);
        System.out.printf("Blue eggs: %d%n", bluePoint);
        System.out.printf("Green eggs: %d%n", greenPoint);
        System.out.printf("Max eggs: %d -> %s", maxEgs, maxColor);

        /**
7
orange
blue
green
green
blue
red
green

         */




    }
}
