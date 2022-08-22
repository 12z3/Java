package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class HightJumpWhile extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        int startHight = 0, falseJunp = 0, okJumps = 0, allJumps = 0;

        // TODO: Ред 15:  Не е в Цикъл - не е необходимо на всяка итерация да се ъпдейтва. "+" е излишен.

        int target = Integer.parseInt(scan.nextLine());
        startHight += target - 30;

        while (startHight <= target) {
            int jump = Integer.parseInt(scan.nextLine());

            if ((jump <= startHight)) {
                falseJunp++;
                allJumps++;
                System.out.printf("%d %d %n", jump, falseJunp);
                if (falseJunp >= 3) {
                    System.out.printf("Your failed on %dsm after %d times jump ", jump, allJumps);
                    break;
                }
            } else {
                okJumps++;
                allJumps++;
                System.out.printf("Yes: Jump = %d Position = %d -> %d %n %d %n", jump, startHight, okJumps, allJumps);

                if (allJumps >= 3){
                    break;
                }
                startHight += 5;
                okJumps = 0;
                falseJunp = 0;
                allJumps = 0;
                System.out.printf("Yes -> New Hight = %d %n", startHight);

                if (startHight > target){
                    System.out.print("Ok!");
                    System.out.printf("Yes -> New Hight = %d %n", startHight);
                    return;
                }
            }
        }
    }
}

/*

231
205
212
213
228
229
230
235

 */