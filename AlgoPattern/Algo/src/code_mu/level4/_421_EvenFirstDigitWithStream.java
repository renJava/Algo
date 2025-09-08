package code_mu.level4;

import java.util.stream.IntStream;

/**
 * Выведите в консоль все числа в промежутке от 10 до 1000, у которых первая цифра четная.
 */

public class _421_EvenFirstDigitWithStream {
    public static void main(String[] args) {
        IntStream.rangeClosed(10, 1000) // Генерируем числа от 10 до 1000
                .filter(num -> isFirstDigitEven(num)) // Фильтруем по условию
                .forEach(System.out::println); // Выводим на консоль
    }

    // Метод для проверки, является ли первая цифра четной
    private static boolean isFirstDigitEven(int num) {
        int firstDigit = Integer.parseInt(Integer.toString(num).substring(0, 1));
        return firstDigit % 2 == 0; // Проверяем, четная ли первая цифра
    }
}
