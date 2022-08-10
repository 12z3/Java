package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class LoadingLuggage extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         Линк: https://judge.softuni.bg/Contests/Compete/Index/2275#9

         Напишете програма, която ви помага при товаренето на куфари в багажника на самолет.
         Всеки самолет има определен капацитет на багажника.
         До получаване на команда "End" ще получавате обем на куфар.
         Обемът на всеки трети куфар трябва да се увеличава с 10%,
         поради загубата на пространство при начина на подреждане.
         Ако свободното пространството в даден момент е по-малко от обема на куфар товаренето трябва да прекъсне.

         Вход
         Първоначално се чете един ред:
         •	Капацитетът на багажника – реално число в диапазона [100.0…6000.0]
         След това до получаване на команда "End" или до запълване на багажника, се чете по един ред:
         o	Обем на куфар – реално число в диапазона [100.0…6000.0]

         Изход
         На конзолата да се отпечатат следните редове според случая:
         •	При получаване на командата "End" се печата:
         "Congratulations! All suitcases are loaded!"
         •	Ако обемът на куфара е по-голям от оставащото пространство в багажника:
         "No more space!"
         •	Накрая винаги се отпечатва статистика – колко багажа са натоварени:
         "Statistic: {брой натоварени багажи} suitcases loaded."

         */

        double suiteCapacity = 0.0;
        boolean isEmptySpace = true;
        int countAdd = 0, countIn = 0;


        double capacity = Double.parseDouble(scan.nextLine());
        String command = scan.nextLine();

        while (!command.equalsIgnoreCase("End")) {
            suiteCapacity = Double.parseDouble(command);
            countIn++;                                           // Броя Пристигащи куфарчета.

            if (countIn % 3 == 0) {
                suiteCapacity += suiteCapacity * 0.01;
            }

            capacity -= suiteCapacity;

            if (capacity <= 0) {
                isEmptySpace = false;
                break;
            } else {
                countAdd++;                                     // Броя Натоварени куфарчета.
            }

            command = scan.nextLine();
        }

        if (isEmptySpace) {
            System.out.printf("%s %n", "Congratulations! All suitcases are loaded!");
        } else {
            System.out.println("No more space!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", countAdd);
    }
}

/*
700.5
180
340.6
126
220

--------------
No more space!
Statistic: 3 suitcases loaded.

--------------
1200.2
260
380.5
125.6
305
End

--------------
Congratulations! All suitcases are loaded!
Statistic: 4 suitcases loaded.

*/