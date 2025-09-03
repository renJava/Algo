package code_mu.level1;

/**
 * Уровень 17 задачника Java
 * № 175
 * <p>
 * Дано некоторое число:
 * 12345
 * Найдите сумму цифр этого числа.
 */

public class _175_SumOfDigitsInInt {
    public static void main(String[] args) {
        System.out.println(sumOfDigitsRecursion(10)); // 1
        System.out.println(sumOfDigitsRecursion(99)); // 18
        System.out.println(sumOfDigitsRecursion(-32)); // 5
    }

    public static int sumOfDigitsRecursion(int number) {
        if (number < 10) return number;
        return number % 10 + sumOfDigitsRecursion(number / 10);
    }
}
