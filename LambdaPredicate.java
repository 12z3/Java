package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPredicate {

    /*
    Predicate -> Изявление, състояние на нещо си.
    test() -> метод на Predicate. (Evaluates this predicate on the given argument.)
    "predicate.test(number)" връща резултата от "number -> number % 2 == 0"
    Където "number" може да е с ПРОИЗВОЛНО име.
    */


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, -4, -5, 6, 7, 8, -10);
        System.out.println(filter(numbers));
        System.out.println(filterA(numbers, number -> number > 0));
        System.out.println(filterA(numbers, number -> number % 2 == 0));
        System.out.println(filterT(numbers, number -> number < 0));
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
