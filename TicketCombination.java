package aSoftUni;

import training.Methods;

import java.util.Scanner;

public class TicketCombination extends Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        /*

         Задача 6. Билетна комбинация
         Пепи спечелил билет за мач от световното от онлайн томбола. За да получи своята награда,
         той трябвало да въведе единствено число – поредният номер на печелившата комбинация.
         При достигане на този номер се генерира 5-символен код, съдържащ следната информация за мача:
         • Символ 1: Главна латинска буква с четен ASCII код от "B" до "L", съответстваща на името на стадиона
         • Символ 2: Малка латинска буква от "f" до "a", съответстваща на името на сектора
         • Символ 3: Главна латинска буква от "A" до "C", съответстваща на входа
         • Символ 4: Цяло положително число от 1 до 10, съответстващо на реда
         • Символ 5: Цяло положително число от 10 до 1, съответстващо на мястото
         Като бонус Пепи получава и парична награда на стойност сумата от ASCII кодовете на буквите,
         събрана с цифрите на билетната комбинация.
         Напишете програма,която генерира билетната комбинация и изчислява нейната сума.
         Вход
         От конзолата се чете един ред:
         •	Пореден номер на комбинацията – цяло положително число в интервала [1..10000]
         Изход
         На конзолата да се отпечатат два реда, съдържащи съответно генерираната комбинация
         и паричната награда, форматирани по следния начин:
         •	"Ticket combination: {генерираната комбинация}"
         •	"Prize: {паричната награда} lv."

         Вход: 17
         Изход: Ticket combination: BfA24. Prize: 239 lv.

         Първата генерирана комбинация,
         която започва с главна латинска буква с четен ASCII код е BfA110. Нейната сума е 244.
         Втората генерирана комбинация,
         която започва с главна латинска буква с четен ASCII код е BfA19. Нейната сума е 243.
         …
         Десетата е BfA11. Нейната сума е 235.
         …
         Седемнадесетата генерирана комбинация,
         която започва с главна латинска буква с четен ASCII код е BfA24.
         Числото, което сме въвели е 17 => това е комбинацията, която търсим
         Сумата й е: 66 + 102 + 65 + 2 + 4 = 239

         2568 (1418) -> DdB73; 7589 -> JeA92;
         */

        char nameOfStadion = 'A';   // B -> L   41-132
        char nameOfSector = 'a';    // f -> a
        char nameOfEntrance = 'A';  // A -> C
        int nameOfLineNumber = 0;   // 1 -> 10
        int thePlace = 0;           // 10 -> 1

        int reward = 0, count = 0;
        int number = Integer.parseInt(scan.nextLine());

        /* Генерира всички възможни комбинации от горните 5: */

        for (nameOfStadion = 'B'; nameOfStadion <= 'L'; nameOfStadion += 2) {
            for (nameOfSector = 'f'; nameOfSector >= 'a'; nameOfSector--) {
                for (nameOfEntrance = 'A'; nameOfEntrance <= 'C'; nameOfEntrance++) {
                    for (nameOfLineNumber = 1; nameOfLineNumber <= 10; nameOfLineNumber++) {
                        for (thePlace = 10; thePlace >= 1; thePlace--) {
                            count++;

                            if (number == count) {
                                reward = (int) nameOfStadion + (int) nameOfSector + (int) nameOfEntrance +
                                        nameOfLineNumber + thePlace;
                                System.out.printf("%d: ", count);
                                System.out.printf("Ticket combination: %c%c%c%d%d %n", nameOfStadion, nameOfSector,
                                        nameOfEntrance, nameOfLineNumber, thePlace);
                                System.out.printf("sum is: %d %n", reward);
                            }
                        }
                    }
                }
            }
        }
    }
}


