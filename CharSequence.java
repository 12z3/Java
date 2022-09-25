package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class CharSequence extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         Напишете програма, която да принтира на конзолата всички комбинации от 3 букви в зададен интервал,
         като се пропускат комбинациите съдържащи зададена от конзолата буква.
         Накрая трябва да се изпринтира броят на отпечатаните комбинации.
         Вход
         Входът се чете от конзолата и съдържа точно 3 реда:
         Ред 1.	Малка буква от английската азбука за начало на интервала – от ‘a’ до ‚z’.
         Ред 2.	Малка буква от английската азбука за край на интервала  – от първата буква до ‚z’.
         Ред 3.	Малка буква от английската азбука – от ‘a’ до ‚z’ – като комбинациите съдържащи тази буквата се пропускат.
         Изход
         Да се отпечатат на един ред всички комбинации отговарящи на условието плюс броят им разделени с интервал.

         acb -> aaa aac aca acc caa cac cca ccc 8

         */

        // TODO:
        //  Идеята е следната: Взима всяка една комбинация на first, second, third == str.
        //  За всяка комбинация проверява всеки един от чаровете дали съвпада с thirdChar.
        //  Ако съвпада (isItThirdChar = true) излиза от 4-for и НЕ печата комбинацията.
        //  И така всеки път за всяка една възможна комбинация.


        char firstChar = scan.nextLine().charAt(0);
        char secondChar = scan.nextLine().charAt(0);
        char thisChar = scan.nextLine().charAt(0);

        int count = 0;
        for (char first = firstChar; first <= secondChar; first++) {
            for (char second = firstChar; second <= secondChar; second++) {
                for (char third = firstChar; third <= secondChar; third++) {

                    String str = "" + first + second + third;
                    boolean isThisChar = false;               // <- За всяка НОВА комбинация от букви в "str"
                                                                 // задава изходна стойност на "isItThirdChar".
                                                                 // Инак помни последната и става Мазало.
                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == thisChar) {
                            isThisChar = true;
                            break;                // <- Без break Ще запомни последната стойност на isItThirdChar.
                                                  // Ако i(0) = b няма да го отчете.
                        }                         // break: от ред 44 -> на ред 48.
                    }
                    if (!isThisChar) {
                        count++;
                        System.out.printf("%c%c%c %d %n", first, second, third, count);
                    }

                }
            }
        }


    }
}

