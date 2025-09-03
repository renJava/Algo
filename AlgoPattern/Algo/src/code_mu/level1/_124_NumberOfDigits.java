package code_mu.level1;

/**
 * Уровень 1.2 задачника Java
 * № 124
 * <p>
 * Дано целое число. Выведите количество цифр в этом числе.
 */

public class _124_NumberOfDigits {
    static int numberOfDigitsReal = (int) -12345678.9f;

    public static void main(String[] args) {
        int numberOfDigitsAbc = Math.abs(numberOfDigitsReal);
        System.out.println("Длина числа: " + String.valueOf(numberOfDigitsAbc).length());
    }
}
