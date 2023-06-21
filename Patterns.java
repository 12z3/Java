package aSoftUni;

public class Patterns {
    public static void main(String[] args) {
        three(7);
        System.out.println();
        triangle(7);
        System.out.println();
        triangleA(7);
        System.out.println();
        halfRhombus(7);
        System.out.println();
        rhombus(7);
        System.out.println();
        rhombusA(7);
    }

    private static void three(int n) {
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n - row; space++) {    // Принтира  броя " " за всеки ред
                System.out.print(" ");
            }
            for (int symbol = 0; symbol < row + 1; symbol++) {    // След като е разпечатало спесчетата за дадения ред,
                System.out.print(" *");                      // за същият ред печата и "*" в съответните колони на реда.
            }
            System.out.println();
        }
    }

    private static void triangle(int n) {
        for (int row = 0; row < n; row++) {
            for (int symbol = 0; symbol < row + 1; symbol++) {    // След като е разпечатало спесчетата за дадения ред,
                System.out.print(" *");                      // за същият ред печата и "*" в съответните колони на реда.
            }
            System.out.println();
        }
    }

    private static void triangleA(int n) {
        for (int row = 0; row < n; row++) {
            for (int symbol = 0; symbol < n - row; symbol++) {    // След като е разпечатало спесчетата за дадения ред,
                System.out.print(" *");                      // за същият ред печата и "*" в съответните колони на реда.
            }
            System.out.println();
        }
    }

    private static void halfRhombus(int n) {
        for (int row = 0; row <= (2 * n) - 1; row++) {
            int columOfRows = row < n ? row : (2 * n) - row;
            for (int col = 0; col < columOfRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
                                                                        // row и col -> държат индекси не бройка.
    private static void rhombus(int n) {                                 // при row = 1 до 2*n тогава ще"държат" бройката
        for (int row = 0; row <= (2 * n) - 1; row++) {                  // 1-во принтира " "-те и след това "* "
            int countSpace = row < n ? n - row : row - n;               // броя " " в зависимост от реда -
            for (int space = 0; space < countSpace; space++) {          // броя в зависимост от половината фигура.
                System.out.print(" ");
            }
            int columOfRows = row < n ? row : (2 * n) - row;            // броя символи/колони за дадения ред
            for (int col = 0; col < columOfRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void rhombusA(int n) {
        for (int row = 0; row <= (2 * n) - 1; row++) {
            int columOfRows = row < n ? row : (2 * n) - row;
            int countSpace = n - columOfRows;                          // " " -тата са равни на n - columOfRows
            for (int space = 0; space < countSpace; space++) {         // по този начин не се притеснявам за тяхната -
                System.out.print(" ");                                 // бройка в двете половини на фигурата.
            }                                                          // -> виж rhombus(int n).

            for (int col = 0; col < columOfRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
