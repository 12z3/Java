package aSoftUni;

import training.Methods;
import java.util.Scanner;
import java.util.Arrays;

public class SearchBinary extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        int[] arr = { 10, 20, 15, 22, 35 };
        int key = 22;

        int res = Arrays.binarySearch(arr, key);

        System.out.println(res);













    }
}
