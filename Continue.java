package java_Nakov;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int a = Integer.parseInt(scaner.next());
        int b = Integer.parseInt(scaner.next());
        int c = Integer.parseInt(scaner.next());

        for (int number = b; number >= a; number--) {
            if ( number % 2 == 0 && number % 3 == 0) {
                if (number == c){
                    continue;
                } else {
                    System.out.printf("%d ", number);
                }
            }
        }
    }
}
