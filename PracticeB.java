package aSoftUni;

import training.Methods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PracticeB extends Methods {


    // TODO: Варианти на тема "Четене на вход". Мъчи се да Чете и Печата 2D масив от конзолата.

    private static void consoleInput(Scanner scan, int[][] arr) {
        String[] lineElement;
        for (int row = 0; row < 3; row++) {
            for (int coll = 0; coll < 5; coll++) {

                int element = scan.nextInt();
                arr[row][coll] = element;                             // <- Чете и печата коректно. - 1.

                lineElement = scan.nextLine().split("\\s");
                System.out.println(Arrays.toString(lineElement));


            }
        }
        System.out.println();                                         // - 2.
        print2DArray(arr);                                            // - 3.

        for (int i = 0; i < 5; i++) {
            lineElement = scan.nextLine().split(" ");
            System.out.println(Arrays.toString(lineElement));
        }
    }


    // TODO: ArrayList - добавя елементи.

    private static void addElementsToArrayLiist(StringBuilder sb, List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            sb.append(i).append(" ").append(";");
            sb.insert(0, 2);
            System.out.println(sb);
            list.add(i);
        }
        System.out.println(sb);
        System.out.println(Arrays.toString(list.toArray()));
    }


    // TODO: Намира Всички възможни комбинации на числата от "massive" чиято сума = numberC;

    private static void sumOfNumbersFromArray(int number) {
        int numberC = 0, numberA = 0, numberB = 0;
        int[] massive = {0, 14, 0, 4, 7, 8, 3, 5, 7};       // 0, 14, 0, 4, 7, 8, 3, 5, 7   // TODO: <- Помисли !

        for (int i = 0; i < massive.length - 1; i++) {
            numberA = massive[i];

            for (int j = 0; j < massive.length - 1; j++) {
                numberB = massive[j];
                numberC = numberA + numberB;

                if (numberC == number) {
                    System.out.println(numberA +
                            " + " + numberB + " = " + numberC);
                }
            }
        }
    }

    // TODO: Рисува робмчета:

    private static void printRhombus() {
        printRow();
        printReversedRow();
    }

    private static void printRow() {
        String line;
        for (int i = 0; i < 4; i++) {
            line = printSpace(4 - i) + printSymbol("*", i);
            System.out.println(line);
        }
    }

    private static void printReversedRow() {
        String line;
        for (int i = 4; i >= 0; i--) {
            line = printSpace(4 - i) + printSymbol("*", i);
            System.out.println(line);
        }
    }

    public static String printSpace(int spaceCount) {
        String line = " ";
        for (int j = 0; j < spaceCount; j++) {
            System.out.print(" ");
        }
        return line;
    }

    private static String printSymbol(String symbol, int symbolCount) {
        String line = " ";
        for (int i = 0; i < symbolCount; i++) {
            line += "* ";
        }
        return line;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        // TODO: Търси всеки от всеки елемент:
        //  0. Ако е проверило i-я с всички останали няма смисъл да сравнява останалите с i-я <- !
        //  1. Ако има съвпадение брои и записва елемента в ArrayList и индекса в друг ArrayList.
        //  Брояча се нулира при смяна на елемента - репер, а не при смяна на реда в който се търси.
        //  2. Ако няма съвпадение продължава да търси.
        //  3. Не трябра да се сравнява елемента сам със себе си. Трябва да се прескача.
        //  4. При избиране на следващ елемент с който ще се сравнява да се прескачат предишните.
        //  Идеята е ако е проверен 1 с всички останали да не се търси 2 с 1, 3 с 1 i т.н.


        int[][] arr = new int[3][5];
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<Integer>();


        // consoleInput(scan, arr);
        // addElementsToArrayLiist(sb, list);
        // printRhombus();
        sumOfNumbersFromArray(11);
        System.out.printf("String as '%s'. %n", String.valueOf(2));
        System.out.printf("Integer as '%d'. %n", Integer.valueOf("22"));


    }
}

/*
2 3 4 5 6
3 3 4 5 6
3 4 5 6 7

*/