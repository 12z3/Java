package aSoftUni;

import training.Methods;

import java.util.Arrays;
import java.util.*;

public class PracticeA extends Methods {


    // TODO: -> https://www.youtube.com/watch?v=I-vk9orNCuQ&t=388s
    // TODO: -> https://www.youtube.com/watch?v=QYO5_riePOQ

    // TODO: Alt + Enter <-


    // TODO: Сумира четните и нечетни числа от числото: 1235678 /983467899678/  ->
    //       Even number is: 268. Sum is 16; Odd number is: 1357. Sum is 16

    // TODO: Бруталният начин:

    public static void sumOfNumbersOfLiterals(long number) {
        Scanner scan = new Scanner(System.in);

        number = Math.abs(number);
        String intToString = String.valueOf(number);                                  // TODO: int = 2 -> String = "2"

        StringBuilder evenStrB = new StringBuilder();
        StringBuilder oddStrB = new StringBuilder();

        StringBuilder evenMassiveS = new StringBuilder();
        StringBuilder oddMassiveS = new StringBuilder();

        char[] evenMassive = new char[intToString.length()];
        char[] oddMassive = new char[intToString.length()];
        int oddSum = 0, evenSum = 0, evenIndex = -1, oddIndex = -1;


        for (int i = 0; i < intToString.length(); i++) {
            if (intToString.charAt(i) % 2 == 0) {
                evenStrB.append(intToString.charAt(i));               // TODO: Еквивалентно е на: Str = Str + str.charAt(i);
                evenSum += Character.getNumericValue(intToString.charAt(i));          // TODO: chat = '2' -> int = 2

                evenIndex++;
                evenMassive[i] = intToString.charAt(i);

                evenMassiveS.append(intToString.charAt(i));                           // TODO: Същото като Ред: 43

            } else {
                oddStrB.append(intToString.charAt(i));
                oddSum += Integer.parseInt(String.valueOf(intToString.charAt(i)));    // TODO: chat = '2' -> int = 2

                oddIndex++;
                oddMassive[i] = intToString.charAt(i);

                oddMassiveS.append(intToString.charAt(i));                            // TODO: Същото като Ред: 41
            }
        }
        System.out.printf("Even number is: %s. Sum is %d. %n", evenStrB, evenSum);
        System.out.printf("Odd number is: %s. Sum is %d. %n", oddStrB, oddSum);
        System.out.println("Multiply Result is: " + (long) evenSum * oddSum + '.');

        System.out.println(Arrays.toString(evenMassive));                       // TODO: Print -> Massive
        System.out.println(Arrays.toString(oddMassive));

        System.out.println("Even number is: " + evenMassiveS + '.');            // TODO: Print -> StringBuilder
        System.out.println("Odd number is: " + oddMassiveS + '.');
    }


    // TODO: Елегантният начин:

    public static void sumOfNumbersA(long number) {
        int evenSum = 0, oddSum = 0, sum = 0;
        number = Math.abs(number);

        while (number > 0) {
            long digit = number % 10;    // TODO: 1234 % 10 = 4; -> Взима последната цифра от "number".
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            number = number / 10;        // TODO: 1234 / 10 = 123; -> Маха взетата последна цифра от "number".
        }
        System.out.printf("Even sum = %d; Odd sum = %d; %n", evenSum, oddSum);
        //return number;
    }


    // TODO: Запълва елементите на масива по търсеният отдавна начин.     <---

