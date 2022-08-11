package aSoftUni;
import training.Methods;

public class OddOrEvensDigits extends Methods {

    public static String negativeToPositiveAddingNumber(String number) {

        int intN = Math.abs(Integer.parseInt(number));
        number = String.valueOf(intN);
        return number;
    }

    public static void sumOfEvenOrOddDigits(String number) {
        long intNumber = 0, evenSum = 0, oddSum = 0;

        number = negativeToPositiveAddingNumber(number);

        for (int i = 0; i < number.length(); i++) {

            char charNumber = number.charAt(i);
            String stringNumber = String.valueOf(charNumber);
            intNumber = Integer.parseInt(stringNumber);

            if (i % 2 == 0) {
                evenSum += intNumber;
            } else {
                oddSum += intNumber;
            }
        }
        System.out.printf("Number = %s %n", number);
        System.out.printf("Even digits sum = %d %n", evenSum);
        System.out.printf("Odd digits sum = %d %n", oddSum);
        System.out.printf("Multiply = %d ", evenSum * oddSum);
    }

    public static void main(String[] args) {
        timeAndData();
        sumOfEvenOrOddDigits("-12345");
    }
}
