package sort.greedy_sort;

/**
 * Жадная сортировка через стрим
 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class GreedySortingByStream {
    public static void main(String[] args) {
        Integer[] numbers = {3, 1, 7, 9, 9, 5};
        Integer[] sortedNumbers = getLargestNumber(numbers);
        System.out.println("Максимальное число: " + Arrays.toString(sortedNumbers));
    }

    private static Integer[] getLargestNumber(Integer[] numbers) {
        // Сортируем числа по убыванию, используя стримы
        Arrays.sort(numbers, (a, b) -> {
            // Преобразуем числа в массивы цифр
            int[] digitsA = getDigits(a);
            int[] digitsB = getDigits(b);

            // Сравниваем цифры на соответствующих позициях
            return IntStream.range(0, Math.min(digitsA.length, digitsB.length))
                    .filter(i -> digitsA[i] != digitsB[i])
                    .map(i -> digitsB[i] - digitsA[i])
                    .findFirst()
                    .orElse(digitsB.length - digitsA.length);
        });

        return numbers;
    }
    private static int[] getDigits(int number) {
        // Получаем массив цифр числа в порядке обратном их появлению
        String numberString = String.valueOf(number);
        int[] digits = new int[numberString.length()];
        for (int i = 0; i < numberString.length(); i++) {
            digits[i] = Character.getNumericValue(numberString.charAt(i));
        }
        return digits;
    }
}