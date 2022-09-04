package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class BarcodGeneratorTRUE extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /**
         Взима първото число от first(2345) в случая 2.
         Взима и първото число от second(6789) което е 6.
         Задачата иска да се генерират всички възможни 4 цифрени числа за които:
          - Първата цифра е в диапазаноа от 2 до 6, втората от 3 до 7 и т.н.
         Допълнително условие е да няма ЧЕТНИ цифри в новото число.
         */

        // TODO: Виж -> "BarcodeGeneratorInt"
        // TODO: Чете входа като int -> Ред: 25-24.
        //   Обръща го на String -> Ред: 28-29.
        //   Взема всеки един char от Stringa -> Ред: 34-40-46-52.

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());

        String firstString = String.valueOf(first);    // TODO: int - > String.
        String secondString = String.valueOf(second);  // TODO: int - > String.

        char firstDigits = '@', secondDigits = '@', thirdDigits = '@', fourDigits = '@';
        boolean isTrue = false;

        for (int i = firstString.charAt(0); i <= secondString.charAt(0); i++) {
            if (!(i % 2 == 0)) {
                firstDigits = (char) i;         // TODO: И това върши работа.
            } else {
                continue;
            }
            for (int a = firstString.charAt(1); a <= secondString.charAt(1); a++) {
                if (!(a % 2 == 0)) {            // TODO: Ако int(a) е нечетен, -
                    secondDigits = (char) a;    // TODO: запази го в char като "secondDigits".
                } else {                        // TODO: Ако ле не прескочи и отиди на следващата итерация.
                    continue;                   // TODO: "Не ходи на долу" в кода
                }
                for (int w = firstString.charAt(2); w <= secondString.charAt(2); w++) {
                    if (!(w % 2 == 0)) {
                        thirdDigits = (char) w;
                    } else {
                        continue;
                    }
                    for (int s = firstString.charAt(3); s <= secondString.charAt(3); s++) {
                        if (!(s % 2 == 0)) {
                            fourDigits = (char) s;
                            System.out.println("" + firstDigits + secondDigits + thirdDigits + fourDigits);
                        }
                    }
                }
            }
        }


    }
}

/**
2345
6789
 -----
 3355
 3357
 3359
 3375
 3377
 3379
 3555
 3557
 3559
 3575
 3577
 3579
 3755
 3757
 3759
 3775
 3777
 3779
 5355
 5357
 5359
 5375
 5377
 5379
 5555
 5557
 5559
 5575
 5577
 5579
 5755
 5757
 5759
 5775
 5777
 5779
 */