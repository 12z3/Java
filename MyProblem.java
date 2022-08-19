package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class MyProblem extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        int[] arr = new int[]{1, 2, 8, 1, 2, 2, 2, 5, 1};             // {1, 2, 8, 1, 2, 2, 2, 5, 1};
        int[] fr = new int[arr.length];                               // {0, 0, 0,-1,-1,-1,-1, 0,-1}; - visited.
        int visited = -1;                                             // {3, 4, 0,-1,-1,-1,-1, 0,-1}; - count.

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {  // j = i+1 -> Избягва сравняването на елемента със себе си.

                if (arr[i] == arr[j]) {    // arr[i] Ще го сравни със Всичките arr[j] <--
                    count++;

                    fr[j] = visited;      // Маркира Повтарящите се в масива елементи.
                }
            }
            if (fr[i] != visited)         // Ако fr[i] != -1 (няма съвпадение) то нека fr[i] = count. Виж: Ред: 11-12.
                fr[i] = count;
        }

        //Displays the frequency of each element present in array
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)         // ако елемента fr[i] е != -1 (той трябва да е = count) ->  печатай.
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
        System.out.println("----------------------------------------");

    }
}
