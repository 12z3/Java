package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class TimeExam extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        int examHour = Integer.parseInt(scan.nextLine());
        int examMinutes = Integer.parseInt(scan.nextLine());
        int arrivalHour = Integer.parseInt(scan.nextLine());
        int arrivalMinutes = Integer.parseInt(scan.nextLine());

        int allTimeExamMin = (examHour * 60) + examMinutes;
        int allTimeArrivalMin = (arrivalHour * 60) + arrivalMinutes;

        int timeDifferenceMin = allTimeExamMin - allTimeArrivalMin;

        /*
         * "mm minutes before the start" за идване по-рано с по-малко от час.

         • "hh:mm hours before the start" за подраняване с 1 час или повече.
            Минутите винаги печатайте с 2 цифри, например "1:05".
         •  mm minutes after the start" за закъснение под час.
         • "hh:mm hours after the start" за закъснение от 1 час или повече. Минутите винаги печатайте с 2 цифри, например "1:03".
         */


        int hourDifference = (examHour - arrivalHour);
        int minuteDifference = examMinutes - arrivalMinutes;


        if (hourDifference >= 1) {
            System.out.printf("%d:%02d hours before the start %n", hourDifference, Math.abs(minuteDifference));
        }else {
            System.out.printf("%d:%02d hours after the start %n", Math.abs(hourDifference), Math.abs(minuteDifference));
        }


    }
}
