package aSoftUni;

import training.Methods;
import java.util.Scanner;

public class CatBreed extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        int yearLife = 0, count = 0;
        boolean isWrongName = false, isValidName = false;

        String[] catBreed = new String[]        // По-трудният вариант <-
                {"British Shorthair", "Siamese", "Persian", "Ragdoll", "American Shorthair", "Siberian"};

        // Проверява на всяка една итерация дали breed е различно от catBreed[i]. Ако е различно
        // count расте с 1 респективно isWrongName -> true. Ако ли Не, преминава на следващата итерация.
        // И така докато не обходи целия масив catBreed[]:


        String breed = scan.nextLine();
        String catGender = scan.nextLine();

        for (String itemBreed : catBreed) {
            if (!breed.equals(itemBreed)) {
                count++;
                isWrongName = true;
            }
        }

        // if (isWrongName && (count == catBreed.length)) == true.
        // (count == catBreed.length)) -> обходен е целия масив с имена.
        // -> Въведено е грешно име -> return:

        if (isWrongName && (count == catBreed.length)){
            System.out.printf("%s is invalid cat! %n", breed);
            return;
        }

        switch (breed) {
            case "British Shorthair" -> {
                isValidName = true;
                if (catGender.equals("m")) {
                    yearLife += 13;
                } else if (catGender.equals("f")) {
                    yearLife += 14;                      // TODO: Към старата стойност добавя новата.
                }
            }
            case "Siamese" -> {
                isValidName = true;
                if (catGender.equals("m")) {
                    yearLife += 15;
                } else if (catGender.equals("f")) {
                    yearLife += 16;
                }
            }
            case "Persian" -> {
                isValidName = true;
                if (catGender.equals("m")) {
                    yearLife += 14;
                } else if (catGender.equals("f")) {
                    yearLife += 15;
                }
            }
            case "Ragdoll" -> {
                isValidName = true;
                if (catGender.equals("m")) {
                    yearLife += 16;
                } else if (catGender.equals("f")) {
                    yearLife += 17;
                }
            }
            case "American Shorthair" -> {
                isValidName = true;
                if (catGender.equals("m")) {
                    yearLife += 12;
                } else if (catGender.equals("f")) {
                    yearLife += 13;
                }
            }
            case "Siberian" -> {
                isValidName = true;
                if (catGender.equals("m")) {
                    yearLife += 11;
                } else if (catGender.equals("f")) {
                    yearLife += 12;
                }
            }
        }
        yearLife = (yearLife * 12) / 6;
        System.out.printf("%d cat months %n", yearLife);

        if (isValidName){                           //Валидиране:  По-лесният вариант <-
            yearLife = (yearLife * 12) / 6;
            System.out.printf("%d cat months", yearLife);
        } else {
            System.out.printf("%s %n", "НеМа Такова Животно!");
        }

    }
}
