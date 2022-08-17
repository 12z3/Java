package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class NumbersOddEven extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        double oddSum = 0, oddMin = Double.POSITIVE_INFINITY, oddMax = Double.NEGATIVE_INFINITY,
                evenSum = 0, evenMin = Double.POSITIVE_INFINITY, evenMax = Double.NEGATIVE_INFINITY;

        // Брой числа:
        int countOfNumbers = Integer.parseInt(scan.nextLine());
        int[] tempArray = new int[countOfNumbers];

        for (int i = 0; i < tempArray.length; i++) {
            int readingNumber = Integer.parseInt(scan.next());
            tempArray[i] = readingNumber;

            if (tempArray[i] % 2 == 0) {
                evenSum += tempArray[i];

                if (tempArray[i] < evenMin) {
                    evenMin = tempArray[i];
                } else {
                    evenMax = tempArray[i];
                }
            }

            if (!(tempArray[i] % 2 == 0)) {
                oddSum += tempArray[i];

                if (tempArray[i] < oddMin) {
                    oddMin = tempArray[readingNumber];
                } else {
                    oddMax = tempArray[i];
                }
            }
        }

        printIntArray(tempArray);
        System.out.printf("oddSum = %.2f; %n", oddSum);

        if (oddSum == 0) {
            System.out.print("oddMax = No; \n");
            System.out.print("oddMin = No; \n");
        } else {
            System.out.printf("oddMax = %.2f; %n", oddMax);
            System.out.printf("oddMin = %.2f; %n", oddMin);
        }

        System.out.printf("evenSum = %.2f; %n", evenSum);
        if (evenSum == 0) {
            System.out.print("evenMax = No; \n");
            System.out.print("evenMin = No; \n");
        } else {
            System.out.printf("evenMax = %.2f; %n", evenMax);
            System.out.printf("evenMin = %.2f; %n", evenMin);
        }


    }
}
