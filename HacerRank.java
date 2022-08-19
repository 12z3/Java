package aSoftUni;

import training.Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class HacerRank extends Methods {
    public static class HackerRank extends Methods {
        public static void main(String[] args) throws IOException {
            timeAndData();
            // BufferedReader -> InputStreamReader(System.in)
            BufferedReader bufferedReader = new BufferedReader(           // bufferedReader.readLine().trim()) ==> String.
                    new InputStreamReader(System.in));

            int N = Integer.parseInt(
                    bufferedReader.readLine().trim());

            StringReader str = new StringReader(
                    bufferedReader.readLine().trim());

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d %n", N, i, N * i);
            }

            System.out.println(str);
            bufferedReader.close();
        }
    }
}
