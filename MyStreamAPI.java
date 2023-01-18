package aSoftUni;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStreamAPI {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, -4, 5, 6 - 7, 9};
        List<Integer> list = Arrays.asList(1, -2, 3, -4, 8);

        IntStream streamA = Arrays.stream(arr);        // IntStream -> при инициализацията на масивите е ясно какъв тип
        int result = Arrays.stream(arr).min().getAsInt(); // данни ще съдържат. И поради това типа на потока е IntStream
        OptionalInt resultA = streamA.min();

        System.out.println(result);

        Stream<Integer> streamB = list.stream();    // Не знае какво има в потока.В случая има <Integer>.
        System.out.println(streamB);                // Но може да бъде и произволен тип.
                                                    // Поради това се създава поток Stream<Integer>, а не ListStream
        // 1                                        // ... както е при масивите (IntStream) с примитивни данни.
        //IntStream min = streamB.mapToInt(x -> x); (x -> x * 2)
                                                    // .. т.е. вземи елемента x и го преобразувай по правилото:
                                                    // новото x = старото * 2. В скобите е начина по които
                                                    // mapTo() работи. тазгледай и само map() - метода.
                                                    // map -> означава за Всяко Едно Направи това в скобите.
                                                    // "(x -> x)" всяко едно число от този "stream" Stream<Integer>
                                                    // ... го обърни към int като му вземеш стойността чрез
                                                    // ... streamB.mapToInt(x -> x);
        // 2
        //IntStream minА = streamB.mapToInt(Integer::intValue);
                                                     // Обърни го към Integer като вземеш стойноста на тези
        // 3                                         // Integer -> intValue.
        //IntStream minB = streamB.mapToInt(x -> x.intValue());
                                                     // Друг запис. И трите правят едно и също нещо.
        // mapToInt(Integer::intValue); -> На всеки един елемент от steam-а, му вземи интСтойността "intValue".
        // "Integer" приема стойността на "intValue". Ако тя е "String" ще приеме "parsInt": "Integer::parsInt"
        // Ако не се интересувам от типа на stream-a -> вместо "Stream<Integer>" -> "Stream<?>". Но това води до други
        // проблеми. Няма да може да се взима стойност на елемента на потока - примерно и т.н.
        // В тривиалният случай дадена променлива(референтна) когато е "празна" има стойност "null".
        // При StreamAPI за да е по-лесен chaining-a се допуска стойността на дадена променлива от потока
        // да може и да я има и да я няма.И тук в играта идва типа "OptionalInt". Но него трябва да го проверявам.

        if (resultA.isPresent()) System.out.println(resultA.getAsInt());            // OptionalInt resultA
        System.out.println(Arrays.stream(arr).average().orElse(0));           // ... ако няма average върни "0"
        System.out.println(Arrays.stream(arr)
                .filter(x -> x > 0)                               // Предикат: x приема само положителните стойностти
                .average()
                .orElse(0));

        Integer minPositive = list.stream()
                .filter(x -> x > 0)
                .min((a,b) -> a.compareTo(b))  //Указва как взима min. -> "Alt + Enter" -> "Replace with for - chain..."
                .orElse(0);

        System.out.println(minPositive);


    }
}
