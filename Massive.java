package dynamicsStructhure;

import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me a number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("... and a number of cols: ");
        int cols = scanner.nextInt();

        int[][] a = new int[rows][cols];
        int allCount = 1, countRColumElements, start = 1, leftRow, rightRow;


        for (int row = rows - 1; row >= 0; row--) {
            leftRow = row;
            for (int col = 0; col < a[row].length; col++) {
                a[row][col] = allCount++;
                if ((row == rows - 1)) break;
                row++;
            }
            row = leftRow;
            if ((a[0][0] != 0)) break;                         // за матрици от рода на [3][5] и [5][3]
        }

        for (int row = 0; row <= rows; row++) {
            countRColumElements = 0;
            rightRow = row;
            for (int col = start; col < a[0].length; col++) {
                a[row][col] = allCount++;
                row++;
                countRColumElements++;
                if (row == a.length) break;
            }
            if (allCount <= (rows * cols)) {
                row = (rightRow == 0) ? -1 : row - countRColumElements;
                start++;
            } else break;
        }

        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


    }
}
