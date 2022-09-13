package aSoftUni;

public class BarCodeGeneratorInt1 {
    /**
     * @Problem: Техниката в магазин за коледни украси се разваля. Артикулите, които съдържат четни числа в своя
     * баркод не могат да бъдат маркирани от касиерите. Вашата задача е, да напишете програма, която
     * генерира всички баркодове, които НЕ съдържат четни цифри в себе си.
     *
     * @Web: <a href="https://softuni.bg/trainings/resources/pdf/74405/">...
     * %D0%BF%D0%BE%D0%B4%D0%B3%D0%BE%D1%82%D0%BE%D0%B2%D0%BA%D0%B0-%D0%B7%D0%B0-%D0%B8%D0%B7%D0%BF%D0%B8%D1%82-
     * pdf-programming-basics-with-java-july-2022/3754...</a>
     * @Source: : <a href="https://judge.softuni.bg/Contests/Compete/Index/2507#5">...</a>
     */
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        int a = 2345;
        int b = 6789;
        int elCount = 0;

        int four1 = a % 10;
        int four2 = b % 10;
        a = a / 10;
        b = b / 10;

        int third1 = a % 10;
        int third2 = b % 10;
        a = a / 10;
        b = b / 10;

        int two1 = a % 10;
        int two2 = b % 10;
        a = a / 10;
        b = b / 10;

        int one1 = a % 10;
        int one2 = b % 10;

        for (int i = one1; i <= one2; i++) {
            for (int j = two1; j <= two2; j++) {
                for (int k = third1; k <= third2; k++) {
                    for (int l = four1; l <= four2; l++) {
                        if ((i % 2 != 0) && (j % 2 != 0) && (k % 2 != 0) && (l % 2 != 0)) {
                            System.out.printf(" %d%d%d%d", i, j, k, l);
                            elCount++;
                            if ((elCount % 7) == 0) System.out.println();
                        }
                    }
                }
            }
        }
    }
}
