package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class SomeString extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

//        String str = "alabaal";
//        char[] somOne = scan.nextLine().toCharArray();

//        int result = str.indexOf("b");
//        int res = str.indexOf("l");
//
//        System.out.println(result);
//        System.out.println(res);
//
//

        /**
         word: pesho pesho pak e pesho
         pattern: pesho
         Колко пъти в word се среща pesho?
         */

//        String word = scan.nextLine();
//        String pattern = scan.nextLine();
//
//        int pos = 0, count = 0;
//        while (true) {
//            pos = word.indexOf(pattern, pos);
//            if (pos == -1) {
//                break;
//            }
//            count++;
//            pos = pos + 1;
//        }
//        System.out.print(count);


        String a = "Sofia";
        String b = "Varna";
        System.out.println(a.compareTo(a+b));


        int aa = 122;
        int bb = 32;
         String s = aa > bb ? b : a;
        System.out.println(s);
    }
}
