package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class BarcodeGeneratorString extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

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

        String a = scan.nextLine();
        String b = scan.nextLine();

        char firstA = a.charAt(0);         // (2345) -> 2
        char firstB = b.charAt(0);         // (6789) -> 6

        char secondA = a.charAt(1);        // (2345) -> 3
        char secondB = b.charAt(1);        // (6789) -> 7

        char thirdA = a.charAt(2);         // (2345) -> 4
        char thirdB = b.charAt(2);         // (6789) -> 8

        char fourA = a.charAt(3);          // (2345) -> 5
        char fourB = b.charAt(3);          // (6789) -> 9

        // TODO: Забележи -> "int i = firstA...."

        for (int first = firstA; first <= firstB; first++) {
            if (first % 2 == 0) {
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
                        System.out.printf("%c %c %c %c %n", first, second, third, four);
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

