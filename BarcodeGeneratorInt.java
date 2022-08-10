package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class BarcodeGeneratorInt extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        // TODO: Виж BarcodeGeneratorTRUE.

        /*
         Линк: https://judge.softuni.bg/Contests/Compete/Index/2507#5

         Артикулите, които съдържат четни числа в своя баркод не могат да бъдат маркирани от касиерите.
         Вашата задача е, да напишете програма, която генерира всички баркодове,
         които НЕ съдържат четни цифри в себе си.

         Вход:
         •	Две четирицифрени числа, които показват обхвата на баркодовете, които трябва да промените.
         •	Първи ред – четирицифрено число – началото на обхвата. Цяло число в интервала [1000…9999]
         •	Втори ред – четирицифрено число – края на обхвата. Цяло число в интервала [1000…9999]

         Изход:
         На конзолата трябва да се отпечатат всички "баркодове",
         които НЕ съдържат четна цифра в себе си, разделени с интервал.

         */

        int count = 0;

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        int firstA = a / 1000;               // (2345) -> 2
        int firstB = b / 1000;               // (6789) -> 6

        int secondA = (a / 100) % 10;        // (2345) -> 3
        int secondB = (b / 100) % 10;        // (6789) -> 7

        int thirdA = (a / 10) % 10;          // (2345) -> 4
        int thirdB = (b / 10) % 10;          // (6789) -> 8

        int fourA = a % 10;                  // (2345) -> 5
        int fourB = b % 10;                  // (6789) -> 9

        for (int first = firstA; first <= firstB; first++) {
            if (first % 2 == 0) {                                   // Прескача ЧЕТНИТЕ елементи от поредицата
                continue;
            }
            for (int second = secondA; second <= secondB; second++) {
                if (second % 2 == 0) {
                    continue;
                }
                for (int third = thirdA; third <= thirdB; third++) {
                    if (third % 2 == 0) {
                        continue;
                    }
                    for (int four = fourA; four <= fourB; four++) {
                        if (four % 2 == 0) {
                            continue;
                        }
                        count++;
                        System.out.printf("%d%d%d%d %n", first, second, third, four);
                    }
                }
            }
        }

        System.out.printf("%d %n", count);
    }
}

/*

2345
6789

------

3355 3357 3359 3375 3377 3379 3555
3557 3559 3575 3577 3579 3755 3757
3759 3775 3777 3779 5355 5357 5359
5375 5377 5379 5555 5557 5559 5575
5577 5579 5755 5757 5759 5775 5777
5779

*/