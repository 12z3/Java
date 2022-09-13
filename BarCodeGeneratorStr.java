package aSoftUni;

public class BarCodeGeneratorStr {
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
        int a = 2345;
        int b = 6789;

        barCodeGenerator(a, b);
    }

    private static void barCodeGenerator(int a, int b) {
        int elCount = 0;
        String aa = String.valueOf(a);
        String bb = String.valueOf(b);

        for (int i = Integer.parseInt(String.valueOf(aa.charAt(0)));
             i < Integer.parseInt(String.valueOf(bb.charAt(0))); i++) {

            for (int j = Integer.parseInt(String.valueOf(aa.charAt(1)));
                 j <= Integer.parseInt(String.valueOf(bb.charAt(1))); j++) {

                for (int k = Integer.parseInt(String.valueOf(aa.charAt(2)));
                     k <= Integer.parseInt(String.valueOf(bb.charAt(2))); k++) {

                    for (int l = Integer.parseInt(String.valueOf(aa.charAt(3)));
                         l <= Integer.parseInt(String.valueOf(bb.charAt(3))); l++) {

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
