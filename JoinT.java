package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class JoinT extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        String[] str = new String[]{"A", "B", "C"};
        String a = "a"; String b = "b"; String c = "c";
        int[] abc = new int[]{1, 2, 3, 4};
        String[] newF;

        newF =  scan.nextLine().split("/",12);
        System.out.println();

        System.out.println(String.join("->",a,b,c));
        System.out.println(String.join("/", str));
        System.out.print(String.join("/", newF));
    }
}
