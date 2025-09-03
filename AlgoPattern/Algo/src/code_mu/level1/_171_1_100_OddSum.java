package code_mu.level1;

/**
 * Уровень 17 задачника Java
 * № 171
 * <p>
 * Найдите сумму всех целых нечетных чисел в промежутке от 1 до 100.
 */

public class _171_1_100_OddSum {

    public static void main(String[] args) {
        int oddSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) oddSum += i;
        }

        System.out.println("Сумма всех целых нечетных чисел в промежутке от 1 до 100: " + oddSum);
    }
}
