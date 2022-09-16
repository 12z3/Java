package aSoftUni;

public class Sentenses {

    /**
     *                      Резултат
     * Конкретнен резултат в блока на if {result = }
     * Резултат с натрупване if {result += }
     * /ASCIIDone.java/
     *
     *                      МАСИВИ
     *  massive: За всеки ред се обхождат колоните в масива <for></>
     *
     *  * for{
     *      *  for }-> сравнява елемент със всички останали.
     *
     *      * for {arr[i] > arr[j]} сравнява 1 с 2, 2 с 3 i т.н.
     *
     *  Ако не ме интересува индекса на елемента -> forEach cycle,
     *  в противен случай fori.
     *
                            WHILE
     *  String command = scan.nextLine();
     *         while (!command.equals("STOP") && countPiecesInCake >= 0) {
     *      ДА       int takenPieces = Integer.parseInt(command); // <- Важно е !
     *      НЕ       int takenPieces = Integer.parseInt(scanner.nextLine);

                           КОНЗОЛА
     *  Два начина за четене от конзолата:
     *  Scanner scan = new Scanner(System.in);
     *  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     *
     *         int one = Integer.parseInt(scan.nextLine());
     *         int two = Integer.parseInt(reader.readLine());

                           ПРОЦЕНТИ
     *  price +/-= price * 0.5 -> Към текущата стойност на цената +/- 50% от стойноста на цената.
     *  Или което е едно и също със записа: price = price(1 +/- 0.5) = * 1.5;


                           CONTINUE
     * for (int i = firstString.charAt(0); i <= secondString.charAt(0); i++) {
     *             if (!(i % 2 == 0)) {
     *                 firstDigits = (char) i;
     *
     *             } else {
     *                 continue;
     *             }
     *
     * Ако чара е нечетен ПРЕСКАЧА на следващата итерация от цикъла <- докато не намери четен

                        INT -> STRING -> CHAR
     *  (int)firstDigits = (char) i:
     *   firstDigits =3 '51'; i = 51
     *
     * char symbol; int number;
     * int result = (int) symbol + number;
     *             char resultChar = (char) result1;
     *
     * result += abc.charAt(j); Конкатенира чара. Ако е в тялото на for -> Конкатенира чаровете от abc.Length

                           ПЕЧАТАНЕ
     *  System.out.printf("%.2f BGN %n", price); BGN <- Печата BGN в резултата.
     *  За да не се Чудиш КАК.



                          КОМБИНАЦИИ
     *  for (int i = 0; i < ; i++) {
     *             for (int j = 0; j < ; j++) {
     *                 for (int k = 0; k < ; k++) {
     * -> Това са ВСИЧКИ възможни КОМБИНАЦИИ между i, j и k.
     *

                             FOR
     * Винаги проверявай началните(стойности) условия за променливите в тялото на цикъла.
     * for (char third = firstChar; third <= secondChar; third++) {
     * String str = "" + first + second + third;
     *                     boolean isIt = false;                // <- За всяка нова комбинация от букви в str
     *                                                          //  задава изходна стойност на isIT.
     *                                                          // Инак помни последната и става Мазало.
     *                     for (int i = 0; i < str.length(); i++) {
     *                         if (str.charAt(i) == thirdChar) {
     *                             isIt = true;                // <- Без break Ще запомни последната стойност на isIt.
     *                                                         // Ако i(0)=b няма да я отчете.
     *                             break;
     *                         }
     *
     *
     *   }
     * }



     *
     *
     */
}
