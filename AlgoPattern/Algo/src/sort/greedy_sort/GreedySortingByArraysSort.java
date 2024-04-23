package sort.greedy_sort;

/**
 * Жадная сортировка
 */

import java.util.Arrays;

public class GreedySortingByArraysSort {
    public static void main(String[] args) {
        Integer[] numbers = {3, 1, 7, 9, 9, 5};
        Integer[] sortedNumbers = getLargestNumber(numbers);
        System.out.println("Максимальное число: " + Arrays.toString(sortedNumbers));
    }

    private static Integer[] getLargestNumber(Integer[] numbers) {
        // Сортируем числа по убыванию, используя Arrays.sort и анонимный компаратор
        Arrays.sort(numbers, (a, b) -> {
            // Преобразуем числа в массивы цифр
            int[] digitsA = getDigits(a);
            int[] digitsB = getDigits(b);

            // Сравниваем цифры на соответствующих позициях
            int i = 0;
            while (i < digitsA.length && i < digitsB.length) {
                if (digitsA[i] != digitsB[i]) {
                    return digitsB[i] - digitsA[i]; // Цифра b больше цифры a
                }
                i++;
            }

            // Если одно число является префиксом другого, то больше будет число с большей длиной
            return digitsB.length - digitsA.length;
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