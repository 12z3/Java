package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class Cake extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        int cakeWidth = Integer.parseInt(scan.nextLine());
        int cakeHeigth = Integer.parseInt(scan.nextLine());
        int countPiecesInCake = cakeWidth * cakeHeigth;

        /*
         NumberFormatException: For input string: "STOP":
         Грешката се генерира когато усливието в while не е правилно = "||" вместо "&&".
         1. Получава се команда STOP влиза в тялото на while.
         2. Чете Integer.parseInt(command) и хвърля грешка.
         */

        String command = scan.nextLine();
        while (!command.equals("STOP") && countPiecesInCake >= 0) {
            int takenPieces = Integer.parseInt(command);  // <- Важно
            countPiecesInCake -= takenPieces;

            if (countPiecesInCake <= 0) {
                System.out.printf("No more cake left! You need %d pieces more. %n", Math.abs(countPiecesInCake));
                break;
            }

            command = scan.nextLine();  // <- Важно
        }

        /*
         Да се отпечата:
         - "{брой парчета} pieces are left." - ако стигнете до STOP ! и не се свършили парчетата торта

         -> Без if ще печата и двата soutf.
         */

        if (command.equals("STOP")) {
            System.out.printf("%d pieces are left. %n", countPiecesInCake);
        }
    }
}

/*
10
10
20
20
20
20
21
---
10
2
2
4
6
STOP


*/