package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class HightJumpFor extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();


        int startHight = 0, falseJunp = 0,
                okJumps = 0, allJumps = 0, jump = 0;

        int target = Integer.parseInt(scan.nextLine());

        startHight += target - 30;
        for (int hight = startHight; hight < target; hight += 5) {
            jump = Integer.parseInt(scan.nextLine());
            System.out.printf("Hight is %s your jump is %d %n", hight, jump);

            if (jump <= startHight) {
                falseJunp++;
                if (falseJunp >= 3) {
                    System.out.printf("No. Yor faiL on %d.Opit: %d %n", jump, falseJunp);
                    break;
                }
            } else {

                System.out.printf("Yes: %d %n", startHight);
            }
        }
        System.out.println("Ok!");

    }
}
