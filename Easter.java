package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class Easter extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        int countOfCosunaks = Integer.parseInt(scan.nextLine());
        int ocenkaOfOnePeople = 0, maxOcenka = Integer.MIN_VALUE;
        String nameofCook = " ";

        for (int i = 0; i < countOfCosunaks; i++) {
            ocenkaOfOnePeople = 0;
             nameofCook = scan.nextLine();

            String command = scan.nextLine();
            while (!command.equals("Stop")) {

                ocenkaOfOnePeople += Integer.parseInt(command); // <- входа е "command". ВАЖНО Е!
                command = scan.nextLine();
            }
            System.out.println();
            System.out.printf("%s has %d points. %n", nameofCook, ocenkaOfOnePeople);

            if (ocenkaOfOnePeople > maxOcenka) {
                maxOcenka = ocenkaOfOnePeople;
                System.out.printf("%s is the new number 1!%n", nameofCook);
            }
        }
        System.out.printf("%s won competition with %d points!",nameofCook, maxOcenka);


    }
}
