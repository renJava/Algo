package code_mu.level1;

/**
 * Уровень 15 задачника Java
 * № 152
 * <p>
 * Даны два целых числа. Проверьте, что первое число без остатка делится на второе.
 */

public class _152_DeletedWithoutRemainder {

    static int dividend = 10;
    static int divisor = 5;

    public static void main(String[] args) {
        int result = dividend % divisor;

        System.out.println(dividend % divisor == 0
                ? "Деление без остатка!"
                : "Деление с остатком: " + result);

    }
}
