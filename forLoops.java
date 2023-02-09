package java_Nakov;

import training.Methods;
import java.util.Scanner;

public class forLoops extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // timeAndData();

        // TODO: Just Loops:
        // TODO: Проблема на Запетаята във различни Варианти ;) :

//        int n = Integer.parseInt(scan.nextLine());

//       //  TODO: И това Работи ;) :
//
//        for (int i = 1; i <= n; i += 3) {
//            System.out.print(i);
//                                             // При n = 4.
//            if ((i <= n - 3)) {              // Първа итерация: Печатай 1. ? 1 <= 1 -> "Да". То печатай ", "
//                System.out.print(", ");      // Втора итерация:  ? 4 <= 4 -> "Да". То Печатай 4. Е ли 4 <= 1
//            }                                // -> "Не" то Не печатай ", "
//        }                                    // Трета итерация: Излез от цукъла. 7 > 4.
//
//        System.out.println();
//
//
//        //  TODO: По Хитрия вариант:         // Първо печата ", ", след това числото.
//                                             // Ако числото стане >= n Не Печатай Нищо <- Просто ;)
//        for (int i = 1; i <= n; i += 3) {
//            if ((i > 1)) {                   // Ако i > 1 печатай i. -> При n = 4 Третата итерация е:
//                System.out.print(", ");      // ? 7 <= 4 -> "Не", то излез от цикъла и Не Печатай Нищо.
//            }
//            System.out.print(i);             // Първо печатай запетаята и след това числото <- !
//        }
//        System.out.println();
//
//
//        //  TODO: Обратният Вариант:
//
//        for (int i = n; i >= 1; i--) {       // Обърни Внимание Къде Печата числото.
//            System.out.print(i);
//            if (i > 1){
//                System.out.print(", ");
//            }
//                                            // Реда Не Случайно е Парзен ;) <-
//        }
//        System.out.println();


//       //  TODO: Четните степени на 2:          // 1 4 8 16 32 64 128 256 512 1024 ......

//        for (int i = 2; i <= 1024 ; i *= 2) {
//            if (i == 2){
//                System.out.printf("%d ", 1);
//                continue;
//            }
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//
//        for (int i = 2; i < 1000 ; i *= 2) {
//            if (i == 2){
//                System.out.printf("%d ", 1);
//            }
//            int num = i * 2;
//            System.out.print(num + " ");
//        }
//
//        System.out.println();
//
//        int i = 1;
//        while (i < 1000){
//            if (i == 1){
//                System.out.printf("%d ", 1);
//            }
//            i *= 4;
//            if ( i == 2){
//                continue;
//            } else {
//                System.out.printf("%d ", i);
//            }
//        }

        // TODO: Nested Loops - Фигурки - Вариан:

        // Triangle:

//        for (int row = 0; row < 5; row++) {
//            for (int coll = 0; coll < 5; coll++) {
//                if (row >= coll )
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for (int row = 5; row >= 0; row--) {
//            for (int coll = row; coll <= 5; coll++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int row = 0; row <= 5; row++) {
            for (int coll = 0; coll <= row; coll++) {
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
