package code_mu.level1;

/**
 * Уровень 1.10 задачника Java
 * № 1.101
 * <p>
 * Найдите сумму всех целых четных чисел в промежутке от 1 до 100.
 */

public class _1101_1_100_EvenSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;

        }
        System.out.println("\nСумма всех четных чисел в промежутке от 1 до 100: "
                + sum);

    }
}
