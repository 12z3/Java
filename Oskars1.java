package task.aSoftUni;

import java.util.Scanner;

public class Oskars1 {

    /**
     * @Source: <a href="https://judge.softuni.org/Contests/Compete/Index/1699#8">...</a>
     * Поканени сте от академията да напишете софтуер, който да пресмята точките за актьор/актриса.
     * Академията ще ви даде първоначални точки за актьора. След това всеки оценяващ ще дава своята оценка.
     * Точките, които актьора получава се формират от: дължината на името на оценяващия умножено по точките,
     * които дава делено на две.
     * Ако резултатът в някой момент надхвърли 1250.5 програмата трябва да прекъсне и да се отпечата,
     * че дадения актьор е получил номинация.
     *
     * Вход:
     * Име на актьора – текст
     * Точки от академията - реално число в интервала [2.0... 450.5]
     * Брой оценяващи n – цяло число в интервала[1… 20]
     * На следващите n-на брой реда:
     * Име на оценяващия – текст
     * Точки от оценяващия – реално число в интервала [1.0... 50.0]
     *
     * Изход:
     * Да се отпечата на конзолата един ред:
     * Ако точките са над 1250.5:
     * "Congratulations, {име на актьора} got a nominee for leading role with {точки}!"
     * Ако точките не са достатъчни:
     * 	"Sorry, {име на актьора} you need {нужни точки} more!"
     * Резултатът да се форматирана до първата цифра след десетичния знак!
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());
        boolean isBreak = false;

        oskars(scanner, actorName, points, juryCount, isBreak);
    }

    private static void oskars(Scanner scanner, String actorName, double points, int juryCount, boolean isBreak) {
       // Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < juryCount) {
            String juryName = scanner.nextLine();
            double juryPoint = Double.parseDouble(scanner.nextLine());

            double thisJuryPoint = (juryName.length() * juryPoint) / 2;
            points += thisJuryPoint;
            if (points > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.2f!%n",
                        actorName, points);
                isBreak = true;
                break;
            }
            count++;
        }
        if (!isBreak) System.out.printf("Sorry, %s you need %.2f more!", actorName, (1250.5 - points));
    }
}