    public static void snakeMassive(int[][] arr) {
        int count = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int coll = 0; coll < arr[row].length; coll++) {
                count++;

                if (!(row % 2 == 0)) {              // TODO: За всеки нечетен ред запълването да започва на обратно.
                    arr[row][arr[row].length - 1 - coll] = count;
                } else {
                    arr[row][coll] = count;
                }

                //System.out.print(arr[row][coll] + " ");  // TODO: Дава много Красива Грешка в печатането.
            }
            // System.out.println();
        }
        print2DArray(arr);
        System.out.println();
    }


    // TODO: Търси "element" в масива "arr". Пеачата индекса и колко пъти се среща в него.

    public static void searchElement(int[][] arr, int element) {
        int countElement = 0;
        boolean isElementFound = false;
        Deque<String> deque = new ArrayDeque<>() {
        };

        for (int row = 0; row < arr.length; row++) {
            for (int coll = 0; coll < arr[row].length; coll++) {

                if (element == arr[row][coll]) {
                    countElement++;
                    System.out.printf("index of element is: %d%d %n", row, coll);

                    String matches = row + "" + coll;
                    deque.offer(matches);
                }
            }
        }
        System.out.printf("Element %d found %d times %n", element, countElement);
    }


    // TODO: Сравнява елементите на масивите: 1 с 1, 2 с 2 ... и т.н
    // TODO: Но аз искам да сравнява 1 елемент от първия масив с всички елементи от втория и т.н
    // Ще трябват още два вложени fori-цикъла.

    public static void searchInMassive(int[][] a, int[][] b) {
        int countElement = 0;
        boolean isElement = false;
        for (int row = 0; row < a.length; row++) {
            for (int coll = 0; coll < a[row].length; coll++) {

                if (a[row][coll] == b[row][coll]) {
                    isElement = true;
                    countElement++;
                    System.out.printf("%d%d ", row, coll);
                }
            }
        }
        if (isElement) {
            System.out.println();
            System.out.printf("There is %d elements %n", countElement);
        } else {
            System.out.println("This element is Not Found.");
        }
    }

    // TODO: Сравнява всеки елемент със всеки: 1 с 1, 1 с 2 и т.н и Намира съвпаденията.

    private static void searchDuplicateElements(int[][] a) {
        int count = 0, countFindingElement = 0,
                findingElement = 0, indexRow = 0, indexColl = 0;
        boolean isMatch = false;

        for (int thisRow = 0; thisRow < a.length; thisRow++) {
            for (int thisColl = 0; thisColl < a[thisRow].length; thisColl++) {

                for (int findRow = 0; findRow < a.length; findRow++) {
                    count = 0;
                    for (int findColl = 0; findColl < a[findRow].length; findColl++) {

                        if (a[thisRow][thisColl] == a[findRow][findColl]) {
                            count++;
                            // TODO:  {{1, 12, 3}, {3, 3, 3}, {3, 15, 16}};
                            if (count > 2) {
                                isMatch = true;
                                countFindingElement++;
                                findingElement = a[findRow][findColl];
                                System.out.printf("%d%d ", findRow, findColl);
                            }
                        }
                    }
                }
            }
        }
        if (isMatch) {
            System.out.println();
            System.out.print("Element " + findingElement + " Find " + countFindingElement + " times.");
        } else {
            System.out.println("No match in this Massive");
        }
    }

    private static void searchingForRepetitiveElement(int[][] a) {
        int countElement = 0, element = 0, index = 0;

        for (int thisRow = 0; thisRow < a.length; thisRow++) {
            for (int thisColl = 0; thisColl < a[thisRow].length; thisColl++) {

                for (int findRow = 0; findRow < a.length; findRow++) {
                    index = 0;
                    countElement = 0;       // TODO: Нулира "countElement" при всяка смяна на реда в който търси.
                    // TODO: Трябва да се нулира при смяна на елемента който сравнява. <-

                    for (int findColl = 0; findColl < a[findRow].length; findColl++) {
                        index++;
                        // TODO: {{1, 12, 33}, {3, 33, 3}, {3, 33, 16}};

                        if (thisRow == findRow && thisColl == findColl) {
                            continue;
                        } else {
                            if (a[thisRow][thisColl] == a[findRow][findColl]) {     // <-
                                countElement++;
                                element = a[findRow][findColl];

                                if (countElement >= 1) {
                                    System.out.printf("%d%d -> ", thisRow, thisColl);
                                    System.out.printf("%d/  ", element);
                                    // System.out.printf("%d; ", countElement);

                                    // TODO: Държи се странно при повече от няколко съвпадения. Оправи го!
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // TODO: Пренапиши "searchingForRepetitiveElementsInArray" имайки на предвид "MyProblem"

    private static void searchingForRepetitiveElementsInArray(int[][] arr) {
        int countElement = 0, elementToChek = 0,
                element = 0, maxCount = Integer.MIN_VALUE,
                elementToChekIndex = 0, elementIndex = 0, allCount = 0, countPrint = 0;

        String index = "", elementToChekStringIndex = "", elementStringIndex = "";
        List<Integer> list = new ArrayList<>();

        //  TODO: {{33, 33, 33}, {3, 33, 3}, {3, 33, 33}};
        System.out.println("-------------------");                       //  00  01  02,  10  11 12,   20  21  22
        for (int thisRow = 0; thisRow < arr.length; thisRow++) {
            for (int thisColl = 0; thisColl < arr[thisRow].length; thisColl++) {

                // За Всеки Елемент от Всяка Колона на дедения Ред:
                // Дефинира Реперният елемент.

                elementToChek = arr[thisRow][thisColl];
                elementToChekStringIndex = "" + thisRow + thisColl;                 // 1 + 2 = 12 as String
                elementToChekIndex = Integer.parseInt(elementToChekStringIndex);

                if (!(countElement == 0)) {
                    System.out.printf("%d = %d checks. %n%n", elementToChek, countElement);

//                    if (!(list.isEmpty())){
//                        System.out.print(Arrays.toString(list.toArray()));
//                        System.out.printf(", size = %d. %n", list.size());
//                    }
//                    list.add(elementToChek);
                }

                if (!(countElement == 0)) {
                    System.out.println("-------------------");
                }                                                                   //TODO: Брои - Печата - Нулира !

                countElement = 0;                     // Нулира "countElement" при избор на нов елемент "elementToChek".

                for (int findRow = thisRow + 1; findRow < arr.length; findRow++) {
                    for (int findColl = thisColl + 1; findColl < arr[findRow].length; findColl++) {

                        // За Всеки Елемент от Всяка Колона на дедения Ред:
                        // Дефинира Елемента който ще се сравнява с Реперният.

                        element = arr[findRow][findColl];
                        elementStringIndex = "" + findRow + findColl;
                        elementIndex = Integer.parseInt(elementStringIndex);

                                                                 // Изключва текущия(thisRow, thisColl) от търсенето.
//                        if (thisRow == findRow && thisColl == findColl) {
//                            continue;
//                        }                                       // ??? Ako i-я е проверен да не се сравнява с текущия.
                        if (elementToChekIndex > elementIndex) {
                            continue;
                        }

                        if (elementToChek == element) {

                            countElement++;
                            allCount += countElement;

                            System.out.printf("%d[%d%d] -> ", elementToChek, thisRow, thisColl);
                            System.out.printf("%d(%d%d) = ", element, findRow, findColl);
                            System.out.printf("%d;    ", countElement);
                            System.out.println();
                        }
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeAndData();

        int[][] arr = new int[4][4];
        int[][] a = {{33, 33, 33},
                {3, 33, 3},
                {3, 33, 33}};

        int[][] b = new int[][]{{1, 2, 3}, {3, 3, 3}, {4, 5, 6}};


//        sumOfNumbers(123456789);
//        sumOfNumbersA(-123456789);
//
//        snakeMassive(arr);
//
//        searchElement(b, 3);
//        searchInMassive(a, b);

        // searchDuplicateElements(a);
        // newSearch(a);
        searchingForRepetitiveElementsInArray(a);
    }
}




