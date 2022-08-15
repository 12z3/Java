package aSoftUni;

import training.Methods;

public class Recursion extends Methods {

    /**
     * - n!
     * - С влизането в рекурсията тя нарежда всички числа които трябва да се умножат.
     * С излизането ги умножава едно по друго и така се получава резултата.
     */

    public static int factorialRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }

    public static void factorialForCycle(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.printf("%d %n", factorial);
    }

    public static int fibRecursion(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return fibRecursion(n - 1) + fibRecursion(n - 2);
        }
    }

    public static long fibRecursionMemorization(int n) {
        long[] fib = new long[n + 3];
        if (n == 0 || n == 1) {
            return 1;
        }
        if (fib[n] == 0) {
            fib[n] = fibRecursionMemorization(n - 1) + fibRecursionMemorization(n - 2);

        }
        return fib[n];
    }

    public static int fibInterpolation(int n) {
        int f0, f1, f2, i;
        f0 = 0;
        f1 = 1;
        f2 = 1;
        i = 0;

        System.out.print("Row is = 0 1 1 ");
        while (i < n) {
            f0 = f1;
            f1 = f2;
            f2 = f1 + f0;
            i++;
            System.out.printf("%d ", f2);
        }
        return f2;
    }

    public static void bits(int n, String bits) {
        if (n == 0) {
            System.out.printf("%s ", bits);
            return;
        }
        bits(n - 1, "0");
        bits(n - 1, "1");
        System.out.println();
    }


    public static void main(String[] args) {
        timeAndData();
//        System.out.printf("%d %n", factorialRecursion(5));
////        bits(3, "");
//        fibonacciRow(52);
//        System.out.println();
//        System.out.println(fibRecursionMemorization(50) + " <-");

        fibInterpolation(5);


    }
}


