package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class RecursionAgain extends Methods {

    public static void sayHi(int count) {
        if (count < 1) {
            return;
        }
        sayHi(count - 1);
        System.out.println("Hi");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        sayHi(3);
        System.out.println(sum(2,3));


    }
}
