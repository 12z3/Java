package aSoftUni;

import training.Methods;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticeC extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        String[] word = new String[]{"one", "two", "third"};
        String[] anotherWord = new String[]{"one", "four", "five"};
        List<Integer> intList = new ArrayList<>();

        String aWord = "number section";
        String bWord = "number-qecjios"; // number-qecjios

        compareWords(aWord, bWord);

        //------------------------------------------------------------------------------

        String one = scan.next(); // next(): Взима до първият Space.
        String two = scan.nextLine();

        //------------------------------------------------------------------------------
        String gameNames = scan.nextLine();
        String[] name = gameNames.split("");   // TODO:  Много е важен СЕПАРАТОРА. Дали е " " или "".
                                                      // TODO: Резултат е коренно различен.
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " = " + i + "; ");
        }
        //------------------------------------------------------------------------------

        String[] a = new String[]{"b", "s", "g", "t"};
        String consoleRead = scan.nextLine();                        // Вход:   ->     // 1 23 45 67 8

        String[] strinG = consoleRead.split(" ");         // Изход:   ->    // [1, 23, 45, 67,8]
        System.out.println(Arrays.toString(strinG));

        //------------------------------------------------------------------------------

        String s = scan.nextLine(); // TODO: nextLine(); -> Взима целия ред. next(); -> До 1-та Шпация !!!

        String[] aa = s.split("");
        System.out.printf("First is = %s, End is = %s %n", aa[0], aa[aa.length - 1]);
        System.out.printf("%d %n", aa.length);

        // ali ab: -> First is = a, End is = b; a.length = 6.

        //------------------------------------------------------------------------------

        // TODO:  Метода "split" връща Масив! <-
        // TODO:  Взима елементите на strinG от конзолата (1 23 45 67 8).
        // TODO:  Метода "toString" ги конвертита в тип "String".
        // TODO:  И на края ги "обръща" в масив от стрингове [1, 23, 45, 67,8].
        // TODO:  Метода toString() е от класса Arrays.


        for (int i = 0; i < 5; i++) {
            intList.add(i);
        }

        String intResult = intList.toString();
        System.out.println(intResult);


        List<String> strings = List.of("Java", "is", "cool");
        String message = String.join(" ", strings);
        // message returned is: "Java is cool"

        String messagE = String.join("-", "Java", "is", "cool");
        // message returned is: "Java-is-cool"

    }
}
