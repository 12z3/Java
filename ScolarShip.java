package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class ScolarShip extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();


        // TODO: НЕ Е ОК КОДА ТАКА НАПИСАН !

        boolean isGraduate = false, isSocial = false;
        double socialScholarship = 0, graduateScholarship = 0;


        double inCome = Double.parseDouble(scan.nextLine());
        double averageGrade = Double.parseDouble(scan.nextLine());
        double minimumSalary = Double.parseDouble(scan.nextLine());

        if (inCome <= minimumSalary && averageGrade >= 4.50) {
            socialScholarship += minimumSalary * 0.35;
            isSocial = true;
        }
        if (averageGrade >= 5.50) {
            graduateScholarship = averageGrade * 25;
            isGraduate = true;
        }
                                                                            // && = true - true
                                                                            // || = true - false
        if (!isGraduate && !isSocial) { // -> false - false or true - true
            System.out.print("No");
        }

        if (isGraduate || isSocial && (socialScholarship > graduateScholarship)) { // -> true - false - true = true
            System.out.println("Social scholarship");
            System.out.printf("Social scholarship = %.0f %n", socialScholarship);
            System.out.printf("Graduate scholarship = %.0f %n", graduateScholarship);
        }

        if (isSocial || isGraduate && (graduateScholarship > socialScholarship)) {
            System.out.print("Graduate scholarship");
            System.out.printf("Graduate scholarship = %.0f %n", graduateScholarship);
            System.out.printf("Social scholarship = %.0f %n", socialScholarship);
        }
    }
}


/*

318.40
4.60
320.00

*/