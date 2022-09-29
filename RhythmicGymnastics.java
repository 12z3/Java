package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class RhythmicGymnastics extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*
         Линк към Judge: https://judge.softuni.bg/Contests/Practice/Index/1538#4
         На световно първенство по художествена гимнастика три от държавите се изявяват като лидери в класирането
         (Русия, България, Италия).
         Вашата задача е да изчислите каква е оценката дадена от журито за конкретно съчетание,
         като знаете държавата, която е играла и с кой уред е играла - лента, обръч или въже.
         За съчетанието си, отбора е получил две оценки: оценка за трудност и оценка за изпълнение на съчетанието,
         като крайната оценка е сбор на двете оценки.
         В таблицата са показани какви оценки за трудност и изпълнение са получили ансамблите за всеки един уред.

         Уред	        Русия	                            България	                        Италия
         Лента (ribbon)	Трудност: 9.100 Изпълнение: 9.400	Трудност: 9.600 Изпълнение: 9.400	Трудност: 9.200 Изпълнение: 9.500
         Обръч (hoop)	Трудност: 9.300 Изпълнение: 9.800	Трудност: 9.550 Изпълнение: 9.750	Трудност: 9.450 Изпълнение: 9.350
         Въже (rope)	Трудност: 9.600 Изпълнение: 9.000	Трудност: 9.500 Изпълнение: 9.400	Трудност: 9.700 Изпълнение: 9.150

         Напишете програма, която изчислява каква е оценката на дадена държава за определен уред
         и колко процента не им достигат, за да имат максималната оценка, която е 20.
         Вход
         Входът се чете от конзолата и се състои от два реда:
         •	Първи ред – държава – текст ("Russia", "Bulgaria" или "Italy")
         •	Втори ред – уред - текст ("ribbon", "hoop" или "rope")
         Изход
         На конзолата трябва да се отпечатат два реда:
         •	Първи ред: "The team of {държава} get {обща оценка} on {уред}."
         •	Втори ред:  "{процентът, който не им достига до максималния брой точки}%"

         Общата оценка да бъде форматирана до третата цифра след десетичния знак,
         а процентът да бъде форматиран до втората цифра след десетичния знак.
         */

        double ribbonGrade = 0.0, hoopGrade = 0.0,
                ropeGrade = 0.0, totalGrade = 0.0;


        String country = scan.nextLine();
        String device = scan.nextLine();

        switch (country) {
            case "Russia" -> {                                   // Редовете
                if (device.equals("ribbon")) {                   // Колоните
                    ribbonGrade = 9.100 + 9.400;
                } else if (device.equals("hoop")) {
                    hoopGrade = 9.300 + 9.800;
                } else if (device.equals("rope")) {
                    ropeGrade += 9.600 + 9.000;
                }
            }
            case "Bulgaria" -> {
                if (device.equals("ribbon")) {
                    ribbonGrade = 9.600 + 9.400;
                } else if (device.equals("hoop")) {
                    hoopGrade = 9.550 + 9.750;
                } else if (device.equals("rope")) {
                    ropeGrade += 9.500 + 9.400;
                }
            }
            case "Italy" -> {
                if (device.equals("ribbon")) {
                    ribbonGrade = 9.200 + 9.500;
                } else if (device.equals("hoop")) {
                    hoopGrade = 9.450 + 9.350;
                } else if (device.equals("rope")) {
                    ropeGrade += 9.700 + 9.150;
                }
            }
        }

        totalGrade = ribbonGrade + hoopGrade + ropeGrade;

        System.out.printf("The team of %s get %.3f on %s. %n", country, totalGrade, device);
        System.out.printf("%.2f%% %n", ((20. - totalGrade) / 20) * 100);


    }
}

/*
-----------------------------------------
Bulgaria
ribbon

-----------------------------------------
The team of Bulgaria get 19.000 on ribbon.
5.00%
-----------------------------------------
Russia
rope

-----------------------------------------
The team of Russia get 18.600 on rope.
7.00%
-----------------------------------------
Italy
hoop

-----------------------------------------
The team of Italy get 18.800 on hoop.
6.00%
-----------------------------------------
*/
