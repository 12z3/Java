package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPredicate {

    /*

    -> https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
       https://docs.oracle.com/javase/8/docs/api/java/util/function/class-use/Predicate.html
       https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html

    Predicate -> Изявление, състояние на нещо си. Функция, която връща "true" или "false"....
    test() -> метод на Predicate. (Evaluates this predicate on the given argument.)
    "predicate.test(number)" връща резултата от "number -> number % 2 == 0"
    "number -> number < 0)" връща "true" или "false"
    Където "number" може да е с ПРОИЗВОЛНО име.
    */


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, -4, -5, 6, 7, 8, -10);
        System.out.println(filter(numbers));
        System.out.println(filterA(numbers, number -> number > 0));
        System.out.println(filterA(numbers, number -> number % 2 == 0));
        System.out.println(filterT(numbers, number -> {
            return number < 0;
        }));
    }

    private static List<Integer> filterA(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            boolean isValid = predicate.test(number);
            if (isValid) result.add(number);
        }
        return result;
    }

    private static <T> List<T> filterT(List<T> numbers, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T number : numbers) {
            boolean isValid = predicate.test(number);
            if (isValid) result.add(number);
        }
        return result;
    }

    private static List<Integer> filter(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            boolean isValid = number > 0;
            if (isValid) result.add(number);
        }
        return result;
    }
}
