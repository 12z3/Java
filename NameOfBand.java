package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class NameOfBand extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();


        char goliamaBukvA = scan.nextLine().charAt(0);  // A- goliamaBukvA
        char malkaBukvA1 = scan.nextLine().charAt(0);   // a- malkaBukvA1
        char malkaBukvA2 = scan.nextLine().charAt(0);   // a- malkaBukvA2
        char malkaBukvA3 = scan.nextLine().charAt(0);   // a- malkaBukvA3
        int cifra = Integer.parseInt(scan.nextLine());  // 0 - cifra


        String name = "Kabc5 ", nameOfChar = "";
        int count = 0;

        for (char golemiBukvi = 'A'; golemiBukvi <= goliamaBukvA; golemiBukvi++) {
            for (char malkiBukvi1 = 'a'; malkiBukvi1 <= malkaBukvA1; malkiBukvi1++) {
                for (char malkiBukvi2 = 'a'; malkiBukvi2 <= malkaBukvA2; malkiBukvi2++) {
                    for (char malkiBukvi3 = 'a'; malkiBukvi3 <= malkaBukvA3; malkiBukvi3++) {
                        for (int cifri = 0; cifri <= cifra; cifri++) {
                            count++;
                            nameOfChar = "" + golemiBukvi + malkiBukvi1 + malkiBukvi2 + malkiBukvi3 + cifri;
                            System.out.printf("%d %n", count);
                            System.out.printf("%s %n", nameOfChar);
//                            if (name.equals(nameOfChar)) {
//                                System.out.printf("%d %n", count);
//                                System.out.printf("%c%c%c%c%d %n", golemiBukvi, malkiBukvi1, malkiBukvi2, malkiBukvi3, cifri);
//                                break;
////                            }
                            }
                        }
                    }
                }
            }
            System.out.printf("%d %n", count - 1);
            System.out.printf("%s %n", nameOfChar);


    }
}
/*
K
a
b
c
5

*/